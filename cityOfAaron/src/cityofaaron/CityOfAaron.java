/*
 * The main() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team members: Lance Abernathy, Brian Kenoyer, Andrew Petersen
 */
package cityofaaron;

import Model.Player;

/**
 *
 * @author Lance
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player = new Player();
        
        Player.setName("Fred Flintstone");
        
        String player = Player.getName();
        
        System.out.println("Name = " + player);
        
        
    }
    
}
