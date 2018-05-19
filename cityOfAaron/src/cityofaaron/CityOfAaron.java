/*
 * The main() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team members: Lance Abernathy, Brian Kenoyer, Andrew Petersen
 */
package cityofaaron;

import Model.Location;
import Model.Player;
import Model.TeamMember;

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
        Location currentLocation = new Location();
        Location currentSymbol = new Location();
        
        player.setName("Fred Flintstone");
        
        currentLocation.setDescription("Home");
        currentSymbol.setSymbol("@");
                
        String playername = player.getName();
        
        System.out.println("Name = " + playername);
        
        String member1name = TeamMember.Lance.getName();
        String member1title = TeamMember.Lance.getTitle();
        String member2name = TeamMember.Brian.getName();
        String member2title = TeamMember.Brian.getTitle();
        String member3name = TeamMember.Andrew.getName();
        String member3title = TeamMember.Andrew.getTitle();
        
        System.out.println(member1name + ", " + member1title);
        System.out.println(member2name + ", " + member2title);
        System.out.println(member3name + ", " + member3title);
        
        String playerlocation = currentLocation.getDescription();
        String playerSymbol = currentSymbol.getSymbol();
        
        System.out.println("Player is at " + playerlocation);
        System.out.println("Player's Symbol is  " + playerSymbol);
        
        
        
              
       
        
        
    }
    
}
