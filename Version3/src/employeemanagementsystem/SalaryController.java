/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

import java.sql.ResultSet;

public class SalaryController {

    private SalaryModel model;

    public SalaryController() {
        model = new SalaryModel();
    }

    // Method to get employee data
    public ResultSet fetchEmployeeInfo() {
        return model.getEmployeeInfo();
    }
    
    public boolean generateSalary(int employee_info_id, String startDate, String endDate, String amount) {
        return model.generateSalary(employee_info_id, startDate, endDate, amount);
    }
    
     public ResultSet fetchSalaryData() {
        return model.fetchSalaryData();
    }
     
      public ResultSet fetchSalaryDataForEmployee(int empId) {
        return model.fetchSalaryDataForEmployee(empId);
    }
}
