/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

import java.io.*;
import java.util.*;


public class EMSAttendance {

     public ArrayList<Attendance> attendaces;
     private PrintWriter output;
     private Scanner input;
     
       private static EMSAttendance emsAtt;


      public EMSAttendance() {
        attendaces = new ArrayList<Attendance>();
      
        try{
            output = new PrintWriter(new FileWriter("C:/JavaFiles/Attendance.txt", true));
            input = new Scanner(new File("C:/JavaFiles/Attendance.txt"));
           
        }catch(Exception e){
            e.printStackTrace();
        }
       loadData();
    }
    public static EMSAttendance getInstance(){
        if(emsAtt == null){
            emsAtt = new EMSAttendance();
        }
        return emsAtt;
    }
    public Attendance searchAttendance(int id){
        for(Attendance e : attendaces){
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }
    
     public boolean removeAttendanceById(int id){
        for(Attendance e : attendaces){
            if(e.getId() == id){
                attendaces.remove(e);
                writeBack();
                return true;
            }
        }
        return false;
    }
    
    private void writeBack(){
        try{
            PrintWriter writeBack = new PrintWriter(new FileWriter("C:/JavaFiles/Employee.txt"));
            for(Attendance e : attendaces){
                writeToFile(e);
            }
            writeBack.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     private void loadData(){
        try{
            while(input.hasNext()){
                String st = input.nextLine();
                String empl[] = st.split(":");
                Attendance a = new Attendance(Integer.parseInt(empl[0]),empl[1],empl[2],empl[3],empl[4]);
                attendaces.add(a);
            }
            input.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     public void editAttendace(int id, String name, String date, String timeIn, String timeOut){
        for(Attendance e : attendaces){
            if(e.getId() == id){
                e.setName(name);
                e.setDate(date);
                e.setTimeIn(timeIn);
                e.setTimeOut(timeOut);
                writeBack();
            }
        }
    }
    public void addAttendance(int id, String name, String date, String timeIn,  String timeOut){
        Attendance e = new Attendance(id,name,date,timeIn,timeOut);
        attendaces.add(e);
        writeToFile(e);
    }
    

    public void writeToFile(Attendance e){
        try{
            output.println(e.getId() + ":" + e.getName()+ ":" + e.getDate()+ ":" + e.getTimeIn()+ ":" + e.getTimeOut());
            output.flush();
            output.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
   
   
   
}
