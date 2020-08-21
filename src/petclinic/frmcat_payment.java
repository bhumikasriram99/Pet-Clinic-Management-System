/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petclinic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author CR-2
 */
public class frmcat_payment extends javax.swing.JFrame {

    /**
     * Creates new form frmcat_payment
     */
    public frmcat_payment() {
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
        jLabel1 = new javax.swing.JLabel();
        txttreatch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmic = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtownername = new javax.swing.JTextField();
        txtbreed = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtproblemdetails = new javax.swing.JTextArea();
        txtbdate = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtbno = new javax.swing.JTextField();
        cmbpid1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnshow = new javax.swing.JButton();
        txtamt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txttreatmentgiven = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        btncalculate = new javax.swing.JButton();
        txtmedch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BILL GENERATION");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("BILL NUMBER");

        txttreatch.setBackground(new java.awt.Color(255, 204, 204));
        txttreatch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("AGE");

        txtmic.setBackground(new java.awt.Color(255, 204, 204));
        txtmic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("PATIENT ID");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("MISCELLANEOUS CHARGES");

        txtownername.setBackground(new java.awt.Color(255, 204, 204));
        txtownername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbreed.setBackground(new java.awt.Color(255, 204, 204));
        txtbreed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtproblemdetails.setBackground(new java.awt.Color(255, 204, 204));
        txtproblemdetails.setColumns(20);
        txtproblemdetails.setRows(5);
        txtproblemdetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtproblemdetails);

        txtbdate.setBackground(new java.awt.Color(255, 204, 204));
        txtbdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtdate.setBackground(new java.awt.Color(255, 204, 204));
        txtdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("TREATMENT DATE");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("OWNER NAME");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("BILL DATE");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtbno.setEditable(false);
        txtbno.setBackground(new java.awt.Color(255, 204, 204));
        txtbno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cmbpid1.setBackground(new java.awt.Color(255, 204, 204));
        cmbpid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbpid1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("MEDICINE CHARGES");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("TREATMENT GIVEN");

        btnsave.setBackground(new java.awt.Color(255, 204, 204));
        btnsave.setText("GENERATE BILL");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnshow.setBackground(new java.awt.Color(255, 204, 204));
        btnshow.setText("SHOW");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });

        txtamt.setBackground(new java.awt.Color(255, 204, 204));
        txtamt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("TREATMENT CHARGES");

        txttreatmentgiven.setBackground(new java.awt.Color(255, 204, 204));
        txttreatmentgiven.setColumns(20);
        txttreatmentgiven.setRows(5);
        txttreatmentgiven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(txttreatmentgiven);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("TOTAL AMOUNT");

        btncalculate.setBackground(new java.awt.Color(255, 204, 204));
        btncalculate.setText("CALCULATE");
        btncalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculateActionPerformed(evt);
            }
        });

        txtmedch.setBackground(new java.awt.Color(255, 204, 204));
        txtmedch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("PROBLEM DETAILS");

        txtage.setBackground(new java.awt.Color(255, 204, 204));
        txtage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("BREED");

        btnexit.setBackground(new java.awt.Color(255, 204, 204));
        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbno, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btncalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtbdate))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)
                                    .addComponent(txtownername)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtbreed, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtage, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtdate, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(79, 79, 79))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbpid1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnshow))
                                    .addComponent(txtamt, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(txtmic)
                                    .addComponent(txtmedch)
                                    .addComponent(txttreatch)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsave)
                                .addGap(32, 32, 32)
                                .addComponent(btnexit))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(119, 119, 119)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtbno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnshow)
                    .addComponent(jLabel2)
                    .addComponent(cmbpid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtbreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtownername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttreatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtmedch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtmic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnexit)
                    .addComponent(btnsave)
                    .addComponent(btncalculate))
                .addGap(0, 22, Short.MAX_VALUE))
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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");  
        LocalDateTime now = LocalDateTime.now();  
    
        txtbdate.setText(dtf.format(now));
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
                    
            String temp="",temp1="";
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bhumika","bhumika");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            ResultSet rs1,rs2;
            rs1 = st.executeQuery("select * from cattreatment order by patientid" );
            rs2 = st1.executeQuery("select * from catpayment" ); 
            while(rs1.next())
            {
                temp=rs1.getString(1);
                 cmbpid1.addItem(temp);
               
            }
             while(rs2.next())
            {
                temp1=rs2.getString(1);
                 
               
            }
            
            
            if(temp1.equals(""))
            {
               temp1="1001";
            }
            else
            {
              int a=Integer.parseInt(temp1);
               a++;
               temp1=""+a;
            }
            txtbno.setText(temp1);
            
                        
        }
        catch(SQLException se)
        {
            System.out.println(se);
        }
    }//GEN-LAST:event_formWindowActivated

    private void cmbpid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbpid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbpid1ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
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
            String bno=txtbno.getText();
            String bdate=txtbdate.getText();
            String pid =cmbpid1.getSelectedItem().toString();
            String tdate=txtdate.getText();

            String pbreed=txtbreed.getText();
            String age=txtage.getText();
            String oname=txtownername.getText();

            String pdetails=txtproblemdetails.getText();
            String tgiven=txttreatmentgiven.getText();
            String treach=txttreatch.getText();
            String med=txtmedch.getText();
            String mic=txtmic.getText();
            String amt=txtamt.getText();

            JOptionPane sc;
            sc = new JOptionPane();
            if(tdate.equals(""))
            {
                sc.showMessageDialog(sc,"Please enter Cat's Treatment date");

            }
            else if(pbreed.equals(""))
            {
                sc.showMessageDialog(sc,"Please enter Cat's breed");

            }
            else if(age.equals(""))
            {
                sc.showMessageDialog(sc,"Please enter Cat's age");

            }
            else if(oname.equals(""))
            {
                sc.showMessageDialog(sc,"Please enter Owner Name");
            }
            else if(pdetails.equals(""))
            {
                sc.showMessageDialog(sc,"Please enter Problem Description");
            }
            else if(tgiven.equals(""))
            {
                sc.showMessageDialog(sc,"Please enter treatment given");
            }
            if(treach.equals(""))
            {
                sc.showMessageDialog(sc,"Please enter treatment charges");

            }
            if(med.equals(""))
            {
                sc.showMessageDialog(sc,"Please enter Medicine charges");

            }
            if(mic.equals(""))
            {
                sc.showMessageDialog(sc,"Please enter Miscellaneous Charges");

            }
            if(amt.equals(""))
            {
                sc.showMessageDialog(sc,"Please enter Amount");

            }

            else
            {
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bhumika","bhumika");
                Statement st=con.createStatement();

                String sql = "insert into catpayment values('"+pid+"','"+tdate+"','"+pbreed+"','"+age+"','"+oname+"','"+pdetails+"','"+tgiven+"','"+bno+"','"+bdate+"',"+treach+","+med+","+mic+","+amt+")";
                st.executeUpdate(sql);

                sc.showMessageDialog(sc,"Data saved successfully");

                txtbno.setText("");
                txtbdate.setText("");
                txtdate.setText("");
                txtbreed.setText("");
                txtage.setText("");

                txtownername.setText("");
                txtproblemdetails.setText("");
                txttreatmentgiven.setText("");
                txttreatch.setText("");
                txtmedch.setText("");
                txtmic.setText("");
                txtamt.setText("");

            }

        }
        catch(SQLException se)
        {
            System.out.println(se);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
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
            String bno="";
            String bdate="";
            String pid=cmbpid1.getSelectedItem().toString();
            String tdate="";

            String breed="";
            String age="";
            String oname="";

            String pdetails="";
            String tgiven="";
            String treatch="";
            String med="";
            String mic="";
            String amt="";

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bhumika","bhumika");
            Statement st=con.createStatement();

            ResultSet rs = st.executeQuery("select * from cattreatment where patientid='"+pid+"'");

            while(rs.next())
            {

                pid=rs.getString(1);
                tdate=rs.getString(2);

                age=rs.getString(4);
                breed=rs.getString(3);
                pdetails=rs.getString(6);
                oname=rs.getString(5);

                tgiven=rs.getString(7);

            }
            //txtbno.setText(bno);
            //txtbdate.setText(bdate);
            //txtdate.setText(tdate);
            cmbpid1.setSelectedItem(pid);
            txtdate.setText(tdate);
            txtbreed.setText(breed);
            txtage.setText(age);
            txtownername.setText(oname);
            txtproblemdetails.setText(pdetails);
            txttreatmentgiven.setText(tgiven);
            /*txttreatch.setText(treatch);
            txtmedch.setText(med);
            txtmic.setText(mic);
            txtamt.setText(amt);*/

        }

        catch(SQLException se)
        {
            System.out.println(se);
        }
    }//GEN-LAST:event_btnshowActionPerformed

    private void btncalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculateActionPerformed
        // TODO add your handling code here:
        int tr=Integer.parseInt(txttreatch.getText());
        int me=Integer.parseInt(txtmedch.getText());
        int mi=Integer.parseInt(txtmic.getText());
        int am;

        am=mi+me+tr;

        //txtrate.setText(rate);
        txttreatch.setText(""+tr);

        txtmedch.setText(""+me);
        txtmic.setText(""+mi);
        txtamt.setText(""+am);
    }//GEN-LAST:event_btncalculateActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

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
            java.util.logging.Logger.getLogger(frmcat_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmcat_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmcat_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmcat_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmcat_payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalculate;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnshow;
    private javax.swing.JComboBox<String> cmbpid1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtamt;
    private javax.swing.JTextField txtbdate;
    private javax.swing.JTextField txtbno;
    private javax.swing.JTextField txtbreed;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtmedch;
    private javax.swing.JTextField txtmic;
    private javax.swing.JTextField txtownername;
    private javax.swing.JTextArea txtproblemdetails;
    private javax.swing.JTextField txttreatch;
    private javax.swing.JTextArea txttreatmentgiven;
    // End of variables declaration//GEN-END:variables
}
