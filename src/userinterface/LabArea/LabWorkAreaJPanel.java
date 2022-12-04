
package userinterface.LabArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Homeless.Homeless;
import Business.Homeless.HomelessDirectory;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorWorkRequest;
import Business.WorkQueue.LabWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mahes
 */
public class LabWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
     private JPanel userProcessContainer;
    private LabOrganization labOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private HomelessDirectory homelessDirectory;
    private Homeless homeless;
    private EcoSystem business;
    private Network network;
    

    public LabWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       
        
        

        initComponents();
        
         this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.labOrganization = (LabOrganization)organization;
        this.enterprise = enterprise;
        this.business = business;
        this.homelessDirectory = new HomelessDirectory();
        populateTable();
        
         doctorBtn.setVisible(false);
    }

    
    
    
     public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : labOrganization.getWorkQueue().getWorkRequestList()){
         
            Object[] row = new Object[7];
            
            row[1] = request.getMessage();
            row[0] = request;
            row[2] = request.getName1();
           row[3] = request.getSender().getEmployee().getName();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[5] = request.getStatus();
            row[6] = request.getTesttype();

            
            model.addRow(row);
        }
    }
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        doctorBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        refreshJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        workRequestJTable.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Message", "Name", "Sender", "Receiver", "Status", "Test Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        workRequestJTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                workRequestJTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(460, 130, 800, 90);

        assignJButton.setBackground(new java.awt.Color(0, 0, 0));
        assignJButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(255, 255, 255));
        assignJButton.setText("Assign to me");
        assignJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton);
        assignJButton.setBounds(460, 240, 170, 40);

        doctorBtn.setBackground(new java.awt.Color(0, 0, 0));
        doctorBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        doctorBtn.setForeground(new java.awt.Color(255, 255, 255));
        doctorBtn.setText("Process");
        doctorBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        doctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorBtnActionPerformed(evt);
            }
        });
        add(doctorBtn);
        doctorBtn.setBounds(1100, 250, 160, 40);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Lab Work Area");
        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(0, 0, 1750, 80);

        refreshJButton.setBackground(new java.awt.Color(0, 0, 0));
        refreshJButton.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshJButton.setText("Refresh");
        refreshJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton);
        refreshJButton.setBounds(30, 100, 130, 40);

        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1750, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void workRequestJTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_workRequestJTableKeyPressed

        //
        //         int i = workRequestJTable.getSelectedRow();
        //        TableModel model = workRequestJTable.getModel();
        //        String cloth = model.getValueAt(i,3).toString();
        //        if( cloth == "true")
        //
        //            jCheckBox1.setSelected(true);
        //
        //        else
        //            jCheckBox1.setSelected(false);
        //
    }//GEN-LAST:event_workRequestJTableKeyPressed
int i=0;
    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row First");
            return;
        }
        else{
        LabWorkRequest request = (LabWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Received By Lab");
        populateTable();
        
        
         doctorBtn.setVisible(true);
          assignJButton.setEnabled(false);
          
       i = selectedRow;
       
       Logger logger = Logger.getLogger("MyLog");  
      FileHandler fh;  

    try {  

        // This block configure the logger with handler and formatter  
        fh = new FileHandler("D:/MyLogFile.log");  
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  

        // the following statement is used to log any messages  
        logger.info("Request for "+workRequestJTable.getValueAt(selectedRow,2 )+"has been picked up by "+userAccount);  

    } catch (SecurityException e) {  
        e.printStackTrace();  
    } catch (IOException e) {  
        e.printStackTrace();  
    }  

        
        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void doctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorBtnActionPerformed
    
        
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
        
         if (i!=selectedRow){
             JOptionPane.showMessageDialog(null, "Please Select the Same Row");
            return;
           
        }
         
        LabWorkRequest request = (LabWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
     
        request.setStatus("Lab Result");
        
      SendLabResultJPanel processWorkRequestJPanel = new SendLabResultJPanel(userProcessContainer, request, enterprise, userAccount, network, business);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
//       int selectedRow = workRequestJTable.getSelectedRow();
//
//        if (selectedRow < 0){
//            return;
//        }
//
//        LabWorkRequest request = (LabWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
//        request.setStatus("Treatment Done");
//        request.setTreatment(false);
//        
//        populateTable();

// TODO add your handling code here:
    }//GEN-LAST:event_doctorBtnActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        doctorBtn.setVisible(false);
        assignJButton.setEnabled(true);
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton doctorBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
