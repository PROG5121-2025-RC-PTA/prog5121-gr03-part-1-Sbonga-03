/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login_signup;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */


public class Login extends javax.swing.JFrame {
    
    static String[] userDetails = new String[3]; // [username, password, phone]
    
    // Arrays to store up to 10 users (can be increased)
    private String[] usernames = new String[10];
    private String[] passwords = new String[10];
    private int userCount = 0; // Tracks how many users are stored

    


    
    public Login() {
        initComponents();
        jPasswordField1.setEnabled(false);
         jPasswordField1.setEnabled(false);
        jTextFieldPhone.setEnabled(false);
        jButton1.setEnabled(false);
        setLocationRelativeTo(null);

    }
    // disable password field at start

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\RC_Student_lab\\Documents\\NetBeansProjects\\Login_SignUp\\src\\Icon\\ChatWave.jpg")); // NOI18N
        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 51, 204));
        Right.setBorder(new javax.swing.border.MatteBorder(null));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\RC_Student_lab\\Documents\\NetBeansProjects\\Login_SignUp\\src\\Icon\\ChatWave1.jpg")); // NOI18N

        jLabel7.setBackground(new java.awt.Color(51, 102, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Where Every Massage Flows");

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("copyright@ChatWaveAll rights reserved");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(103, 103, 103))
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel8))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(24, 24, 24))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 390, 500);

        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Create Account");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Password");

        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Phone Number");

        jTextFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneActionPerformed(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Already have an account?");

        jButton2.setBackground(new java.awt.Color(102, 153, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(112, 112, 112))))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(55, 55, 55))
        );

        jPanel1.add(Left);
        Left.setBounds(390, 0, 410, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    String username = jTextFieldUsername.getText().trim();
String password = new String(jPasswordField1.getPassword());
String phone = jTextFieldPhone.getText().trim();

// Username validation
if (!username.matches(".*_.*") || username.length() > 5) {
    JOptionPane.showMessageDialog(this, "Username must contain an underscore and be no more than 5 characters long.");
    return;
}

// Password validation
if (!password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,}$")) {
    JOptionPane.showMessageDialog(this, "Password is not correctly formatted.\nIt must be at least 8 characters, contain a capital letter, a number, and a special character.");
    return;
}

// Phone number validation
if (!phone.matches("^0\\d{9}$")) {
    JOptionPane.showMessageDialog(this, "Phone number must be 10 digits and start with 0.");
    return;
}

// Save user info
if (userCount < usernames.length) {
    usernames[userCount] = username;
    passwords[userCount] = password;
    userCount++;
    JOptionPane.showMessageDialog(this, "Account created successfully!");

    // Clear fields
    jTextFieldUsername.setText("");
    jPasswordField1.setText("");
    jTextFieldPhone.setText("");
} else {
    JOptionPane.showMessageDialog(this, "User limit reached!");
}
    

     
    }//GEN-LAST:event_jButton1ActionPerformed


    
    
    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
        String username = jTextFieldUsername.getText().trim();

    if (username.contains("_") && username.length() <= 5) {
        JOptionPane.showMessageDialog(this, "Username successfully captured.");
        jPasswordField1.setEnabled(true); 
        jPasswordField1.requestFocus();  
    } else {
        JOptionPane.showMessageDialog(this, "Username is not correctly formatted.\nIt must contain an underscore and be no more than 5 characters.");
        jPasswordField1.setEnabled(false); 
    }
        
        
        
       
        
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    Real_Login LoginFrame = new Real_Login();
    LoginFrame.setVisible(true);
    LoginFrame.pack();
    LoginFrame.setLocationRelativeTo(null);
    this.dispose();

    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneActionPerformed
        // TODO add your handling code here:
    String phone = jTextFieldPhone.getText().trim();

    if (phone.matches("\\d{10}")) {
        JOptionPane.showMessageDialog(this, "Phone number successfully captured.");
        jButton1.setEnabled(true); // Enable Create Account button
        jButton1.requestFocus();
    } else {
        JOptionPane.showMessageDialog(this, "Invalid phone number.");
        jButton1.setEnabled(false);
        jTextFieldPhone.setText("");
        jTextFieldPhone.requestFocus();
    }   
    }//GEN-LAST:event_jTextFieldPhoneActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
     String password = new String(jPasswordField1.getPassword());

    boolean hasUpper = password.matches(".*[A-Z].*");
    boolean hasDigit = password.matches(".*\\d.*");
    boolean hasSpecial = password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");

    if (password.length() >= 8 && hasUpper && hasDigit && hasSpecial) {
        JOptionPane.showMessageDialog(this, "Password successfully captured.");
        jTextFieldPhone.setEnabled(true); // Enable phone number
        jTextFieldPhone.requestFocus();
    } else {
        JOptionPane.showMessageDialog(this, "Password is not correctly formatted.\nIt must be at least 8 characters long and include:\n- A capital letter\n- A number\n- A special character");
        jTextFieldPhone.setEnabled(false);
        jPasswordField1.setText("");
        jPasswordField1.requestFocus();
    }  
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}



                    //OpenAl.(2025).ChatGBT[Large language model].
                    //Avalible at : https://chat.openai.com (Accessed 10 April 2025)