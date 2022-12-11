
package UI.NGOSupervisorRole;

import HMS.NetworkDirectory;
import HMS.Enterprise.Enterprise;
import HMS.Network.Network;
import HMS.Organization.NGOOrganization;
import HMS.Organization.Organization;
import HMS.UserAccount.UserAccount;
import HMS.WorkQueue.DoctorWorkRequest;
import HMS.WorkQueue.NGOWorkRequest;
import HMS.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author mahes
 */
public class NGOSupervisorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private NetworkDirectory business;
    private UserAccount userAccount;
    private NGOOrganization ngoOrganization;
    private Enterprise enterprise;
    private Network network;
    private NGOWorkRequest request;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public NGOSupervisorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization ngoOrganization, NetworkDirectory business, Enterprise enterprise) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.ngoOrganization = (NGOOrganization)ngoOrganization;
        this.enterprise = enterprise;
        
        populateTable();
        hiddenitems();
        processJButton.setVisible(false);
        provideClothing.setToolTipText("Check if a person needs clothing, if yes ,then provide clothing");
     
    }
    
    
    
    private void hiddenitems()
    {
           provideClothing.setVisible(false);
        provideFood.setVisible(false);
        daysTxt.setVisible(false);
        jLabel1.setVisible(false);
         daysTxt1.setVisible(false);
        jLabel3.setVisible(false);
        breakfastChk.setVisible(false);
        lunchChk.setVisible(false);
        snacksChk.setVisible(false);
        dinnerChk.setVisible(false);
        saveBtn.setVisible(false);
        saveBtn1.setVisible(false);  
        costTxt.setVisible(false);
        jLabel2.setVisible(false);
         costTxt1.setVisible(false);
        jLabel4.setVisible(false);
        calculateCostBtn.setVisible(false);
         calculateCostBtn1.setVisible(false);
        costTxt.setEditable(false);
        costTxt.setEnabled(false);
        costTxt1.setEditable(false);
        costTxt1.setEnabled(false);
        jacketChk.setVisible(false);
        topWearChk.setVisible(false);
        bottomWearChk.setVisible(false);
        thermalChk.setVisible(false);
        
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : ngoOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[11];
           row[0] = request;
            row[1] = request.getMessage();

            row[2] = request.getName1();
            row[3] = request.getLocation();
            row[4] = request.getCloth();
            row[5] = request.getTreatment();
            row[6] = request.getFood();
            row[7] = request.getCriminal();
            row[8] = request.getSender()== null ? null : request.getSender().getEmployee().getName();
            row[9] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[10] = request.getStatus();
            
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
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        provideFood = new javax.swing.JButton();
        provideClothing = new javax.swing.JButton();
        daysTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        breakfastChk = new javax.swing.JCheckBox();
        lunchChk = new javax.swing.JCheckBox();
        snacksChk = new javax.swing.JCheckBox();
        dinnerChk = new javax.swing.JCheckBox();
        saveBtn = new javax.swing.JButton();
        costTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        calculateCostBtn = new javax.swing.JButton();
        jacketChk = new javax.swing.JCheckBox();
        topWearChk = new javax.swing.JCheckBox();
        bottomWearChk = new javax.swing.JCheckBox();
        thermalChk = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        daysTxt1 = new javax.swing.JTextField();
        saveBtn1 = new javax.swing.JButton();
        costTxt1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        calculateCostBtn1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Message", "Name", "Location", "Clothing?", "Treatment?", "Food?", "Criminal?", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workRequestJTableMouseClicked(evt);
            }
        });
        workRequestJTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                workRequestJTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(5).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(6).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(7).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(8).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(9).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(10).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 1510, 150));

        assignJButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 180, -1));

        processJButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        processJButton.setText("Process");
        processJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 840, 160, -1));

        refreshJButton.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 110, -1));

        provideFood.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        provideFood.setText("Provide Food");
        provideFood.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        provideFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provideFoodActionPerformed(evt);
            }
        });
        add(provideFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        provideClothing.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        provideClothing.setText("Provide Clothing");
        provideClothing.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        provideClothing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provideClothingActionPerformed(evt);
            }
        });
        add(provideClothing, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 430, 210, -1));

        daysTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(daysTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 120, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Number Of Days");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, -1, -1));

        breakfastChk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        breakfastChk.setText("Breakfast");
        add(breakfastChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, -1, -1));

        lunchChk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lunchChk.setText("Lunch");
        add(lunchChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, -1, -1));

        snacksChk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        snacksChk.setText("Snacks");
        add(snacksChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, -1, -1));

        dinnerChk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dinnerChk.setText("Dinner");
        add(dinnerChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 680, -1, -1));

        saveBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 740, -1, -1));

        costTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(costTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 90, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Cost");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, -1, -1));

        calculateCostBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        calculateCostBtn.setText("Calculate Cost");
        calculateCostBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        calculateCostBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateCostBtnActionPerformed(evt);
            }
        });
        add(calculateCostBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 650, 190, 30));

        jacketChk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jacketChk.setText("Jacket");
        add(jacketChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 550, -1, -1));

        topWearChk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        topWearChk.setText("Top Wear");
        add(topWearChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, -1, -1));

        bottomWearChk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bottomWearChk.setText("Bottom Wear");
        add(bottomWearChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 650, -1, -1));

        thermalChk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        thermalChk.setText("Thermals");
        add(thermalChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 700, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Number Of Days");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 490, -1, -1));

        daysTxt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(daysTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 490, 130, -1));

        saveBtn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saveBtn1.setText("Save");
        saveBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        saveBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtn1ActionPerformed(evt);
            }
        });
        add(saveBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 740, -1, -1));

        costTxt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(costTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 610, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Cost");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 610, -1, -1));

        calculateCostBtn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        calculateCostBtn1.setText("Calculate Cost");
        calculateCostBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        calculateCostBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateCostBtn1ActionPerformed(evt);
            }
        });
        add(calculateCostBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 660, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("NGO Work Area");
        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1750, 70));

        jLabel5.setText("jLabel5");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1750, 830));
    }// </editor-fold>//GEN-END:initComponents
int i =0;
    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
              
        if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, "Please Select a Row First");
            return;
        }
        
        else{
          
        
        NGOWorkRequest request = (NGOWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Received By NGO");
        populateTable();
        provideClothing.setVisible(true);
        provideFood.setVisible(true);
        if(workRequestJTable.getValueAt(selectedRow,4).equals(true))
            provideClothing.setEnabled(true);
        else
             provideClothing.setEnabled(false);
        
         if(workRequestJTable.getValueAt(selectedRow,6).equals(true))
            provideFood.setEnabled(true);
        else
             provideFood.setEnabled(false);
            
         
          processJButton.setVisible(true);
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

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
       
        
        
        
        int selectedRow = workRequestJTable.getSelectedRow();
        
        
        if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, "Please Select a Row First");
            return;
           
        }
        
        if (i!=selectedRow){
             JOptionPane.showMessageDialog(null, "Please Select the Same Row");
            return;
           
        }
        
        
        NGOWorkRequest request = (NGOWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Sent to Next Panel");
        request.setFood(false);
        request.setCloth(false);
         if(workRequestJTable.getValueAt(selectedRow,4).equals(true))
        request.setClothCost(costTxt1.getText());
         else
             request.setClothCost("0");
         if(workRequestJTable.getValueAt(selectedRow,6).equals(true))
        request.setFoodCost(costTxt.getText());
         else
              request.setFoodCost("0");
        
        
       
        
       // request.setId(TOOL_TIP_TEXT_KEY);
        
        
//        WorkRequest request1 = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 3);
//        request1.setCloth(false);
//        
        ProcessNGORequestJPanel processWorkRequestJPanel = new ProcessNGORequestJPanel(userProcessContainer, request, enterprise, userAccount, network, business);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        
       
        hiddenitems();
        processJButton.setVisible(false);
     assignJButton.setEnabled(true);
    }//GEN-LAST:event_refreshJButtonActionPerformed

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

    private void provideFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provideFoodActionPerformed




 int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
         if (i!=selectedRow){
             JOptionPane.showMessageDialog(null, "Please Select the Same Row");
            return;
           
        }

        daysTxt.setVisible(true);
        jLabel1.setVisible(true);
        breakfastChk.setVisible(true);
        lunchChk.setVisible(true);
        snacksChk.setVisible(true);
        dinnerChk.setVisible(true);
        saveBtn.setVisible(true);   
         costTxt.setVisible(true);
        jLabel2.setVisible(true);
        calculateCostBtn.setVisible(true);
        
        jacketChk.setVisible(false);
        bottomWearChk.setVisible(false);
        topWearChk.setVisible(false);
        thermalChk.setVisible(false);
        
        
        daysTxt1.setVisible(false);
        jLabel3.setVisible(false);
        saveBtn1.setVisible(false);   
        costTxt1.setVisible(false);
        jLabel4.setVisible(false);
        calculateCostBtn1.setVisible(false);
        
// TODO add your handling code here:
    }//GEN-LAST:event_provideFoodActionPerformed

    private void calculateCostBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateCostBtnActionPerformed

        
        int count=0 ;
       
       
       int total=0;
       
       if(daysTxt.getText() == null || daysTxt.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Enter Number of Days");
       }
       
       else{
           int days = Integer.parseInt(daysTxt.getText());
       if(breakfastChk.isSelected())
       {
           count = count+1;
       }
        if(lunchChk.isSelected())
       {
           count = count+1;
       }
         if(snacksChk.isSelected())
       {
           count = count+1;
       }
          if(dinnerChk.isSelected())
       {
           count = count+1;
       }
        total = count * days * 10;
        costTxt.setText(String.valueOf(total));
         JOptionPane.showMessageDialog(null, "Food Cost Calculated Successfully");
        
       }
       
      
          
          
       // TODO add your handling code here:
    }//GEN-LAST:event_calculateCostBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed



        if(costTxt.getText() == null || costTxt.getText().equals("")){
           JOptionPane.showMessageDialog(null, "First Calculate the Cost of Food");
           return;
       }
       
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        NGOWorkRequest request = (NGOWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        
        if(breakfastChk.isSelected())
        request.setBreakfast("Provided");
         if(lunchChk.isSelected())
        request.setLunch("Provided");
          if(snacksChk.isSelected())
        request.setSnacks("Provided");
           if(dinnerChk.isSelected())
        request.setDinner("Provided");
           
           request.setFoodCost(costTxt.getText());
           
           
           JOptionPane.showMessageDialog(null, "Food Cost Saved Successfully");
           


// TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed

    private void provideClothingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provideClothingActionPerformed
         
        
        
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
         if (i!=selectedRow){
             JOptionPane.showMessageDialog(null, "Please Select the Same Row");
            return;
           
        }
        
        daysTxt1.setVisible(true);
        jLabel3.setVisible(true);
        
        saveBtn1.setVisible(true);   
         costTxt1.setVisible(true);
        jLabel4.setVisible(true);
        calculateCostBtn1.setVisible(true);
        
        jacketChk.setVisible(true);
        bottomWearChk.setVisible(true);
        topWearChk.setVisible(true);
        thermalChk.setVisible(true);
        
        breakfastChk.setVisible(false);
        lunchChk.setVisible(false);
        snacksChk.setVisible(false);
        dinnerChk.setVisible(false);
        
        
        daysTxt.setVisible(false);
        jLabel1.setVisible(false);
        saveBtn.setVisible(false);   
        costTxt.setVisible(false);
        jLabel2.setVisible(false);
        calculateCostBtn.setVisible(false);
        
 // TODO add your handling code here:
    }//GEN-LAST:event_provideClothingActionPerformed

    private void saveBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtn1ActionPerformed
 
        if(costTxt1.getText() == null || costTxt1.getText().equals("")){
           JOptionPane.showMessageDialog(null, "First Calculate the Cost of Cloth");
           return;
       }
         int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        NGOWorkRequest request = (NGOWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        
        
        if(jacketChk.isSelected())
        request.setJacket("Provided");
         if(bottomWearChk.isSelected())
        request.setBottomWear("Provided");
          if(topWearChk.isSelected())
        request.setTopWear("Provided");
           if(thermalChk.isSelected())
        request.setThermal("Provided");       
           
        request.setClothCost(costTxt.getText());
        
        JOptionPane.showMessageDialog(null, "Cloth Cost Saved Successfully");

// TODO add your handling code here:
    }//GEN-LAST:event_saveBtn1ActionPerformed

    private void calculateCostBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateCostBtn1ActionPerformed
  int count1=0 ;
      
       int total1=0;
       
        if(daysTxt1.getText() == null || daysTxt1.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Enter Number of Days");
       }
        else
        {
            
             int days1 = Integer.parseInt(daysTxt1.getText());
       if(jacketChk.isSelected())
       {
           count1 = count1+1;
       }
        if(bottomWearChk.isSelected())
       {
           count1 = count1+1;
       }
         if(topWearChk.isSelected())
       {
           count1 = count1+1;
       }
          if(thermalChk.isSelected())
       {
           count1 = count1+1;
       }
        total1 = count1 * days1 * 10;
        
        costTxt1.setText(String.valueOf(total1));
        
         JOptionPane.showMessageDialog(null, "Cloth Cost Calculated Successfully");
          
       }
      
// TODO add your handling code here:
    }//GEN-LAST:event_calculateCostBtn1ActionPerformed

    private void workRequestJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workRequestJTableMouseClicked
//            int i = workRequestJTable.getSelectedRow();
//        //TableModel model = workRequestJTable.getModel(); 
//        txtCurrentLocation.setText(workRequestJTable.getValueAt(i,3).toString());
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_workRequestJTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JCheckBox bottomWearChk;
    private javax.swing.JCheckBox breakfastChk;
    private javax.swing.JButton calculateCostBtn;
    private javax.swing.JButton calculateCostBtn1;
    private javax.swing.JTextField costTxt;
    private javax.swing.JTextField costTxt1;
    private javax.swing.JTextField daysTxt;
    private javax.swing.JTextField daysTxt1;
    private javax.swing.JCheckBox dinnerChk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jacketChk;
    private javax.swing.JCheckBox lunchChk;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton provideClothing;
    private javax.swing.JButton provideFood;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton saveBtn1;
    private javax.swing.JCheckBox snacksChk;
    private javax.swing.JCheckBox thermalChk;
    private javax.swing.JCheckBox topWearChk;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
