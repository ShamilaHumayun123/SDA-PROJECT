/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

public class LoginController {

    private LoginModel model;

    public LoginController() {
        model = new LoginModel();
    }

    // Method to handle Admin login
    public int loginAsAdmin(String email, String password) {
        return model.validateAdminLogin(email, password);
    }

    // Method to handle Employee login
    public int loginAsEmployee(String email, String password) {
        return model.validateEmployeeLogin(email, password);
    }
}

