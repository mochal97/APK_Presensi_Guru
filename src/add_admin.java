
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prdigma
 */
public class add_admin extends javax.swing.JFrame {

    /**
     * Creates new form layout1
     */
    public add_admin(String ae) {
        initComponents();
        txtadmin.setText(ae);
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
        jPanel2 = new javax.swing.JPanel();
        txtadmin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        BtnSend = new javax.swing.JButton();
        BtnSend1 = new javax.swing.JButton();
        txtword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(-30, -30, 10, 10);

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));
        jPanel2.setLayout(null);

        txtadmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtadmin.setForeground(new java.awt.Color(255, 255, 255));
        txtadmin.setText("admin");
        jPanel2.add(txtadmin);
        txtadmin.setBounds(10, 50, 140, 15);

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tambah Admin");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(70, 10, 360, 50);
        jPanel2.add(icon);
        icon.setBounds(0, -30, 210, 230);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 410, 70);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel8.setText("UserName");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(160, 0, 210, 50);

        jLabel7.setFont(new java.awt.Font("Humanst521 BT", 1, 24)); // NOI18N
        jLabel7.setText("Password");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(160, 90, 210, 50);

        txtuser.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(txtuser);
        txtuser.setBounds(70, 50, 280, 40);

        BtnSend.setBackground(new java.awt.Color(255, 204, 204));
        BtnSend.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnSend.setText("Cancel");
        BtnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSendActionPerformed(evt);
            }
        });
        jPanel3.add(BtnSend);
        BtnSend.setBounds(220, 190, 130, 40);

        BtnSend1.setBackground(new java.awt.Color(255, 204, 204));
        BtnSend1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnSend1.setText("SignUp");
        BtnSend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSend1ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnSend1);
        BtnSend1.setBounds(70, 190, 130, 40);

        txtword.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(txtword);
        txtword.setBounds(70, 140, 280, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 70, 410, 270);

        setSize(new java.awt.Dimension(425, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSendActionPerformed
        String ae = txtadmin.getText();
        new table_admin2(ae).setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnSendActionPerformed

    private void BtnSend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSend1ActionPerformed
        // TODO add your handling code here:
        String kode_guru = txtuser.getText();
        String password = txtword.getText();

        try{
            try (Statement statement = (Statement) file_koneksi.GetConnection().createStatement()){
                statement.executeUpdate("insert into admin(kode_guru, password) VALUES ('"+kode_guru+"','"+password+"');");
            }
            JOptionPane.showMessageDialog(null,"Selamat! anda berhasil sign up!");
            new adminn().setVisible(true);
            this.dispose();
        }catch (Exception t){
            JOptionPane.showMessageDialog(null, "Mohon maaf, ulangi lagi prosedur");
            txtuser.setText("");
            txtword.setText("");
        }
    }//GEN-LAST:event_BtnSend1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_admin(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSend;
    private javax.swing.JButton BtnSend1;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtadmin;
    private javax.swing.JTextField txtuser;
    private javax.swing.JPasswordField txtword;
    // End of variables declaration//GEN-END:variables
}
