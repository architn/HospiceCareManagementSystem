/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Appointments;

import Business.COVID.COVIDTest;
import Business.EcoSystem;
import Business.Patients.Patient;
import Business.TestingCentre.TestingCentre;
import Business.UserAccount.UserAccount;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 *
 * @author architnigam
 */
public class ScheduleACOVIDTestAppointment extends javax.swing.JPanel {

    /**
     * Creates new form ScheduleACOVIDTestAppointment
     */
    UserAccount account;
    EcoSystem system;
    ButtonGroup group1;
    public ScheduleACOVIDTestAppointment(UserAccount account, EcoSystem system) {
        initComponents();
        group1 = new ButtonGroup();
        group1.add(btnElevenAM);
        group1.add(btnOnePM);
        group1.add(btnTwoPM);
        group1.add(btnThreePM);
        group1.add(btnFourPM);
        group1.add(btnFourThirtyPM);
        group1.add(btnFivePM);
        group1.add(btnFiveThirtyPM);
        
        txtDate.setMinSelectableDate(new Date());
        this.account = account;
        this.system = system;
        populateTestingCentreDropdown();
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
        btnElevenAM = new javax.swing.JToggleButton();
        btnOnePM = new javax.swing.JToggleButton();
        btnThreePM = new javax.swing.JToggleButton();
        btnTwoPM = new javax.swing.JToggleButton();
        btnFourPM = new javax.swing.JToggleButton();
        btnFourThirtyPM = new javax.swing.JToggleButton();
        btnFiveThirtyPM = new javax.swing.JToggleButton();
        btnFivePM = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        btnCOVIDTest = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        ddTestingCentre = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel1.setText("Select a Date: ");
        add(jLabel1);
        jLabel1.setBounds(80, 240, 150, 20);

        btnElevenAM.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnElevenAM.setText("11:00 AM");
        btnElevenAM.setActionCommand("11:00:00 AM");
        add(btnElevenAM);
        btnElevenAM.setBounds(270, 320, 107, 29);

        btnOnePM.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnOnePM.setText("1:00 PM");
        btnOnePM.setActionCommand("1:00:00 PM");
        add(btnOnePM);
        btnOnePM.setBounds(390, 320, 98, 29);

        btnThreePM.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnThreePM.setText("3:00 PM");
        btnThreePM.setActionCommand("3:00:00 PM");
        add(btnThreePM);
        btnThreePM.setBounds(640, 320, 98, 29);

        btnTwoPM.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnTwoPM.setText("2:00 PM");
        btnTwoPM.setActionCommand("2:00:00 PM");
        add(btnTwoPM);
        btnTwoPM.setBounds(510, 320, 98, 29);

        btnFourPM.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnFourPM.setText("4:00 PM");
        btnFourPM.setActionCommand("4:00:00 PM");
        add(btnFourPM);
        btnFourPM.setBounds(280, 390, 98, 29);

        btnFourThirtyPM.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnFourThirtyPM.setText("4:30 PM");
        btnFourThirtyPM.setActionCommand("4:30:00 PM");
        add(btnFourThirtyPM);
        btnFourThirtyPM.setBounds(400, 390, 98, 29);

        btnFiveThirtyPM.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnFiveThirtyPM.setText("5:30 PM");
        btnFiveThirtyPM.setActionCommand("6:00:00 PM");
        add(btnFiveThirtyPM);
        btnFiveThirtyPM.setBounds(640, 390, 98, 29);

        btnFivePM.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnFivePM.setText("5:00 PM");
        btnFivePM.setActionCommand("5:00:00 PM");
        add(btnFivePM);
        btnFivePM.setBounds(520, 390, 98, 29);

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel2.setText("Select a Time Slot: ");
        add(jLabel2);
        jLabel2.setBounds(80, 330, 170, 20);
        add(txtDate);
        txtDate.setBounds(280, 230, 145, 34);

        btnCOVIDTest.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnCOVIDTest.setText("Schedule a COVID - 19 Test");
        btnCOVIDTest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCOVIDTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOVIDTestActionPerformed(evt);
            }
        });
        add(btnCOVIDTest);
        btnCOVIDTest.setBounds(270, 560, 200, 40);

        jCheckBox1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jCheckBox1.setText("I need special accomodations for this COVID Test");
        add(jCheckBox1);
        jCheckBox1.setBounds(250, 470, 410, 40);

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        jLabel3.setText("Schedule a COVID-19 Test: ");
        add(jLabel3);
        jLabel3.setBounds(190, 50, 400, 50);

        ddTestingCentre.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        ddTestingCentre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        add(ddTestingCentre);
        ddTestingCentre.setBounds(270, 160, 210, 30);

        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel4.setText("Testing Centre: ");
        add(jLabel4);
        jLabel4.setBounds(80, 160, 150, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/COVIDTest_1.png"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(0, 0, 1200, 840);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCOVIDTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOVIDTestActionPerformed
        // TODO add your handling code here:
        try{
            String selectedTrainingCentre = ddTestingCentre.getSelectedItem().toString();
            TestingCentre testingCentre = system.getTestingCentreDirectory().findTestingCentreByName(selectedTrainingCentre, 
                                          system.getTestingCentreDirectory().getListOfTestingCentre());
            Date selectedDate = txtDate.getDate();
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");  
            String strDate = dateFormat.format(selectedDate);  
            Date appointmentDate =new SimpleDateFormat("MM/dd/yyyy").parse(strDate);
            JToggleButton buttonPressed = determinePressButton();
            String time = buttonPressed.getActionCommand();
        
            Patient patient = system.getPatientDirectory().findPatientByEmailID(account.getUsername(), 
                system.getPatientDirectory().getPatientList());
        
            COVIDTest covidTestSchedule = system.getCovidTestDirectory().scheduleANewCOVIDTest(patient, testingCentre, 
                appointmentDate, time);
            if(covidTestSchedule != null)
            {
                JOptionPane.showMessageDialog(this, "COVID Test has been scheduled successfully!"
                    + "\n The test is scheduled on "+appointmentDate+" at "+time
                +"\n Location is " +testingCentre.getTestingCentreAddress()+", "+testingCentre.getTestingCentreCity());
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnCOVIDTestActionPerformed

    private JToggleButton determinePressButton() {
        if(btnElevenAM.isSelected())
        {
            return btnElevenAM;
        }
        else
        {
            if(btnOnePM.isSelected())
            {
                return btnOnePM;
            }
            else{
                if(btnThreePM.isSelected())
                {
                    return btnThreePM;
                }
                else{
                    if(btnFourPM.isSelected())
                    {
                        return btnFourPM;
                    }
                    else{
                        if(btnFourThirtyPM.isSelected())
                        {
                            return btnFourThirtyPM;
                        }
                        else{
                            if(btnFivePM.isSelected())
                            {
                                return btnFivePM;
                            }
                            else{
                                if(btnFiveThirtyPM.isSelected())
                                {
                                    return btnFiveThirtyPM;
                                }
                            }
                        }
                    }
                }
                    
            }
        }
        return null;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCOVIDTest;
    private javax.swing.JToggleButton btnElevenAM;
    private javax.swing.JToggleButton btnFivePM;
    private javax.swing.JToggleButton btnFiveThirtyPM;
    private javax.swing.JToggleButton btnFourPM;
    private javax.swing.JToggleButton btnFourThirtyPM;
    private javax.swing.JToggleButton btnOnePM;
    private javax.swing.JToggleButton btnThreePM;
    private javax.swing.JToggleButton btnTwoPM;
    private javax.swing.JComboBox<String> ddTestingCentre;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.toedter.calendar.JDateChooser txtDate;
    // End of variables declaration//GEN-END:variables

    private void populateTestingCentreDropdown() {
       for(TestingCentre testCentre : system.getTestingCentreDirectory().getListOfTestingCentre())
       {
           ddTestingCentre.addItem(testCentre.getTestingCentreName());
       }
    }
}
