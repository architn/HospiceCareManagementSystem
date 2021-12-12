/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Alerts;

import Business.Alerts.Alert;
import Business.EcoSystem;
import Business.LookUpMapping;
import Business.Nurses.Nurse;
import Business.Providers.Provider;
import Business.UserAccount.UserAccount;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author architnigam
 */
public class ManageAlertsNurseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAlertsNurseJPanel
     */
    EcoSystem system;
    UserAccount account;
    LookUpMapping lookups = new LookUpMapping();
    public ManageAlertsNurseJPanel(EcoSystem system, UserAccount account) {
        initComponents();
        this.system = system;
        this.account = account;
        populateTable();
        cbAlertAttended.setVisible(false);
        btnSave.setVisible(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlerts = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        cbAlertAttended = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel1.setText("Alerts Assigned To Me");
        add(jLabel1);
        jLabel1.setBounds(50, 20, 215, 46);

        tblAlerts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Alert ID", "Patient Name", "Alert Symptom", "Alert Time", "Alert Status", "Alert"
            }
        ));
        jScrollPane1.setViewportView(tblAlerts);

        add(jScrollPane1);
        jScrollPane1.setBounds(50, 90, 720, 224);

        btnUpdate.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(50, 330, 174, 55);

        cbAlertAttended.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        cbAlertAttended.setText("Alert Attended?");
        cbAlertAttended.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlertAttendedActionPerformed(evt);
            }
        });
        add(cbAlertAttended);
        cbAlertAttended.setBounds(270, 420, 160, 30);

        btnSave.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave);
        btnSave.setBounds(270, 480, 97, 21);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NurseAlerts.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(5, -4, 1440, 880);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblAlerts.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblAlerts.getModel();
        Alert selectedAlert = (Alert) model.getValueAt(selectedIndex, 5);
        if(selectedAlert.getAlertStatus() == 0)
        {
            cbAlertAttended.setVisible(true);
            btnSave.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "User cannot update a closed alert");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblAlerts.getSelectedRow();
        if(selectedIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please select an alert before proceding!");
        }
        else{
            DefaultTableModel model = (DefaultTableModel) tblAlerts.getModel();
            Alert selectedAlert = (Alert) model.getValueAt(selectedIndex, 5);
            Alert updatedAlert = system.getAlertsDirectory().updateAlert(selectedAlert);
            if(cbAlertAttended.isSelected())
            {
                updatedAlert.setAlertStatus(1);
                updatedAlert.setAlertCloseTime(new Date());
            }
            cbAlertAttended.setVisible(false);
            btnSave.setVisible(false);
            JOptionPane.showMessageDialog(this, "Alert successfully closed!");
            populateTable();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cbAlertAttendedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlertAttendedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAlertAttendedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JRadioButton cbAlertAttended;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlerts;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model1 = (DefaultTableModel) tblAlerts.getModel();
        Nurse loggedInNurse = system.getNurseDirectory().findNurseByEmailID(account.getUsername(), 
                system.getNurseDirectory().getNurseList());
        model1.setRowCount(0);
        for(int index = 0; index < system.getAlertsDirectory().getListOfAlerts().size(); index++)
        {
            Object[] row = new Object[6];
            Alert currentAlert = system.getAlertsDirectory().getListOfAlerts().get(index);
            if(currentAlert.getAlertNurse().getNurseID().equals(
            loggedInNurse.getNurseID()))
            {
                row[0] = currentAlert.getAlertID();
                row[1] = currentAlert.getAlertPatient().getPatientName();
                row[2] = currentAlert.getAlertSymptom();
                row[3] = currentAlert.getAlertTime();
                String alertStatusValue = lookups.mapAlertStatus(currentAlert.getAlertStatus());
                row[4] = alertStatusValue;
                row[5] = currentAlert;
            }
            model1.addRow(row);
        }
    }
}
