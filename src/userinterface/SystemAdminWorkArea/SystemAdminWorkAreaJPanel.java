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
        jLabel1 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

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
            .addGap(0, 996, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(null);

        btnAddHospice.setBackground(new java.awt.Color(193, 137, 165));
        btnAddHospice.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnAddHospice.setText("Add Hospice");
        btnAddHospice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddHospice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHospiceActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddHospice);
        btnAddHospice.setBounds(16, 87, 225, 66);

        btnAddDonor.setBackground(new java.awt.Color(193, 137, 165));
        btnAddDonor.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnAddDonor.setText("Add Donor");
        btnAddDonor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDonorActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddDonor);
        btnAddDonor.setBounds(306, 87, 225, 66);

        btnManageHospice.setBackground(new java.awt.Color(193, 137, 165));
        btnManageHospice.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnManageHospice.setText("Manage Hospice");
        btnManageHospice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageHospice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHospiceActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageHospice);
        btnManageHospice.setBounds(16, 190, 225, 69);

        btnAutomatedSetup.setBackground(new java.awt.Color(193, 137, 165));
        btnAutomatedSetup.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnAutomatedSetup.setText("Run Automated Setup");
        btnAutomatedSetup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAutomatedSetup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutomatedSetupActionPerformed(evt);
            }
        });
        jPanel2.add(btnAutomatedSetup);
        btnAutomatedSetup.setBounds(306, 357, 225, 80);

        btnManageDonors.setBackground(new java.awt.Color(193, 137, 165));
        btnManageDonors.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnManageDonors.setText("Manage Donors");
        btnManageDonors.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageDonors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDonorsActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageDonors);
        btnManageDonors.setBounds(306, 191, 225, 67);

        btnAddPayer.setBackground(new java.awt.Color(193, 137, 165));
        btnAddPayer.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnAddPayer.setText("Add Payers");
        btnAddPayer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddPayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPayerActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddPayer);
        btnAddPayer.setBounds(582, 87, 213, 67);

        btnManagePayer.setBackground(new java.awt.Color(193, 137, 165));
        btnManagePayer.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnManagePayer.setText("Manage Payers");
        btnManagePayer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManagePayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePayerActionPerformed(evt);
            }
        });
        jPanel2.add(btnManagePayer);
        btnManagePayer.setBounds(582, 190, 213, 69);

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to Hospice Management System");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(268, 16, 512, 31);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SystemAdmin.png"))); // NOI18N
        jPanel2.add(lblImage);
        lblImage.setBounds(6, 443, 758, 305);

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddHospiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHospiceActionPerformed
        AddHospiceJPanel addHospiceJPanel = new AddHospiceJPanel(userProcessContainer,userAccount, ecosystem);
        jSplitPane.setRightComponent(addHospiceJPanel);
    }//GEN-LAST:event_btnAddHospiceActionPerformed

    private void btnAddDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDonorActionPerformed
        AddDonorJPanel addDonorJPanel = new AddDonorJPanel(userProcessContainer, userAccount, ecosystem);
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
                && automatedEntry.AutomatedCreationOfLinkages() &&automatedEntry.AutomatedCreationOfTestingCentres())
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JLabel lblImage;
    // End of variables declaration//GEN-END:variables
}
