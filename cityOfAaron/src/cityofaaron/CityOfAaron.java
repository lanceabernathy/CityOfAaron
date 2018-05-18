/*
 * The main() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team members: Lance Abernathy, Brian Kenoyer, Andrew Petersen
 */
package cityofaaron;

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
        
        player.setName("Fred Flintstone");
        
        String playername = player.getName();
        
        System.out.println("Name = " + playername);
        
        TeamMember.Lance.getName();
        TeamMember.Lance.getTitle();
        TeamMember.Brian.getName();
        TeamMember.Brian.getTitle();
        TeamMember.Andrew.getName();
        TeamMember.Andrew.getTitle();
        
       
        
        
        
        
    }
    
}
