
package employeemanagementsystem;


public class Employee {

    public int empoyeeInfoId ;
    public int id;
    public String Name;
    public String Address;
    public String MobileNo;
    public int Experience;
    public String City;
    public String Country;
    public int age;
    public int Salary;
    public String Password;
    public String Cnic;
    public String Email;
    public int DepartmentId;

    public String getCnic() {
        return Cnic;
    }

    public void setCnic(String cnic) {
        this.Cnic = cnic;
    }

    public int getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.DepartmentId = departmentId;
    }
    
    public Employee( )
    {
        
    }
    public Employee(int empInfoId)
    {
        this.empoyeeInfoId = empInfoId;
    }
    public Employee(int id, String Name, String Address, String MobileNo, int Experience, String City, String Country, int age, int Salary, String Password, String Cnic, int DepartmentId, String Email) {
        this.id = id;
        this.Name = Name;
        this.Address = Address;
        this.MobileNo = MobileNo;
        this.Experience = Experience;
        this.City = City;
        this.Country = Country;
        this.age = age;
        this.Salary = Salary;
        this.Password = Password;
        this.Cnic = Cnic;
        this.DepartmentId = DepartmentId;
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
     
    public String getPassword() {
        return Password;
    }
    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String MobileNo) {
        this.MobileNo = MobileNo;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int Experience) {
        this.Experience = Experience;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public boolean login(int id, String password)
    {
       return  EMS.getInstance().login(id, password);
    }
     public void AddAttendance(int empId){
         AddAttendance a1=new AddAttendance(empId);
         a1.setVisible(true);
    }
      public void AddLeave(int empId){
        // AddLeave a1=new AddLeave(empId);
        // a1.setVisible(true);
    }
    public void ViewMainMenu(int empId){
         WelcomeScreenEmployee a1=new WelcomeScreenEmployee(empId);
         a1.setVisible(true);
    }       
    
     public void ViewAttendanceEmployee(int empId){
         ViewAttendanceEmployee a1=new ViewAttendanceEmployee(empId);
         a1.setVisible(true);
    } 
     public void ViewLeavesEmployee(int empId){
         //ViewLeavesEmployee a1=new ViewLeavesEmployee(empId);
         //a1.setVisible(true);
    } 
     public void ViewSalaryEmployee(int empId){
         ViewSalaryEmployee a1=new ViewSalaryEmployee(empId);
         a1.setVisible(true);
    } 
     public void ViewBonusEmployee(int empId){
         ViewBonusEmployee a1=new ViewBonusEmployee(empId);
         a1.setVisible(true);
    } 
     public void ViewEmployeeInfo(int empId){
         ViewEmployeeInfo a1=new ViewEmployeeInfo(empId);
         a1.setVisible(true);
    } 
    public void logout()
    {
       Login w  = new Login();
        w.setVisible(true);
    }     
}
