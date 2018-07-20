// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Abernathy, Petersen team
// Date last modified: June 2018
//-------------------------------------------------------------
package view;

import Control.GameControl;
import Model.*;
import cityofaaron.CityOfAaron;
import java.io.Serializable;
import java.util.Scanner;
//import gameproject.GameProject;

public class MainMenuView extends MenuView implements Serializable 
{   
    Scanner keyboard = new Scanner(System.in);
    private String theMenu;
    private int max;

    
    
    /**
    * The MainMenuView constructor
    * Purpose: Initialize the menu data
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public MainMenuView()
    {
        super("\n" +
            "**********************************\n" +
            "* CITY OF AARON: MAIN GAME MENU *\n" +
            "**********************************\n" +
            " 1 - Start new game\n" +
            " 2 - Get and start a saved game\n" +
            " 3 - Get help on playing the game\n" +
            " 4 - Save game\n" +
            " 5 - Quit\n",

        5);
    }
    
    
    
    /**
    *The doAction method
    * Purpose: performs the selected action
    * Parameters: none
    * Returns: none
    */
    // ===================================
    @Override public void doAction(int option)
    {
        switch (option)
        {
            case 1: // if the option is 1, call startNewGame( )
                startNewGame();
                break;
            case 2: // if the option is 2, call startExistingGame( )
                startSavedGame();
                break;
            case 3: // if the option is 3, call displayHelpMenu( )
                displayHelpMenuView();
                break;
            case 4: // if the option is 4, call displaySaveGame( )
                displaySaveGameView();
                break;
            case 5: // if the option is 5, display a goodbye message
                System.out.println("Thanks for playing ... goodbye.");
        }        
    } 
        
    /**
    * The startNewGame method
    * Purpose: creates game object and starts the game
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public void startNewGame()
    {
    //Create a new Game object.
    //Game theGame = new Game();
        
    // Display the Banner Page. 
    System.out.println(
            " Welcome to the city of Aaron. You have been called here by the\n" +
            " poweful leader to take over your position as the new chief\n" +
            " leader. To ensure the survival of this city and all residents \n" +
            " here in, you will need to make wise decisions in the following:\n" +
            " -Buy and sell land.\n -Determine the amount of wheat" +
            " to plant each year, and to set aside to feed your people.\n" +
            " -Pay an annual tithe on the harvested wheat.\n" +
            " \n The lives of your people are in your hands. People will die" +
            " of starvation if you fail to provide enough wheat. As a result you " +
            " workforce will diminish slowing your production.\n *Warning - " +
            " you also have the danger of rats eating your wheat.\n" +
            " \n Good Luck!\n");
    
    // Create a new Player object
    Player thePlayer = new Player();
    
    // Prompt for and get the user’s name.
    String name;
    System.out.println("Please type in your first name: ");
    name = keyboard.next();

    // Save the user’s name in the Player object
    thePlayer.setName(name);
    
    // Save a reference to the player object in the Game object
    //theGame.setThePlayer(thePlayer);

    // Display a welcome message
    System.out.println("Welcome " + name + " have fun.");
    
    // call the createNewGame( ) method. Pass the name as a parameter
    GameControl.createNewGame(name);
    GameControl.createCropDataObject();
    GameControl.createMap();
    GameControl.createAnimalList();
    GameControl.createToolList();
    GameControl.createProvisionsList();
    GameControl.displayBeginningCropReport();
    
    
    // Display the Game menu
    GameMenuView gmv = new GameMenuView();
    gmv.displayMenuView(); 
    
    }
    
     /**
    * The startSavedGame method
    * Purpose: loads a saved game object from disk and start the game
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public void startSavedGame()
    {
        String filePath;
        
        // get rid of \n character left in the stream
        keyboard.nextLine();
        
        // prompt user and get a file path
        System.out.println("Enter the name of the saved game: ");
        filePath = keyboard.next();
        
        // call the getSavedGame( ) method in the GameControlclass to load the game
        GameControl.getSavedGame(filePath);
        
        // display the game menu for the loaded game
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenuView(); 
        
    
    }
    
    /**
    * The displayHelpMenuView method
    * Purpose: display the help menu
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public void displayHelpMenuView()
    {
    HelpMenuView hmv = new HelpMenuView();
    hmv.displayMenuView();    
    }
    
    /**
    * The displaySaveGameView method
    * Purpose: display the save game menu
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public void displaySaveGameView()
    {
        String filePath;
        
        // get rid of \n character left in the stream
        keyboard.nextLine();
        
        // prompt user and get a file path
        System.out.println("Enter a file name to save the game as: ");
        filePath = keyboard.next();
        Game theGame = CityOfAaron.getTheGame();
        
        // call the getSavedGame( ) method in the GameControlclass to load the game
        GameControl.saveGame(filePath);
        

    }
}
