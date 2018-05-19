/*
 * The main() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team members: Lance Abernathy, Brian Kenoyer, Andrew Petersen
 */
package cityofaaron;

import Model.Player;
import Model.TeamMember;
import Model.ListItem;
import Model.CropData;

/**
 *
 * @author Lance
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player = new Player();
        
        player.setName("Fred Flintstone");
        
        String playername = player.getName();
        
        System.out.println("Name = " + playername);
        
        TeamMember.Lance.getName();
        TeamMember.Lance.getTitle();
        TeamMember.Brian.getName();
        TeamMember.Brian.getTitle();
        TeamMember.Andrew.getName();
        TeamMember.Andrew.getTitle();
        
     // instance and test for ListItem
        ListItem listItemName = new ListItem();
        ListItem listItemTitle = new ListItem();
        listItemName.setName("shovel");
        String itemName = listItemName.getName();
        listItemTitle.setTitle("tool");
        String itemTitle = listItemTitle.getTitle();

        System.out.println("ListItem class has a " + itemTitle + " that is a " + itemName);

     // instance and test for CropData
        CropData dataAcresOwned = new CropData();
        dataAcresOwned.setAcresOwned(20);
        int acresOwned = dataAcresOwned.getAcresOwned();

        System.out.println("CropData class says you now own " + acresOwned + " acres.");
           
        
    }
    
}
