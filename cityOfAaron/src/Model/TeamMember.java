/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Lance
 */
public enum TeamMember implements Serializable
{
    
    Lance("Lance Abernathy", "Team member from California"),
    Andrew("Andrew Petersen", "Team member from Nevada");
    
    private String name;
    private String title;

    TeamMember(String name, String title) {
        this.name = name;
        this.title = title; 
    } 

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
}
