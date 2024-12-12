/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import javax.swing.JOptionPane;


public class EMS {

    public ArrayList<Employee> employees;
      public ArrayList<Admin> admins;
    private PrintWriter output;
     private Scanner input;
     private Scanner input1;
     private Connection conn;
       private static EMS ems;


      public EMS() {
        employees = new ArrayList<Employee>();
        admins = new ArrayList<Admin>();
        try{
            conn=DriverManager.getConnection(  
                    "jdbc:mysql://127.0.0.1:3306/ems","root","");
            if(conn != null)
            {
                  // JOptionPane.showMessageDialog(null, "Connected");
            }else
            {
                   JOptionPane.showMessageDialog(null, "Not Connected");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
       loadData();
    }
    public static EMS getInstance(){
        if(ems == null){
            ems = new EMS();
        }
        return ems;
    }
    public Employee searchEmployee(int id){
        for(Employee e : employees){
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }
    public Boolean login(int id,String password){
        for(Employee e : employees){
            if(e.getId() == id && e.getPassword().matches(password)){
                return true;
            }
        }
        return false;
    }
    public Boolean adminLogin(int id,String password){
        for(Admin e : admins){
            if(e.getId() == id && e.getPassword().matches(password)){
                return true;
            }
        }
        return false;
    }
     public boolean removeEmployeeById(int id){
        for(Employee e : employees){
            if(e.getId() == id){
                employees.remove(e);
                writeBack();
                return true;
            }
        }
        return false;
    }
    
    private void writeBack(){
        try{
            PrintWriter writeBack = new PrintWriter(new FileWriter("C:/JavaFiles/Employee.txt"));
            for(Employee e : employees){
                writeToFile(e);
            }
            writeBack.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     private void loadData(){
         
         /*
         try{
               
            while(input.hasNext()){
               String st = input.nextLine();
                String empl[] = st.split(":");
               Employee s = new Employee(Integer.parseInt(empl[0]),empl[1],empl[2],empl[3],Integer.parseInt(empl[4]),empl[5], empl[6],Integer.parseInt(empl[7]),Integer.parseInt(empl[8]),empl[9],);
                employees.add(s);
            }
            input.close();
            while(input1.hasNext()){
               String st = input1.nextLine();
                String empl[] = st.split(":");
                Admin x = new Admin(Integer.parseInt(empl[0]),empl[1],empl[2],empl[3],Integer.parseInt(empl[4]),empl[5], empl[6],Integer.parseInt(empl[7]),Integer.parseInt(empl[8]),empl[9]);
                admins.add(x);
            }
            input1.close();
        }catch(Exception e){
            e.printStackTrace();
        }*/
    }
     public void editEmployee(int id, String name, String address, int salary, String mobileNumber){
        for(Employee e : employees){
            if(e.getId() == id){
                e.setName(name);
                e.setAddress(address);
                e.setSalary(salary);
                e.setMobileNo(mobileNumber);
                writeBack();
            }
        }
    }
    public void addEmployee(int id, String name, String Address, String MobileNo, int Experience, String City, String Country, int age, int salary, String password, String cnic, int departmentId, String email){
       /* try{
                Employee e = new Employee(id,name,Address,MobileNo,Experience,City,Country,age,salary,password, cnic, departmentId, email);
                Statement stmt = conn.createStatement();
                
                String strInsert = "INSERT INTO employee_info ( name, address, email, cnic, mobile_no, employee_department_id, basic_salary, age, city, country, experience, create_date) "
                                 + "values('"e.getName()+"','"+e.getAddress()+"','"+e.getEmail()+"','"+e.getCnic()+"','"+e.getMobileNo()+"',1,'"+e.getSalary()+"','"+e.getAge()+"','"+e.getCity()+"','"+e.getCountry()+"','"+e.getExperience()+"',curdate())";
                stmt.execute(strInsert);
                employees.add(e);
      // writeToFile(e);
         }catch(Exception ex){
            ex.printStackTrace();
        }*/
    }
    

    public void writeToFile(Employee e){
        try{
           // output.println(e.getId() + ":" + e.getName()+ ":" + e.getAddress() + ":" + e.getMobileNo() + ":" + e.getExperience() + ":" + e.getCity() + ":" + e.getCountry() + ":" + e.getAge() + ":" + e.getSalary()+":" + e.getPassword() + );
            output.flush();
            output.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
   
   
   
}
