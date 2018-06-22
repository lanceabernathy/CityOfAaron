// The HelpMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Abernathy, Petersen team
// Date last modified: June 2018
//-------------------------------------------------------------
package view;

import java.util.Scanner;

public class GameMenuView {
    
    Scanner keyboard = new Scanner(System.in);
    private String theGameMenu;
    private int max;
    
        /**
    * The displayHelpView method
    * Purpose: displays the menu, gets the user's input, and does the
    *   selected action
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
            System.out.println(theGameMenu);
            
            // Prompt the user and get the user’s input
            menuOption = getMenuOption();
            
            // Perform the desired action
            doAction(menuOption);
            
            // Determine and display the next view
        } while (menuOption != max);
     }
    
    /**
    * The HelpMenuView constructor
    * Purpose: Initialize the menu data
    * Parameters: none
    * Returns: none
    */
    // ===================================
        
    public GameMenuView()
    {
        theGameMenu = "\n" +
            "**********************************\n" +
            "* CITY OF AARON: GAME MENU *\n" +
            "**********************************\n" +
            " 1 - View the map\n" +
            " 2 - View/Print a list\n" +
            " 3 - Move to a new location\n" +
            " 4 - Manage the Crops\n" +
            " 5 - REturn to the Main Menu.\n";

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
            case 1: // if the option is 1, call displayViewTheMap( )
                displayViewTheMap();
                break;
            case 2: // if the option is 2, call displayViewPrintList( )
                displayViewPrintList();
                break;
            case 3: // if the option is 3, call startMoveNewLocation( )
                startMoveNewLocation();
                break;
            case 4: // if the option is 4, call startManageCrops( )
                startManageCrops();
                break;
            case 5: // if the option is 5, return to main menu
                break;
        }        
    }
    
    private void displayViewTheMap() {
    System.out.println("This option will display the map.");    
    }

    private void displayViewPrintList() {
    System.out.println("This option will display a list.");    
    }

    private void startMoveNewLocation() {
    System.out.println("This option will let you move to a new location.");    
    }

    private void startManageCrops() {
    System.out.println("This option will allow you to manage the crops.");
   //CropView cv = new CropView();
   //cv.runCropView();
    }
    
}
