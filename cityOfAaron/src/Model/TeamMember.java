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
    
    Lance("Lance", "A member of the team", new Point(1,1))
    Brian("Brian", "another member of the team", new Point(0,1))
    Andrew("Andrew", "and another member of the team", new Point(1,2));
    
    private String name;

    @Override
    public String toString() {
        return "TeamMember{" + "name=" + name + ", title=" + title + '}';
    }

    public String getName() {
        return name;
    }
    private String title;
    
    TeamMember(String name, String title) {
        this.name = name;
        this.title = title;
}
    
}
