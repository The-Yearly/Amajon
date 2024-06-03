/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.amajon;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author vighn
 */
interface int_signup{
    void setUser(String user);
    void setPass(String pass);
    void setCpass(String cpass);
    void setName(String na);
    String getUser();
    String getPass();
    String getName();
    String getCpass();
}



class New_User implements int_signup{
    private String password;
    private String username;
    private String name;
    private String conpass;
    public void setUser(String user){
        username=user;
    }
    public void setPass(String pass){
        password=pass;
    }
    public void setCpass(String cpass){
        conpass=cpass;
    }
    public void setName(String na){
        name=na;
    }
    public String getUser(){
        return(username);
    }
    public String getPass(){
        return(password);
    }
    public String getName(){
        return(name);
    }
    public String getCpass(){
        return(conpass);
    }

}
public class Signup extends javax.swing.JFrame {
    /**
     * Creates new form Signup
     */
    public Signup() {
        try{
            List unames=new ArrayList();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/amajon","root","Arduino1");
            Statement stmt=con.createStatement();
            ResultSet Rs=stmt.executeQuery("select * from users_list");
            while (Rs.next()){
                unames.add(Rs.getString(2));
            }
            initComponents(unames,stmt);
        }catch(Exception e){ System.out.println(e);}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(List unames,Statement stmt) {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        namet = new javax.swing.JTextField();
        passwordt = new javax.swing.JPasswordField();
        cpasswordt = new javax.swing.JPasswordField();
        usert = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(226, 210, 238,80));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel1.setText("Sign Up");

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel6.setText("Confirm Password");

        jButton1.setBackground(new java.awt.Color(226, 210, 238,80));
        jButton1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jButton1.setText("Sign Up");
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt,unames,stmt);
            }
        });

        namet.setBackground(new java.awt.Color(226, 210, 238));
        namet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametActionPerformed(evt);
            }
        });

        passwordt.setBackground(new java.awt.Color(226, 210, 238));

        cpasswordt.setBackground(new java.awt.Color(226, 210, 238));

        usert.setBackground(new java.awt.Color(226, 210, 238));
        usert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cpasswordt)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(namet)
                                                        .addComponent(passwordt)
                                                        .addComponent(usert, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))))
                                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(namet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(passwordt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(cpasswordt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 300, 370));

        jLabel2.setBackground(new java.awt.Color(226, 210, 238));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\Images\\a.signupimg.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 330, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 250, 330));

        setSize(new java.awt.Dimension(1033, 607));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt,List unames,Statement stmt) {//GEN-FIRST:event_jButton1ActionPerformed
        New_User user=new New_User();
        user.setUser(usert.getText());
        user.setName(namet.getText());
        user.setPass(passwordt.getText());
        user.setCpass(cpasswordt.getText());
        if(user.getName().equals("")){
            JOptionPane.showMessageDialog(null,"Please enter a name");}
        else if(user.getName().length()<3 || user.getName().length()>30){
            JOptionPane.showMessageDialog(null,"Please Enter A Name Greater Than 2 Characters And Less Than 30 Characters");
        }
        else if(user.getUser().equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter the username");}
        else if (user.getUser().length()<3 || user.getUser().length()>30){
            JOptionPane.showMessageDialog(null,"Please Enter A User-Name Greater Than 2 Characters and less Than 30 Characters");

        }
        else if(unames.contains(user.getUser())){
            JOptionPane.showMessageDialog(null,"User-Name Already Exist");
        }
        else if(user.getPass().equals("")) {
            JOptionPane.showMessageDialog(null,"Please enter the Password");}
        else if (user.getPass().length()<3 || user.getPass().length()>30){
            JOptionPane.showMessageDialog(null,"Please Enter A Password Greater Than 2 Characters and less Than 30 Characters");
        }
        else if(user.getCpass().equals("")) {
            JOptionPane.showMessageDialog(null,"Please Re-Enter The Password");}
        else if (user.getPass() != null && user.getCpass() != null &&
                user.getPass().trim().equals(user.getCpass().trim())) {
            Login log=new Login();
            try {
                String q=String.format("insert into users_list(username,password,name) values('%1s','%2s','%3s')",user.getUser(),passwordt.getText(),user.getName());
                stmt.executeUpdate(q);
                log.setVisible(true);
                this.setVisible(false);
            }
            catch(Exception e){
                System.out.println(e);
            }

        } else {
            JOptionPane.showMessageDialog(null,"Password and Confirm Password doesn't match");



        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nametActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametActionPerformed

    private void usertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cpasswordt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField namet;
    private javax.swing.JPasswordField passwordt;
    private javax.swing.JTextField usert;
    // End of variables declaration//GEN-END:variables
}
