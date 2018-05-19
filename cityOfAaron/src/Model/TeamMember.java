/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Point;

/**
 *
 * @author Lance
 */
public enum TeamMember {
    
    Lance("Lance", "A member of the team"),
    Brian("Brian", "another member of the team"),
    Andrew("Andrew", "and another member of the team");
    
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
