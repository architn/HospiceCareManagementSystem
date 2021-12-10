/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Workflows;

import Business.AppConstants;
import Business.EcoSystem;
import Business.Patients.Patient;
import Business.UserAccount.UserAccount;
import Business.ValidationLogic;
import Business.VitalSigns.BMICalculator;
import Business.VitalSigns.BloodPressureCalculator;
import Business.VitalSigns.CholesterolCalculator;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author architnigam
 */
public class LogVitalSignsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LogVitalSignsJPanel
     */
    BMICalculator bmiCalculator = new BMICalculator();
    CholesterolCalculator cholesterolCalculator = new CholesterolCalculator();
    BloodPressureCalculator bloodPressureCalculator = new BloodPressureCalculator();
    AppConstants AppConstants = new AppConstants();
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    
    public LogVitalSignsJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        populateMedicalRecordNumberDropdown();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMRN = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lblPounds = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        lblInches = new javax.swing.JLabel();
        lblSystole = new javax.swing.JLabel();
        txtSystoleReading = new javax.swing.JTextField();
        lblDiastole = new javax.swing.JLabel();
        txtDiastoleReading = new javax.swing.JTextField();
        lblmmHg1 = new javax.swing.JLabel();
        lblmmHg2 = new javax.swing.JLabel();
        lblCholesterolReading = new javax.swing.JLabel();
        txtCholestrolReading = new javax.swing.JTextField();
        lblmgdL = new javax.swing.JLabel();
        btnSaveData = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ddMRN = new javax.swing.JComboBox();
        ddEthinicity = new javax.swing.JComboBox();

        lblMRN.setText("Medical Record Number:");

        lblWeight.setText("Weight (in pounds):");

        lblPounds.setText("pounds");

        lblHeight.setText("Height (in Inches):");

        lblInches.setText("inches");

        lblSystole.setText("Systole Reading: ");

        lblDiastole.setText("Diastole Reading: ");

        lblmmHg1.setText("mm Hg");

        lblmmHg2.setText("mm Hg");

        lblCholesterolReading.setText("Cholesterol Reading: ");

        lblmgdL.setText("mg/dL");

        btnSaveData.setText("SAVE DATA");
        btnSaveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDataActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setText("VITAL SIGNS ENCOUNTER:");

        lblAge.setText("Ethinicity:");

        lblGender.setText("Gender: ");

        jButton1.setText("Populate");

        ddMRN.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        ddEthinicity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "White, non-Hispanic", "Black, non-Hispanic", "Hispanic", "Asian",
            "American Indian or Alaska Native", "Native Hawaiian or Other Pacific Islander" }));

javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(67, 67, 67)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMRN)
            .addComponent(lblSystole)
            .addComponent(lblDiastole)
            .addComponent(lblCholesterolReading)
            .addComponent(lblHeight)
            .addComponent(lblWeight)
            .addComponent(lblGender)
            .addComponent(lblAge))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtCholestrolReading, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblmgdL))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtSystoleReading, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblmmHg1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInches))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPounds))
            .addComponent(btnSaveData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ddMRN, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(ddEthinicity, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtDiastoleReading, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblmmHg2)))
        .addContainerGap(324, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(lblTitle)
                    .addGap(44, 44, 44)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMRN)
                        .addComponent(jButton1)
                        .addComponent(ddMRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGender))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(lblAge))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(ddEthinicity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(46, 46, 46)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblWeight)
                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPounds))
                    .addGap(39, 39, 39)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeight)
                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblInches))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                    .addComponent(lblmmHg1))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSystoleReading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSystole, javax.swing.GroupLayout.Alignment.TRAILING))))
            .addGap(40, 40, 40)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblDiastole)
                .addComponent(txtDiastoleReading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblmmHg2))
            .addGap(41, 41, 41)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblCholesterolReading)
                .addComponent(txtCholestrolReading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblmgdL))
            .addGap(35, 35, 35)
            .addComponent(btnSaveData)
            .addContainerGap(36, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(11, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDataActionPerformed
        // TODO add your handling code here:
        String mrn = ddMRN.getSelectedItem().toString();
        Patient patient = system.getPatientDirectory().findPatientByMRN(mrn, 
                system.getPatientDirectory().getPatientList());
        String weightInString = (txtWeight.getText());
        String heightInString = (txtHeight.getText());
        String totalCholesterolReadingInString = (txtCholestrolReading.getText());
        String systoleInString = (txtSystoleReading.getText());
        String diastoleInString = (txtDiastoleReading.getText());
        String gender = txtGender.getText();
        String ethinicity = ddEthinicity.getSelectedItem().toString();
        ValidationLogic validationLogic = new ValidationLogic();
        if(validationLogic.ValidateIfAllFieldsOnUIAreFilledAndAreNumeric(mrn,  weightInString,
            heightInString, totalCholesterolReadingInString, systoleInString, diastoleInString))
        {
            double weight = Double.parseDouble(txtWeight.getText());
            double height = Double.parseDouble(txtHeight.getText());
            double totalCholesterolReading = Double.parseDouble(txtCholestrolReading.getText());
            double systoleReading = Double.parseDouble(txtSystoleReading.getText());
            double diastoleReading = Double.parseDouble(txtDiastoleReading.getText());
            double BMIValue = (bmiCalculator.CalculateBMI(weight, height));

            int BMICriticality = bmiCalculator.DetermineBMICriticalityOfPatient(weight, height);
            String BMICriticalityLevel = bmiCalculator.BMIMapCriticalityLevelToCategory(BMICriticality);
            String BMIMessage = "Patient with MRN '"+mrn+"' BMI value is: '"+BMIValue+"' and the patient's BMI is"
            + ": "+BMICriticalityLevel;

            int CholesterolCriticality = cholesterolCalculator.DetermineCholesterolDangerLevelCriticalityOfPatient(totalCholesterolReading);
            String CholesterolCriticalityLevel = cholesterolCalculator.CholesterolMapCriticalityLevelToCategory(CholesterolCriticality);
            String CholesterolMessage = "Patient with MRN '"+mrn+"' cholesterol level is: "+CholesterolCriticalityLevel;

            int BPCriticality = bloodPressureCalculator.DetermineBloodPressureCriticalityOfPatient(systoleReading, diastoleReading);
            String BPCriticalityLevel = bloodPressureCalculator.BPMapCriticalityLevelToCategory(BPCriticality);
            String BPMessage = "Patient with MRN '"+mrn+"' blood pressure level is: "+BPCriticalityLevel;

            String finalMessageOnSave = AppConstants.PatientRecordSuccessfullySavedMessage + "\n \n" +BMIMessage +
            "\n" +BPMessage+ "\n" +CholesterolMessage ;
            
            system.getVitalSignsDirectory().createVitalSignsRecord(patient, gender, ethinicity, 
                            new Date(), height, weight, systoleReading, diastoleReading, totalCholesterolReading);


            JOptionPane.showMessageDialog(this, finalMessageOnSave);

            txtHeight.setText("");
            txtWeight.setText("");
            txtSystoleReading.setText("");
            txtDiastoleReading.setText("");
            txtCholestrolReading.setText("");
        }
    }//GEN-LAST:event_btnSaveDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveData;
    private javax.swing.JComboBox<String> ddEthinicity;
    private javax.swing.JComboBox<String> ddMRN;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCholesterolReading;
    private javax.swing.JLabel lblDiastole;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblInches;
    private javax.swing.JLabel lblMRN;
    private javax.swing.JLabel lblPounds;
    private javax.swing.JLabel lblSystole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblmgdL;
    private javax.swing.JLabel lblmmHg1;
    private javax.swing.JLabel lblmmHg2;
    private javax.swing.JTextField txtCholestrolReading;
    private javax.swing.JTextField txtDiastoleReading;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtSystoleReading;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

    private void populateMedicalRecordNumberDropdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
