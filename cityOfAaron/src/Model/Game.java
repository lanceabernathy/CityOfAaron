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
    
    private Player player;
    private CropData cropData;
    private Map theMap;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     *
     * @param thePlayer
     */
    public void setThePlayer(Player thePlayer) {
        
    }

    public void setCropData(CropData cropData) {
        
    }

    public CropData getCropData() {
        return this.cropData;
        
    }

    public void setMap(Map theMap) {
       
    }

    public Map getMap() {
        return this.theMap;
        
    }


    public void setAnimals(ArrayList<ListItem> animals) {
        
    }
    
    public ArrayList<ListItem> getAnimals() {
        return this.getAnimals();
        
    }
    
    public ArrayList<ListItem> setAnimals() {
        return this.setAnimals();
    }

    public void setTools(ArrayList<ListItem> tools) {
        
    }

    public int[] getTools() {
        return this.tools();
    }

    private int[] tools() {
        return this.tools();
    }

       
}
