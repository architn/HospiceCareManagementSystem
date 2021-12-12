/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Automated.AutomatedEntry;
import Business.Configurations.Configurations;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import static java.time.Clock.system;
import javax.swing.JOptionPane;
import javax.swing.JPanel;;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.userAccount = userAccount;
        for(Configurations config : ecosystem.getConfigDirectory().getListOfConfigurations())
        {
            if(config.isHasAutomatedSetupBeenRun())
            {
                btnAutomatedSetup.setEnabled(false);
            }
        }
        //populateTree();
    }
    
    public void populateTree(){
//        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
//       // Add the code for draw your system structure shown by JTree
        
       
        //model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAddHospice = new javax.swing.JButton();
        btnAddDonor = new javax.swing.JButton();
        btnManageHospice = new javax.swing.JButton();
        btnAutomatedSetup = new javax.swing.JButton();
        btnManageDonors = new javax.swing.JButton();
        btnAddPayer = new javax.swing.JButton();
        btnManagePayer = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        btnAddHospice.setText("Add Hospice");
        btnAddHospice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHospiceActionPerformed(evt);
            }
        });

        btnAddDonor.setText("Add Donor");
        btnAddDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDonorActionPerformed(evt);
            }
        });

        btnManageHospice.setText("Manage Hospice");
        btnManageHospice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHospiceActionPerformed(evt);
            }
        });

        btnAutomatedSetup.setText("Run Automated Setup");
        btnAutomatedSetup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutomatedSetupActionPerformed(evt);
            }
        });

        btnManageDonors.setText("Manage Donors");
        btnManageDonors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDonorsActionPerformed(evt);
            }
        });

        btnAddPayer.setText("Add Payers");
        btnAddPayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPayerActionPerformed(evt);
            }
        });

        btnManagePayer.setText("Manage Payers");
        btnManagePayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddPayer)
                    .addComponent(btnAddHospice))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnManageHospice)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnManageDonors)
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnManagePayer)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(btnAutomatedSetup, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddHospice)
                    .addComponent(btnManageHospice)
                    .addComponent(btnAddDonor)
                    .addComponent(btnManageDonors))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPayer)
                    .addComponent(btnManagePayer))
                .addGap(63, 63, 63)
                .addComponent(btnAutomatedSetup, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(414, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddHospiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHospiceActionPerformed
        AddHospiceJPanel addHospiceJPanel = new AddHospiceJPanel(userAccount, ecosystem);
        jSplitPane.setRightComponent(addHospiceJPanel);
    }//GEN-LAST:event_btnAddHospiceActionPerformed

    private void btnAddDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDonorActionPerformed
        AddDonorJPanel addDonorJPanel = new AddDonorJPanel(userAccount, ecosystem);
        jSplitPane.setRightComponent(addDonorJPanel);
    }//GEN-LAST:event_btnAddDonorActionPerformed

    private void btnManageHospiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHospiceActionPerformed
       ManageHospiceJPanel managehospiceJPanel = new ManageHospiceJPanel(userProcessContainer, userAccount, ecosystem);
       jSplitPane.setRightComponent(managehospiceJPanel);
    }//GEN-LAST:event_btnManageHospiceActionPerformed

    private void btnAutomatedSetupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutomatedSetupActionPerformed
        // TODO add your handling code here:
        AutomatedEntry automatedEntry = new AutomatedEntry(userProcessContainer, userAccount, ecosystem);
        if(     automatedEntry.AutomatedCreationOfAgency() &&
                automatedEntry.AutomatedCreationOfHospice() &&
                automatedEntry.AutomatedCreationOfProviders() && automatedEntry.AutomatedCreationOfPayer()
                && automatedEntry.AutomatedCreationOfPatients() && automatedEntry.AutomatedCreationOfNurses()
                && automatedEntry.AutomatedCreationOfDonors() && automatedEntry.AutomatedCreationOfCounsellors()
                && automatedEntry.AutomatedCreationOfDiagnosis() && automatedEntry.AutomatedCreationOfServices()
                && automatedEntry.AutomatedCreationOfLinkages())
        {
            Configurations config = ecosystem.getConfigDirectory().createNewConfigurations(true);
            if(config != null)
            {
                JOptionPane.showMessageDialog(this, "Success, please logout and login again!");
            }
        }
        
    }//GEN-LAST:event_btnAutomatedSetupActionPerformed

    private void btnManageDonorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDonorsActionPerformed
        // TODO add your handling code here:
        ManageDonorJPanel manageDonorJPanel = new ManageDonorJPanel(userProcessContainer,userAccount, ecosystem);
        jSplitPane.setRightComponent(manageDonorJPanel);
    }//GEN-LAST:event_btnManageDonorsActionPerformed

    private void btnManagePayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePayerActionPerformed
        // TODO add your handling code here:
        ManagePayerJPanel managepayerjpanel = new ManagePayerJPanel(userProcessContainer,userAccount, ecosystem);
        jSplitPane.setRightComponent(managepayerjpanel);
    }//GEN-LAST:event_btnManagePayerActionPerformed

    private void btnAddPayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPayerActionPerformed
        // TODO add your handling code here:
        AddPayerJPanel addPayerJPanel = new AddPayerJPanel(userProcessContainer, userAccount, ecosystem);
        jSplitPane.setRightComponent(addPayerJPanel);
    }//GEN-LAST:event_btnAddPayerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDonor;
    private javax.swing.JButton btnAddHospice;
    private javax.swing.JButton btnAddPayer;
    private javax.swing.JButton btnAutomatedSetup;
    private javax.swing.JButton btnManageDonors;
    private javax.swing.JButton btnManageHospice;
    private javax.swing.JButton btnManagePayer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
