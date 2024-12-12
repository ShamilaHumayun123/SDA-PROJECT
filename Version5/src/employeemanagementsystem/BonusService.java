package employeemanagementsystem;

public class BonusService {

    public void viewBonus(int empId) {
        ViewBonus1 viewBonusUI = new ViewBonus1(empId);
        viewBonusUI.setVisible(true);
    }
     public void addBonus() {
         AddBonus addBonus = new AddBonus();
         addBonus.setVisible(true);
    }
     public void viewBonus() {
         ViewBonus viewBonus = new ViewBonus();
         viewBonus.setVisible(true);
    }
     
       public void updateBonus() {
         UpdateBonus updateBonus = new UpdateBonus();
         updateBonus.setVisible(true);
    }
      public void deleteBonus() {
               DelBonus delBonus = new DelBonus();
          delBonus.setVisible(true);
    }
    public void assignBonus() {
         AssignBonus assignBonus = new AssignBonus();
         assignBonus.setVisible(true);
    }
}
