// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Abernathy, Petersen team
// Date last modified: June 2018
//-------------------------------------------------------------
package view;

import cityofaaron.CityOfAaron;
import Model.Game;
import java.util.Scanner;
import gameproject.GameProject;
import Model.Player;

public class MainMenuView 
{   
    Scanner keyboard = new Scanner(System.in);
    private String theMenu;
    private int max;

     /**
    * The displayMenuView method
    * Purpose: displays the menu, gets the user's input, and does the
    * selected action
    * Parameters: none
    * Returns: none
    */
    // =========================================================
    public void displayMenuView()
    {
        int menuOption;
        do
        {
            // Display the menu
            System.out.println(theMenu);
            
            // Prompt the user and get the user’s input
            menuOption = getMenuOption();
            
            // Perform the desired action
            doAction(menuOption);
            
            // Determine and display the next view
        } while (menuOption != max);
    }
    
    /**
    * The MainMenuView constructor
    * Purpose: Initialize the menu data
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public MainMenuView()
    {
        theMenu = "\n" +
            "**********************************\n" +
            "* CITY OF AARON: MAIN GAME MENU *\n" +
            "**********************************\n" +
            " 1 - Start new game\n" +
            " 2 - Get and start a saved game\n" +
            " 3 - Get help on playing the game\n" +
            " 4 - Save game\n" +
            " 5 - Quit\n";

        max = 5;
    }
    
    /**
    * The getMenuOption method
    * Purpose: gets the user's input
    * Parameters: none
    * Returns: integer - the option selected
    */
    // ===================================
    public int getMenuOption()
    {
        // declare a variable to hold user’s input
        int userInput;
        
        // begin loop
        do
        {    
            // get user input from the keyboard
            userInput = keyboard.nextInt();
            
            // if it is not a valid value, output an error message
            if (userInput < 1 || userInput > max)
            {
            System.out.println("Option must be between 1 and " + max);
            }
            
        // loop back to the top if input was not valid
        } while(userInput < 1 || userInput > max);
        
        // return the value input by the user
        return userInput;

    }
    
    /**
    *The doAction method
    * Purpose: performs the selected action
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public void doAction(int option)
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
    Game theGame = new Game();
    
    // Save a reference to it in the GameProject class.
    GameProject.setTheGame(theGame);
    
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
    theGame.setThePlayer(thePlayer);

    // Display a welcome message
    System.out.println("Welcome " + name + " have fun.");
    
    // Display the Game menu

    }
    
     /**
    * The startNewGame method
    * Purpose: loads game object and continues the game
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public void startSavedGame()
    {
    System.out.println("Start saved game option selected.");
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
    //System.out.println("display help menu option selected.");
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
    System.out.println("display the save game view option selected.");
    }

    
}
