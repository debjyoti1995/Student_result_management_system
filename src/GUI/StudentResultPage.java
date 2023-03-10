/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import ConnectionProvider.ConnectionProviderCode;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author 91731
 */
public class StudentResultPage extends javax.swing.JFrame {

    /**
     * Creates new form StudentResultPage
     */
    public StudentResultPage() {
        initComponents();
    }
    String rollNo ;
    public StudentResultPage(String rollNo) {
        initComponents();
        txt_rollno.setText(rollNo);
        this.rollNo=rollNo;
       // formComponentShown(evt);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_rollno = new javax.swing.JTextField();
        txt_fathername = new javax.swing.JTextField();
        txt_verdict = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_gender = new javax.swing.JTextField();
        txt_course = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txt_branch = new javax.swing.JTextField();
        txt_phy = new javax.swing.JTextField();
        txt_math = new javax.swing.JTextField();
        txt_chem = new javax.swing.JTextField();
        txt_elec = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txt_bio = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Roll No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 50, 20));

        jLabel2.setText("Branch");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 90, 30));

        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 30));

        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 90, 30));

        jLabel5.setText("Marks Obtained");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 90, 30));

        jLabel6.setText("Father Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 90, 30));

        txt_rollno.setText(" ");
        getContentPane().add(txt_rollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 40, 30));

        txt_fathername.setText(" ");
        getContentPane().add(txt_fathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 110, 30));

        txt_verdict.setText(" ");
        getContentPane().add(txt_verdict, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 120, 40));

        txt_name.setText(" ");
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 110, 30));

        txt_gender.setText(" ");
        getContentPane().add(txt_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 110, 30));

        txt_course.setText(" ");
        getContentPane().add(txt_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 110, 30));

        jLabel7.setText("Course");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 90, 30));

        jLabel8.setText("30");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 60, 30));

        jLabel9.setText("Total Marks");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 90, 30));

        jLabel10.setText("Passing Marks");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 90, 30));

        jLabel11.setText("Subject");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 90, 30));

        jLabel12.setText("Physics");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 90, 30));

        jLabel13.setText("Math");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 90, 30));

        jLabel14.setText("Chemistry");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 90, 30));

        jLabel15.setText("Electrical");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 90, 30));

        jLabel16.setText("Verdict");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 90, 30));

        jLabel17.setText("100");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 60, 30));

        jLabel18.setText("100");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 60, 30));

        jLabel19.setText("100");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 60, 30));

        jLabel20.setText("100");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 60, 30));

        jLabel21.setText("100");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 60, 30));

        jLabel22.setText("30");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 60, 30));

        jLabel23.setText("30");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 60, 30));

        jLabel24.setText("30");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 60, 30));

        jLabel25.setText("30");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 60, 30));

        txt_branch.setText(" ");
        getContentPane().add(txt_branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 110, 30));

        txt_phy.setText(" ");
        getContentPane().add(txt_phy, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 110, 20));

        txt_math.setText(" ");
        txt_math.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mathActionPerformed(evt);
            }
        });
        getContentPane().add(txt_math, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 110, 20));

        txt_chem.setText(" ");
        getContentPane().add(txt_chem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 110, 20));

        txt_elec.setText(" ");
        getContentPane().add(txt_elec, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 110, 20));

        jLabel26.setText("Biology");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 90, 30));

        txt_bio.setText(" ");
        getContentPane().add(txt_bio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 110, 20));

        jLabel27.setText("Total Marks");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 90, 30));

        txt_total.setText(" ");
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 110, -1));

        jButton1.setText("LogOut");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, 90, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mathActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
//        String rollNo =txt_rollno.getText();
//        
        try {
            String rollNo =txt_rollno.getText().trim();
            Connection con = ConnectionProviderCode.getcon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs= st.executeQuery("select * from student inner join result on student.rollNo="+rollNo+" and result.rollNo='"+rollNo+"'");
            
            if(! rs.first()){
                JOptionPane.showMessageDialog(null, "Entered RollNo doesn't exist");
            }else{
                txt_name.setText(rs.getString(1));
                txt_gender.setText(rs.getString(3));
                txt_course.setText(rs.getString(5));
                txt_fathername.setText(rs.getString(4));
                txt_branch.setText(rs.getString(6));
                
                txt_phy.setText(rs.getString(8));
                txt_math.setText(rs.getString(9));
                txt_chem.setText(rs.getString(10));
                txt_elec.setText(rs.getString(11));
                txt_bio.setText(rs.getString(12));
                
                txt_total.setText(rs.getString(13));
                
                txt_rollno.setEditable(false);
                txt_name.setEditable(false);
                txt_gender.setEditable(false);
                txt_fathername.setEditable(false);
                txt_course.setEditable(false);
                txt_branch.setEditable(false);
                
                txt_phy.setEditable(false);
                txt_math.setEditable(false);
                txt_chem.setEditable(false);
                txt_elec.setEditable(false);
                txt_bio.setEditable(false);
                
                int physicsMarks = Integer.parseInt(rs.getString(8));
                int mathMarks = Integer.parseInt(rs.getString(9));
                int chemistryMarks = Integer.parseInt(rs.getString(10));
                int electricalMarks = Integer.parseInt(rs.getString(11));
                int biologyMarks = Integer.parseInt(rs.getString(12));
                
                if(physicsMarks >=30 && mathMarks >=30 && chemistryMarks>=30 && electricalMarks>=30 && biologyMarks >=30){
                    txt_verdict.setText("PASS");
                }else{
                    txt_verdict.setText("FAIL");
                }
                
                txt_verdict.setEditable(false);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit", "submit",JOptionPane.YES_NO_OPTION);
        
        if (response ==0){
            setVisible(false);
            Student frame = new Student();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
             
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResultPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_bio;
    private javax.swing.JTextField txt_branch;
    private javax.swing.JTextField txt_chem;
    private javax.swing.JTextField txt_course;
    private javax.swing.JTextField txt_elec;
    private javax.swing.JTextField txt_fathername;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_math;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phy;
    private javax.swing.JTextField txt_rollno;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_verdict;
    // End of variables declaration//GEN-END:variables
}
