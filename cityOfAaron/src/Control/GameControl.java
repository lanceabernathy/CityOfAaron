/*
 * The Map() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team members: Lance Abernathy, Andrew Petersen
 */
package Control;

import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import Model.*;
import java.io.Serializable;

public class GameControl implements Serializable
{
  
    // size of the Locations array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;
    
    // reference to a Game object
    private static Game theGame; //= CityOfAaron.getTheGame();
    //Map theMap = theGame.setMap();
    
    public static void createNewGame(String name)
    {
        // Created the game object. Save it in the main driver file
        theGame = new Game();
        CityOfAaron.setCurrentGame(theGame);
        
        // create the player object. Save it in the game object
        Player thePlayer = new Player();
        thePlayer.setName(name);
        theGame.setThePlayer(thePlayer);
        //System.out.print("Player set");
        

    }
        
        // create the CropData object
        // method prologue ….
    public static void createCropDataObject()
        {
            
            CropData theCrops = new CropData();
            
            theCrops.setYear(0);
            theCrops.setPopulation(100);
            theCrops.setNewPeople(5);
            theCrops.setCropYield(3);
            theCrops.setNumberWhoDied(0);
            theCrops.setOffering(10);
            theCrops.setWheatInStore(2700);
            theCrops.setAcresOwned(1000);
            theCrops.setAcresPlanted(1000);
            theCrops.setHarvest(3000);
            theCrops.setOfferingBushels(300);
            theCrops.setAcresPlanted(1000);
            
            // Save the cropData in the Game object
            theGame.setCropData(theCrops);
            System.out.println("Crop Data Set");
                        
        }
        // create the list of animals
        public static void createAnimalList()
        {
            ArrayList<ListItem> animals = new ArrayList<>();
            animals.add(new ListItem("cows", 12));
            animals.add(new ListItem("horses", 3));
            animals.add(new ListItem("pigs", 7));
            animals.add(new ListItem("goats", 4));
            
            // Save the animals in the game
            theGame.setAnimals(animals);
            System.out.println("Animal list set");
           // System.out.print(animals.get(0));
        }
    
        // create the list of tools
        public static void createToolList()
        {
            ArrayList<ListItem> tools = new ArrayList<>();
            tools.add(new ListItem("hammer", 5));
            tools.add(new ListItem("Shovel", 10));
            tools.add(new ListItem("scythe", 11));
            tools.add(new ListItem("plow", 2));
            
            // Save the tools in the game
            theGame.setTools(tools);
            System.out.println("Tool list set");
        }
        //create the list of provisions
        
        // create the Locations and the Map object
        /**
        * The createMap method
        * Purpose: creates the location objects and the map
        * Parameters: none
        * Returns: none
        */
        public static void createMap()
        {
            // create the Map object,
            // refer to the Map constructor
            //Map theMap = new Map(MAX_ROW, MAX_COL);
            Map theMap = new Map(MAX_ROW, MAX_COL);
            
            // create a string that will go in the Location objects
            // that contain the river
            String river =  "You are on the River. The river is the source\n" +
                            "of life for our city. The river marks the eastern\n " +
                            "boundary of the city - it is wilderness to the East.\n";
            
            // create a new Location object
            Location loc = new Location();
            
            // use setters in the Location class to set the description and symbol
            loc.setDescription(river);
            loc.setSymbol("~~~");
                       
            // set this location object in each cell of the array in column 4
            for(int i = 0; i < MAX_ROW; i++)
            {
                theMap.setLocation(i, 4, loc);
            }
            
            // create a string that will go in the Location objects
            // that contain the desert
            String desert =  "You have entered the Great Desert. The desert marks\n" +
                             "the western boarder of our land. There is nothing but\n " +
                             "sand as far as the eye can see. No one that has.\n" +
                             "gone into the desert has ever returned.\n";
            
            // create a new Location object
            loc = new Location();
            
            // use setters in the Location class to set the description and symbol
            loc.setDescription(desert);
            loc.setSymbol("---");
            
            // set this location object in each cell of the array in column 4
            for(int i = 0; i < MAX_ROW; i++)
            {
                theMap.setLocation(i, 0, loc);
            }
            
            // create a string that will go in the Location objects
            // that contain the Lamanite Border
            String border =  "You have arrived at the Norther border of our land.\n" +
                             "To the north lie the lands of the Lamanites,\n " +
                             "Only death awaits you there.\n";
            
            // create a new Location object
            loc = new Location();
            
            // use setters in the Location class to set the description and symbol
            loc.setDescription(border);
            loc.setSymbol("xxx");
            
            // set this location object in each cell of the array in column 4
            for(int i = 1; i < MAX_COL -1; i++)
            {
                theMap.setLocation(0, i, loc);
            }
            
                        // create a string that will go in the Location objects
            // that contain the Lamanite Border
            String wilderness =  "You have arrived at the Southern border of our land.\n" +
                                 "To the south lie the wilderness, it is populated\n " +
                                 "wild animals and dangerous beast. Do not enter. \n";
            
            // create a new Location object
            loc = new Location();
            
            // use setters in the Location class to set the description and symbol
            loc.setDescription(wilderness);
            loc.setSymbol("^^^");
            
            // set this location object in each cell of the array in column 4
            for(int i = 1; i < MAX_COL -1; i++)
            {
                theMap.setLocation(4, i, loc);
            }
            
            // define the string for a farm land location
            String farmland = "You are on the fertile banks of the River.\n" +
            "In the spring, this low farmland floods and is covered with rich\n" +
            "new soil. Wheat is planted as far as you can see. \n";
            
            // set the farmland locations with a hint
            loc = new Location();
            loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("!!!");
            
            for(int i = 1; i < MAX_ROW -1; i++)
            {
                theMap.setLocation(i, 3, loc);
            }
            
            // define the string for the rulers court location
            String Court = "This is the Ruler's Court. A great building that serves\n" +
            "as your residience and office to oversee and manage the affairs of the\n" +
            "land. Take care of the people and they will take care of you.\n";
            
            // set a court location with a hint
            loc = new Location();
            loc.setDescription(Court);
            loc.setSymbol("***");
            theMap.setLocation(1, 1, loc);
            
            // define the string for the Lords Temple location
            String Temple = "This is the Lord's Temple. The greates building in the\n" +
            "land. It was built to honor the Lord and to allow the people to gather\n" +
            "and worship.\n";
            
            // set a tomb location
            loc = new Location();
            loc.setDescription(Temple + "\nBe generous with your offerings and the Lord will bless you.");
            loc.setSymbol("@@@");
            theMap.setLocation(2, 1, loc);
            
            // define the string for the Tomb location
            String Tomb = "The is the Tomb for the honored dead. Those that have gone\n" +
            "before us and have completed there work in this life are laid to rest.\n";
            
            // set a tomb location
            loc = new Location();
            loc.setDescription(Tomb);
            loc.setSymbol("###");
            theMap.setLocation(3, 1, loc);
           
            // define the string for the village location
            String Village = "This is the Village. Where the people live their lives.\n" +
            "There are many houses here and a large marketplace.\n";
            
            // set the village location with a hint
            loc = new Location();
            loc.setDescription(Village + "\nA person can eat 20 bushels of grain a year.");
            loc.setSymbol("vvv");
            theMap.setLocation(1, 2, loc);
            
            // define the string for the granary location
            String Granary = "This is the Granary. Where all the wheat is gathered,\n" +
            " stored and turned into flour to feed the peop\n";
            
            // set the granary location
            loc = new Location();
            loc.setDescription(Granary);
            loc.setSymbol("...");
            theMap.setLocation(2, 2, loc);
            
            // define the string for the storehouse location
            String Storehouse = "This is the Storehouse. Where all tools and items,\n" +
            " are kept.\n";
            
            // set the Storehouse location
            loc = new Location();
            loc.setDescription(Storehouse);
            loc.setSymbol("...");
            theMap.setLocation(3, 2, loc);
            
            theGame.setTheMap(theMap);
            System.out.println("Map data set");
            /*Location[][] locations = theMap.getLocation();
            //System.out.println(locations[2][1]);
    
                for (int i = 0; i < locations.length; i++) 
                {
                    for (int j = 0; j < locations[i].length; j++) 
                    {
                        //System.out.println(locations[i][j]);
                        System.out.print(locations[i][j]);
                    }
                }
            */

        }
        
        public static void displayMap() {
                    
            //Game tg = CityOfAaron.getTheGame();
            Map theMap = theGame.getTheMap();
            //System.out.println(theGame.getPlayer());
            //CropData theCrops = theGame.getCropData();
            //System.out.println(theCrops.getAcresOwned());
            Location[][] locations = theMap.getLocation();
            //System.out.println(locations[2][1]);
    
                for (int i = 0; i < locations.length; i++) 
                {
                    for (int j = 0; j < locations[i].length; j++) 
                    {
                        System.out.println(locations[i][j]);
                    }
                }
            }
        
        public void displayAnimals() {
            
        System.out.println("List of Animals: ");
        ArrayList<ListItem> animals = theGame.getAnimals();
                for (ListItem item : animals)
                System.out.println(item.getName()+ " " + item.getNumber());
         
        }
        
        public void displayTools() {
            
        System.out.println("List of Tools: ");
               ArrayList<ListItem> tools = theGame.getTools();
                for (ListItem item : tools)
                System.out.println(item.getName()+ " " + item.getNumber());
         
        }
        

 }
        
