/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SalaryModel {

    private Connection conn;

    public SalaryModel() {
        conn = DBConnection.getConnection();
    }

    // Method to get employee data from employee_info table
    public ResultSet getEmployeeInfo() {
        try {
            Statement stmt = conn.createStatement();
            String selectEmployee1 = "SELECT * FROM employee_info";
            return stmt.executeQuery(selectEmployee1);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean generateSalary(int employee_info_id, String startDate, String endDate, String amount) {
        try {
            Statement stmt = conn.createStatement();
            String strInsert = "INSERT INTO employee_salary (employee_info_id, salary_generated_date, salary_start_date, salary_end_date, salary_amount, create_date) "
                                + "values('" + employee_info_id + "', curdate(), '" + startDate + "', '" + endDate + "', '" + amount + "', curdate())";
            stmt.execute(strInsert);
            return true; // Salary generated successfully
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Error generating salary
        }
    }
    
    public ResultSet fetchSalaryData() {
        try {
            Statement stmt = conn.createStatement();
            String selectQuery = "SELECT a.id, a.salary_generated_date, a.salary_start_date, a.salary_end_date, a.salary_amount, b.name " +
                                 "FROM employee_salary a " +
                                 "INNER JOIN employee_info b ON a.employee_info_id = b.id";
            return stmt.executeQuery(selectQuery);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ResultSet fetchSalaryDataForEmployee(int empId) {
        try {
            Statement stmt = conn.createStatement();
            String selectQuery = "SELECT a.id, a.salary_generated_date, a.salary_start_date, a.salary_end_date, a.salary_amount, b.name " +
                                 "FROM employee_salary a " +
                                 "INNER JOIN employee_info b ON a.employee_info_id = b.id " +
                                 "WHERE b.id = " + empId;
           // System.out.println(selectQuery);
            return stmt.executeQuery(selectQuery);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

