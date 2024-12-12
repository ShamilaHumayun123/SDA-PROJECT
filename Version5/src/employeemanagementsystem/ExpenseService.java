/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

/**
 *
 * @author SHAMILA HUMAYUN
 */
public class ExpenseService {
     public void addExpense() {
         AddCompanyExpense addExpenseUI = new AddCompanyExpense();
        addExpenseUI.setVisible(true);
    }

    public void viewExpense() {
        ViewCompanyExpense viewExpenseUI = new ViewCompanyExpense();
        viewExpenseUI.setVisible(true);
    }

    public void updateExpense() {
        UpdateCompanyExpense updateExpenseUI = new UpdateCompanyExpense();
        updateExpenseUI.setVisible(true);
    }

    public void deleteExpense() {
         DelCompanyExpense deleteExpenseUI = new DelCompanyExpense();
         deleteExpenseUI.setVisible(true);
    }
}
