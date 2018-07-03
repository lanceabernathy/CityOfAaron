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

    private String name, title;

    public ListItem(String animals, int i) {
       
    }

    public ListItem() {
        
    }
    
    // get and set name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

// get and set title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public ArrayList<ListItem> getAnimals() {
        return this.getAnimals();
    }
}
