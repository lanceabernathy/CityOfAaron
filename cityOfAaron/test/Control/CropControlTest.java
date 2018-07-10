/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.CropData;
import exceptions.CropException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lance
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    /**
     * Test of calcLandPrice method, of class CropControl.
     
    @Test
    public void testCalcLandPrice() {
        System.out.println("calcLandPrice");
        int expResult = 0;
        int result = CropControl.calcLandPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLand() throws CropException {
        System.out.println("sellLand");
        int landPrice = 15;
        int acresToSell = 10;
        CropData cropData = new CropData();
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2800);
        CropControl instance = new CropControl();
        int expResult = 2790;
        int result = instance.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand() throws CropException {
        System.out.println("buyLand");
        int landPrice = 15;
        int acresToBuy = 10;
        CropData cropData = new CropData();
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2800);
        cropData.setPopulation(110);
        CropControl instance = new CropControl();
        int expResult = 2810;
        int result = instance.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOffering() throws CropException {
        System.out.println("setOffering");
        int percentOffering = 10;
        CropData cropData = new CropData();
        cropData.setHarvest(250);
        CropControl instance = new CropControl();
        int expResult = 25;
        int result = instance.setOffering(percentOffering, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
