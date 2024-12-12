/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author SHAMILA HUMAYUN
 */
public class SummaryModel {
   
    private Connection conn;

    public SummaryModel() {
        conn = DBConnection.getConnection();
    }

    // Method to get employee summary (total salary, total attendances, total bonuses)
    public List<Object[]> getEmployeeSummary() {
        List<Object[]> employeeSummary = new ArrayList<>();
         try {
            Statement stmt = conn.createStatement();
            String selectEmployees = "SELECT " +
                                      "    a.id AS id, " +
                                      "    a.name AS employee_name, " +
                                      "    COALESCE(SUM(s.salary_amount), 0) AS total_salary, " +
                                      "    COALESCE(attendance.total_attendances, 0) AS total_attendances, " +
                                      "    COALESCE(bonuses.total_bonuses, 0) AS total_bonuses " +
                                      "FROM " +
                                      "    employee_info a " +
                                      "LEFT JOIN ( " +
                                      "    SELECT " +
                                      "        employee_info_id, " +
                                      "        COUNT(*) AS total_attendances " +
                                      "    FROM " +
                                      "        employee_attendance " +
                                      "    GROUP BY " +
                                      "        employee_info_id " +
                                      ") attendance ON a.id = attendance.employee_info_id " +
                                      "LEFT JOIN ( " +
                                      "    SELECT " +
                                      "        employee_info_id, " +
                                      "        COUNT(*) AS total_bonuses " +
                                      "    FROM " +
                                      "        employee_bonus " +
                                      "    GROUP BY " +
                                      "        employee_info_id " +
                                      ") bonuses ON a.id = bonuses.employee_info_id " +
                                      "LEFT JOIN employee_salary s ON a.id = s.employee_info_id " +
                                      "GROUP BY a.id, a.name";
            ResultSet rs = stmt.executeQuery(selectEmployees);

            while (rs.next()) {
                Object[] data = {
                    rs.getInt("id"),
                    rs.getString("employee_name"),
                    rs.getString("total_salary"),
                    rs.getString("total_attendances"),
                    rs.getInt("total_bonuses")
                };
                employeeSummary.add(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employeeSummary; // Returns list of employee summary details
    }

}
   