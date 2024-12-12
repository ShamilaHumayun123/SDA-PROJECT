package employeemanagementsystem;

public class MenuService {

    public void showEmployeeMainMenu(int empId) {
        WelcomeScreenEmployee mainMenuUI = new WelcomeScreenEmployee(empId);
        mainMenuUI.setVisible(true);
    }
     public void showAdminMainMenu() {
        WelcomeScreen mainMenuUI = new WelcomeScreen();
        mainMenuUI.setVisible(true);
    }

    public void logout() {
        Login loginUI = new Login();
        loginUI.setVisible(true);
    }
}
