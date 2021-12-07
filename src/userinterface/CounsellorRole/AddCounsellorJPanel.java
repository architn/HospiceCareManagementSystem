/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CounsellorRole;

/**
 *
 * @author rohannayak
 */
public class AddCounsellorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCounsellorJPanel
     */
    public AddCounsellorJPanel() {
        initComponents();
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
        AddressScrollPane = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        lbCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lbState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lbZipCode = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        lbCountry = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        lbContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        lbEmailID = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        lbHospiceAssigned = new javax.swing.JLabel();
        HospiceAssignedDropDown = new javax.swing.JComboBox();
        btnAddCounsellor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbCounsellorId = new javax.swing.JLabel();
        txtCounsellorId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 204));

        lbTitle.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Add Counsellor");

        lbName.setText("Name :");

        lbAddress.setText("Address :");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        AddressScrollPane.setViewportView(txtAddress);

        lbCity.setText("City :");

        lbState.setText("State :");

        lbZipCode.setText("Zip Code :");

        lbCountry.setText("Country :");

        lbContactNumber.setText("Contact Number :");

        lbEmailID.setText("Email ID :");

        lbHospiceAssigned.setText("Hospice Assigned :");

        HospiceAssignedDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAddCounsellor.setText("Add Counsellor");
        btnAddCounsellor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCounsellorActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CounsellorImage2.png"))); // NOI18N

        lbCounsellorId.setText("Counesllor ID :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbAddress)
                            .addComponent(lbName)
                            .addComponent(lbCity)
                            .addComponent(lbState)
                            .addComponent(lbZipCode)
                            .addComponent(lbCountry)
                            .addComponent(lbContactNumber)
                            .addComponent(lbEmailID)
                            .addComponent(lbHospiceAssigned)
                            .addComponent(lbCounsellorId))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddCounsellor)
                            .addComponent(AddressScrollPane)
                            .addComponent(txtName)
                            .addComponent(txtCity)
                            .addComponent(txtState)
                            .addComponent(txtZipCode)
                            .addComponent(txtCountry)
                            .addComponent(txtContactNumber)
                            .addComponent(txtEmailID)
                            .addComponent(HospiceAssignedDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCounsellorId))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitle)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCounsellorId)
                            .addComponent(txtCounsellorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAddress)
                            .addComponent(AddressScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCity)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbState)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbZipCode)
                            .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCountry)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbContactNumber)
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEmailID)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbHospiceAssigned)
                            .addComponent(HospiceAssignedDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(btnAddCounsellor)))
                .addContainerGap(303, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCounsellorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCounsellorActionPerformed
        // TODO add your handling code here:
        //        nurse.setNurseName(txtName.getText());
        //        nurse.setNurseId(txtCounsellorId.getText());
    }//GEN-LAST:event_btnAddCounsellorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AddressScrollPane;
    private javax.swing.JComboBox<String> HospiceAssignedDropDown;
    private javax.swing.JButton btnAddCounsellor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbCity;
    private javax.swing.JLabel lbContactNumber;
    private javax.swing.JLabel lbCounsellorId;
    private javax.swing.JLabel lbCountry;
    private javax.swing.JLabel lbEmailID;
    private javax.swing.JLabel lbHospiceAssigned;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbState;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbZipCode;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtCounsellorId;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
