package employeemanagementsystem;

public class EmployeeInfoService {

    public void viewEmployeeInfo(int empId) {
        ViewEmployeeInfo viewEmployeeInfoUI = new ViewEmployeeInfo(empId);
        viewEmployeeInfoUI.setVisible(true);
    }
}
