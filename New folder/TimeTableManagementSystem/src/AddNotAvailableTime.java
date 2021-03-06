/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddNotAvailableTime extends javax.swing.JFrame {

    /**
     * Creates new form AddNotAvailableTime
     */
    public AddNotAvailableTime() {
        initComponents();
        NotAvailable_Load();
    }
    Connection con;
    PreparedStatement insert;
    ResultSet rs;
    DefaultTableModel d;
 
    
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_lec = new javax.swing.JComboBox<>();
        jComboBox_grp = new javax.swing.JComboBox<>();
        jComboBox_subgrp = new javax.swing.JComboBox<>();
        jComboBox_sessionID = new javax.swing.JComboBox<>();
        jTextField_time = new javax.swing.JTextField();
        jButton_submit = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Select Lecturer");

        jLabel2.setText("Select Group");

        jLabel3.setText("Select Sub Group");

        jLabel4.setText("Select Session ID");

        jLabel5.setText("Time");

        jComboBox_lec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr. Nalaka Perera", "Mr. Prasanna Haddela", "Ms. Shashika Lokuliyana", "Mr. Archchana Kugathasan" }));

        jComboBox_grp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jComboBox_subgrp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", " " }));

        jComboBox_sessionID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "001", "002", "003", "004", "005", "006" }));

        jTextField_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_timeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox_sessionID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_subgrp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_grp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_lec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_time, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_lec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_grp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_subgrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox_sessionID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_time, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(134, 134, 134))
        );

        jButton_submit.setText("Submit");
        jButton_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_submitActionPerformed(evt);
            }
        });

        jButton_delete.setText("Delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lecturer Name", "Group", "Sub group", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton_edit.setText("Edit");
        jButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_submitActionPerformed
        // TODO add your handling code here:
        
        try {
            String lecname = jComboBox_lec.getSelectedItem().toString();
            String mGroup = jComboBox_grp.getSelectedItem().toString();
            String SGroup = jComboBox_subgrp.getSelectedItem().toString();
            String session = jComboBox_sessionID.getSelectedItem().toString();
            String time = jTextField_time.getText();

            insert = con.prepareStatement("insert into notavailabletime(LecName,MGroup,SubGroup,SID,Time)valuse(?,?,?,?,?)");
            insert.setString(1, lecname);
            insert.setString(2, mGroup);
            insert.setString(3, SGroup);
            insert.setString(4, session);
            insert.setString(5, time);
            JOptionPane.showMessageDialog(this,"Not Available time added");
            
            jComboBox_lec.setSelectedIndex(-1);
            jComboBox_grp.setSelectedIndex(-1);
            jComboBox_subgrp.setSelectedIndex(-1);
            jComboBox_sessionID.setSelectedIndex(-1);
            jTextField_time.setText("");
                           
            
        } catch (SQLException ex) {
            Logger.getLogger(AddNotAvailableTime.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton_submitActionPerformed

    
    //To show data in table
    public void NotAvailable_Load(){
        int c;
        try {
            insert = con.prepareStatement("select from notavailabletime");
            rs = insert.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            
            d = (DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);
            
            while(rs.next()){
                Vector v2 = new Vector();
                
                for(int i=1; i<=c; i++){
                    v2.add(rs.getString("SID"));
                    v2.add(rs.getString("LecName"));
                    v2.add(rs.getString("MGroup"));
                    v2.add(rs.getString("SubGroup"));
                    v2.add(rs.getString("Time"));
                    
                }
                d.addRow(v2);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddNotAvailableTime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    private void jTextField_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_timeActionPerformed

    
    //when mouse click on the table item it will show in form
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        d = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        String id = d.getValueAt(selectIndex, 0).toString();
        jComboBox_lec.setSelectedItem(d.getValueAt(selectIndex, 1).toString());
        jComboBox_grp.setSelectedItem(d.getValueAt(selectIndex, 2).toString());
        jComboBox_subgrp.setSelectedItem(d.getValueAt(selectIndex, 3).toString());
        jComboBox_sessionID.setSelectedItem(d.getValueAt(selectIndex, 4).toString());
        jTextField_time.setText(d.getValueAt(selectIndex, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed
        // TODO add your handling code here:
        try{
             d = (DefaultTableModel)jTable1.getModel();
            int selectIndex = jTable1.getSelectedRow();
            
            String id = d.getValueAt(selectIndex, 0).toString(); 
            String lecname = jComboBox_lec.getSelectedItem().toString();
            String mGroup = jComboBox_grp.getSelectedItem().toString();
            String sGroup = jComboBox_subgrp.getSelectedItem().toString();
            String session = jComboBox_sessionID.getSelectedItem().toString();
            String STime = jTextField_time.getText();
            
        
        
            insert = con.prepareStatement("update session set notavailabletime(LecName = ?,MGroup=?,SubGroup=?,SID=?,Time=? where id=?");
            insert.setString(1, lecname);
            insert.setString(2, mGroup);
            insert.setString(3, sGroup);
            insert.setString(4, session);
            insert.setString(5, STime);
            JOptionPane.showMessageDialog(this,"Not available time edited.");
            jButton_submit.setEnabled(true);
            
            
            jComboBox_lec.setSelectedIndex(-1);
            jComboBox_grp.setSelectedIndex(-1);
            jComboBox_subgrp.setSelectedIndex(-1);
            jComboBox_sessionID.setSelectedIndex(-1);
            jTextField_time.setText("");
            jComboBox_lec.requestFocus();
            NotAvailable_Load();
            
        }catch(SQLException ex){
            Logger.getLogger(AddLocation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton_editActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        // TODO add your handling code here:
        try{
             d = (DefaultTableModel)jTable1.getModel();
            int selectIndex = jTable1.getSelectedRow();
            
            String id = d.getValueAt(selectIndex, 0).toString(); 
          
            insert = con.prepareStatement("delete notavailabletime from where id = ?");
            insert.setString(1, id);
            
            JOptionPane.showMessageDialog(this,"Successfully deleted.");
            jButton_submit.setEnabled(true);
            
            
            jComboBox_lec.setSelectedIndex(-1);
            jComboBox_grp.setSelectedIndex(-1);
            jComboBox_subgrp.setSelectedIndex(-1);
            jComboBox_sessionID.setSelectedIndex(-1);
            jTextField_time.setText("");
            jComboBox_lec.requestFocus();
            NotAvailable_Load();
            
        }catch(SQLException ex){
            Logger.getLogger(AddLocation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablemanagementsystem", "root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select*from notavailabletime");
            while(rs.next())
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
            con.close();
            
        }catch(Exception e){System.out.println(e);}
        
        
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
            java.util.logging.Logger.getLogger(AddNotAvailableTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNotAvailableTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNotAvailableTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNotAvailableTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNotAvailableTime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JButton jButton_submit;
    private javax.swing.JComboBox<String> jComboBox_grp;
    private javax.swing.JComboBox<String> jComboBox_lec;
    private javax.swing.JComboBox<String> jComboBox_sessionID;
    private javax.swing.JComboBox<String> jComboBox_subgrp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_time;
    // End of variables declaration//GEN-END:variables
}
