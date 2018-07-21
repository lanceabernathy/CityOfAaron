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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import static java.lang.System.out;
import java.util.Scanner;

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
        CityOfAaron.setTheGame(theGame);
        
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
            
            theCrops.setYear(1);
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
    
        public static void displayBeginningCropReport() {

            CropData theCrops = theGame.getCropData();

            System.out.println("\nGame Report: \n The year number: " + theCrops.getYear() +
                    "\n How many people starved: " + theCrops.getNumStarved() + 
                    "\n How many people came to the city: " + theCrops.getNewPeople() + 
                    "\n The current population: " + theCrops.getPopulation() + 
                    "\n The number of acres of crop land owned by the city: " + theCrops.getAcresOwned() +
                    "\n The number of bushels per acre in this years harvest: " + theCrops.getCropYield() + 
                    "\n The total number of bushels of wheat harvested: " + theCrops.getHarvest() +
                    "\n The number of bushels paid in tithes and offerings: " + theCrops.getOfferingBushels() +
                    "\n The number of bushels of wheat eaten by rats: " + theCrops.getEatenByRats() +
                    "\n The number of bushels of wheat in store: " + theCrops.getWheatInStore());
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
        public static void createProvisionsList()
        {
            ArrayList<ListItem> provisions = new ArrayList<>();
            provisions.add(new ListItem("Meat", 6));
            provisions.add(new ListItem("Sugar", 13));
            provisions.add(new ListItem("Beans", 21));
            provisions.add(new ListItem("Corn", 19));
            
            // Save the tools in the game
            theGame.setProvisions(provisions);
            System.out.println("provisions list set");
        }
        
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
            
  
                       
            // set this location object in each cell of the array in column 4
            for(int i = 0; i < MAX_ROW; i++)
            {
                // create a new Location object
            Location loc = new Location();
            
            // use setters in the Location class to set the description and symbol
            loc.setDescription(river);
            loc.setSymbol("~~~");
                theMap.setLocation(i, 4, loc);
            }
            
            // create a string that will go in the Location objects
            // that contain the desert
            String desert =  "You have entered the Great Desert. The desert marks\n" +
                             "the western boarder of our land. There is nothing but\n " +
                             "sand as far as the eye can see. No one that has.\n" +
                             "gone into the desert has ever returned.\n";
            
           
            
            // set this location object in each cell of the array in column 4
            for(int i = 0; i < MAX_ROW; i++)
            {
                 // create a new Location object
           Location loc = new Location();
            
            // use setters in the Location class to set the description and symbol
            loc.setDescription(desert);
            loc.setSymbol("---");
                theMap.setLocation(i, 0, loc);
            }
            
            // create a string that will go in the Location objects
            // that contain the Lamanite Border
            String border =  "You have arrived at the Norther border of our land.\n" +
                             "To the north lie the lands of the Lamanites,\n " +
                             "Only death awaits you there.\n";
            
            
            // set this location object in each cell of the array in column 4
            for(int i = 1; i < MAX_COL -1; i++)
            {
                // create a new Location object
            Location loc = new Location();
            
            // use setters in the Location class to set the description and symbol
            loc.setDescription(border);
            loc.setSymbol("xxx");
            
                theMap.setLocation(0, i, loc);
            }
            
                        // create a string that will go in the Location objects
            // that contain the Lamanite Border
            String wilderness =  "You have arrived at the Southern border of our land.\n" +
                                 "To the south lie the wilderness, it is populated\n " +
                                 "wild animals and dangerous beast. Do not enter. \n";
            
           
            
            // set this location object in each cell of the array in column 4
            for(int i = 1; i < MAX_COL -1; i++)
            {
                 // create a new Location object
            Location loc = new Location();
            
            // use setters in the Location class to set the description and symbol
            loc.setDescription(wilderness);
            loc.setSymbol("^^^");
                theMap.setLocation(4, i, loc);
            }
            
            // define the string for a farm land location
            String farmland = "You are on the fertile banks of the River.\n" +
            "In the spring, this low farmland floods and is covered with rich\n" +
            "new soil. Wheat is planted as far as you can see. \n";
            
            
            
            for(int i = 1; i < MAX_ROW -1; i++)
            {
                // set the farmland locations with a hint
             Location loc = new Location();
            loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
            loc.setSymbol("!!!");
                theMap.setLocation(i, 3, loc);
            }
            
            // define the string for the rulers court location
            String Court = "This is the Ruler's Court. A great building that serves\n" +
            "as your residience and office to oversee and manage the affairs of the\n" +
            "land. Take care of the people and they will take care of you.\n";
            
            // set a court location with a hint
            Location loc = new Location();
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
                    

            Map theMap = theGame.getTheMap();
            //System.out.println(locations[2][1]);
                for (int i = 0; i < MAX_ROW; i++) 
                {
                    for(int j = 0; j < MAX_COL; j++){
                        System.out.print(theMap.getLocation(i, j). getSymbol() + " ");
                    }
                    System.out.print(" \n");
                }
            }
        
        public void displayAnimals() {
            
        System.out.println("List of Animals: ");
        ArrayList<ListItem> animals = theGame.getAnimals();
        animals.forEach((item) -> {
            System.out.println(item.getName()+ " " + item.getNumber());
        });
         
        }
        
        // This is the function that actually writes the report to the file.
        public void printAnimalReport()
        {        
        // Receive a string of the file name, passed into the printing routine.
            System.out.println("Enter a filename to save the list.");
            Scanner keyboard = new Scanner(System.in);
            String fileLocation = keyboard.next();
        // declare a reference to a PrintWriterobject
        try (PrintWriter out = new PrintWriter(fileLocation))
        {
        // create the PrintWriterobject
        // get a reference to the ArrayListyou want to output
            ArrayList<ListItem> animals = theGame.getAnimals();
        
        // output a heading for the report
            out.println("\n\n      Animal Report              ");
            out.printf("%n%-20s%10s", "Description", "Quantity");
            out.printf("%n%-20s%10s", "-----------", "--------");
        
                // use a for loop to get the data from the ArrayList
                animals.forEach((item) -> {
                    out.printf("%n%-20s%7d", item.getName(), item.getNumber());
                });
                
        // and output it
        
            System.out.println("The file was sucessfully saved.");
            
            out.flush();
        }
        catch(Exception e)
        {
        // output error message
            System.out.println("Error saving animals to file!");
            System.out.println("I/O Error:" + e.getMessage());
        }
        finally
        {
        // if(output != null) close the file
           if (out != null) {
                out.close();
            }
        }
        }
        
        public void displayTools() {
            
        System.out.println("List of Tools: ");
               ArrayList<ListItem> tools = theGame.getTools();
               tools.forEach((item) -> {
                   System.out.println(item.getName()+ " " + item.getNumber());
        });
         
        }
        
          public void printToolsReport() {
        // Receive a string of the file name, passed into the printing routine.
            System.out.println("Enter a filename to save the list.");
            Scanner keyboard = new Scanner(System.in);
            String fileLocation = keyboard.next();
        // declare a reference to a PrintWriterobject
        try (PrintWriter out = new PrintWriter(fileLocation))
        {
        // create the PrintWriterobject
        // get a reference to the ArrayListyou want to output
            ArrayList<ListItem> tools = theGame.getTools();
        
        // output a heading for the report
            out.println("\n\n      Tools Report              ");
            out.printf("%n%-20s%10s", "Description", "Quantity");
            out.printf("%n%-20s%10s", "-----------", "--------");
        
                // use a for loop to get the data from the ArrayList
                tools.forEach((item) -> {
                    out.printf("%n%-20s%7d", item.getName(), item.getNumber());
                });
                
        // and output it
        
            System.out.println("The file was sucessfully saved.");
            
            out.flush();
        }
        catch(Exception e)
        {
        // output error message
            System.out.println("Error saving tools to file!");
            System.out.println("I/O Error:" + e.getMessage());
        }
        finally
        {
        // if(output != null) close the file
           if (out != null) {
                out.close();
            }
        }
    }

        
        
        /**
         * SavedGame method
         * Purpose: save a game to disk
         * @param filePath 
         * Returns: none
         * Side Effect: the game reference in the driver is updated
         */
        public static void saveGame(String filePath) 
        {
            Game Game = CityOfAaron.getTheGame();
            try(FileOutputStream fips = new FileOutputStream(filePath))
            {
                Game = GameControl.theGame;
                ObjectOutputStream output = new ObjectOutputStream(fips);
                output.writeObject(Game);
               
            }
            catch(Exception e)
            {
                System.out.println("There was an error saving the game file\n");
            }
        }
        
        /**
         * getSavedGame method
         * Purpose: load a saved game from disk
         * @param filePath 
         * Returns: none
         * Side Effect: the game reference in the driver is updated
         */
        public static void getSavedGame(String filePath) 
        {
            theGame = null;
            
            try(FileInputStream fips = new FileInputStream(filePath))
            {
                ObjectInputStream input = new ObjectInputStream(fips);
                theGame=(Game) input.readObject();
                CityOfAaron.setTheGame(theGame);
            }
            catch(Exception e)
            {
                System.out.println("There was an error reading the saved game file\n");
            }
        }

  
    
    public void displayProvisions() {
            
        System.out.println("List of Provisions: ");
               ArrayList<ListItem> provisions = theGame.getProvisions();
               provisions.forEach((item) -> {
                   System.out.println(item.getName()+ " " + item.getNumber());
        });
         
        }
    
    public void printProvisionsReport() {
        // Receive a string of the file name, passed into the printing routine.
            System.out.println("Enter a filename to save the list.");
            Scanner keyboard = new Scanner(System.in);
            String fileLocation = keyboard.next();
        // declare a reference to a PrintWriterobject
        try (PrintWriter out = new PrintWriter(fileLocation))
        {
        // create the PrintWriterobject
        // get a reference to the ArrayListyou want to output
            ArrayList<ListItem> provisions = theGame.getProvisions();
        
        // output a heading for the report
            out.println("\n\n      Provisions Report              ");
            out.printf("%n%-20s%10s", "Description", "Quantity");
            out.printf("%n%-20s%10s", "-----------", "--------");
        
                // use a for loop to get the data from the ArrayList
                provisions.forEach((item) -> {
                    out.printf("%n%-20s%7d", item.getName(), item.getNumber());
                });
                
        // and output it
        
            System.out.println("The file was sucessfully saved.");
            
            out.flush();
        }
        catch(Exception e)
        {
        // output error message
            System.out.println("Error saving animals to file!");
            System.out.println("I/O Error:" + e.getMessage());
        }
        finally
        {
        // if(output != null) close the file
           if (out != null) {
                out.close();
            }
        }
    }
    
    public void displaylocation()
    {
        System.out.println("Enter the coordinates of the location you want to move to");
        
            int x;
            int y;
        
            Map theMap = theGame.getTheMap();
   
            Scanner scan = new Scanner(System.in);
            while (true)
            {
            System.out.println("Enter the x-coordinate:");
            x = scan.nextInt();
            if ((x > MAX_ROW) || (x < 0))
                System.out.println("That area is not within your lands\n");
            else
                break;
            }
            
            while (true)
            {
            System.out.println("Enter the y-coordinate:");
            y = scan.nextInt();
            if ((y > MAX_COL) || (y < 0))
                System.out.println("That area is not within your lands\n");
            else
                break;
            }
            
            System.out.print(theMap.getLocation(x, y). getDescription());
            
    }        

 }
        
