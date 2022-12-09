/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.FoodRole;

import HMS.NetworkDirectory;
import HMS.Enterprise.Enterprise;
import HMS.FoodClothing.Food;
import HMS.FoodClothing.FoodInventory;
import HMS.Organization.Organization;
//import Business.Homeless.Homeless;
//import Business.Homeless.HomelessDirectory;
//import Business.Network.Network;
//import Business.Organization.FoodOrganization;
//import Business.Organization.Organization;
import HMS.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mahes
 */
public class FoodWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    //private FoodOrganization foodOrganization;
    private Enterprise enterprise;
   // private UserAccount userAccount;
    //private HomelessDirectory homelessDirectory;
    //private Homeless homeless;
    private NetworkDirectory business;
    //private Network network;
    private FoodInventory foodinventory;
    private String username;
    private Organization org;
    public FoodWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,Organization organization, NetworkDirectory business, FoodInventory foodinventory, String username) {
        initComponents();
        //this.userProcessContainer = userProcessContainer;
        //this.userAccount = account;
        ///this.foodOrganization = (FoodOrganization)organization;
        this.enterprise = enterprise;
        this.business = business;
        this.username=username;
        //this.homelessDirectory = new HomelessDirectory();
      this.foodinventory= foodinventory;
     // this.org=organization;
      
      populateTbl();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        locationTxt = new javax.swing.JTextField();
        quantityTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        date = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        foodTbl = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jLabel1.setText("Shelter:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jLabel2.setText("Location:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jLabel3.setText("Donated On:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jLabel6.setText("Quantity Provided:");

        locationTxt.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jButton1.setText("Donate");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cambridge", "Boston", "Wrentham", "New York", "Park Drive" }));

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jButton2.setText("Update");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(0, 0, 0));
        backJButton.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        foodTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(foodTbl);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/food-removebg-preview.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(locationTxt)
                                    .addComponent(jComboBox1, 0, 136, Short.MAX_VALUE))
                                .addGap(156, 156, 156)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(quantityTxt)
                                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(951, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(80, 80, 80)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        String shelter = jComboBox1.getSelectedItem().toString() ;
      
        String location = locationTxt.getText();
        int quantity = Integer.parseInt(quantityTxt.getText());
        
        SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd");
        String donatedOn = dformat.format(date.getDate());
        
      //  MainJFrame mainframe = new MainJFrame();
      //  String userName = mainframe.userNameJTextField.getText();
     
     // String o="Food Organization";
    //   for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
      // {
           
        //       if(organization.getName().contains("Food Organization"))
          //    {
           
                   
              //     organization.getFoodinventory().addToInventory(shelter,location,quantity, username, donatedOn);
            //       JOptionPane.showMessageDialog(null, "Added");
                 //  populateTbl();
       //       }
       //}
      
       for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
       {
           
               if(organization.getName().contains("Food Organization"))
            {
           try{
               JOptionPane.showMessageDialog(null, enterprise);
                  foodinventory.addToInventory(shelter, location, quantity, username, donatedOn);
                      // organization.getFoodinventory().addToInventory(shelter, location, quantity, username, donatedOn);
                       JOptionPane.showMessageDialog(null, "Added");
                   populateTbl();
              //     organization.getFoodinventory().addToInventory(shelter,location,quantity, username, donatedOn);
            //       JOptionPane.showMessageDialog(null, "Added");
                 //  populateTbl();
       //       }
       //}
      
           }
           catch(NullPointerException e)
           {
               JOptionPane.showMessageDialog(null, e);
           }
            }
       }
    // org.getFoodinventory().addToInventory(shelter,location,quantity, username, donatedOn);
      // JOptionPane.showMessageDialog(null, "Added");
     //  JOptionPane.showMessageDialog(null, org);
      // populateTbl();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
           
        int selectedRowIndex = foodTbl.getSelectedRow();

        if (selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this,"Please select a row to edit!");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) foodTbl.getModel();
        Food selectedDetail = (Food) model.getValueAt(selectedRowIndex,0);


        String shelter = jComboBox1.toString();
        String location = locationTxt.getText();
        int quantity = Integer.parseInt(quantityTxt.getText());
        SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd");
        String donatedOn = dformat.format(date.getDate());
        
       int index=foodinventory.getFoodinventory().indexOf(selectedDetail);
       Food food= foodinventory.updateInventory(index, selectedDetail);
        
       
       food.setShelter(shelter);
       food.setLocation(location);
       food.setQuantity(quantity);
       food.setDonatedon(donatedOn);
       food.setProvidedby(username);
       populateTbl();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTable foodTbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField locationTxt;
    private javax.swing.JTextField quantityTxt;
    // End of variables declaration//GEN-END:variables

    private void populateTbl() {
        
      // MainJFrame mainframe = new MainJFrame();
       //String userName = mainframe.userNameJTextField.getText();
       
       
       
     //   UserAccount useraccount= new UserAccount();
        
        DefaultTableModel model = (DefaultTableModel) foodTbl.getModel();
        model.setRowCount(0);
        //Food food=new Food();
        //for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
       {
           
               if(organization.getName().contains("Food Organization"))
              {
                   for (Food food : foodinventory.getFoodinventory())
        {
            if(food.getProvidedby().equals(username))
            {
            Object[] row = new Object[4];
            row[0]=food.getShelter();
            row[1]=food.getLocation();
            row[2]=food.getDonatedon();
            row[3]=food.getQuantity();
            
            model.addRow(row);
            
            }
        //}
       
       
    }
              }
       
    
    }

}}