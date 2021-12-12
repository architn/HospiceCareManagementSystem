/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Claims;

import Business.Audits.Audit;
import Business.ClaimsBilling.Claim;
import Business.Diagnosis.Diagnosis;
import Business.EcoSystem;
import Business.Hospice.Hospice;
import Business.Linkage.Linkage;
import Business.Patients.Patient;
import Business.Providers.Provider;
import Business.Services.Service;
import Business.SetIDsForWorkflows;
import Business.UserAccount.UserAccount;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author architnigam
 */
public class CreateClaimJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateClaimJPanel
     */
    UserAccount account;
    EcoSystem system;
    public CreateClaimJPanel(UserAccount account, EcoSystem system) {
        initComponents();
        this.account = account;
        this.system = system;
        txtPatientName.setEditable(false);
        txtPatientAddress.setEditable(false);
        txtPatientCity.setEditable(false);
        txtPatientState.setEditable(false);
        txtPatientZipCode.setEditable(false);
        txtProviderAddress.setEditable(false);
        txtProviderCity.setEditable(false);
        txtProviderName.setEditable(false);
        txtProviderState.setEditable(false);
        txtProviderZipCode.setEditable(false);
        txtCost.setEditable(false);
        populateDiagnosisDropdown();
        txtBatchNo.setText("CLM1");
        
        txtEndDate.setMaxSelectableDate(new Date());
        txtStartDate.setMaxSelectableDate(new Date());
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
        ddClaimType = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtLinkageID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnPopulate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtProviderAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPatientState = new javax.swing.JTextField();
        txtPatientCity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPatientZipCode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ddDiagnosis = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtProviderState = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPatientAddress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtProviderName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtProviderCity = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtProviderZipCode = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtBatchNo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ddServiceCode = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        txtEndDate = new com.toedter.calendar.JDateChooser();
        txtUnits = new javax.swing.JTextField();
        txtStartDate = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        btnComputeCost = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        btnSubmitClaim = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        ddPlaceOfService = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel1.setText("Claim Type: ");
        add(jLabel1);
        jLabel1.setBounds(20, 20, 85, 15);

        ddClaimType.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        ddClaimType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Professional", "Institutional"}));
        add(ddClaimType);
        ddClaimType.setBounds(120, 20, 177, 27);

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel2.setText("Linkage ID:");
        add(jLabel2);
        jLabel2.setBounds(20, 80, 78, 15);
        add(txtLinkageID);
        txtLinkageID.setBounds(120, 80, 154, 21);

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel3.setText("Patient Information");
        add(jLabel3);
        jLabel3.setBounds(60, 130, 164, 19);

        btnPopulate.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnPopulate.setText("Populate");
        btnPopulate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPopulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopulateActionPerformed(evt);
            }
        });
        add(btnPopulate);
        btnPopulate.setBounds(310, 80, 112, 21);

        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel4.setText("Name: ");
        add(jLabel4);
        jLabel4.setBounds(60, 190, 47, 15);
        add(txtPatientName);
        txtPatientName.setBounds(170, 190, 146, 26);

        jLabel5.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel5.setText("Address:");
        add(jLabel5);
        jLabel5.setBounds(50, 260, 62, 15);
        add(txtProviderAddress);
        txtProviderAddress.setBounds(610, 240, 245, 51);

        jLabel6.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel6.setText("State: ");
        add(jLabel6);
        jLabel6.setBounds(50, 360, 44, 15);

        jLabel7.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel7.setText("City: ");
        add(jLabel7);
        jLabel7.setBounds(50, 440, 36, 15);
        add(txtPatientState);
        txtPatientState.setBounds(170, 350, 216, 40);
        add(txtPatientCity);
        txtPatientCity.setBounds(180, 500, 164, 26);

        jLabel8.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel8.setText("Zip Code:");
        add(jLabel8);
        jLabel8.setBounds(41, 516, 67, 15);
        add(txtPatientZipCode);
        txtPatientZipCode.setBounds(180, 430, 180, 30);

        jLabel9.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel9.setText("Diagnosis:");
        add(jLabel9);
        jLabel9.setBounds(50, 580, 74, 15);

        ddDiagnosis.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        ddDiagnosis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        add(ddDiagnosis);
        ddDiagnosis.setBounds(190, 570, 166, 27);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel10.setText("Provider Information");
        add(jLabel10);
        jLabel10.setBounds(510, 120, 192, 22);

        jLabel11.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel11.setText("Name:");
        add(jLabel11);
        jLabel11.setBounds(520, 180, 43, 15);
        add(txtProviderState);
        txtProviderState.setBounds(630, 480, 182, 35);

        jLabel12.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel12.setText("Address:");
        add(jLabel12);
        jLabel12.setBounds(510, 260, 62, 15);
        add(txtPatientAddress);
        txtPatientAddress.setBounds(170, 250, 226, 71);

        jLabel13.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel13.setText("State: ");
        add(jLabel13);
        jLabel13.setBounds(520, 340, 44, 15);
        add(txtProviderName);
        txtProviderName.setBounds(610, 170, 154, 26);

        jLabel14.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel14.setText("City:");
        add(jLabel14);
        jLabel14.setBounds(530, 410, 32, 15);
        add(txtProviderCity);
        txtProviderCity.setBounds(620, 330, 182, 37);

        jLabel15.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel15.setText("Zip Code:");
        add(jLabel15);
        jLabel15.setBounds(520, 490, 67, 15);
        add(txtProviderZipCode);
        txtProviderZipCode.setBounds(630, 410, 182, 34);

        jLabel16.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel16.setText("Claim Batch Number: ");
        add(jLabel16);
        jLabel16.setBounds(470, 560, 148, 15);
        add(txtBatchNo);
        txtBatchNo.setBounds(640, 560, 176, 26);

        jLabel17.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel17.setText("Start Date:");
        add(jLabel17);
        jLabel17.setBounds(50, 640, 72, 15);

        jLabel18.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel18.setText("End Date:");
        add(jLabel18);
        jLabel18.setBounds(200, 640, 67, 15);

        ddServiceCode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        add(ddServiceCode);
        ddServiceCode.setBounds(320, 680, 126, 27);

        jLabel19.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel19.setText("Service Code:");
        add(jLabel19);
        jLabel19.setBounds(340, 640, 95, 15);
        add(txtEndDate);
        txtEndDate.setBounds(40, 680, 99, 26);
        add(txtUnits);
        txtUnits.setBounds(490, 680, 88, 29);
        add(txtStartDate);
        txtStartDate.setBounds(180, 680, 99, 26);

        jLabel20.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel20.setText("Units:");
        add(jLabel20);
        jLabel20.setBounds(510, 630, 46, 15);

        btnComputeCost.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnComputeCost.setText("Compute Cost:");
        btnComputeCost.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnComputeCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComputeCostActionPerformed(evt);
            }
        });
        add(btnComputeCost);
        btnComputeCost.setBounds(480, 740, 129, 18);

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel21.setText("Cost:");
        add(jLabel21);
        jLabel21.setBounds(630, 620, 36, 17);
        add(txtCost);
        txtCost.setBounds(650, 670, 100, 21);

        jLabel22.setText("$");
        add(jLabel22);
        jLabel22.setBounds(630, 680, 8, 16);

        btnSubmitClaim.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnSubmitClaim.setText("SUBMIT CLAIM");
        btnSubmitClaim.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmitClaim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitClaimActionPerformed(evt);
            }
        });
        add(btnSubmitClaim);
        btnSubmitClaim.setBounds(90, 760, 240, 40);

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel23.setText("Place of Service:");
        add(jLabel23);
        jLabel23.setBounds(1043, 710, 115, 17);

        ddPlaceOfService.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        ddPlaceOfService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home", "Institution"}));
        add(ddPlaceOfService);
        ddPlaceOfService.setBounds(1043, 756, 136, 27);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/claim.png"))); // NOI18N
        jLabel24.setText("jLabel24");
        add(jLabel24);
        jLabel24.setBounds(450, 0, 360, 100);
        add(jLabel25);
        jLabel25.setBounds(0, 0, 1190, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPopulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopulateActionPerformed
        // TODO add your handling code here:
        String linkageID = txtLinkageID.getText();
        Linkage linkageChosen = system.getLinkageDirectory().findLinkageByID(linkageID, 
                system.getLinkageDirectory().getListOfLinkageIDs());
        if(linkageChosen != null)
        {
            Patient linkedPatient =  linkageChosen.getLinkedPatient();
            txtPatientName.setText(linkedPatient.getPatientName());
            txtPatientAddress.setText(linkedPatient.getPatientAddress());
            txtPatientCity.setText(linkedPatient.getPatientCity());
            txtPatientState.setText(linkedPatient.getPatientState());
            txtPatientZipCode.setText(linkedPatient.getPatientZipCode());
            
            Provider linkedProvider = linkageChosen.getLinkedProvider();
            txtProviderName.setText(linkedProvider.getProviderName());
            txtProviderAddress.setText(linkedProvider.getProviderAddress());
            txtProviderCity.setText(linkedProvider.getProviderCity());
            txtProviderState.setText(linkedProvider.getProviderState());
            txtProviderZipCode.setText(linkedProvider.getZipCode());
            
            populateServiceDropdown(linkedProvider);
        }
        else{
            JOptionPane.showMessageDialog(this, "No such linkage ID in system");
            txtLinkageID.setText("");
            txtPatientName.setText("");
            txtPatientAddress.setText("");
            txtPatientCity.setText("");
            txtPatientState.setText("");
            txtPatientZipCode.setText("");
             txtProviderName.setText("");
            txtProviderAddress.setText("");
            txtProviderCity.setText("");
            txtProviderState.setText("");
            txtProviderZipCode.setText("");
        }
    }//GEN-LAST:event_btnPopulateActionPerformed

    private void btnComputeCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComputeCostActionPerformed
        // TODO add your handling code here:
        String unitsInString = txtUnits.getText();
        String selectedServiceCode = ddServiceCode.getSelectedItem().toString();
        Service selectedService = system.getServiceDirectory().findServiceBySvcCode(selectedServiceCode, 
                system.getServiceDirectory().getServicesList());
        if(selectedService != null)
        {
            double units = Double.parseDouble(unitsInString);
            double cost = selectedService.getServiceCostPerUnit() * units;
            txtCost.setText(String.valueOf(cost));
        }
    }//GEN-LAST:event_btnComputeCostActionPerformed

    private void btnSubmitClaimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitClaimActionPerformed
        // TODO add your handling code here:
        SetIDsForWorkflows setIDForWorkflow = new SetIDsForWorkflows();
        String claimID = setIDForWorkflow.SetIDForClaims();
        String claimType = ddClaimType.getSelectedItem().toString();
        String linkageID = txtLinkageID.getText();
        String diagnosisSelection = ddDiagnosis.getSelectedItem().toString();
        String batchNumber = txtBatchNo.getText();
        Date startDate = txtStartDate.getDate();
        Date endDate = txtEndDate.getDate();
        Service selectedService = system.getServiceDirectory().findServiceBySvcCode(ddServiceCode.getSelectedItem().toString(), 
                system.getServiceDirectory().getServicesList());
        double totalCost = Double.parseDouble(txtCost.getText());
        int units = Integer.parseInt(txtUnits.getText());
        String placeOfService = ddPlaceOfService.getSelectedItem().toString();
        Patient claimPatient = system.getLinkageDirectory().findPatientByLinkageID(linkageID, 
                system.getLinkageDirectory().getListOfLinkageIDs());
        Provider claimProvider = system.getLinkageDirectory().findProviderByLinkageID(linkageID, 
                system.getLinkageDirectory().getListOfLinkageIDs());
        Hospice associatedHospice = claimProvider.getOperatingHospice();
        
        Claim newClaimGenerated = system.getClaimsDirectory().createNewClaim(claimID, claimType, 
                linkageID, startDate, endDate, diagnosisSelection, units, totalCost, 
                placeOfService, batchNumber, selectedService, claimPatient, claimProvider, associatedHospice);
                
        if(newClaimGenerated != null)
        {
            JOptionPane.showMessageDialog(this, "Claim with ID '"+claimID+"' succesfully submitted!");
            Audit audit = system.getAuditDirectory().createNewAuditEntryForClaimCreation(newClaimGenerated);
        }
        else{
            JOptionPane.showMessageDialog(this, "Claim submission unsuccessful.");
            txtLinkageID.setText("");
            txtPatientName.setText("");
            txtPatientAddress.setText("");
            txtPatientCity.setText("");
            txtPatientState.setText("");
            txtPatientZipCode.setText("");
             txtProviderName.setText("");
            txtProviderAddress.setText("");
            txtProviderCity.setText("");
            txtProviderState.setText("");
            txtProviderZipCode.setText("");
        }
    }//GEN-LAST:event_btnSubmitClaimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComputeCost;
    private javax.swing.JButton btnPopulate;
    private javax.swing.JButton btnSubmitClaim;
    private javax.swing.JComboBox<String> ddClaimType;
    private javax.swing.JComboBox<String> ddDiagnosis;
    private javax.swing.JComboBox<String> ddPlaceOfService;
    private javax.swing.JComboBox<String> ddServiceCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBatchNo;
    private javax.swing.JTextField txtCost;
    private com.toedter.calendar.JDateChooser txtEndDate;
    private javax.swing.JTextField txtLinkageID;
    private javax.swing.JTextField txtPatientAddress;
    private javax.swing.JTextField txtPatientCity;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientState;
    private javax.swing.JTextField txtPatientZipCode;
    private javax.swing.JTextField txtProviderAddress;
    private javax.swing.JTextField txtProviderCity;
    private javax.swing.JTextField txtProviderName;
    private javax.swing.JTextField txtProviderState;
    private javax.swing.JTextField txtProviderZipCode;
    private com.toedter.calendar.JDateChooser txtStartDate;
    private javax.swing.JTextField txtUnits;
    // End of variables declaration//GEN-END:variables

    private void populateServiceDropdown(Provider linkedProvider) {
        for(Service service : system.getServiceDirectory().getServicesList())
        {
            if(service.getServiceProvider().getProviderNPI().equals(linkedProvider.getProviderNPI()))
            {
                ddServiceCode.addItem(service.getServiceCode());
            }
        }
    }

    private void populateDiagnosisDropdown() {
        for(Diagnosis diagnosis : system.getDiagnosisDirectory().getDiagnosisList())
        {
            ddDiagnosis.addItem(diagnosis.getDiagnosisDescription());
        }
    }
}
