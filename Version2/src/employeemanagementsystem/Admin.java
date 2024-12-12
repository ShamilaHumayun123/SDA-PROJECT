
package employeemanagementsystem;


public class Admin extends Employee{

    public Admin(int id, String Name, String Address, String MobileNo, int Experience, String City, String Country, int age, int Salary, String password, String Cnic, int DepartmentId, String Email) {
        super(id, Name, Address, MobileNo, Experience, City, Country, age, Salary, password, Cnic, DepartmentId, Email);
    }
   
    public Admin()
    {
        
    }
    public void AddEmployee(){
         AddEmployee a1=new AddEmployee();
         a1.setVisible(true);
    }
   
    public void ViewEmployee(){
        ViewEmployee a1=new ViewEmployee();
         a1.loadData();
         a1.setVisible(true);
    }
    public void ViewAttendance(){
        ViewAttendance a1=new ViewAttendance();
         a1.loadData();
         a1.setVisible(true);
    }
    public void UpdateAttendance(){
         UpdateAttendance a1=new UpdateAttendance();
         a1.setVisible(true);
    }
    public void UpdateEmployee(){
         UpdateEmployee a1=new UpdateEmployee();
         a1.setVisible(true);
    }
   
    public void ViewLeaves(){
       // ViewLeaves a1=new ViewLeaves();
       //  a1.loadData();
       //  a1.setVisible(true);
    }
    public void UpdateLeaves(){
        // UpdateLeaves a1=new UpdateLeaves();
       //  a1.setVisible(true);
    }
     public void DeleteLeave(){
         // DelLeaves a1=new DelLeaves();
         //a1.setVisible(true);
    }
  
   
    public void DeleteAttendance(){
          DelAttendance a1=new DelAttendance();
         a1.setVisible(true);
    }
    public void DeleteEmployee(){
          DelEmployee a1=new DelEmployee();
         a1.setVisible(true);
    }
     public void AddExpense(){
         // AddCompanyExpense a1=new AddCompanyExpense();
        // a1.setVisible(true);
    }
      public void ViewExpense(){
          //ViewCompanyExpense a1=new ViewCompanyExpense();
  //       a1.setVisible(true);
    }
       public void DeleteExpense(){
    ///      DelCompanyExpense a1=new DelCompanyExpense();
       ////  a1.setVisible(true);
    }
       public void UpdateExpense(){
        //  UpdateCompanyExpense a1=new UpdateCompanyExpense();
        // a1.setVisible(true);
    }
        
       public void GenerateSalary(){
          GenerateSalary a1=new GenerateSalary();
         a1.setVisible(true);
    }
         public void ViewGenerateSalary(){
          ViewSalaries a1=new ViewSalaries();
         a1.setVisible(true);
    }
          public void ViewSmmary(){
          ViewSummary a1=new ViewSummary();
         a1.setVisible(true);
    }
    
     public void AddBonus(){
          AddBonus a1=new AddBonus();
         a1.setVisible(true);
    }
      public void ViewBonus(){
          ViewBonus a1=new ViewBonus();
         a1.setVisible(true);
    }
       public void DeleteBonus(){
          DelBonus a1=new DelBonus();
         a1.setVisible(true);
    }
       public void UpdateBonus(){
          UpdateBonus a1=new UpdateBonus();
         a1.setVisible(true);
    }
    
         public void AssignBonus(){
          AssignBonus a1=new AssignBonus();
         a1.setVisible(true);
    }
    public void ViewMainMenu(){
         WelcomeScreen a1=new WelcomeScreen();
         a1.setVisible(true);
    }

    @Override
    public boolean login(int id, String password) {
        return  EMS.getInstance().adminLogin(id, password);
    }
    @Override
    public void logout()
    {
      super.logout();
    }
    
}
