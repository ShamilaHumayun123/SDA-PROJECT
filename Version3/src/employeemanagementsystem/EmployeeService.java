/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class EmployeeService {
    public void addEmployee() {
        AddEmployee addEmployeeUI = new AddEmployee();
        addEmployeeUI.setVisible(true);
    }

    public void viewEmployees() {
        ViewEmployee viewEmployeeUI = new ViewEmployee();
        viewEmployeeUI.loadData();
        viewEmployeeUI.setVisible(true);
    }

    public void updateEmployee() {
        UpdateEmployee updateEmployeeUI = new UpdateEmployee();
        updateEmployeeUI.setVisible(true);
    }

    public void deleteEmployee() {
        DelEmployee deleteEmployeeUI = new DelEmployee();
        deleteEmployeeUI.setVisible(true);
    }
}
