/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author SHAMILA HUMAYUN
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


public class EmployeeModel {
    private Connection conn;

    public EmployeeModel() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ems", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addEmployee(String name, String mobileNo, String cnic, int salary, String address, 
                               int age, int experience, String city, String country, 
                               String password, String email) {
        try {
            Statement stmt = conn.createStatement();
            String strInsert = "INSERT INTO employee_info (name, address, email, cnic, mobile_no, employee_department_id, " +
                               "basic_salary, age, city, country, experience, create_date) " +
                               "VALUES ('" + name + "','" + address + "','" + email + "','" + cnic + "','" + mobileNo + 
                               "', 1,'" + salary + "','" + age + "','" + city + "','" + country + "','" + experience + "', CURDATE())";
            stmt.execute(strInsert);

            // Get Employee ID
            ResultSet rs = stmt.executeQuery("SELECT id FROM employee_info WHERE cnic = '" + cnic + "'");
            if (rs.next()) {
                int employeeInfoId = rs.getInt("id");
                String loginInsert = "INSERT INTO login (email, password, user_type_id, employee_info_id) " +
                                     "VALUES ('" + email + "','" + password + "', 2, '" + employeeInfoId + "')";
                stmt.execute(loginInsert);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public List<Object[]> getAllEmployees() {
    List<Object[]> employees = new ArrayList<>();
    try {
        Statement stmt = conn.createStatement();
        String selectEmployees = "SELECT * FROM employee_info";
        ResultSet rs = stmt.executeQuery(selectEmployees);

        while (rs.next()) {
            Object[] employee = {
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("address"),
                rs.getString("mobile_no"),
                rs.getInt("experience"),
                rs.getString("city"),
                rs.getString("country"),
                rs.getString("basic_salary"),
                rs.getString("cnic"),
                rs.getString("email")
            };
            employees.add(employee);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return employees;
}
    public List<Object[]> getSingleEmployee(int empId) {
    List<Object[]> employees = new ArrayList<>();
    try {
        Statement stmt = conn.createStatement();
        String selectEmployees = "SELECT * FROM employee_info where id="+empId;
        ResultSet rs = stmt.executeQuery(selectEmployees);

        while (rs.next()) {
            Object[] employee = {
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("address"),
                rs.getString("mobile_no"),
                rs.getInt("experience"),
                rs.getString("city"),
                rs.getString("country"),
                rs.getString("basic_salary"),
                rs.getString("cnic"),
                rs.getString("email")
            };
            employees.add(employee);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return employees;
}
public boolean updateEmployee(int id, String name, String mobileNo, int salary, String address, String email) {
    try {
        Statement stmt = conn.createStatement();
        String updateQuery = "UPDATE employee_info SET mobile_no = '" + mobileNo + 
                             "', basic_salary = '" + salary + "', address = '" + address + 
                             "', email = '" + email + "', name = '" + name + 
                             "' WHERE id = '" + id + "'";
        stmt.execute(updateQuery);
        return true; // Update successful
    } catch (Exception e) {
        e.printStackTrace();
        return false; // Update failed
    }
}
public Map<String, String> getEmployeeById(int id) {
    Map<String, String> employeeDetails = new HashMap<>();
    try {
        Statement stmt = conn.createStatement();
        String selectQuery = "SELECT * FROM employee_info WHERE id = " + id;
        System.out.println(selectQuery);
        ResultSet rs = stmt.executeQuery(selectQuery);

        if (rs.next()) {
            employeeDetails.put("name", rs.getString("name"));
            employeeDetails.put("mobile_no", rs.getString("mobile_no"));
            employeeDetails.put("basic_salary", String.valueOf(rs.getInt("basic_salary")));
            employeeDetails.put("address", rs.getString("address"));
            employeeDetails.put("email", rs.getString("email"));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    
    return employeeDetails; // Returns an empty map if no employee is found
}

public boolean deleteEmployee(int id) {
    try {
        // Delete from `login` table
        String deleteLogin = "DELETE FROM login WHERE employee_info_id = " + id;
        Statement stmt = conn.createStatement();
        stmt.execute(deleteLogin);

        // Delete from `employee_info` table
        String deleteEmployee = "DELETE FROM employee_info WHERE id = " + id;
        Statement stmt1 = conn.createStatement();
        stmt1.execute(deleteEmployee);

        return true; // Deletion successful
    } catch (Exception e) {
        e.printStackTrace();
        return false; // Deletion failed
    }
}
public Map<String, String> getEmployeeDetailsById(int id) {
    Map<String, String> employeeDetails = new HashMap<>();
    try {
        Statement stmt = conn.createStatement();
        String selectQuery = "SELECT * FROM employee_info WHERE id = " + id;
        ResultSet rs = stmt.executeQuery(selectQuery);

        if (rs.next()) {
            employeeDetails.put("name", rs.getString("name"));
            employeeDetails.put("mobile_no", rs.getString("mobile_no"));
            employeeDetails.put("basic_salary", String.valueOf(rs.getInt("basic_salary")));
            employeeDetails.put("address", rs.getString("address"));
            // Email is intentionally omitted
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return employeeDetails; // Returns an empty map if no record is found
}



 public List<Object[]> getEmployeeDetails(int empId) {
        List<Object[]> employeeDetails = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String selectQuery = "SELECT a.id, b.name, a.attendance_date, a.check_in_time, a.check_out_time " +
                                 "FROM employee_attendance a " +
                                 "INNER JOIN employee_info b ON a.employee_info_id = b.id " +
                                 "WHERE a.id = " + empId;
            ResultSet rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                Object[] data = {
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("attendance_date"),
                    rs.getString("check_in_time"),
                    rs.getString("check_out_time")
                };
                employeeDetails.add(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employeeDetails; // Returns list of employee details
    }}
