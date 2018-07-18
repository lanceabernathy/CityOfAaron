/*
 * The main() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team members: Lance Abernathy, Brian Kenoyer, Andrew Petersen
 */
package cityofaaron;

import Model.*;
//import Control.CropControl;
import view.*;


public class CityOfAaron {
    
    // variable for keeping a reference to the Game object
    private static Game theGame;
    //private static Game currentGame;
          
     public static Game getTheGame() {
         return theGame;
     }  
     
     public static void setTheGame(Game _theGame) {
         //return theGame;
         theGame = _theGame;
     }
          
    // main function - entry point for the program
    // runs the main menu1
     
    /*public static void setTheGame(Game theGame) {
        Game currentGame = theGame;
        
    }
      
    public static void getCurrentGame(Game theGame) {
          currentGame = theGame;
        
    }*/ 
   
        public static void main(String[] args) 
    {
        
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();
   
    }

    /*public static class setCurrentGame {

        public setCurrentGame() {
        }
    }*/

   
    
}
