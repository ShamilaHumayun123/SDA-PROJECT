/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

import java.sql.ResultSet;

public class EmployeeBonusController {
    private EmployeeBonusModel model;

    public EmployeeBonusController() {
        model = new EmployeeBonusModel();
    }

    // Method to add bonus
    public boolean addBonus(String name, String date, String detail) {
        return model.addBonus(name, date, detail);
    }
    
    public ResultSet getBonusData() {
        return model.getBonusData();
    }
    
    public ResultSet getAllBonuses() {
        return model.getAllBonuses();
    }

    // Method to get employee data from the model
    public ResultSet getAllEmployees() {
        return model.getAllEmployees();
    }
    
    public boolean assignBonus(String bonusComboBoxSelection, String employeeComboBoxSelection) {
        try {
            // Extract numeric part from the selected item in bonusComboBox1 for bonus_id
            String numericPartBonus = bonusComboBoxSelection.replaceAll("[^0-9]", "");  // Remove non-numeric characters
            int bonusId = Integer.parseInt(numericPartBonus);

            // Extract numeric part from the selected item in bonusComboBox2 for employee_info_id
            String numericPartEmployee = employeeComboBoxSelection.replaceAll("[^0-9]", "");  // Remove non-numeric characters
            int employeeInfoId = Integer.parseInt(numericPartEmployee);

            // Call the model method to assign bonus
            return model.assignBonus(employeeInfoId, bonusId);
        } catch (Exception e) {
            e.printStackTrace();
            return false;  // Error during assignment
        }}
    
    public boolean updateBonus(int id, String name, String detail, String date) {
        return model.updateBonus(id, name, detail, date);
    }
    
    public ResultSet fetchBonusById(int id) {
        return model.getBonusById(id);
    }
    
    public boolean deleteBonus(int id) {
        return model.deleteBonus(id);
    }
    
    public ResultSet fetchBonussById(int id) {
        return model.getBonusById(id);
    }
    
    public ResultSet loadBonusData(int empId) {
        ResultSet rs = model.getEmployeeBonusData(empId);
        return rs;
    }
    
}
