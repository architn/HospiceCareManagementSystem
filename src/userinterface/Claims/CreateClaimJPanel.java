/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Claims;

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

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel1.setText("Claim Type: ");

        ddClaimType.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        ddClaimType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Professional", "Institutional"}));

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel2.setText("Linkage ID:");

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel3.setText("Patient Information");

        btnPopulate.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnPopulate.setText("Populate");
        btnPopulate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPopulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopulateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel4.setText("Name: ");

        jLabel5.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel5.setText("Address:");

        jLabel6.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel6.setText("State: ");

        jLabel7.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel7.setText("City: ");

        jLabel8.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel8.setText("Zip Code:");

        jLabel9.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel9.setText("Diagnosis:");

        ddDiagnosis.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        ddDiagnosis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel10.setText("Provider Information");

        jLabel11.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel11.setText("Name:");

        jLabel12.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel12.setText("Address:");

        jLabel13.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel13.setText("State: ");

        jLabel14.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel14.setText("City:");

        jLabel15.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel15.setText("Zip Code:");

        jLabel16.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel16.setText("Claim Batch Number: ");

        jLabel17.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel17.setText("Start Date:");

        jLabel18.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel18.setText("End Date:");

        ddServiceCode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));

        jLabel19.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel19.setText("Service Code:");

        jLabel20.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel20.setText("Units:");

        btnComputeCost.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnComputeCost.setText("Compute Cost:");
        btnComputeCost.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnComputeCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComputeCostActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel21.setText("Cost:");

        jLabel22.setText("$");

        btnSubmitClaim.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnSubmitClaim.setText("SUBMIT CLAIM");
        btnSubmitClaim.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmitClaim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitClaimActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel23.setText("Place of Service:");

        ddPlaceOfService.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        ddPlaceOfService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home", "Institution"}));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/claim.png"))); // NOI18N
        jLabel24.setText("jLabel24");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ddClaimType, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtLinkageID, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(btnPopulate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(338, 338, 338)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel19))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSubmitClaim, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ddServiceCode, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(76, 76, 76)
                                                .addComponent(txtUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(70, 70, 70)
                                .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPatientState, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ddDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPatientCity, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPatientZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(412, 412, 412)
                                        .addComponent(jLabel15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(426, 426, 426)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(360, 360, 360)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(jLabel11)
                                                            .addGap(56, 56, 56))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel12)
                                                            .addGap(37, 37, 37)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel13)
                                                        .addGap(55, 55, 55))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel14)
                                                        .addGap(67, 67, 67))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel16)
                                                        .addGap(18, 18, 18))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(51, 51, 51)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtProviderZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtProviderCity, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtProviderAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtProviderName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtProviderState, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(145, 145, 145))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(txtBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(btnComputeCost, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(50, 50, 50)
                                                        .addComponent(jLabel22)
                                                        .addGap(34, 34, 34)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel21))
                                                        .addGap(41, 41, 41)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel23)
                                                    .addComponent(ddPlaceOfService, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addContainerGap(654, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtProviderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel12))
                            .addComponent(txtProviderAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPatientState, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtProviderCity, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ddClaimType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLinkageID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(btnPopulate))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtProviderZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPatientZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtPatientCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtProviderState, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel9)
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ddDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(jLabel21))
                            .addComponent(jLabel20))
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnComputeCost, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ddPlaceOfService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ddServiceCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addComponent(btnSubmitClaim, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
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
