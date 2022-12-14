
package HMS.Role;

import HMS.NetworkDirectory;
import HMS.Enterprise.Enterprise;
import HMS.FoodClothing.ClothInventory;
import HMS.FoodClothing.FoodInventory;
import HMS.Homeless.HomelessDirectory;
import HMS.Organization.Organization;
import HMS.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author mahes
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Police("Police"),
        NGOSupervisor("NGO Supervisor"),
        Doctor("Doctor"),
        Lab("Lab"),
        Billing("Billing"),
        Food("Food"),
        Clothing("Clothing"),
        Self("Self");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            NetworkDirectory business,
            HomelessDirectory homelessdirectory,
            FoodInventory foodinventory,
            ClothInventory clothinventory,
    String username);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}