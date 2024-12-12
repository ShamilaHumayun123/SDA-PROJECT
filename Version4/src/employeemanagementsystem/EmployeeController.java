/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author SHAMILA HUMAYUN
 */

package employeemanagementsystem;

import java.util.List;
import java.util.Map;

public class EmployeeController {
    private EmployeeModel model;

    public EmployeeController() {
        this.model = new EmployeeModel();
    }

    public boolean addEmployee(String name, String mobileNo, String cnic, int salary, String address, 
                               int age, int experience, String city, String country, 
                               String password, String email) {
        return model.addEmployee(name, mobileNo, cnic, salary, address, age, experience, city, country, password, email);
    }
    public List<Object[]> fetchAllEmployees() {
    return model.getAllEmployees();
}
    public boolean updateEmployee(int id, String name, String mobileNo, int salary, String address, String email) {
    return model.updateEmployee(id, name, mobileNo, salary, address, email);
}

public Map<String, String> fetchEmployeeById(int id) {
    return model.getEmployeeById(id);
}
public boolean deleteEmployee(int id) {
    return model.deleteEmployee(id);
}
public Map<String, String> fetchEmployeeDetailsById(int id) {
    return model.getEmployeeDetailsById(id);
}

  public List<Object[]> getEmployeeDetails(int empId) {
        return model.getSingleEmployee(empId); // Call Model to get data
    }
}
