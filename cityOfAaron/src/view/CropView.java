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
import java.io.Serializable;

public class CropView implements Serializable {
    
// Create a Scanner object
private static Scanner keyboard = new Scanner(System.in);

// Get references to the Game object and the CropDataobject
//Game Game = CityOfAaron.getTheGame();
//CropData theCrops = Game.getCropData();

/**
* The buyLandViewmethod
* Purpose: interface with the user input for buying land
* Parameters: none
* Returns: none
*/
public static void buyLandView()
{
    System.out.print("Buying Land");
    Game theGame = CityOfAaron.getTheGame();
    CropData theCrops = theGame.getCropData();
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
            CropControl.buyLand(toBuy, price, theCrops);
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
    */
    public static void feedPeopleView()
    {
    Game theGame = CityOfAaron.getTheGame();
    CropData cropData = theGame.getCropData();
      
    // Get the user’s input and save it.
    int bushelsToFeed;
    boolean paramsNotOkay;
    do
    {
        paramsNotOkay = false;
        System.out.print("How many bushels of grain do you want to give to the people? ");
        bushelsToFeed = keyboard.nextInt();
        try
        {    
            // Call the feedPeople( ) method in the control layer
            CropControl.feedPeople(bushelsToFeed, cropData);
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
    * The plantCropsViewmethod
    */
    public static void plantCropsView()
    {
    Game theGame = CityOfAaron.getTheGame();
    CropData cropData = theGame.getCropData();
    
    // not sure where this is set at so I intitialized at 100 here for now
    int cityLandAvailable = 100;
    
    // Prompt the user to enter the number of acres to buy
    System.out.format("City land available is %d acres.%n",cityLandAvailable);
    
    // Get the user’s input and save it.
    int desiredAcres;
    boolean paramsNotOkay;
    do
    {
        paramsNotOkay = false;
        System.out.print("How many acres of land do you want to plant? ");
        desiredAcres = keyboard.nextInt();
        try
        {    
            // Call the plantCrops( ) method in the control layer
            CropControl.plantCrops(desiredAcres, cityLandAvailable, cropData);
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
    * The setOfferingViewmethod
    */
    public static void setOfferingView()
    {
    Game theGame = CityOfAaron.getTheGame();
    CropData cropData = theGame.getCropData();
      
    // Get the user’s input and save it.
    int percentOffering;
    boolean paramsNotOkay;
    do
    {
        paramsNotOkay = false;
        System.out.print("What percentage for offerings will you offer? ");
        percentOffering = keyboard.nextInt();
        try
        {    
            // Call the setOffering( ) method in the control layer
            CropControl.setOffering(percentOffering, cropData);
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
        feedPeopleView();
        plantCropsView();
        setOfferingView();
        
        // add calls to the other crop view methods
        // as they are written
    }
}   
