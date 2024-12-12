/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;
import java.util.List;
/**
 *
 * @author SHAMILA HUMAYUN
 */
public class SummaryController {
    
    private SummaryModel model;

    public SummaryController() {
        model = new SummaryModel();
    }

    // Fetch employee summary data from the Model
    public List<Object[]> getEmployeeSummary() {
        return model.getEmployeeSummary();
    }
}


