/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package userinterface.SystemAdminWorkArea;

import Business.Donors.Donor;
import Business.EcoSystem;
import Business.SetIDsForEnterprises;
import Business.UserAccount.UserAccount;
import Business.ValidationLogic;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nishitasheelendraupadhyay
 */
public class AddDonorJPanel extends javax.swing.JPanel {

    /** Creates new form AddDonorJPanel */
    UserAccount userAccount;
    EcoSystem system;
    JPanel userProcessContainer;
    public AddDonorJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbAmount = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        lblimage = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(null);

        lbTitle.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Add Donor");
        add(lbTitle);
        lbTitle.setBounds(340, 50, 240, 60);

        lbName.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        lbName.setText("Name:");
        add(lbName);
        lbName.setBounds(180, 140, 90, 30);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        add(txtName);
        txtName.setBounds(290, 130, 207, 40);

        lbAmount.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        lbAmount.setText("Email ID:");
        add(lbAmount);
        lbAmount.setBounds(180, 200, 80, 30);
        add(txtEmailID);
        txtEmailID.setBounds(290, 190, 210, 40);

        lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/donor.png"))); // NOI18N
        add(lblimage);
        lblimage.setBounds(550, 20, 450, 380);

        btnSave.setBackground(new java.awt.Color(193, 137, 165));
        btnSave.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave);
        btnSave.setBounds(260, 279, 120, 50);

        btnBack.setBackground(new java.awt.Color(193, 137, 165));
        btnBack.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbtnimg-2.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(100, 40, 130, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        ValidationLogic validationLogic = new ValidationLogic();
        if(validationLogic.validateIfAllFieldsAreFilled_2(txtEmailID, txtName))
        {
            String donorName = txtName.getText();
            String emailID = txtEmailID.getText();
            SetIDsForEnterprises setIDForEnterprises = new SetIDsForEnterprises();
            String donorID = setIDForEnterprises.SetIDForDonors();
            Donor newDonor = system.getDonorDirectory().createNewDonor(donorID, donorName, emailID);
            if(newDonor != null)
            {
                JOptionPane.showMessageDialog(this, "Donor saved successfully!");
                txtName.setText("");
                txtEmailID.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Donor details are not saved successfully!!");
            }
        }
        else
        {
             JOptionPane.showMessageDialog(this, "Please ensure that all fields are filled!!");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        SystemAdminWorkAreaJPanel a = new SystemAdminWorkAreaJPanel(userProcessContainer, userAccount, system);
        userProcessContainer.add(a);
        Layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lbAmount;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lblimage;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

}
