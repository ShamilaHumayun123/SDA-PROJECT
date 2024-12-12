package employeemanagementsystem;

public class LeaveService {

    public void addLeave(int empId) {
         AddLeave addLeaveUI = new AddLeave(empId);
         addLeaveUI.setVisible(true);
    }

    public void viewLeaves(int empId) {
         ViewLeavesEmployee viewLeavesUI = new ViewLeavesEmployee(empId);
         viewLeavesUI.setVisible(true);
    }
      public void viewLeaves() {
         ViewLeaves viewLeavesUI = new ViewLeaves();
         viewLeavesUI.setVisible(true);
    }
     public void updateLeaves() {
         UpdateLeaves updateLeavesUI = new  UpdateLeaves();
         updateLeavesUI.setVisible(true);
    }
       public void deleteLeave() {
        DelLeaves deleteLeavesUI = new DelLeaves();
        deleteLeavesUI.setVisible(true);
    }
}
