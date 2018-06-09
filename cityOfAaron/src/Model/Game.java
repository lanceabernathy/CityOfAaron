 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Lance
 */
public class Game implements Serializable{
    
    private Player player;

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
    
    
    
}
