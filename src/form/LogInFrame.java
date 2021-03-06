/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import define.Account;
import java.awt.Color;
import javax.swing.JOptionPane;
import service.QuanLyTaiKhoan;

public class LogInFrame extends javax.swing.JFrame {
    
    QuanLyTaiKhoan quanLyTaiKhoan;
    Account account;       
    
    public LogInFrame() {
        initComponents();
        setSize(380, 330);
        setLocationRelativeTo(null);

        quanLyTaiKhoan = new QuanLyTaiKhoan();
        account= new Account();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        hidepass = new javax.swing.JLabel();
        showpass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        btLogin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login ");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 10, 310, 41);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        hidepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hidepass.png"))); // NOI18N
        hidepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidepassMouseClicked(evt);
            }
        });
        jPanel2.add(hidepass);
        hidepass.setBounds(280, 30, 30, 30);

        showpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/showpass.png"))); // NOI18N
        showpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpassMouseClicked(evt);
            }
        });
        jPanel2.add(showpass);
        showpass.setBounds(280, 30, 30, 30);

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtPass.setText("password");
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jPanel2.add(txtPass);
        txtPass.setBounds(16, 33, 296, 24);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 140, 330, 80);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Username", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel1.setOpaque(false);

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtUsername.setText("Enter the username");
        txtUsername.setPreferredSize(new java.awt.Dimension(127, 22));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 60, 330, 70);

        btLogin.setBackground(new java.awt.Color(204, 204, 204));
        btLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btLogin.setText("Login");
        btLogin.setOpaque(false);
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btLogin);
        btLogin.setBounds(20, 240, 330, 33);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 50, 330, 10);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login_bgrbasic.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 370, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        if(txtUsername.getText().equals("Enter the username"))
        {
            txtUsername.setText("");
            txtUsername.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if(txtUsername.getText().equals(""))
        {
            txtUsername.setText("Enter the username");
            txtUsername.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        if(String.valueOf(txtPass.getPassword()).equals("password"))
        {
            txtPass.setText("");
            txtPass.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        if(String.valueOf(txtPass.getPassword()).equals(""))
        {
            txtPass.setText("password");
            txtPass.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtPassFocusLost

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        String username=txtUsername.getText();
        String password=String.valueOf(txtPass.getPassword());
        account=quanLyTaiKhoan.checkUser(username, password);
        if (account == null) 
            JOptionPane.showMessageDialog(this, "T??i kho???n ho???c m???t kh???u sai", "Sai", JOptionPane.ERROR_MESSAGE);
        else 
        {
            new Main(account).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btLoginActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        btLoginActionPerformed(evt);
    }//GEN-LAST:event_txtPassActionPerformed

    private void hidepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidepassMouseClicked
        hidepass.setVisible(false);
        txtPass.setEchoChar((char)0);
    }//GEN-LAST:event_hidepassMouseClicked

    private void showpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpassMouseClicked
        hidepass.setVisible(true);
        txtPass.setEchoChar('*');
    }//GEN-LAST:event_showpassMouseClicked

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
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JLabel hidepass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel showpass;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
