/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospiceAdminRole;

import Business.EcoSystem;
import Business.Hospice.Hospice;
import Business.Organization;
import Business.Patients.Patient;
import Business.Payers.Payer;
import Business.Providers.Provider;
import Business.UserAccount.UserAccount;
import Business.ValidationLogic;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author rohannayak
 */
public class AddPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPatientJPanel
     */
    UserAccount userAccount;
    EcoSystem system;
    JPanel userProcessContainer;
    Organization customerOrg;
    Patient Patient;
    public AddPatientJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
//         hospice = system.getHospiceDirectory().findHospiceByEmailID(userAccount.getUsername(),
//             system.getHospiceDirectory().getListOfHospice());
        populateProviderDropdown();
        populatePayerDropdown();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbAddress = new javax.swing.JLabel();
        lbCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lbState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lbZipCode = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        lbContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        lbEmailID = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        lbTerminalIllness = new javax.swing.JLabel();
        btnAddPatient = new javax.swing.JButton();
        TerminalIllnessDropDown = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        lbPatientMRN = new javax.swing.JLabel();
        txtPatientMRN = new javax.swing.JTextField();
        lbDateOfBirth = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        OperatingProvider = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        Payer = new javax.swing.JComboBox();
        txtAddress = new javax.swing.JTextField();
        lbGender = new javax.swing.JLabel();
        GenderDropDown = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        EthinicityDropDown = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        CountryDropDown = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        lbEmergencyContactName = new javax.swing.JLabel();
        txtEmergencyContactName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmergencyContactNumber = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        lbTitle.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("ADD PATIENT");

        lbName.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbName.setText("Name :");

        lbAddress.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbAddress.setText("Address :");

        lbCity.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbCity.setText("City :");

        lbState.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbState.setText("State :");

        lbZipCode.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbZipCode.setText("Zip Code :");

        lbContactNumber.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbContactNumber.setText("Contact Number :");

        lbEmailID.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbEmailID.setText("Email ID :");

        lbTerminalIllness.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbTerminalIllness.setText("Terminal Illness Associated  :");

        btnAddPatient.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAddPatient.setText("Add Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        TerminalIllnessDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Parkinson's Disease", "Terminal Cancer", "Alzheimer's Disease" }));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ImagePatient-2.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(320, 240));

        lbPatientMRN.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbPatientMRN.setText("Patient MRN :");

        lbDateOfBirth.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbDateOfBirth.setText("Date of Birth :");

        jDateChooser1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Provider :");

        OperatingProvider.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Payer :");

        Payer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));

        lbGender.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lbGender.setText("Gender :");

        GenderDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        jLabel4.setText("Ethinicity :");

        EthinicityDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));

        jLabel5.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        jLabel5.setText("Country :");

        CountryDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));

        jButton1.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbEmergencyContactName.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbEmergencyContactName.setText("Emergency Contact Name :");

        jLabel6.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        jLabel6.setText("Emergency Contact No :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbAddress)
                            .addComponent(lbName)
                            .addComponent(lbCity)
                            .addComponent(lbState)
                            .addComponent(lbZipCode)
                            .addComponent(lbContactNumber)
                            .addComponent(lbEmailID)
                            .addComponent(lbTerminalIllness)
                            .addComponent(lbPatientMRN)
                            .addComponent(lbDateOfBirth)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(lbGender)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(lbEmergencyContactName)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(txtCity)
                            .addComponent(txtState)
                            .addComponent(txtZipCode)
                            .addComponent(txtContactNumber)
                            .addComponent(txtEmailID)
                            .addComponent(TerminalIllnessDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPatientMRN)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(OperatingProvider, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Payer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAddress)
                            .addComponent(GenderDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EthinicityDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CountryDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmergencyContactName)
                            .addComponent(txtEmergencyContactNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(btnAddPatient))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDateOfBirth)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPatientMRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPatientMRN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbState))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbZipCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CountryDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContactNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEmailID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TerminalIllnessDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTerminalIllness))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OperatingProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Payer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbGender)
                            .addComponent(GenderDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(EthinicityDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEmergencyContactName)
                            .addComponent(txtEmergencyContactName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmergencyContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(btnAddPatient)
                .addContainerGap(427, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
        ValidationLogic validationLogic = new ValidationLogic();
        if(validationLogic.validateIfAllFieldsAreFilled_7(txtName, txtAddress, txtCity, txtState, txtZipCode,
                txtContactNumber, txtEmailID) && validationLogic.validateIfContactNumberIsCorrect(txtContactNumber) && validationLogic.validateIfEmailIDIsCorrect(txtEmailID) && validationLogic.validateIfZipCodeIsValid(txtZipCode) && validationLogic.validateIfFieldIsNumeric(txtZipCode) && validationLogic.validateIfFieldIsNumeric(txtPatientMRN)){
            String patientName = txtName.getText();
            String patientAddress = txtAddress.getText();
            String patientCity = txtCity.getText();
            String patientState = txtState.getText();
            String patientZipcode = txtZipCode.getText();
            String patientCountry = CountryDropDown.getSelectedItem().toString();
            String patientContactNumber = txtContactNumber.getText();
            String patientEmailID = txtEmailID.getText();
            String patientMRN = txtPatientMRN.getText();
            String providerNPIChosen = OperatingProvider.getSelectedItem().toString();
            String chosenPayer = Payer.getSelectedItem().toString();
            Date dateOfBirth = jDateChooser1.getDate();
            String patientEmergencyContactName = txtEmergencyContactName.getText();
            String patientEmergencyContactNumber = txtEmergencyContactNumber.getText();
            String chosenGender = GenderDropDown.getSelectedItem().toString();
            String chosenEthinicity = EthinicityDropDown.getSelectedItem().toString();
            String terminallIllnessAssociated = TerminalIllnessDropDown.getSelectedItem().toString();
            Provider associatedProvider = system.getProviderDirectory().findProviderByNPI(providerNPIChosen, 
                    system.getProviderDirectory().getProviderList());
            Payer payer = system.getPayerDirectory().findPayerByName(chosenPayer,
                    system.getPayerDirectory().getListOfPayers());
            Patient newPatient = system.getPatientDirectory().createPatient(patientMRN, patientName,chosenGender,chosenEthinicity, patientCity, patientAddress,patientState, 
                    patientZipcode, patientCountry, patientContactNumber, patientEmailID, 
                    associatedProvider, payer, terminallIllnessAssociated, dateOfBirth,patientEmergencyContactName,patientEmergencyContactNumber, true, associatedProvider.getOperatingHospice());
            if(newPatient != null)
            {
                JOptionPane.showMessageDialog(this, "Patient added successfully!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Patient details are not saved successfully!!");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please ensure that all fields are filled!!");
        }
    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        AdminWorkAreaJPanel a = new AdminWorkAreaJPanel(userProcessContainer, userAccount, system);
        userProcessContainer.add(a);
        Layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CountryDropDown;
    private javax.swing.JComboBox<String> EthinicityDropDown;
    private javax.swing.JComboBox<String> GenderDropDown;
    private javax.swing.JComboBox<String> OperatingProvider;
    private javax.swing.JComboBox<String> Payer;
    private javax.swing.JComboBox<String> TerminalIllnessDropDown;
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbCity;
    private javax.swing.JLabel lbContactNumber;
    private javax.swing.JLabel lbDateOfBirth;
    private javax.swing.JLabel lbEmailID;
    private javax.swing.JLabel lbEmergencyContactName;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPatientMRN;
    private javax.swing.JLabel lbState;
    private javax.swing.JLabel lbTerminalIllness;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbZipCode;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtEmergencyContactName;
    private javax.swing.JTextField txtEmergencyContactNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientMRN;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
    private void populateProviderDropdown() {
        Hospice hospice = system.getHospiceDirectory().findHospiceByEmailID(userAccount.getUsername(),
                system.getHospiceDirectory().getListOfHospice());
        for(Provider provider : system.getProviderDirectory().getProviderList())
        {
            if(provider.getOperatingHospice().getHospiceID().equals(hospice.getHospiceID()))
            {
                OperatingProvider.addItem(provider.getProviderNPI());
            }
        }
    }

    private void populatePayerDropdown() {
        for(Payer payer : system.getPayerDirectory().getListOfPayers())
        {
            Payer.addItem(payer.getPayerName());
        }
    }
}
