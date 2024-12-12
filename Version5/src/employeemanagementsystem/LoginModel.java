/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

import java.sql.*;

public class LoginModel {

    private Connection conn;

    public LoginModel() {
         conn = DBConnection.getConnection();
    }

    // Method to validate Admin login
    public int validateAdminLogin(String email, String password) {
        try {
            Statement stmt = conn.createStatement();
            String query = "SELECT employee_info_id FROM login WHERE email='" + email + "' AND password='" + password + "' AND user_type_id = 1";
            ResultSet rs = stmt.executeQuery(query);

            

            if (rs.next()) {
                return rs.getInt("employee_info_id"); // Return Employee Info ID
            }
            return -1; // Return -1 if no valid login
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    // Method to validate Employee login and fetch employee info ID
    public int validateEmployeeLogin(String email, String password) {
        try {
            Statement stmt = conn.createStatement();
            String query = "SELECT employee_info_id FROM login WHERE email='" + email + "' AND password='" + password + "' AND user_type_id = 2";
            ResultSet rs = stmt.executeQuery(query);
            System.out.println(query);
            if (rs.next()) {
                return rs.getInt("employee_info_id"); // Return Employee Info ID
            }
            return -1; // Return -1 if no valid login
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Return -1 on error
        }
    }
}
