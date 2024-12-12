package employeemanagementsystem;

public class Admin extends Employee {

    private final EmployeeService employeeService;
    private final AttendanceService attendanceService;
     private final EmployeeInfoService employeeInfoService;
    private final LeaveService leaveService;
    private final ExpenseService expenseService;
    private final BonusService bonusService;
    private final SalaryService salaryService;
    private final SummaryService summaryService;
    private final MenuService menuService;

 
   
    public Admin(int id, String name, String address, String mobileNo, int experience, String city, String country,
                 int age, int salary, String password, String cnic, int departmentId, String email
                 ) {
        super(id, name, address, mobileNo, experience, city, country, age, salary, password,  cnic, departmentId,email);
        this.employeeService = new EmployeeService();
        this.employeeInfoService = new EmployeeInfoService();
        this.attendanceService = new AttendanceService();
        this.leaveService = new LeaveService();
        this.expenseService = new ExpenseService();
        this.bonusService = new BonusService();
        this.salaryService = new SalaryService();
        this.summaryService = new SummaryService();
        this.menuService = new MenuService();
    }

   

       @Override
    public boolean login(int id, String password) {
        return EMS.getInstance().adminLogin(id, password);
    }


    // Employee Management
    public void addEmployee() {
        employeeService.addEmployee();
    }

    public void viewEmployee() {
        employeeService.viewEmployees();
    }

    public void updateEmployee() {
        employeeService.updateEmployee();
    }

    public void deleteEmployee() {
        employeeService.deleteEmployee();
    }

    // Attendance Management
    @Override
    public void viewAttendance() {
        attendanceService.viewAttendance();
    }

    public void updateAttendance() {
        attendanceService.updateAttendance();
    }

    public void deleteAttendance() {
        attendanceService.deleteAttendance();
    }

    // Leave Management
    public void viewLeaves() {
        leaveService.viewLeaves();
    }

    public void updateLeaves() {
        leaveService.updateLeaves();
    }

    public void deleteLeave() {
        leaveService.deleteLeave();
    }

    // Expense Management
    public void addExpense() {
        expenseService.addExpense();
    }

    public void viewExpense() {
        expenseService.viewExpense();
    }

    public void updateExpense() {
        expenseService.updateExpense();
    }

    public void deleteExpense() {
        expenseService.deleteExpense();
    }

    // Salary Management
    public void generateSalary() {
        salaryService.generateSalary();
    }

    public void viewGeneratedSalaries() {
        salaryService.viewGeneratedSalaries();
    }

    // Bonus Management
    public void addBonus() {
        bonusService.addBonus();
    }

    public void viewBonus() {
        bonusService.viewBonus();
    }

    public void updateBonus() {
        bonusService.updateBonus();
    }

    public void deleteBonus() {
        bonusService.deleteBonus();
    }

    public void assignBonus() {
        bonusService.assignBonus();
    }

    // Summary
    public void viewSummary() {
        summaryService.viewSummary();
    }

    // Main Menu and Login
    public void viewMainMenu() {
        menuService.showAdminMainMenu();
    }

     public void logout() {
        menuService.logout();
    }

   
}
 
 
 
