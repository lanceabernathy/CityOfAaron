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
import exceptions.CropException;

public class CropView {
    
// Create a Scanner object
private static Scanner keyboard = new Scanner(System.in);

// Get references to the Game object and the CropDataobject
//private static Game theGame = CityOfAaron.getTheGame();
//private static CropData cropData = theGame.getCropData();

/**
* The buyLandViewmethod
* Purpose: interface with the user input for buying land
* Parameters: none
* Returns: none
*/
public static void buyLandView()
{
    Game theGame = CityOfAaron.getTheGame();
    CropData cropData = theGame.getCropData();
    // Get the cost of land for this round.
    int price = CropControl.calcLandPrice();
    
    // Prompt the user to enter the number of acres to buy
    System.out.format("Land is selling for %d bushels per acre.%n",price);
    
    
    // Get the user’s input and save it.
    int toBuy;
    boolean paramsNotOkay;
    do
    {
        paramsNotOkay = false;
        System.out.print("How many acres of land do you wish to buy? ");
        toBuy= keyboard.nextInt();
        try
        {
    
            // Call the buyLand( ) method in the control layer to buy the land
            CropControl.buyLand(toBuy, price, cropData);
        }
        catch(CropException e)
        {
            System.out.println("I am sorry master, I cannot do this.");
            System.out.println(e.getMessage());
            paramsNotOkay = true;
        }    
    }while(paramsNotOkay);
}    

    /**
    * The sellLandViewmethod
    * Purpose: interface with the user input for selling land
    * Parameters: none
    * Returns: none
    */
    public static void sellLandView()
    {
    Game theGame = CityOfAaron.getTheGame();
    CropData cropData = theGame.getCropData();
    // Get the cost of land for this round.
    int price = CropControl.calcLandPrice();
    
    // Prompt the user to enter the number of acres to sell
    System.out.format("Land is selling for %d bushels per acre.%n",price);
    
    
    // Get the user’s input and save it.
    int toSell;
    boolean paramsNotOkay;
    do
    {
        paramsNotOkay = false;
        System.out.print("How many acres of land do you wish to sell? ");
        toSell = keyboard.nextInt();
        try
        {    
            // Call the buyLand( ) method in the control layer to buy the land
            CropControl.buyLand(toSell, price, cropData);
        }    
        catch(CropException e)
        {
            System.out.println("I am sorry master, I cannot do this.");
            System.out.println(e.getMessage());
            paramsNotOkay = true;
        }
    }while(paramsNotOkay);
    }    
    /**
    * The feedPeopleViewmethod
    * Purpose: interface with the user input for selling land
    * Parameters: none
    * Returns: none
    */
    
    
    
    /**
    * The runCropsViewmethod()
    * Purpose: runs the City of Aaron game
    * Parameters: none
    * Returns: none
    */
    public static void runCropsView()
    {
        // call the LandView() methods
        buyLandView();
        sellLandView();
        
        // add calls to the other crop view methods
        // as they are written
    }
}   
