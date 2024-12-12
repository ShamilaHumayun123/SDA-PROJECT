package employeemanagementsystem;


import java.util.Map;
import java.util.List;

public class ExpenseController {
    private ExpenseModel model;

    public ExpenseController() {
        model = new ExpenseModel();
    }

    public boolean addExpense(String name, String detail, String date, String amount) {
        return model.addExpense(name, detail, date, amount);
    }
    
    public boolean updateExpense(int id, String name, String detail, String date, String amount) {
        return model.updateExpense(id, name, detail, date, amount);
    }
    
     public Map<String, String> getExpenseById(int id) {
        return model.getExpenseById(id);
    }
     
      public List<Object[]> getAllExpenses() {
        return model.getAllExpenses();
    }
}
