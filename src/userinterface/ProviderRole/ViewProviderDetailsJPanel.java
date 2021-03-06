/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ProviderRole;

import Business.EcoSystem;
import Business.Patients.Patient;
import Business.Providers.Provider;
import Business.UserAccount.UserAccount;

/**
 *
 * @author architnigam
 */
public class ViewProviderDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewProviderDetails
     */
    UserAccount account;
    EcoSystem system;
    String viewer;
    
    public ViewProviderDetailsJPanel(UserAccount account, EcoSystem system) {
        initComponents();
        this.account = account;
        this.system = system;
        //this.viewer = viewer;
        txtAddress.setEditable(false);
        txtCity.setEditable(false);
        txtCountry.setEditable(false);
        txtEmailID.setEditable(false);
        txtNPI.setEditable(false);
        txtName.setEditable(false);
        txtOperatingHospice.setEditable(false);
        txtProviderno.setEditable(false);
        txtState.setEditable(false);
        txtZipcode.setEditable(false);
        populatetable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNPI = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblEmailID = new javax.swing.JLabel();
        lblProviderNo = new javax.swing.JLabel();
        lblOperatingHospice = new javax.swing.JLabel();
        txtNPI = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtZipcode = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        txtProviderno = new javax.swing.JTextField();
        txtOperatingHospice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        lblNPI.setText("NPI:");
        add(lblNPI);
        lblNPI.setBounds(33, 43, 90, 31);

        lblState.setText("State:");
        add(lblState);
        lblState.setBounds(33, 296, 90, 31);

        lblName.setText("Name:");
        add(lblName);
        lblName.setBounds(33, 121, 90, 31);

        lblAddress.setText("Address:");
        add(lblAddress);
        lblAddress.setBounds(33, 207, 90, 31);

        lblCity.setText("City:");
        add(lblCity);
        lblCity.setBounds(33, 375, 90, 31);

        lblCountry.setText("Country:");
        add(lblCountry);
        lblCountry.setBounds(367, 43, 90, 31);

        lblZipCode.setText("ZipCode:");
        add(lblZipCode);
        lblZipCode.setBounds(367, 121, 90, 31);

        lblEmailID.setText("Email ID:");
        add(lblEmailID);
        lblEmailID.setBounds(367, 207, 90, 31);

        lblProviderNo.setText("Provider Contact No.:");
        add(lblProviderNo);
        lblProviderNo.setBounds(323, 296, 134, 31);

        lblOperatingHospice.setText("Operating Hospice:");
        add(lblOperatingHospice);
        lblOperatingHospice.setBounds(323, 375, 134, 31);
        add(txtNPI);
        txtNPI.setBounds(129, 45, 100, 26);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName);
        txtName.setBounds(129, 123, 100, 26);
        add(txtAddress);
        txtAddress.setBounds(129, 209, 100, 26);

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });
        add(txtState);
        txtState.setBounds(129, 298, 100, 26);
        add(txtCity);
        txtCity.setBounds(129, 377, 100, 26);

        txtCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountryActionPerformed(evt);
            }
        });
        add(txtCountry);
        txtCountry.setBounds(463, 45, 100, 26);
        add(txtZipcode);
        txtZipcode.setBounds(463, 123, 100, 26);
        add(txtEmailID);
        txtEmailID.setBounds(463, 209, 100, 26);
        add(txtProviderno);
        txtProviderno.setBounds(463, 298, 100, 26);
        add(txtOperatingHospice);
        txtOperatingHospice.setBounds(463, 377, 100, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageproviderfinal.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblNPI;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOperatingHospice;
    private javax.swing.JLabel lblProviderNo;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtNPI;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOperatingHospice;
    private javax.swing.JTextField txtProviderno;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables

    private void populatetable() 
    {
        //String mrn = ddMRN.getSelectedItem().toString();
        Provider provider = system.getProviderDirectory().findProviderByEmailID(account.getUsername(),
                system.getProviderDirectory().getProviderList());
        if(provider != null) 
        {
            txtNPI.setText(provider.getProviderNPI());
            txtName.setText(provider.getProviderName());
            txtAddress.setText(provider.getProviderAddress());
            txtState.setText(provider.getProviderState());
            txtCity.setText(provider.getProviderCity());
            txtCountry.setText(provider.getProviderCountry());
            txtZipcode.setText(provider.getZipCode());
            txtEmailID.setText(provider.getProviderEmailID());
            txtProviderno.setText(provider.getProviderContactNumber());
            txtOperatingHospice.setText(provider.getOperatingHospice().getHospiceName());
        }
    }
}
