/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CounsellorRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Forms.CounsellorObservationFormJPanel;
import userinterface.Appointments.ManageAppointmentsJPanel;
import userinterface.Workflows.ViewPatientInformationJPanel;

/**
 *
 * @author architnigam
 */
public class CounsellorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CounsellorWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem system;
    public CounsellorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnPatientInfo = new javax.swing.JButton();
        btnObservationForm = new javax.swing.JButton();
        btnAppointments = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(246, 233, 244));

        btnPatientInfo.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnPatientInfo.setText("My Patients");
        btnPatientInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPatientInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientInfoActionPerformed(evt);
            }
        });

        btnObservationForm.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnObservationForm.setText("Record a Meeting");
        btnObservationForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObservationFormActionPerformed(evt);
            }
        });

        btnAppointments.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnAppointments.setText("My Appointments");
        btnAppointments.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAppointments)
                    .addComponent(btnPatientInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObservationForm, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnPatientInfo)
                .addGap(59, 59, 59)
                .addComponent(btnAppointments)
                .addGap(54, 54, 54)
                .addComponent(btnObservationForm)
                .addContainerGap(414, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(null);
        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentsActionPerformed
        // TODO add your handling code here:
        ManageAppointmentsJPanel manageAppointmentsPanel = new ManageAppointmentsJPanel();
        jSplitPane1.setRightComponent(manageAppointmentsPanel);
    }//GEN-LAST:event_btnAppointmentsActionPerformed

    private void btnObservationFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObservationFormActionPerformed
        // TODO add your handling code here:
        CounsellorObservationFormJPanel counsellorForm = new CounsellorObservationFormJPanel();
        jSplitPane1.setRightComponent(counsellorForm);
    }//GEN-LAST:event_btnObservationFormActionPerformed

    private void btnPatientInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientInfoActionPerformed
        // TODO add your handling code here:
        ViewPatientInformationJPanel viewPatientInfoPanel = new ViewPatientInformationJPanel(account, system);
        jSplitPane1.setRightComponent(viewPatientInfoPanel);
    }//GEN-LAST:event_btnPatientInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointments;
    private javax.swing.JButton btnObservationForm;
    private javax.swing.JButton btnPatientInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
