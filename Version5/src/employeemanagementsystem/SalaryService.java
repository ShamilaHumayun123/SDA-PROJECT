package employeemanagementsystem;

public class SalaryService {

    public void viewSalary(int empId) {
        ViewSalaryEmployee viewSalaryUI = new ViewSalaryEmployee(empId);
        viewSalaryUI.setVisible(true);
    }
     public void generateSalary() {
         GenerateSalary generateSalary = new GenerateSalary();
        generateSalary.setVisible(true);
    }
       public void viewGeneratedSalaries() {
           ViewSalaries viewGeneratedSalaries = new ViewSalaries();
        viewGeneratedSalaries.setVisible(true);
    }
}
