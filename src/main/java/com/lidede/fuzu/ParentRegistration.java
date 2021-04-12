/*
136362 Timothy Lidede ICS A
*/
package com.lidede.fuzu;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

public class ParentRegistration extends javax.swing.JFrame{

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public ParentRegistration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayText = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        childUsername = new javax.swing.JTextField();
        childFName = new javax.swing.JTextField();
        childLName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonParentRegister = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        displayText.setBackground(new java.awt.Color(54, 69, 79));
        displayText.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 182, 193));
        jLabel1.setText("PARENT REGISTRATION");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 182, 193));
        jLabel4.setText("First Name:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 182, 193));
        jLabel5.setText("Last Name:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 182, 193));
        jLabel7.setText("Student Username:");

        childUsername.setBackground(new java.awt.Color(54, 69, 79));
        childUsername.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        childUsername.setForeground(new java.awt.Color(255, 255, 255));
        childUsername.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        childUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childUsernameActionPerformed(evt);
            }
        });

        childFName.setBackground(new java.awt.Color(54, 69, 79));
        childFName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        childFName.setForeground(new java.awt.Color(255, 255, 255));
        childFName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        childLName.setBackground(new java.awt.Color(54, 69, 79));
        childLName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        childLName.setForeground(new java.awt.Color(255, 255, 255));
        childLName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        childLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childLNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter the details of your child");

        jButton1.setBackground(new java.awt.Color(54, 69, 79));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CANCEL");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonParentRegister.setBackground(new java.awt.Color(54, 69, 79));
        jButtonParentRegister.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonParentRegister.setForeground(new java.awt.Color(255, 255, 255));
        jButtonParentRegister.setText("REGISTER");
        jButtonParentRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonParentRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonParentRegisterMouseClicked(evt);
            }
        });
        jButtonParentRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParentRegisterActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(103, 103, 103));
        jLabel8.setText("sigmawolf");

        javax.swing.GroupLayout displayTextLayout = new javax.swing.GroupLayout(displayText);
        displayText.setLayout(displayTextLayout);
        displayTextLayout.setHorizontalGroup(
            displayTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayTextLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(displayTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayTextLayout.createSequentialGroup()
                        .addGroup(displayTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(displayTextLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(childFName, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(displayTextLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonParentRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, displayTextLayout.createSequentialGroup()
                                .addGroup(displayTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGroup(displayTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(displayTextLayout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(childLName, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayTextLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(childUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(displayTextLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        displayTextLayout.setVerticalGroup(
            displayTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayTextLayout.createSequentialGroup()
                .addGroup(displayTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayTextLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(displayTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(53, 53, 53)
                .addGroup(displayTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childFName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(50, 50, 50)
                .addGroup(displayTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(childLName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(displayTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonParentRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(displayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(displayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonParentRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParentRegisterActionPerformed
        String newChildUsername = childUsername.getText();
        String newChildfName = childFName.getText();
        String newChildlName = childLName.getText();
        
        if(newChildUsername.equals("")){
            JOptionPane.showMessageDialog(null, "Add Student Username");
        }
        else if(newChildfName.equals("")){
            JOptionPane.showMessageDialog(null, "Add First Name");
        }
        
        else if(newChildlName.equals("")){
            JOptionPane.showMessageDialog(null, "Add Last Name");
        }
        
        else{
            try{
                String sql = "INSERT INTO tbl_student"
                        + "(student_username, student_fName, student_lName)"
                        + "VALUES (?,?,?)";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/136362_miniproject", "root", "");
                pst = con.prepareStatement(sql);
                pst.setString(1, childUsername.getText());
                pst.setString(2, childFName.getText());
                pst.setString(3, childLName.getText());

                int res = JOptionPane.showConfirmDialog(null, "Before continuing, please confirm that these details are correct:\nUsername: " + newChildUsername + "\nFirst Name: " + newChildfName + "\nLast Name: " + newChildlName);
                if(res == 0){
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Your child has been successfully registered. Welcome aboard!");
                }else if(res == 1){
                    JOptionPane.showMessageDialog(null, "Please correct the details", "Try Again", JOptionPane.PLAIN_MESSAGE);
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_jButtonParentRegisterActionPerformed

    private void jButtonParentRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonParentRegisterMouseClicked

    }//GEN-LAST:event_jButtonParentRegisterMouseClicked

    private void childLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_childLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_childLNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ParentLogin parentLogin = new ParentLogin();
        parentLogin.setVisible(true);
        parentLogin.pack();
        parentLogin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void childUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_childUsernameActionPerformed
        ;
    }//GEN-LAST:event_childUsernameActionPerformed
    
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
            java.util.logging.Logger.getLogger(ParentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField childFName;
    private javax.swing.JTextField childLName;
    private javax.swing.JTextField childUsername;
    private javax.swing.JPanel displayText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonParentRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
