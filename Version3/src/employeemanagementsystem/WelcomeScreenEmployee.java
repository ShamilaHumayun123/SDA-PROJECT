/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

/**
 *
 * @author INN
 */
public class WelcomeScreenEmployee extends javax.swing.JFrame {

    /**
     * Creates new form LoginInterface
     */
     private int empId;
     private Employee employeeView;
    public WelcomeScreenEmployee() {
        initComponents();
    }

      public WelcomeScreenEmployee(int employeeId) {
        initComponents();
        this.empId = employeeId;
        employeeView = new Employee(empId, null, null, null, 0, null, null, 0, 0, null, null, 0, null);
   
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelSide = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        ViewSalaryB = new javax.swing.JButton();
        ViewBonusB = new javax.swing.JButton();
        ViewPersonalInfoB = new javax.swing.JButton();
        AddAttendanceB = new javax.swing.JButton();
        ViewAttendanceB = new javax.swing.JButton();

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBorder(new javax.swing.border.MatteBorder(null));
        MainPanel.setForeground(new java.awt.Color(51, 51, 255));
        MainPanel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 51, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText(" WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");

        PanelSide.setBackground(new java.awt.Color(51, 51, 255));
        PanelSide.setPreferredSize(new java.awt.Dimension(130, 600));
        PanelSide.setRequestFocusEnabled(false);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employeemanagementsystem/icon (3).jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Employee Portal");

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 204));
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSideLayout = new javax.swing.GroupLayout(PanelSide);
        PanelSide.setLayout(PanelSideLayout);
        PanelSideLayout.setHorizontalGroup(
            PanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelSideLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelSideLayout.setVerticalGroup(
            PanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ViewSalaryB.setBackground(new java.awt.Color(51, 51, 255));
        ViewSalaryB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewSalaryB.setForeground(new java.awt.Color(255, 255, 204));
        ViewSalaryB.setText("View Salary");
        ViewSalaryB.setActionCommand("View  Employees");
        ViewSalaryB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ViewSalaryB.setMaximumSize(new java.awt.Dimension(150, 50));
        ViewSalaryB.setMinimumSize(new java.awt.Dimension(150, 50));
        ViewSalaryB.setPreferredSize(new java.awt.Dimension(150, 50));
        ViewSalaryB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewSalaryBActionPerformed(evt);
            }
        });

        ViewBonusB.setBackground(new java.awt.Color(51, 51, 255));
        ViewBonusB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewBonusB.setForeground(new java.awt.Color(255, 255, 204));
        ViewBonusB.setText("View Bonus");
        ViewBonusB.setActionCommand("View  Employees");
        ViewBonusB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ViewBonusB.setMaximumSize(new java.awt.Dimension(150, 50));
        ViewBonusB.setMinimumSize(new java.awt.Dimension(150, 50));
        ViewBonusB.setPreferredSize(new java.awt.Dimension(150, 50));
        ViewBonusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBonusBActionPerformed(evt);
            }
        });

        ViewPersonalInfoB.setBackground(new java.awt.Color(51, 51, 255));
        ViewPersonalInfoB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewPersonalInfoB.setForeground(new java.awt.Color(255, 255, 204));
        ViewPersonalInfoB.setText("View Personal Info");
        ViewPersonalInfoB.setActionCommand("View  Employees");
        ViewPersonalInfoB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ViewPersonalInfoB.setMaximumSize(new java.awt.Dimension(150, 50));
        ViewPersonalInfoB.setMinimumSize(new java.awt.Dimension(150, 50));
        ViewPersonalInfoB.setPreferredSize(new java.awt.Dimension(150, 50));
        ViewPersonalInfoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPersonalInfoBActionPerformed(evt);
            }
        });

        AddAttendanceB.setBackground(new java.awt.Color(51, 51, 255));
        AddAttendanceB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddAttendanceB.setForeground(new java.awt.Color(255, 255, 204));
        AddAttendanceB.setText("Add Attendance");
        AddAttendanceB.setActionCommand("View  Employees");
        AddAttendanceB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddAttendanceB.setMaximumSize(new java.awt.Dimension(150, 50));
        AddAttendanceB.setMinimumSize(new java.awt.Dimension(150, 50));
        AddAttendanceB.setPreferredSize(new java.awt.Dimension(150, 50));
        AddAttendanceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAttendanceBActionPerformed(evt);
            }
        });

        ViewAttendanceB.setBackground(new java.awt.Color(51, 51, 255));
        ViewAttendanceB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewAttendanceB.setForeground(new java.awt.Color(255, 255, 204));
        ViewAttendanceB.setText("View Attendance");
        ViewAttendanceB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ViewAttendanceB.setMaximumSize(new java.awt.Dimension(150, 50));
        ViewAttendanceB.setMinimumSize(new java.awt.Dimension(150, 50));
        ViewAttendanceB.setPreferredSize(new java.awt.Dimension(150, 50));
        ViewAttendanceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAttendanceBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(PanelSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddAttendanceB, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewPersonalInfoB, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ViewBonusB, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(ViewAttendanceB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addComponent(ViewSalaryB, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddAttendanceB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewBonusB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewSalaryB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewPersonalInfoB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewAttendanceB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(307, Short.MAX_VALUE))
            .addComponent(PanelSide, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddAttendanceBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAttendanceBActionPerformed
         employeeView.addAttendance();
         dispose();
    }//GEN-LAST:event_AddAttendanceBActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Login w  = new Login();
        w.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
         employeeView.logout();
         dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ViewAttendanceBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAttendanceBActionPerformed
         employeeView.viewAttendance();
         dispose();
    }//GEN-LAST:event_ViewAttendanceBActionPerformed

    private void ViewSalaryBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewSalaryBActionPerformed
        // TODO add your handling code here:
        employeeView.viewSalary();
         dispose();
    }//GEN-LAST:event_ViewSalaryBActionPerformed

    private void ViewBonusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBonusBActionPerformed
        // TODO add your handling code here:
         employeeView.viewBonus();
         dispose();
    }//GEN-LAST:event_ViewBonusBActionPerformed

    private void ViewPersonalInfoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPersonalInfoBActionPerformed
        // TODO add your handling code here:
        
          employeeView.viewEmployeeInfo();
         dispose();
    }//GEN-LAST:event_ViewPersonalInfoBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreenEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreenEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreenEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreenEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeScreenEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAttendanceB;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel PanelSide;
    private javax.swing.JButton ViewAttendanceB;
    private javax.swing.JButton ViewBonusB;
    private javax.swing.JButton ViewPersonalInfoB;
    private javax.swing.JButton ViewSalaryB;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}