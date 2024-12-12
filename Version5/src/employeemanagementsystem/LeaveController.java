package employeemanagementsystem;

import java.util.List;
import java.util.Map;

public class LeaveController {
    private LeaveModel model;

    public LeaveController() {
        model = new LeaveModel();
    }

    public boolean applyLeave(String startDate, String endDate, int employeeId) {
        return model.applyLeave(startDate, endDate, employeeId);
    }
    
    public boolean updateLeave(int id, String leaveStartDate, String leaveEndDate, String status) {
        return model.updateLeave(id, leaveStartDate, leaveEndDate, status);
    }

    public Map<String, String> getLeaveById(int id) {
        return model.getLeaveById(id);
    }
    
    public List<Object[]> getAllLeaves() {
        return model.getAllLeaves();
    }
    
     public List<Object[]> getLeavesByEmployeeId(int employeeId) {
        return model.getLeavesByEmployeeId(employeeId);
    }
}
