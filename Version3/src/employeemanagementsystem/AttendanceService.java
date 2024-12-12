package employeemanagementsystem;

public class AttendanceService {

    public void addAttendance(int empId) {
        AddAttendance addAttendanceUI = new AddAttendance(empId);
        addAttendanceUI.setVisible(true);
    }

    public void viewAttendance(int empId) {
        ViewAttendanceEmployee_1 viewAttendanceUI = new ViewAttendanceEmployee_1(empId);
        viewAttendanceUI.setVisible(true);
    }
     public void viewAttendance() {
        ViewAttendance viewAttendanceUI = new ViewAttendance();
        viewAttendanceUI.setVisible(true);
    }
      public void updateAttendance() {
        UpdateAttendance updateAttendance = new UpdateAttendance();
        updateAttendance.setVisible(true);
    }
         public void deleteAttendance() {
        DelAttendance delAttendance = new DelAttendance();
        delAttendance.setVisible(true);
    }
         
}
