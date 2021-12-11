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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("MAKE A DONATION: ");

        jLabel2.setText("Donor Name: ");

        jLabel3.setText("Amount: ");

        jLabel4.setText("$");

        ddHospice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));

        jLabel5.setText("Hospice:");

        btnDonation.setText("Donate");
        btnDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDonorName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ddHospice, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDonation)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(493, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDonorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ddHospice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(65, 65, 65)
                .addComponent(btnDonation)
                .addContainerGap(128, Short.MAX_VALUE))
        );
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
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDonorName;
    // End of variables declaration//GEN-END:variables

    private void populateHospiceDropdown() {
        for(Hospice hospice: system.getHospiceDirectory().getListOfHospice()){
            ddHospice.addItem(hospice.getHospiceName());
        }
    }
}
