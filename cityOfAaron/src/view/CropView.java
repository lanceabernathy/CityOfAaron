/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.*;
import Control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

public class CropView {
    
// Create a Scanner object
private static Scanner keyboard = new Scanner(System.in);

// Get references to the Game object and the CropDataobject
private static Game theGame = CityOfAaron.getTheGame();
private static CropData cropData = theGame.getCropData();

/**
* The buyLandViewmethod
* Purpose: interface with the user input for buying land
* Parameters: none
* Returns: none
*/
public static void buyLandView()
{
    // Get the cost of land for this round.
    int price = CropControl.calcLandPrice();
    
    // Prompt the user to enter the number of acres to buy
    System.out.format("Land is selling for %d bushels per acre.%n",price);
    System.out.print("How many acres of land do you wish to buy? ");
    
    // Get the user’s input and save it.
    int toBuy;
    toBuy= keyboard.nextInt();
    
    // Call the buyLand( ) method in the control layer to buy the land
    CropControl.buyLand(toBuy, price, cropData);
}
    /**
    * The runCropsViewmethod()
    * Purpose: runs the City of Aaron game
    * Parameters: none
    * Returns: none
    */
    public static void runCropsView()
    {
        // call the buyLandView() method
        buyLandView();
        
        // add calls to the other crop view methods
        // as they are written
    }
}   
