/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TestingCentre;

import Business.Appointments.Appointment;
import Business.COVID.COVIDTest;
import Business.EcoSystem;
import Business.Email.Email;
import Business.LookUpMapping;
import Business.Patients.Patient;
import Business.Providers.Provider;
import Business.TestingCentre.TestingCentre;
import Business.UserAccount.UserAccount;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author architnigam
 */
public class TestingCentreJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TestingCentreJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem system;
    public TestingCentreJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        btnSave.setVisible(false);
        cbIsTestPositive.setVisible(false);
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCOVIDTest = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        cbIsTestPositive = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        btnMarkTest = new javax.swing.JButton();

        tblCOVIDTest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "COVID-19 Test ID", "Patient Name", "Test Date", "Test Status", "Test"
            }
        ));
        jScrollPane1.setViewportView(tblCOVIDTest);

        btnUpdate.setText("Update Test Result");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        cbIsTestPositive.setText("Is COVID Test positive  for selected patient?");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnMarkTest.setText("Mark Test as Completed");
        btnMarkTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(cbIsTestPositive, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(391, 391, 391)
                                .addComponent(btnMarkTest)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate)))
                        .addGap(0, 227, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnMarkTest))
                .addGap(17, 17, 17)
                .addComponent(cbIsTestPositive, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnSave)
                .addContainerGap(238, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblCOVIDTest.getSelectedRow();
        LookUpMapping lookups = new LookUpMapping();
        DefaultTableModel model = (DefaultTableModel) tblCOVIDTest.getModel();
        COVIDTest selectedCOVIDTest = (COVIDTest) model.getValueAt(selectedIndex, 4);
        if(selectedCOVIDTest.getTestStatus()== 1)
        {
            btnSave.setVisible(true);
            cbIsTestPositive.setVisible(true);
        }
        else{
            String testStatusValue = lookups.mapAppointmentStatus(selectedCOVIDTest.getTestStatus());
            JOptionPane.showMessageDialog(this, "COVID Test with status '"+testStatusValue+"' cannot be updated");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblCOVIDTest.getSelectedRow();
        if(selectedIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please select an appointment before proceding!");
        }
        else{
            DefaultTableModel model = (DefaultTableModel) tblCOVIDTest.getModel();
            COVIDTest selectedTest = (COVIDTest) model.getValueAt(selectedIndex, 4);
            COVIDTest updatedCOVIDTest = system.getCovidTestDirectory().updateCOVIDTest(selectedTest);
            if(cbIsTestPositive.isSelected())
            {
                updatedCOVIDTest.setTestStatus(3);
                Patient patient = selectedTest.getPatient();
            }
            else{
                updatedCOVIDTest.setTestStatus(2);
            }
            cbIsTestPositive.setVisible(false);
            btnSave.setVisible(false);
            Email email = new Email();
            email.SendEmailOfCOVIDTestResultToPatient(updatedCOVIDTest);
            JOptionPane.showMessageDialog(this, "COVID Test Result updated successfully!");
            populateTable();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnMarkTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkTestActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblCOVIDTest.getSelectedRow();
        LookUpMapping lookups = new LookUpMapping();
        DefaultTableModel model = (DefaultTableModel) tblCOVIDTest.getModel();
        COVIDTest selectedCOVIDTest = (COVIDTest) model.getValueAt(selectedIndex, 4);
        if(selectedCOVIDTest.getTestStatus()== 0)
        {
            COVIDTest updatedCOVIDTest = system.getCovidTestDirectory().updateCOVIDTest(selectedCOVIDTest);
            updatedCOVIDTest.setTestStatus(1);
        }
        else{
            String testStatusValue = lookups.mapAppointmentStatus(selectedCOVIDTest.getTestStatus());
            JOptionPane.showMessageDialog(this, "COVID Test with status '"+testStatusValue+"' cannot be marked as done");
            populateTable();
        }
    }//GEN-LAST:event_btnMarkTestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMarkTest;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox cbIsTestPositive;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCOVIDTest;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model1 = (DefaultTableModel) tblCOVIDTest.getModel();
        model1.setRowCount(0);
        LookUpMapping lookups = new LookUpMapping();
        TestingCentre testCentre = system.getTestingCentreDirectory().findTestingCentreByEmailID(userAccount.getUsername(), 
                system.getTestingCentreDirectory().getListOfTestingCentre());
        for(int index = 0; index < system.getCovidTestDirectory().getListOfCOVIDTest().size(); index++)
        {
            Object[] row = new Object[5];
            COVIDTest covidTest = system.getCovidTestDirectory().getListOfCOVIDTest().get(index);
            if(covidTest.getTestingCentre().getTestingCentreID().equals(
                testCentre.getTestingCentreID()))
            {
                row[0] = covidTest.getCOVIDTestID();
                row[1] = covidTest.getPatient().getPatientName();
                row[2] = covidTest.getTime();
                row[3] = lookups.mapAppointmentStatus(covidTest.getTestStatus());
                row[4] = covidTest;
            }
            model1.addRow(row);
        }
    }
}
