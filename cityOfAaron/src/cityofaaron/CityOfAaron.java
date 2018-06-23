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
import Control.CropControl;
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
    // runs the main menu1
   
        public static void main(String[] args) 
    {
        
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();
                
        
        Player player = new Player();
        
        
        player.setName("Fred Flintstone");
        
                 
        String playername = player.getName();
        
        System.out.println("Name = " + playername);
        
        String member1name = TeamMember.Lance.getName();
        String member1title = TeamMember.Lance.getTitle();
        String member2name = TeamMember.Andrew.getName();
        String member2title = TeamMember.Andrew.getTitle();
        

        System.out.println(member1name + ", " + member1title);
        System.out.println(member2name + ", " + member2title);
            
        
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
        
         // @test sellLand
        System.out.println("\n");
        System.out.println("sellLand");
        CropData theSellCrops = new CropData();
        theSellCrops.setWheatInStore(1000);
        theSellCrops.setAcresOwned(2800);
        int toSell = 10;
        int price = 15;
        int sellExpResult = 2790;
        int sellResult = CropControl.sellLand(price, toSell, theSellCrops);
        System.out.println("Expected: " + sellExpResult + "\ncalculated: " + sellResult);
        
    // @test buyLand
        System.out.println("\n");
        System.out.println("buyLand");
        CropData theBuyCrops = new CropData();
        theBuyCrops.setAcresOwned(20);
        theBuyCrops.setWheatInStore(1000);
        theBuyCrops.setPopulation(100);
        int buyPrice = 10;
        int toBuy = 15;
        int expBuyResult = 35;
        int buyResult = CropControl.buyLand(buyPrice, toBuy, theBuyCrops);  
        System.out.println("Expected: " + expBuyResult + "\nActual: " + buyResult);

    // @test feedPeople
        System.out.println("\n");
        System.out.println("feedPeople");
        CropData theFeedCrops = new CropData();
        theFeedCrops.setWheatInStore(1000);
        int bushels = 100;
        int expFeedResult = 10;
        int feedResult = CropControl.feedPeople(bushels, theFeedCrops);   
        System.out.println("Expected: " + expFeedResult + "\nActual: " + feedResult);

    // @test plantCrops
        System.out.println("\n");
        System.out.println("plantCrops");
        CropData thePlantCrops = new CropData();
        theFeedCrops.setWheatInStore(1000);
        int acres = 100;
        int land = 300;
        int expPlantResult = 100;
        int plantResult = CropControl.plantCrops(acres, land, theFeedCrops); 
        System.out.println("Expected: " + expPlantResult + "\nActual: " + plantResult);

        
    }
    
}
