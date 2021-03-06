/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Workflows;

import Business.Donation.Donation;
import Business.Donors.Donor;
import Business.EcoSystem;
import Business.Audits.Audit;
import Business.Hospice.Hospice;
import Business.Invoice.GenerateInvoices;
import Business.SetIDsForWorkflows;
import Business.UserAccount.UserAccount;
import Business.ValidationLogic;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author architnigam
 */
public class MakeADonationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MakeADonationJPanel
     */
    private JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    public MakeADonationJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        populateHospiceDropdown();
        Donor donor = system.getDonorDirectory().findDonorByEmailID(userAccount.getUsername(), 
                system.getDonorDirectory().getListOfDonors());
        txtDonorName.setText(donor.getDonorName());
        txtDonorName.setEditable(false);
        
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
        jLabel2 = new javax.swing.JLabel();
        txtDonorName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ddHospice = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        btnDonation = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(155, 199, 199));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel1.setText("Make a Donation");
        add(jLabel1);
        jLabel1.setBounds(188, 31, 244, 43);

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel2.setText("Donor Name: ");
        add(jLabel2);
        jLabel2.setBounds(132, 317, 93, 15);
        add(txtDonorName);
        txtDonorName.setBounds(296, 310, 159, 26);

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel3.setText("Amount: ");
        add(jLabel3);
        jLabel3.setBounds(144, 406, 63, 15);
        add(txtAmount);
        txtAmount.setBounds(296, 399, 159, 26);

        jLabel4.setText("$");
        add(jLabel4);
        jLabel4.setBounds(266, 399, 18, 26);

        ddHospice.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        ddHospice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        add(ddHospice);
        ddHospice.setBounds(296, 487, 186, 27);

        jLabel5.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel5.setText("Hospice:");
        add(jLabel5);
        jLabel5.setBounds(144, 492, 61, 15);

        btnDonation.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnDonation.setText("Donate");
        btnDonation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonationActionPerformed(evt);
            }
        });
        add(btnDonation);
        btnDonation.setBounds(296, 581, 186, 21);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/donation.jpeg"))); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6);
        jLabel6.setBounds(132, 92, 490, 200);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonationActionPerformed
        // TODO add your handling code here:
        ValidationLogic validationLogic = new ValidationLogic();
        String donorName = txtDonorName.getText();
        Donor donor = system.getDonorDirectory().findDonorByName(donorName, system.getDonorDirectory().getListOfDonors());
        String donationAmount = txtAmount.getText(); // add validation for double fields
        String selectedHospice = ddHospice.getSelectedItem().toString();
        Hospice donationHospice = system.getHospiceDirectory().findHospiceByName(selectedHospice, 
                system.getHospiceDirectory().getListOfHospice());
        SetIDsForWorkflows setIDForWorkflows = new SetIDsForWorkflows();
        String donationID = setIDForWorkflows.SetIDForDonation();
       if(validationLogic.VerifyThatDonorPermittedAmountOfDonation(Double.parseDouble(donationAmount)))
       {
            Donation addNewDonation = system.getDonationDirectory().createNewDonation(donationID,
                donor, Double.parseDouble(donationAmount), donationHospice);
             if(addNewDonation != null)
            {
                JOptionPane.showMessageDialog(this, "Amount successfully donated!");
                GenerateInvoices generateInvoices = new GenerateInvoices();
                generateInvoices.GenerateDonationInvoice(donationID, donorName, donationAmount, selectedHospice, new Date());
                Hospice updatedHospice = system.getHospiceDirectory().updateHospice(donationHospice);
                double balanceOfHospice = donationHospice.getTotalHospiceBalance();
                double newBalance = balanceOfHospice + Double.parseDouble(donationAmount);
                updatedHospice.setTotalHospiceBalance(newBalance);
                Audit audit = system.getAuditDirectory().createNewAuditEntryForExternalDonation(addNewDonation, 
                        balanceOfHospice, newBalance);
            }
             else{
                 JOptionPane.showMessageDialog(this, "Donation could not be added.");
             }     
        }
       else{
           JOptionPane.showMessageDialog(this, "Donation amount exceeds the allowed permissible amount of $20k");
       }
    }//GEN-LAST:event_btnDonationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonation;
    private javax.swing.JComboBox<String> ddHospice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDonorName;
    // End of variables declaration//GEN-END:variables

    private void populateHospiceDropdown() {
        for(Hospice hospice: system.getHospiceDirectory().getListOfHospice()){
            ddHospice.addItem(hospice.getHospiceName());
        }
    }
}
