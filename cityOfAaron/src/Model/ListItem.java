/*
 * The ListItem() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team members: Lance Abernathy, Brian Kenoyer, Andrew Petersen
 */


package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author andyp
 */
public class ListItem implements Serializable{

    private String name;
    private int number;

    public ListItem(String name, int i) {
       this.name = name;
       this.number = i;
       
    }

       
    // get and set name
    public String getName() {
        return name;
    }
    
    public int getNumber(){
        return number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number){
        this.number = number;
    }


    
    
   
}
