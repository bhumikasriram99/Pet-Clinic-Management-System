/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petclinic;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CR-2
 */
public class frmcat_entry_tableview extends javax.swing.JFrame {

    /**
     * Creates new form frmcat_entry_tableview
     */
    public frmcat_entry_tableview() {
        initComponents();
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
        btnprint = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbpid = new javax.swing.JComboBox<>();
        btnshow = new javax.swing.JButton();
        btnshowall = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIEW CAT DETAILS");
        setBackground(new java.awt.Color(204, 0, 51));
        setForeground(new java.awt.Color(255, 51, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        btnprint.setBackground(new java.awt.Color(255, 204, 204));
        btnprint.setText("PRINT");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        btnexit.setBackground(new java.awt.Color(255, 204, 204));
        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setForeground(new java.awt.Color(255, 102, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("SELECT PATIENT ID");

        cmbpid.setBackground(new java.awt.Color(255, 102, 153));

        btnshow.setBackground(new java.awt.Color(255, 204, 204));
        btnshow.setText("SHOW");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });

        btnshowall.setBackground(new java.awt.Color(255, 204, 204));
        btnshowall.setText("SHOW ALL");
        btnshowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbpid, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnshow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnshowall)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnprint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnexit)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnshow)
                    .addComponent(btnshowall)
                    .addComponent(btnprint)
                    .addComponent(btnexit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(ClassNotFoundException ce)
        {
            System.out.println(ce);
        }
        try
        {
                    
            String temp=" ";
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bhumika","bhumika");
            Statement st=con.createStatement();

            ResultSet rs;
            rs = st.executeQuery("select * from cat" );
           
            while(rs.next())
            {
                temp=rs.getString(1);
                cmbpid.addItem(temp);
            }
                        
        }
        catch(SQLException se)
        {
            System.out.println(se);
        }
        
    }//GEN-LAST:event_formWindowActivated

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        // TODO add your handling code here:
        MessageFormat head=new MessageFormat("Patient details");
        MessageFormat foot=new MessageFormat("Page(0,numbers,integer)");
        try
        {
            jTable1.print(JTable.PrintMode.FIT_WIDTH,head,foot);
        }
        catch(PrinterException ce)
        {
            System.out.println(ce);
        }
    }//GEN-LAST:event_btnprintActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
        // TODO add your handling code here:
        String[]columnnames={"Patient Id","Visiting Date","Patient Age","Patient Breed","Problem Description","Customer Name","Contact Number","Address"};
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(columnnames);
        jTable1.setModel(model);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_ALL_COLUMNS);

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(ClassNotFoundException ce)
        {
            System.out.println(ce);
        }
        try
        {

            String pid=cmbpid.getSelectedItem().toString();
            String vdate="";
            String page="";
            String pbreed="";
            String pdescription="";
            String cname="";
            String cno=" ";
            String address=" ";

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bhumika","bhumika");
            Statement st=con.createStatement();

            ResultSet rs;
            rs = st.executeQuery("select * from cat where patientid='"+pid+"'" );

            while(rs.next())
            {
                pid=rs.getString(1);
                vdate=rs.getString(2);
                page=rs.getString(3);
                pbreed=rs.getString(4);
                pdescription=rs.getString(5);
                cname=rs.getString(6);
                cno=rs.getString(7);
                address=rs.getString(8);
                model.addRow(new Object[]{pid,vdate,page,pbreed,pdescription,cname,cno,address});
            }

        }
        catch(SQLException se)
        {
            System.out.println(se);
        }
    }//GEN-LAST:event_btnshowActionPerformed

    private void btnshowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowallActionPerformed
        // TODO add your handling code here:
        String[]columnnames={"Patient Id","Visiting Date","Patient Age","Patient Breed","Problem Description","Customer Name","Contact Number","Address"};
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(columnnames);
        jTable1.setModel(model);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_ALL_COLUMNS);

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(ClassNotFoundException ce)
        {
            System.out.println(ce);
        }
        try
        {

            String pid=cmbpid.getSelectedItem().toString();
            String vdate="";
            String page="";
            String pbreed="";
            String pdescription="";
            String cname="";
            String cno=" ";
            String address=" ";

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bhumika","bhumika");
            Statement st=con.createStatement();

            ResultSet rs;
            rs = st.executeQuery("select * from cat" );

            while(rs.next())
            {
                pid=rs.getString(1);
                vdate=rs.getString(2);
                page=rs.getString(3);
                pbreed=rs.getString(4);
                pdescription=rs.getString(5);
                cname=rs.getString(6);
                cno=rs.getString(7);
                address=rs.getString(8);
                model.addRow(new Object[]{pid,vdate,page,pbreed,pdescription,cname,cno,address});
            }

        }
        catch(SQLException se)
        {
            System.out.println(se);
        }
    }//GEN-LAST:event_btnshowallActionPerformed

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
            java.util.logging.Logger.getLogger(frmcat_entry_tableview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmcat_entry_tableview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmcat_entry_tableview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmcat_entry_tableview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmcat_entry_tableview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnshow;
    private javax.swing.JButton btnshowall;
    private javax.swing.JComboBox<String> cmbpid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
