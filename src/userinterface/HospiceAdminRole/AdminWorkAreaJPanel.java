

package userinterface.HospiceAdminRole;


import Business.EcoSystem;
import Business.Hospice.Hospice;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rohannayak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem system;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        Hospice hospice = system.getHospiceDirectory().findHospiceByEmailID(userAccount.getUsername(), 
                system.getHospiceDirectory().getListOfHospice());
        jTextField1.setText(String.valueOf(hospice.getTotalHospiceBalance()));
       jTextField1.setEditable(false);
       enterpriseLabel.setText(hospice.getHospiceName());

    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageNurse = new javax.swing.JButton();
        btnManagePatients = new javax.swing.JButton();
        btnManageProvider = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnAddProvider = new javax.swing.JButton();
        btnAddPatient = new javax.swing.JButton();
        btnAddNurse = new javax.swing.JButton();
        btnAddCounsellor = new javax.swing.JButton();
        btnManageCounsellors = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(null);

        btnManageNurse.setBackground(new java.awt.Color(166, 158, 200));
        btnManageNurse.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        btnManageNurse.setText("Manage Nurses");
        btnManageNurse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNurseActionPerformed(evt);
            }
        });
        add(btnManageNurse);
        btnManageNurse.setBounds(220, 260, 170, 90);

        btnManagePatients.setBackground(new java.awt.Color(166, 158, 200));
        btnManagePatients.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        btnManagePatients.setText("Manage Patients");
        btnManagePatients.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManagePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientsActionPerformed(evt);
            }
        });
        add(btnManagePatients);
        btnManagePatients.setBounds(570, 120, 190, 100);

        btnManageProvider.setBackground(new java.awt.Color(166, 158, 200));
        btnManageProvider.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        btnManageProvider.setText("Manage Providers");
        btnManageProvider.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProviderActionPerformed(evt);
            }
        });
        add(btnManageProvider);
        btnManageProvider.setBounds(220, 120, 170, 100);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Hospice:");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(60, 30, 270, 30);

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        jLabel1.setText("Total Hospice Balance: $ ");
        add(jLabel1);
        jLabel1.setBounds(380, 40, 157, 13);
        add(jTextField1);
        jTextField1.setBounds(540, 30, 120, 30);

        btnAddProvider.setBackground(new java.awt.Color(166, 158, 200));
        btnAddProvider.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        btnAddProvider.setText("Add Provider");
        btnAddProvider.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProviderActionPerformed(evt);
            }
        });
        add(btnAddProvider);
        btnAddProvider.setBounds(60, 120, 140, 100);

        btnAddPatient.setBackground(new java.awt.Color(166, 158, 200));
        btnAddPatient.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        btnAddPatient.setText("Add Patient");
        btnAddPatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });
        add(btnAddPatient);
        btnAddPatient.setBounds(400, 120, 150, 100);

        btnAddNurse.setBackground(new java.awt.Color(166, 158, 200));
        btnAddNurse.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        btnAddNurse.setText("Add Nurse");
        btnAddNurse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNurseActionPerformed(evt);
            }
        });
        add(btnAddNurse);
        btnAddNurse.setBounds(60, 260, 140, 90);

        btnAddCounsellor.setBackground(new java.awt.Color(166, 158, 200));
        btnAddCounsellor.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        btnAddCounsellor.setText("Add Counsellor");
        btnAddCounsellor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddCounsellor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCounsellorActionPerformed(evt);
            }
        });
        add(btnAddCounsellor);
        btnAddCounsellor.setBounds(400, 260, 150, 90);

        btnManageCounsellors.setBackground(new java.awt.Color(166, 158, 200));
        btnManageCounsellors.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        btnManageCounsellors.setText("Manage Counsellors");
        btnManageCounsellors.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageCounsellors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCounsellorsActionPerformed(evt);
            }
        });
        add(btnManageCounsellors);
        btnManageCounsellors.setBounds(570, 260, 190, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HospiceBG-removebg-preview.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(210, 370, 360, 260);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNurseActionPerformed
        // TODO add your handling code here:
        ManageNurseJPanel manageNurseJPanel = new ManageNurseJPanel(userProcessContainer,userAccount, system);
        userProcessContainer.add("Manage Nurse", manageNurseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNurseActionPerformed

    private void btnManagePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientsActionPerformed
        ManagePatientJPanel managePatientJPanel = new ManagePatientJPanel(userProcessContainer,userAccount, system);
        userProcessContainer.add("Manage Patient", managePatientJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);  
    }//GEN-LAST:event_btnManagePatientsActionPerformed

    private void btnManageProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProviderActionPerformed
        ManageProviderJPanel manageProviderJPanel = new ManageProviderJPanel(userProcessContainer,userAccount, system);
        userProcessContainer.add("Manage Provider", manageProviderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageProviderActionPerformed

    private void btnAddProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProviderActionPerformed
        // TODO add your handling code here:
        AddProviderJPanel addProviderJPanel = new AddProviderJPanel(userProcessContainer,userAccount,system);
        userProcessContainer.add("Add Counsellor", addProviderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnAddProviderActionPerformed

    private void btnAddCounsellorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCounsellorActionPerformed
        // TODO add your handling code here:
        AddCounsellorJPanel addCounsellorJPanel = new AddCounsellorJPanel(userProcessContainer, userAccount, system);
        userProcessContainer.add("Add Counsellor", addCounsellorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddCounsellorActionPerformed

    private void btnManageCounsellorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCounsellorsActionPerformed
        // TODO add your handling code here:
        ManageCounsellorJPanel manageCounsellorJPanel = new ManageCounsellorJPanel(userProcessContainer,userAccount,system);
        userProcessContainer.add("Manage Counsellor", manageCounsellorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCounsellorsActionPerformed

    private void btnAddNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNurseActionPerformed
        // TODO add your handling code here:
        AddNurseJPanel addNurseJPanel = new AddNurseJPanel(userProcessContainer,userAccount,system);
        userProcessContainer.add("Add Nurse", addNurseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddNurseActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
        AddPatientJPanel addPatientJPanel = new AddPatientJPanel(userProcessContainer,userAccount, system);
        userProcessContainer.add("Add Patient", addPatientJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddPatientActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCounsellor;
    private javax.swing.JButton btnAddNurse;
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnAddProvider;
    private javax.swing.JButton btnManageCounsellors;
    private javax.swing.JButton btnManageNurse;
    private javax.swing.JButton btnManagePatients;
    private javax.swing.JButton btnManageProvider;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    
}
