
package employeemanagementsystem;

public class Employee {

    private int empoyeeInfoId;
    private int id;
    private String name;
    private String address;
    private String mobileNo;
    private int experience;
    private String city;
    private String country;
    private int age;
    private int salary;
    private String password;
    private String cnic;
    private String email;
    private int departmentId;

    private final AttendanceService attendanceService;
    private final LeaveService leaveService;
    private final BonusService bonusService;
    private final SalaryService salaryService;
    private final EmployeeInfoService employeeInfoService;
    private final MenuService menuService;

   
   
    public Employee(int id, String name, String address, String mobileNo, int experience, String city, String country,
                    int age, int salary, String password, String cnic, int departmentId, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
        this.experience = experience;
        this.city = city;
        this.country = country;
        this.age = age;
        this.salary = salary;
        this.password = password;
        this.cnic = cnic;
        this.departmentId = departmentId;
        this.email = email;
        this.attendanceService = new AttendanceService();
        this.leaveService = new LeaveService();
        this.bonusService = new BonusService();
        this.salaryService = new SalaryService();
        this.employeeInfoService = new EmployeeInfoService();
        this.menuService = new MenuService();
    }

   

    // Getters and Setters
    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Functional Methods
    public boolean login(int id, String password) {
        return EMS.getInstance().login(id, password);
    }

    public void addAttendance() {
        attendanceService.addAttendance(this.id);
    }

    public void viewAttendance() {
        attendanceService.viewAttendance(this.id);
    }

    public void addLeave() {
        leaveService.addLeave(this.id);
    }

    public void viewLeaves() {
        leaveService.viewLeaves(this.id);
    }

    public void viewSalary() {
        salaryService.viewSalary(this.id);
    }

    public void viewBonus() {
        bonusService.viewBonus(this.id);
    }

    public void viewEmployeeInfo() {
        employeeInfoService.viewEmployeeInfo(this.id);
    }

    public void showMainMenu(int id) {
        menuService.showEmployeeMainMenu(id);
    }

    public void logout() {
        menuService.logout();
    }

    int getId() {
        return  this.id;
    }
}
