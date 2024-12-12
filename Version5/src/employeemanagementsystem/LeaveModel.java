package employeemanagementsystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeaveModel {
    private Connection conn;

    public LeaveModel() {
         conn = DBConnection.getConnection();
    }

    public boolean applyLeave(String startDate, String endDate, int employeeId) {
        try {
            Statement stmt = conn.createStatement();
            String insertQuery = "INSERT INTO employee_leave (leave_start_date, leave_end_date, status, employee_info_id, create_date) " +
                                 "VALUES ('" + startDate + "', '" + endDate + "', 'pending', '" + employeeId + "', CURDATE())";
            stmt.execute(insertQuery);
            return true; // Leave applied successfully
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Leave application failed
        }
    }
    
    public boolean updateLeave(int id, String leaveStartDate, String leaveEndDate, String status) {
        try {
            Statement stmt = conn.createStatement();
            String updateQuery = "UPDATE employee_leave SET leave_start_date = '" + leaveStartDate +
                                 "', leave_end_date = '" + leaveEndDate + "', status = '" + status +
                                 "' WHERE id = " + id;
            stmt.execute(updateQuery);
            return true; // Update successful
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Update failed
        }
    }

    public Map<String, String> getLeaveById(int id) {
        Map<String, String> leaveData = new HashMap<>();
        try {
            Statement stmt = conn.createStatement();
            String selectQuery = "SELECT a.id, b.name, a.leave_start_date, a.leave_end_date, a.status " +
                                 "FROM employee_leave a " +
                                 "INNER JOIN employee_info b ON a.employee_info_id = b.id " +
                                 "WHERE a.id = " + id;
            ResultSet rs = stmt.executeQuery(selectQuery);

            if (rs.next()) {
                leaveData.put("name", rs.getString("name"));
                leaveData.put("leave_start_date", rs.getString("leave_start_date"));
                leaveData.put("leave_end_date", rs.getString("leave_end_date"));
                leaveData.put("status", rs.getString("status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return leaveData; // Returns an empty map if no record is found
    }
    
   public List<Object[]> getAllLeaves() {
        List<Object[]> leaveList = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String selectQuery = "SELECT a.id, b.name, a.leave_start_date, a.leave_end_date, a.status " +
                                 "FROM employee_leave a " +
                                 "INNER JOIN employee_info b ON a.employee_info_id = b.id";
            ResultSet rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                Object[] data = {
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("leave_start_date"),
                    rs.getString("leave_end_date"),
                    rs.getString("status")
                };
                leaveList.add(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return leaveList;
    }
   
   public List<Object[]> getLeavesByEmployeeId(int employeeId) {
        List<Object[]> leaveList = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String selectQuery = "SELECT a.id, b.name, a.leave_start_date, a.leave_end_date, a.status " +
                                 "FROM employee_leave a " +
                                 "INNER JOIN employee_info b ON a.employee_info_id = b.id " +
                                 "WHERE b.id = " + employeeId;
            ResultSet rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                Object[] data = {
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("leave_start_date"),
                    rs.getString("leave_end_date"),
                    rs.getString("status")
                };
                leaveList.add(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return leaveList;
    }
}
