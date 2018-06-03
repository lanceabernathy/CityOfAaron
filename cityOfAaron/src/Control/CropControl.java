// The CropControl class - part of the control layer
// class contains all of the calculation methods for managing the crops
// Author: Lance
// Date last modified: May 2018
//-------------------------------------------------------------

package Control;

import Model.CropData;
import java.util.Random;

/**
 *
 * @author Lance
 */
public class CropControl 
{
    // constants
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 11;

    // random number generator
    private static Random random = new Random();
    
    // calcLandPrice() method
    // Purpose: Calculate a random land cost between 17 and 26 bushels/acre
    // Parameters: none
    // Returns: the land price
    public static int calcLandPrice()
    {
    int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
    return landPrice;
    }
     
           
    // sellLand method
    // Purpose: Sell land - subtracts from the acres owned
    // Parameters: the price of land, the number of acres to sell, and
    // a reference to a CropData object
    // Pre-conditions: acresToSell >= 0 and acresToSell <= acresOwned
    // Returns: the number of acres owned after the sale
    
public int sellLand(int landPrice, int acresToSell, CropData cropData)
{
    
    //if acresToSell < 0, return -1
    if (acresToSell < 0)
    return -1;
    
    //if acresToSell > acresOwned, return -1
   int acresOwned = cropData.getAcresOwned();
   if (acresToSell > acresOwned)
   return -1;

   //acresOwned = acresOwned - acresToSell
    acresOwned -= acresToSell;
    cropData.setAcresOwned(acresOwned);
  
    //wheatInStore = wheatInStore + acresToSell * landPrice
    int wheatInStore = cropData.getWheatInStore();
    wheatInStore -= (acresToSell * landPrice);
    cropData.setWheatInStore(wheatInStore);

    //return acresOwned
    return acresOwned;
}

    // BuyLand method
    // Purpose: Buy land - Adds to the acres owned
    // Parameters: the price of land, the number of acres to buy, and
    // a reference to a CropData object
    // Pre-conditions: acresToBuy >= 0 and acresToBuy < landPrice * 
    // wheatInStore and wheatInStore < acresToBuy * landPrice and population <
    // (acresOwned + acresToBuy) / 10   
    // Returns: the number of acres owned after the pruchace
    // Returns: the amount of wheat owned after the pruchace.

public int buyLand(int landPrice, int acresToBuy, CropData cropData)
{
    
    //if acresToBuy < 0, return -1
    if (acresToBuy < 0)
    return -1;
       
   //acresToBuy <= landPrice * wheatInStore
   int wheatInStore = cropData.getWheatInStore();
   if (acresToBuy > landPrice * wheatInStore)
   return -1;
   
   //wheatInStore < acresToBuy * landPrice
  if (acresToBuy * landPrice > wheatInStore)
  return -1;
      
  //population < (acresOwned + acresToBuy) / 10 
   int acresOwned = cropData.getAcresOwned();
   int population = cropData.getPopulation();
   if ((acresToBuy + acresOwned) /10 < population);
   return ((acresToBuy + acresOwned) /10);
   //return population;
    
   //acresOwned = acresOwned + acresToBuy
   acresOwned += acresToBuy;
   cropData.setAcresOwned(acresOwned);
    
    //wheatInStore = wheatInStore - landPrice * acresToBuy
    wheatInStore -= (landPrice * acresToBuy);
    cropData.setWheatInStore(wheatInStore);
    
     //return acresOwned
    return acresOwned;
        
}

// setOffering method
    // Purpose: Pay Offering - Determines the percent of the harvest to use in
    // offerings
    // Parameters: the percent wheat to pay in offerings and
    // a reference to a CropData object
    // Pre-conditions: percentOffering >= 0 and percentOffering <= 100
    // Returns: the amount of wheat for paid for offerings
    //Author: Lance Aberanathy
    
public int setOffering(int percentOffering, CropData cropData)
{
    //if percentOffering < 0, return -1
    if (percentOffering < 0)
    return -1;
    
    //if percentOffering > 100, return -1
     if (percentOffering > 100);
     return -1;
     
     //Amount of wheat to pay in offerings. 
     int wheatInTithes
}

