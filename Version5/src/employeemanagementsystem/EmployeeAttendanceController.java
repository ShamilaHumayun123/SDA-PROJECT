/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;


public class EmployeeAttendanceController {
    private EmployeeAttendanceModel model;
   
   public EmployeeAttendanceController() {
        model = new EmployeeAttendanceModel();
    }

    public boolean addAttendance(String date, String timeIn, String timeOut, int employeeId) {
        return model.addAttendance(date, timeIn, timeOut, employeeId);
    }
    public List<Object[]> fetchAttendanceData() {
        return model.getAttendanceData();
    }
    
    public boolean updateAttendance(int id, String date, String timeIn, String timeOut) {
        return model.updateAttendance(id, date, timeIn, timeOut);
    }
    
   public Map<String, String> fetchAttendanceById(int id) {
        return model.getAttendanceById(id);
    }

    // Method to delete attendance by ID
    public boolean deleteAttendanceById(int id) {
        return model.deleteAttendanceById(id);
    }
    
    
    public ResultSet loadAttendanceData(int empId) {
        ResultSet rs = model.getAttendanceData(empId);
        return rs;
    }
}

