/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.volunteer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FoodClothing.ClothInventory;
import Business.FoodClothing.FoodInventory;
import Business.Homeless.Homeless;
import Business.Homeless.HomelessDirectory;
import Business.Network.Network;
import Business.Organization.ClothingOrganization;
import Business.Organization.FoodOrganization;
import Business.Organization.Organization;
import Business.Organization.SelfOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.ClothingRole.ClothingWorkAreaJPanel;
import userinterface.FoodRole.FoodWorkAreaJPanel;

/**
 *
 * @author mahes
 */
public class SelfWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SelfWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private SelfOrganization selfOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private HomelessDirectory homelessDirectory;
    private Homeless homeless;
    private EcoSystem business;
    private Network network;
    private FoodOrganization foodOrganization;
    private ClothingOrganization clothingorganization;
    private FoodInventory foodinventory; 
    private ClothInventory clothinventory;
            
            
    public SelfWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, FoodInventory foodinventory, ClothInventory clothinventory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.selfOrganization = (SelfOrganization)organization;
        this.enterprise = enterprise;
        this.business = business;
        this.homelessDirectory = new HomelessDirectory();
        this.clothinventory=new ClothInventory();
        this.foodinventory= new FoodInventory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();

        btnManageNetwork.setBackground(new java.awt.Color(0, 0, 0));
        btnManageNetwork.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        btnManageNetwork.setForeground(new java.awt.Color(255, 255, 255));
        btnManageNetwork.setText("Donate Food");
        btnManageNetwork.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });

        btnManageEnterprise.setBackground(new java.awt.Color(0, 0, 0));
        btnManageEnterprise.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        btnManageEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEnterprise.setText("Donate Clothes");
        btnManageEnterprise.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(btnManageNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnManageEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnManageNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(btnManageEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        FoodWorkAreaJPanel foodWorkJPanel=new FoodWorkAreaJPanel(userProcessContainer, userAccount, enterprise, business, foodinventory);
        userProcessContainer.add("foodWorkJPanel",foodWorkJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        ClothingWorkAreaJPanel clothingworkareapanel =new ClothingWorkAreaJPanel(userProcessContainer, userAccount, clothingorganization, enterprise, business, clothinventory);
        userProcessContainer.add("clothingworkareapanel",clothingworkareapanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    // End of variables declaration//GEN-END:variables
}
