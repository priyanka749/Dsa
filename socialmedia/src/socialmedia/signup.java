/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package socialmedia;

import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class signup extends javax.swing.JFrame {
private Connection conn;
    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
        conn=Dbconnection.dbconnect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        signup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        compassword = new javax.swing.JTextField();
        interest = new javax.swing.JLabel();
        music = new javax.swing.JCheckBox();
        painting = new javax.swing.JCheckBox();
        numismatics = new javax.swing.JCheckBox();
        Pottery = new javax.swing.JCheckBox();
        Write = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 245, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 3, 24)); // NOI18N
        jLabel1.setText("Sign UP");

        User.setBackground(new java.awt.Color(255, 249, 245));
        User.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 107, 135), 2));
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(255, 249, 245));
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 107, 135), 2));

        signup.setBackground(new java.awt.Color(255, 249, 245));
        signup.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        signup.setText("Sign Up");
        signup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 3, true));
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel2.setText("User Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel4.setText("Comform Password");

        compassword.setBackground(new java.awt.Color(255, 249, 245));
        compassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 107, 135), 2));

        interest.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        interest.setText("Interests");

        music.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        music.setText("Music");
        music.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicActionPerformed(evt);
            }
        });

        painting.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        painting.setText("painting");

        numismatics.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        numismatics.setText("Numismatics");

        Pottery.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Pottery.setText("Pottery");
        Pottery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotteryActionPerformed(evt);
            }
        });

        Write.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Write.setText("Writing.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(interest, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(music, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(painting, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Pottery, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(compassword)
                            .addComponent(password)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(numismatics, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(Write, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(User)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interest)
                    .addComponent(music)
                    .addComponent(painting)
                    .addComponent(Pottery))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numismatics)
                    .addComponent(Write))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
       
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
       String Username = User.getText().trim();
        String pass = password.getText().trim();
        List<String> selectedCategories = getSelectedCategoriesFromUI();


        signup(Username,pass,selectedCategories );
//        String username = User.getText();
//        String Password = password.getText();
//    
//     String confirmPassword=compassword.getText();
//    
//    // Validate input fields (you can add more validation as needed)
//    if (username.isEmpty() || Password.isEmpty() || confirmPassword.isEmpty()) {
//        JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
//        return;
//    }
//    
//    // Validate if password and confirm password match
//    if (!Password.equals(confirmPassword)) {
//        JOptionPane.showMessageDialog(this, "Password and Confirm Password do not match", "Error", JOptionPane.ERROR_MESSAGE);
//        return;
//    }
//    
//   try {
//            Connection conn = Dbconnection.dbconnect();
//            String query = "SELECT UserName FROM Users WHERE UserName = ?";
//            PreparedStatement statement = conn.prepareStatement(query);
//            statement.setString(1, username);
//            ResultSet resultSet = statement.executeQuery();
//            if (resultSet.next()) {
//                JOptionPane.showMessageDialog(null, "Username Already Taken. Please choose a different one.");
//                return;
//            }
//            conn.close();
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error connecting to the database");
//            e.printStackTrace();
//            return;
//        }
//       String sql = "INSERT INTO Users (UserName,pass) VALUES (?, ?)";
//
//        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
////           Assert.assertEquals("Ram", fname);
//
//            pstmt.setString(1, username);
//            pstmt.setString(2, Password);
//
//            int rowsAffected = pstmt.executeUpdate();
//            if (rowsAffected > 0) {
//                System.out.println("Data inserted successfully");
//                JOptionPane.showMessageDialog(null, "Successfully inserted", "EMPLOYEE",
//                        JOptionPane.INFORMATION_MESSAGE);
//    // You can also display a success message or redirect the user to another page
//    JOptionPane.showMessageDialog(this, "Sign up successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
//            }
//            new Login().setVisible(true);
//            
//            
//            
//        
//        }
//        catch (SQLException e) {
//            System.out.println("Error inserting data: " + e.getMessage());
//        }
    }//GEN-LAST:event_signupActionPerformed

    private void musicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musicActionPerformed

    private void PotteryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotteryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PotteryActionPerformed
    private List<String> getSelectedCategoriesFromUI() {
    List<String> selectedCategories = new ArrayList<>();
    
    if (music.isSelected()) {
        selectedCategories.add("Music");
    }
    if (painting.isSelected()) {
        selectedCategories.add("Paiting");
    }
    if (Pottery.isSelected()) {
        selectedCategories.add("Pottery");
    }
    if (numismatics.isSelected()) {
        selectedCategories.add("Numismatics");
    }
    if (Write.isSelected()) {
        selectedCategories.add("Writing");
    }
    
    return selectedCategories;
}
    
    private void signup(String Username, String Password, List<String> selectedCategories) {
    if (Username.equals("") || Password.equals("")) {
        JOptionPane.showMessageDialog(null, "Please fill in all the fields");
        return;
    }
    
    try {
        Connection conn = Dbconnection.dbconnect();
        String query = "SELECT UserName FROM Users WHERE UserName = ?";
        PreparedStatement statement = conn.prepareStatement(query);
        statement.setString(1, Username);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            JOptionPane.showMessageDialog(null, "Username Already Taken. Please choose a different one.");
            return;
        }
        
        // Close the previous statement before creating a new one
        statement.close();

        String insertUserSQL = "INSERT INTO Users (UserName, pass) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(insertUserSQL, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, Username);
            pstmt.setString(2, Password);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("User inserted successfully");

                // Retrieve the generated UserId
                ResultSet generatedKeys = pstmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int userId = generatedKeys.getInt(1);
                    System.out.println("UserId of the inserted user: " + userId);

                    // Store the selected categories for the user
                    String insertCategorySQL = "INSERT INTO UserCategories (UserId, CategoryId) VALUES (?, ?)";
                    try (PreparedStatement pstmtCategories = conn.prepareStatement(insertCategorySQL)) {
                        for (String category : selectedCategories) {
                            // Retrieve the CategoryId for each selected category
                            String categoryIdQuery = "SELECT CategoryId FROM Categories WHERE CategoryName = ?";
                            PreparedStatement pstmtCategoryId = conn.prepareStatement(categoryIdQuery);
                            pstmtCategoryId.setString(1, category);
                            ResultSet rsCategoryId = pstmtCategoryId.executeQuery();
                            if (rsCategoryId.next()) {
                                int categoryId = rsCategoryId.getInt("CategoryId");
                                // Insert the UserId and CategoryId into UserCategories table
                                pstmtCategories.setInt(1, userId);
                                pstmtCategories.setInt(2, categoryId);
                                pstmtCategories.addBatch();
                            }
                        }
                        // Execute batch insert
                        pstmtCategories.executeBatch();
                    }
                }
                
                // Show success message and close the current window
                JOptionPane.showMessageDialog(null, "User successfully registered");
                new Login().setVisible(true);
                dispose();
            } else {
                System.out.println("Data insertion failed");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error connecting to the database or inserting data");
        e.printStackTrace();
    }
}
    
    
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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Pottery;
    private javax.swing.JTextField User;
    private javax.swing.JCheckBox Write;
    private javax.swing.JTextField compassword;
    private javax.swing.JLabel interest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox music;
    private javax.swing.JCheckBox numismatics;
    private javax.swing.JCheckBox painting;
    private javax.swing.JTextField password;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
