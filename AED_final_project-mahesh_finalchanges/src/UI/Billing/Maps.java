/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Billing;


import HMS.Enterprise.Enterprise;
import HMS.Homeless.Homeless;
import HMS.Homeless.HomelessDirectory;
import HMS.Homeless.Shelter;
import HMS.Homeless.ShelterDirectory;
import HMS.LocationService.IEventWaypoint;
import HMS.LocationService.WaypointRender;
import HMS.LocationService.WaypointService;
import HMS.Network.Network;
import HMS.NetworkDirectory;
import HMS.Organization.BillingOrganization;
import HMS.Organization.Organization;
import HMS.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.VirtualEarthTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.WaypointPainter;
/**
 *
 * @author mahes
 */
public class Maps extends javax.swing.JPanel {

    /**
     * Creates new form Maps
     */
    
    private final Set<WaypointService> waypoints = new HashSet<>();
    private HMS.LocationService.IEventWaypoint event;
    private int x;
    private int y;
    Organization organization;
    private JPanel userProcessContainer;
    private BillingOrganization billingOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private HomelessDirectory homelessDirectory;
    private Homeless homeless;
    private NetworkDirectory business;
    private Network network;
     private ShelterDirectory shelterDirectory;
    private Shelter shelter;
    
    public Maps(JPanel userProcessContainer,UserAccount account, Organization organization, Enterprise enterprise, NetworkDirectory business, String location ) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount = account;
        this.billingOrganization = (BillingOrganization)organization;
        this.enterprise = enterprise;
        this.business = business;
        this.homelessDirectory = new HomelessDirectory();
         this.shelterDirectory = new ShelterDirectory();
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXMapViewer = new org.jxmapviewer.JXMapViewer();
        comboMapType = new javax.swing.JComboBox<>();
        cmdAdd = new javax.swing.JButton();
        cmdClear = new javax.swing.JButton();

        jXMapViewer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXMapViewerMouseClicked(evt);
            }
        });

        comboMapType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Open Stree", "Virtual Earth", "Hybrid", "Satellite" }));
        comboMapType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMapTypeActionPerformed(evt);
            }
        });

        cmdAdd.setText("View Locations");
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        cmdClear.setText("Clear");
        cmdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXMapViewerLayout = new javax.swing.GroupLayout(jXMapViewer);
        jXMapViewer.setLayout(jXMapViewerLayout);
        jXMapViewerLayout.setHorizontalGroup(
            jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXMapViewerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdClear, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboMapType, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jXMapViewerLayout.setVerticalGroup(
            jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXMapViewerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMapType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdAdd)
                    .addComponent(cmdClear))
                .addContainerGap(259, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXMapViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXMapViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void init() {
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer.setTileFactory(tileFactory);
        GeoPosition geo = new GeoPosition(42.361145, -71.057083);
        jXMapViewer.setAddressLocation(geo);
        jXMapViewer.setZoom(12);

        //  Create event mouse move
        MouseInputListener mm = new PanMouseInputListener(jXMapViewer);
        jXMapViewer.addMouseListener(mm);
        jXMapViewer.addMouseMotionListener(mm);
        jXMapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(jXMapViewer));
        event = getEvent();
    }
      
        private void addWaypoint(WaypointService waypoint) {
        for (WaypointService d : waypoints) {
            jXMapViewer.remove(d.getButton());
        }
        waypoints.add(waypoint);
        initWaypoint();
    }

    private void initWaypoint() {
        WaypointPainter<WaypointService> wp = new WaypointRender();
        wp.setWaypoints(waypoints);
        jXMapViewer.setOverlayPainter(wp);
        for (WaypointService d : waypoints) {
            jXMapViewer.add(d.getButton());
        }
    }

    private void clearWaypoint() {
        for (WaypointService d : waypoints) {
            jXMapViewer.remove(d.getButton());
        }
        waypoints.clear();
        initWaypoint();
    }
    
     private IEventWaypoint getEvent() {
        return new IEventWaypoint() {
            @Override
            public void selected(WaypointService waypoint) {
                
                JOptionPane.showMessageDialog(Maps.this, waypoint.getName());
                String s= waypoint.getName();
       
            BillingWorkAreaJPanel billing = new BillingWorkAreaJPanel( userProcessContainer, userAccount, organization, enterprise,business, s);
             //reg.loc.setText(s);
           userProcessContainer.add("BillingWorkAreaJPanel", billing);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
       
             
            }
        };
    }
    private void comboMapTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMapTypeActionPerformed
        TileFactoryInfo info;
        int index = comboMapType.getSelectedIndex();
        if (index == 0) {
            info = new OSMTileFactoryInfo();
        } else if (index == 1) {
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.MAP);
        } else if (index == 2) {
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.HYBRID);
        } else {
            info = new VirtualEarthTileFactoryInfo(VirtualEarthTileFactoryInfo.SATELLITE);
        }
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer.setTileFactory(tileFactory);
    }//GEN-LAST:event_comboMapTypeActionPerformed

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed

        addWaypoint(new WaypointService("Quincy", event, new GeoPosition(42.25288, -71.00227)));
        addWaypoint(new WaypointService("Boylston Street", event, new GeoPosition(42.343291, -71.102617)));
        addWaypoint(new WaypointService("Waltham", event, new GeoPosition(42.3750, -71.2343)));
        addWaypoint(new WaypointService("Saugus", event, new GeoPosition(42.4648,  -71.0101)));
        addWaypoint(new WaypointService("Brookline", event, new GeoPosition(42.332218,  -71.121483)));
        addWaypoint(new WaypointService("Fenway", event, new GeoPosition(42.346268,  -71.095764)));
        addWaypoint(new WaypointService("Park Drive", event, new GeoPosition(42.344498,  -71.102902)));
        addWaypoint(new WaypointService("High Street", event, new GeoPosition(42.35532,  -71.053262)));

        // addWaypoint(new WaypointService("Test 002", event, new GeoPosition(this.x, this.y)));
    }//GEN-LAST:event_cmdAddActionPerformed

    private void cmdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearActionPerformed
        clearWaypoint();
    }//GEN-LAST:event_cmdClearActionPerformed

    private void jXMapViewerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXMapViewerMouseClicked
        // TODO add your handling code here:
        this.x=evt.getX();
        this.y=evt.getY();
        System.out.println(this.x+","+this.y);
    }//GEN-LAST:event_jXMapViewerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdClear;
    private javax.swing.JComboBox<String> comboMapType;
    private org.jxmapviewer.JXMapViewer jXMapViewer;
    // End of variables declaration//GEN-END:variables
}