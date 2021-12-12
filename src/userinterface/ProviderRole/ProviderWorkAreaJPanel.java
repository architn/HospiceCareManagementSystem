/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ProviderRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Alerts.ManageAlertsProviderJPanel;
import userinterface.Appointments.ManageAppointmentsProviderJPanel;
import userinterface.Workflows.ViewPatientInformationJPanel;
import userinterface.Workflows.VitalSignsReportsJPanel;

/**
 *
 * @author architnigam
 */
public class ProviderWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProviderWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;

    public ProviderWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
         this.userAccount = account;
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
        btnPatientDetails = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnAppointments = new javax.swing.JButton();
        btnViewAlerts = new javax.swing.JButton();
        btnProviderDetails = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        btnPatientDetails.setText("View Patient Detail");
        btnPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientDetailsActionPerformed(evt);
            }
        });

        btnReports.setText("View Reports");
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });

        btnAppointments.setText("My Appointments");
        btnAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentsActionPerformed(evt);
            }
        });

        btnViewAlerts.setText("My Alerts");
        btnViewAlerts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAlertsActionPerformed(evt);
            }
        });

        btnProviderDetails.setText("View my Details");
        btnProviderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProviderDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPatientDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnViewAlerts, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnProviderDetails)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnProviderDetails)
                .addGap(50, 50, 50)
                .addComponent(btnPatientDetails)
                .addGap(41, 41, 41)
                .addComponent(btnReports)
                .addGap(45, 45, 45)
                .addComponent(btnAppointments)
                .addGap(46, 46, 46)
                .addComponent(btnViewAlerts)
                .addContainerGap(321, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientDetailsActionPerformed
        // TODO add your handling code here:
        ViewPatientInformationJPanel viewInformationJPanel = new ViewPatientInformationJPanel(userAccount, system, "Provider");
        jSplitPane1.setRightComponent(viewInformationJPanel);
    }//GEN-LAST:event_btnPatientDetailsActionPerformed

    private void btnAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentsActionPerformed
        // TODO add your handling code here:
        ManageAppointmentsProviderJPanel manageProvider = new ManageAppointmentsProviderJPanel(userAccount, system);
        jSplitPane1.setRightComponent(manageProvider);
    }//GEN-LAST:event_btnAppointmentsActionPerformed

    private void btnProviderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProviderDetailsActionPerformed
        // TODO add your handling code here:
        ViewProviderDetailsJPanel viewProviderPanel = new ViewProviderDetailsJPanel(userAccount, system);
        jSplitPane1.setRightComponent(viewProviderPanel);
    }//GEN-LAST:event_btnProviderDetailsActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        // TODO add your handling code here:
        VitalSignsReportsJPanel vitalSignsReport = new VitalSignsReportsJPanel(system, userAccount);
        jSplitPane1.setRightComponent(vitalSignsReport);
    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnViewAlertsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAlertsActionPerformed
        // TODO add your handling code here:
         ManageAlertsProviderJPanel manageAlerts = new ManageAlertsProviderJPanel(system, userAccount );
         jSplitPane1.setRightComponent(manageAlerts);
    }//GEN-LAST:event_btnViewAlertsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointments;
    private javax.swing.JButton btnPatientDetails;
    private javax.swing.JButton btnProviderDetails;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnViewAlerts;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
