/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loansystem;

import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
/**
 *
 * @author kiwzu
 */

public class LoanData extends javax.swing.JInternalFrame {

    
    public List<CalLoan> InstallmentList = new ArrayList<>();
    UserInfo cust = new UserInfo();
    Float TotalInt;
    Float Totalinstallment;
    Float InstallmentPrincipal;
    Float InstallmentPrincipals;
    Float InstallmentInt;
    int day,month,year;
    String date;
    
    /**
     * Creates new form 
     */
    public LoanData() {
        initComponents();
        pack();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnSavefile = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCal = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtInstallment = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtIntRate = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtFname = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAmount = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtFullname = new javax.swing.JTextPane();
        btnSearch = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblSearch = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSavefile.setText("บันทึก");
        btnSavefile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSavefileMouseClicked(evt);
            }
        });

        jLabel3.setText("จำนวนงวด(เดือน)");

        btnCal.setText("คำนวณค่างวด");
        btnCal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalMouseClicked(evt);
            }
        });
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(txtInstallment);

        jLabel1.setText("ชื่อ-นามสกุล");

        jLabel2.setText("ยอดเงินที่ต้องการกู้");

        jLabel4.setText("อัตราดอกเบี้ย(ต่อปี)");

        tblResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "งวด", "เงินต้นยกมา", "ดอกเบี้ย", "ค่างวด", "เป็นเงินต้น", "เป็นดอกเบี้ย", "เงินต้นคงเหลือ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResult);
        if (tblResult.getColumnModel().getColumnCount() > 0) {
            tblResult.getColumnModel().getColumn(0).setHeaderValue("งวด");
            tblResult.getColumnModel().getColumn(1).setHeaderValue("เงินต้นยกมา");
            tblResult.getColumnModel().getColumn(2).setHeaderValue("ดอกเบี้ย");
            tblResult.getColumnModel().getColumn(3).setHeaderValue("ค่างวด");
            tblResult.getColumnModel().getColumn(4).setHeaderValue("เป็นเงินต้น");
            tblResult.getColumnModel().getColumn(5).setHeaderValue("เป็นดอกเบี้ย");
            tblResult.getColumnModel().getColumn(6).setHeaderValue("เงินต้นคงเหลือ");
        }

        jScrollPane5.setViewportView(txtIntRate);

        jScrollPane2.setViewportView(txtFname);

        jScrollPane3.setViewportView(txtAmount);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(btnCal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnSavefile, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3)
                                .addComponent(jScrollPane2)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(293, 293, 293))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSavefile, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("UserInfo", jPanel1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("ค้นหา");

        jLabel6.setText("ข้อมูลของผู้กู้เงิน");

        jLabel7.setText("ชื่อ-นามสกุล");

        jScrollPane6.setViewportView(txtFullname);

        btnSearch.setText("ค้นหา");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "งวด", "เงินต้นยกมา", "ดอกเบี้ย", "ค่างวด", "เป็นเงินต้น", "เป็นดอกเบี้ย", "เงินต้นคงเหลือ", "วันที่ชำระ", "สถานะ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSearch.setColumnSelectionAllowed(true);
        jScrollPane8.setViewportView(tblSearch);
        tblSearch.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jButton1.setText("เกินกำหนด");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSearch)
                                .addGap(26, 26, 26)
                                .addComponent(jButton1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(jButton1))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Search", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalMouseClicked

        
        //create userinfo obj
        
        cust.setFname(txtFname.getText());
        cust.setAmount(Float.parseFloat(txtAmount.getText()));
        cust.setInstallment(Integer.parseInt(txtInstallment.getText()));
        cust.setIntRate(Float.parseFloat(txtIntRate.getText()));

        
        System.out.println("Fname = " + cust.getFname());
        System.out.println("Amount = " + cust.getAmount());
        System.out.println("Inst = " + cust.getInstallment());
        System.out.println("Rate = " + cust.getIntRate());

        TotalInt = (float)cust.getAmount()*((cust.getIntRate()/100)*(cust.getInstallment()/(float)12));
        System.out.println("TotalInt = " + TotalInt);

        InstallmentPrincipal = (float)cust.getAmount()/(float)cust.getInstallment();
        System.out.println("InstallmentPrincipal = " + InstallmentPrincipal);
        InstallmentInt = (float)TotalInt/(float)cust.getInstallment();
        System.out.println("InstallmentAmount = " + InstallmentInt);

        Totalinstallment = InstallmentPrincipal +  InstallmentInt;
        System.out.println("Totalinstallment = " + Totalinstallment);

        Float PrincipalBal = cust.getAmount();
        
        
        DefaultTableModel model = (DefaultTableModel)tblResult.getModel();
        //create date for pay
         day = LocalDateTime.now().getDayOfMonth();
         month = LocalDateTime.now().getMonthValue();
         year = LocalDateTime.now().getYear();
         
         
        for (int i = 1; i <= cust.getInstallment(); i++){
            System.out.println("1cust.getInstallment = " + cust.getInstallment());
            System.out.println("Installment = " +i);
            System.out.println("model.getRowCount()-1 = " + String.valueOf(model.getRowCount()-1));

            String s = String.valueOf(cust.getIntRate()+"%");

            //System.out.println("Rate = " + s);
            //System.out.println("Rate = " + String.valueOf(cust.getIntRate()+"%"));

            model.addRow(new Object[0]);
            
            //Col 1 = InstallmentNo
            model.setValueAt(i, model.getRowCount()-1, 0);
            //Col 2 = BalanceForward
            model.setValueAt(PrincipalBal, model.getRowCount() -1, 1);
            //Col 3 = IntRate for year
            model.setValueAt(s, model.getRowCount() -1, 2);
            //Col 4 = TotalInstallment
            model.setValueAt(Totalinstallment, model.getRowCount() -1, 3);
            //Col 5 = InstallmentPrincipal
            model.setValueAt(InstallmentPrincipal, model.getRowCount() -1, 4);
            //Col 6 = InstallmentAmount
            model.setValueAt(InstallmentInt, model.getRowCount() -1, 5);
            //Col 7 = PrincipalBalance
            model.setValueAt(PrincipalBal-InstallmentPrincipal, model.getRowCount() -1, 6);
            
            //set new BalancePrincipal
            PrincipalBal = PrincipalBal-InstallmentPrincipal;
        }
        System.out.println("End: Cal");
    }//GEN-LAST:event_btnCalMouseClicked

    private void btnSavefileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSavefileMouseClicked
        // TODO add your handling code here:
        
        System.out.println("Start: Save");
        
        Float TotalInt;
        Float Totalinstallment;
        Float InstallmentPrincipal;
        Float InstallmentInt;
        
        
        //create userinfo obj
        UserInfo cust = new UserInfo();
        cust.setFname(txtFname.getText());
        cust.setAmount(Float.parseFloat(txtAmount.getText()));
        cust.setInstallment(Integer.parseInt(txtInstallment.getText()));
        cust.setIntRate(Float.parseFloat(txtIntRate.getText()));

        TotalInt = (float)cust.getAmount()*((cust.getIntRate()/100)*(cust.getInstallment()/(float)12));
        InstallmentPrincipal = (float)cust.getAmount()/(float)cust.getInstallment();
        InstallmentInt = (float)TotalInt/(float)cust.getInstallment();
        Totalinstallment = InstallmentPrincipal +  InstallmentInt;
        Float PrincipalBal = cust.getAmount();
        
        for (int i = 1; i <= cust.getInstallment(); i++){
            
            System.out.println("Save: for loop #"+i);
            
            CalLoan cal = new CalLoan();

            String s = String.valueOf(cust.getIntRate()+"%");            
            
            cal.setFname(cust.getFname());
            
            cal.setInstallmentNo(i);
            cal.setPrevPrincipal(PrincipalBal);
            cal.setIntRate(s);
            cal.setInstallmentAmt(Totalinstallment);
            cal.setInstallmentPrincipal(InstallmentPrincipal);
            cal.setInstallmentInt(InstallmentInt);
            cal.setRemainingPrincipal(PrincipalBal-InstallmentPrincipal);
            
            //set new BalancePrincipal
            PrincipalBal = PrincipalBal-InstallmentPrincipal;
     
            InstallmentList.add(cal);
        }
        
        System.out.println("End Save: Before write");
        writeObjecttoFile(InstallmentList);
        System.out.println("End Save: After write");

    }//GEN-LAST:event_btnSavefileMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
       
           
       DefaultTableModel mode1 = (DefaultTableModel)tblSearch.getModel();
       //CalLoan cal = new CalLoan();
       
       String sName;
       
       sName = txtFullname.getText();
       System.out.println(txtFullname.getText());
       System.out.println(cust.getFname());
       
           if (txtFullname.getText().equalsIgnoreCase(cust.getFname())){
               System.out.println("cust.getInstallment = " + cust.getInstallment());
            String s = String.valueOf(cust.getIntRate()+"%");
            TotalInt = (float)cust.getAmount()*((cust.getIntRate()/100)*(cust.getInstallment()/(float)12));
            System.out.println("TotalInt = " + TotalInt);

            InstallmentPrincipals = (float)cust.getAmount()/(float)cust.getInstallment();
            System.out.println("InstallmentPrincipals = " + InstallmentPrincipals);
            InstallmentInt = (float)TotalInt/(float)cust.getInstallment();
            System.out.println("InstallmentAmount = " + InstallmentInt);

            Totalinstallment = InstallmentPrincipals +  InstallmentInt;
            System.out.println("Totalinstallment = " + Totalinstallment);
            Float PrincipalBals = cust.getAmount();
            
        for (int i = 1; i <= cust.getInstallment(); i++){
            
            mode1.addRow(new Object[0]);
            //Col 1 = InstallmentNo
            mode1.setValueAt(i, mode1.getRowCount()-1, 0);
            //Col 2 = BalanceForward
            mode1.setValueAt(PrincipalBals, mode1.getRowCount() -1, 1);
            //Col 3 = IntRate for year
            mode1.setValueAt(s, mode1.getRowCount() -1, 2);
            //Col 4 = TotalInstallment
            mode1.setValueAt(Totalinstallment, mode1.getRowCount() -1, 3);
            //Col 5 = InstallmentPrincipals
            mode1.setValueAt(InstallmentPrincipals, mode1.getRowCount() -1, 4);
            //Col 6 = InstallmentAmount
            mode1.setValueAt(InstallmentInt, mode1.getRowCount() -1, 5);
            //Col 7 = PrincipalBalance
            mode1.setValueAt(PrincipalBals-InstallmentPrincipals, mode1.getRowCount() -1, 6);
            //Col 8 = PayDate
             int j = 1;
            month = month + j;
            j++;
            date = day+"-"+month+"-"+year;
            mode1.setValueAt(date, mode1.getRowCount() -1, 7);
            System.out.println("month = " + month);
            //Col 9 = Status
            mode1.setValueAt(false, mode1.getRowCount() -1, 8);
            //set new BalancePrincipal
            PrincipalBals = PrincipalBals-InstallmentPrincipals;
            System.out.println("PrincipalBals = " + PrincipalBals);
        }
           }else{
           JOptionPane.showMessageDialog(null, "ไม่พบข้อมูล", "Error", JOptionPane.ERROR_MESSAGE);
           }
        
       
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(LoanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanData().setVisible(true);
            }
        });
    }
    
    private boolean writeObjecttoFile(List<CalLoan> pListData){
        
      System.out.println("Start: Write");
        
       String fileP = "D:\\UserData.bin";
       
       try{
          FileOutputStream file = new FileOutputStream(fileP);
          ObjectOutputStream writer = new ObjectOutputStream(file);

          writer.writeObject(pListData);

          writer.close();
          file.close();
          
          System.out.println("End Write: Success");
          
          return true;
       }
       catch(Exception ex){
           System.err.println("failed to write" + fileP + ", "+ex);
           
           System.out.println("End Write: Failed");
           
           return false;
       }
    }
   
//        private List<CalLoan> readUserDataFromFile(){
//           String fileP = "D:\\UserData.bin";
//           try{
//              FileInputStream file = new FileInputStream(fileP);
//              ObjectInputStream reader = new ObjectInputStream(file);
//              while(true){
//                  try{
//                   List<CalLoan> obj = (List<CalLoan>)reader.readObject();
//                   return obj ;
//                   
//                  } catch(Exception ex){
//                        System.err.println("end of reader file");
//                         break;
//                      }   
//                  
//              }
//           
//           }catch(Exception ex){
//               System.err.println("failed to read" + fileP + ", "+ex);
//               
//          }
//            return  null;
//        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnSavefile;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblResult;
    private javax.swing.JTable tblSearch;
    private javax.swing.JTextPane txtAmount;
    private javax.swing.JTextPane txtFname;
    private javax.swing.JTextPane txtFullname;
    private javax.swing.JTextPane txtInstallment;
    private javax.swing.JTextPane txtIntRate;
    // End of variables declaration//GEN-END:variables

 
}
