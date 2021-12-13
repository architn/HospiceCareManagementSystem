/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CounsellorRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Appointments.ManageAppointmentsCounsellorJPanel;
import userinterface.Forms.CounsellorObservationFormJPanel;
import userinterface.Notes.NotesJPanel;
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
        btnMeetingNotes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        btnObservationForm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        btnMeetingNotes.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnMeetingNotes.setText("My Meeting Notes");
        btnMeetingNotes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMeetingNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeetingNotesActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/donorworkarea.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPatientInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAppointments))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMeetingNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnObservationForm, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btnPatientInfo)
                .addGap(60, 60, 60)
                .addComponent(btnAppointments)
                .addGap(55, 55, 55)
                .addComponent(btnObservationForm)
                .addGap(51, 51, 51)
                .addComponent(btnMeetingNotes)
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
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
        ManageAppointmentsCounsellorJPanel manageAppointmentsPanel = new ManageAppointmentsCounsellorJPanel(account, system);
        jSplitPane1.setRightComponent(manageAppointmentsPanel);
    }//GEN-LAST:event_btnAppointmentsActionPerformed

    private void btnObservationFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObservationFormActionPerformed
        // TODO add your handling code here:
        CounsellorObservationFormJPanel counsellorForm = new CounsellorObservationFormJPanel(account, system);
        jSplitPane1.setRightComponent(counsellorForm);
    }//GEN-LAST:event_btnObservationFormActionPerformed

    private void btnPatientInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientInfoActionPerformed
        // TODO add your handling code here:
        ViewPatientInformationJPanel viewPatientInfoPanel = new ViewPatientInformationJPanel(account, system, "Counsellor");
        jSplitPane1.setRightComponent(viewPatientInfoPanel);
    }//GEN-LAST:event_btnPatientInfoActionPerformed

    private void btnMeetingNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeetingNotesActionPerformed
        // TODO add your handling code here:
        NotesJPanel notesJPanel = new NotesJPanel(account, system);
        jSplitPane1.setRightComponent(notesJPanel);
    }//GEN-LAST:event_btnMeetingNotesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointments;
    private javax.swing.JButton btnMeetingNotes;
    private javax.swing.JButton btnObservationForm;
    private javax.swing.JButton btnPatientInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
