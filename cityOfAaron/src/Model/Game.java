 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import Control.*;

/**
 *
 * @author Lance
 */
public class Game implements Serializable{
    
    private Player thePlayer;
    private CropData theCrops;
    private Map theMap;
    //public boolean thePlayer;
    private static Game theGame;
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> tools;

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }


    public void setCropData(CropData cropData) {
        this.theCrops = cropData;
    }

    public CropData getCropData() {
        return theCrops;
        
    }

    public void setTheMap(Map theMap) {
       this.theMap = theMap;
    }

    public Map getTheMap() {
        return theMap;
    }


    public void setAnimals(ArrayList<ListItem> animals) {
        this.animals = animals;
    }
    
    public ArrayList<ListItem> getAnimals() {
        return animals;
        
    }
    
    public ArrayList<ListItem> setAnimals() {
        return animals;
    }

    public void setTools(ArrayList<ListItem> tools) {
        this.tools = tools;
    }
    
    public ArrayList<ListItem> getTools() {
        return tools;
    }
    
       
     public static void setCurrentGame(Game game){
        theGame = game;
    }
    public static Game getCurrentGame(){
        return theGame;
    }   
}
