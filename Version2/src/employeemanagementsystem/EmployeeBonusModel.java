package employeemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeBonusModel {
    private Connection conn;

    public EmployeeBonusModel() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ems", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to add bonus
    public boolean addBonus(String name, String date, String detail) {
        try {
            Statement stmt = conn.createStatement();
            String strInsert = "INSERT INTO bonus (name, description, date, create_date) " +
                               "VALUES ('" + name + "','" + detail + "','" + date + "', curdate())";
            stmt.execute(strInsert);
            return true; // Bonus added successfully
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Error adding bonus
        }
    }
    public ResultSet getBonusData() {
        try {
            Statement stmt = conn.createStatement();
            String selectEmployees = "SELECT * FROM bonus";
            return stmt.executeQuery(selectEmployees);  // Returning ResultSet to the controller
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ResultSet getAllBonuses() {
        try {
            Statement stmt = conn.createStatement();
            String selectBonus = "SELECT * FROM bonus";
            return stmt.executeQuery(selectBonus);  // Returning ResultSet to the controller
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to get all employees
    public ResultSet getAllEmployees() {
        try {
            Statement stmt = conn.createStatement();
            String selectEmployee = "SELECT * FROM employee_info";
            return stmt.executeQuery(selectEmployee);  // Returning ResultSet to the controller
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean assignBonus(int employeeInfoId, int bonusId) {
        try {
            Statement stmt = conn.createStatement();
            String strInsert = "INSERT INTO employee_bonus (employee_info_id, bonus_id, create_date) "
                             + "VALUES ('" + employeeInfoId + "', '" + bonusId + "', CURDATE())";
            stmt.execute(strInsert);
            return true;  // Bonus assigned successfully
        } catch (Exception e) {
            e.printStackTrace();
            return false;  // Error during bonus assignment
        }
    }
    
    public boolean updateBonus(int id, String name, String detail, String date) {
        try {
            Statement stmt = conn.createStatement();
            String updateQuery = "UPDATE bonus SET name = '" + name + "', description = '" + detail + "', date = '" + date + "' WHERE id = " + id;
            stmt.execute(updateQuery);
            return true;  // Bonus updated successfully
        } catch (Exception e) {
            e.printStackTrace();
            return false;  // Error during update
        }
    }
    
    public ResultSet getBonusById(int id) {
        try {
            Statement stmt = conn.createStatement();
            String selectBonus = "SELECT * FROM bonus WHERE id = " + id;
            return stmt.executeQuery(selectBonus);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean deleteBonus(int id) {
        try {
            Statement stmt = conn.createStatement();
            String deleteEmployee = "DELETE FROM bonus WHERE id = " + id;
            stmt.execute(deleteEmployee);
            return true;  // Bonus deleted successfully
        } catch (Exception e) {
            e.printStackTrace();
            return false;  // Error during deletion
        }
    }
    
    public ResultSet getBonussById(int id) {
        try {
            Statement stmt = conn.createStatement();
            String selectBonus = "SELECT * FROM bonus WHERE id = " + id;
            return stmt.executeQuery(selectBonus);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
