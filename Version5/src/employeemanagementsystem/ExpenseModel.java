package employeemanagementsystem;

import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExpenseModel {
    private Connection conn;

    public ExpenseModel() {
         conn = DBConnection.getConnection();
    }

    public boolean addExpense(String name, String detail, String date, String amount) {
        try {
            Statement stmt = conn.createStatement();
            String strInsert = "INSERT INTO expense (name, description, expense_date, expense_amount, create_date) " +
                               "VALUES ('" + name + "', '" + detail + "', '" + date + "', '" + amount + "', CURDATE())";
            stmt.execute(strInsert);
            return true; // Successful insertion
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Insertion failed
        }
    }
    
     public boolean updateExpense(int id, String name, String detail, String date, String amount) {
        try {
            Statement stmt = conn.createStatement();
            String updateQuery = "UPDATE expense SET name = '" + name + "', description = '" + detail + 
                                 "', expense_date = '" + date + "', expense_amount = " + amount + 
                                 " WHERE id = " + id;
            stmt.execute(updateQuery);
            return true; // Update successful
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Update failed
        }
    }
     
     public Map<String, String> getExpenseById(int id) {
        Map<String, String> expenseData = new HashMap<>();
        try {
            Statement stmt = conn.createStatement();
            String selectQuery = "SELECT * FROM expense WHERE id = " + id;
            ResultSet rs = stmt.executeQuery(selectQuery);

            if (rs.next()) {
                expenseData.put("name", rs.getString("name"));
                expenseData.put("description", rs.getString("description"));
                expenseData.put("expense_date", rs.getString("expense_date"));
                expenseData.put("expense_amount", rs.getString("expense_amount"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return expenseData; // Returns an empty map if no record is found
    }
     
      public List<Object[]> getAllExpenses() {
        List<Object[]> expenseList = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            String selectQuery = "SELECT * FROM expense";
            System.err.println(selectQuery);
            ResultSet rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                Object[] data = {
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("description"),
                    rs.getString("expense_date"),
                    rs.getString("expense_amount")
                };
                expenseList.add(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return expenseList;
    }
}
