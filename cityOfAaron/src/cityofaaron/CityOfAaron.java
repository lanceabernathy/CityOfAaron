/*
 * The main() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team members: Lance Abernathy, Brian Kenoyer, Andrew Petersen
 */
package cityofaaron;

import Model.Location;
import Model.Player;
import Model.TeamMember;
import Model.ListItem;
import Model.CropData;
import Model.Game;
import view.*;


public class CityOfAaron {
    
    // variable for keeping a reference to the Game object
     private static Game theGame = null;
     
     public static Game getTheGame() {
         return CityOfAaron.theGame;
     }  
     
     public static Game setTheGame() {
         return CityOfAaron.theGame;
     }
          
    // main function - entry point for the program
    // runs the main menu
   
        public static void main(String[] args) 
    {
        
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenuView();
        
        Player player = new Player();
        
        
        player.setName("Fred Flintstone");
        
                 
        String playername = player.getName();
        
        System.out.println("Name = " + playername);
        
        String member1name = TeamMember.Lance.getName();
        String member1title = TeamMember.Lance.getTitle();
        String member2name = TeamMember.Brian.getName();
        String member2title = TeamMember.Brian.getTitle();
        String member3name = TeamMember.Andrew.getName();
        String member3title = TeamMember.Andrew.getTitle();
        

        System.out.println(member1name + ", " + member1title);
        System.out.println(member2name + ", " + member2title);
        System.out.println(member3name + ", " + member3title);
     
        
        //Instance and test for Location
        Location currentLocation = new Location();
        Location currentSymbol = new Location();
        
        currentLocation.setDescription("Home");
        currentSymbol.setSymbol("@");
        
        String playerlocation = currentLocation.getDescription();
        String playerSymbol = currentSymbol.getSymbol();
        
        System.out.println("Player is at " + playerlocation);
        System.out.println("Player's Symbol is  " + playerSymbol);
              
       
        

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
