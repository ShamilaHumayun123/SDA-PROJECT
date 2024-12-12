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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeAttendanceModel {
    private Connection conn;

    public EmployeeAttendanceModel() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ems", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addAttendance(String date, String timeIn, String timeOut, int employeeId) {
        try {
            Statement stmt = conn.createStatement();
            String insertQuery = "INSERT INTO employee_attendance (attendance_date, check_in_time, check_out_time, employee_info_id, create_date) " +
                                 "VALUES ('" + date + "','" + timeIn + "','" + timeOut + "','" + employeeId + "', CURDATE())";
            stmt.execute(insertQuery);
            return true; // Successful insertion
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Insertion failed
        }
    }
    public List<Object[]> getAttendanceData() {
        List<Object[]> attendanceList = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String selectQuery = "SELECT a.id, b.name, a.attendance_date, a.check_in_time, a.check_out_time " +
                                 "FROM employee_attendance a INNER JOIN employee_info b ON a.employee_info_id = b.id";
            ResultSet rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                Object[] data = {
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("attendance_date"),
                    rs.getString("check_in_time"),
                    rs.getString("check_out_time")
                };
                attendanceList.add(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return attendanceList;
    }
    public boolean updateAttendance(int id, String date, String timeIn, String timeOut) {
        try {
            Statement stmt = conn.createStatement();
            String updateQuery = "UPDATE employee_attendance SET attendance_date = '" + date + 
                                 "', check_in_time = '" + timeIn + "', check_out_time = '" + timeOut + 
                                 "' WHERE id = " + id;
            stmt.executeUpdate(updateQuery);
            return true; // Update successful
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Update failed
        }
    }
    public Map<String, String> getAttendanceById(int id) {
        Map<String, String> attendanceData = new HashMap<>();
        try {
            Statement stmt = conn.createStatement();
            String selectQuery = "SELECT a.id, b.name, a.attendance_date, a.check_in_time, a.check_out_time " +
                                 "FROM employee_attendance a " +
                                 "INNER JOIN employee_info b ON a.employee_info_id = b.id " +
                                 "WHERE a.id = " + id;
            ResultSet rs = stmt.executeQuery(selectQuery);

            if (rs.next()) {
                attendanceData.put("name", rs.getString("name"));
                attendanceData.put("attendance_date", rs.getString("attendance_date"));
                attendanceData.put("check_in_time", rs.getString("check_in_time"));
                attendanceData.put("check_out_time", rs.getString("check_out_time"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return attendanceData; // Returns an empty map if no record is found
    }
   public Map<String, String> getAttendanceDetailsById(int id) {
        Map<String, String> attendanceData = new HashMap<>();
        try {
            Statement stmt = conn.createStatement();
            String selectQuery = "SELECT a.id, b.name, a.attendance_date, a.check_in_time, a.check_out_time " +
                                 "FROM employee_attendance a " +
                                 "INNER JOIN employee_info b ON a.employee_info_id = b.id " +
                                 "WHERE a.id = " + id;
            ResultSet rs = stmt.executeQuery(selectQuery);

            if (rs.next()) {
                attendanceData.put("name", rs.getString("name"));
                attendanceData.put("attendance_date", rs.getString("attendance_date"));
                attendanceData.put("check_in_time", rs.getString("check_in_time"));
                attendanceData.put("check_out_time", rs.getString("check_out_time"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return attendanceData; // Returns an empty map if no record is found
    }

    // Method to delete attendance by ID
    public boolean deleteAttendanceById(int id) {
        try {
            Statement stmt = conn.createStatement();
            String deleteQuery = "DELETE FROM employee_attendance WHERE id = " + id;
            stmt.execute(deleteQuery);
            return true; // Deletion successful
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Deletion failed
        }
    }
}
    



