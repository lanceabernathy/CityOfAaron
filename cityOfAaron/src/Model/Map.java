/*
 * The Map() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team members: Lance Abernathy, Andrew Petersen
 */
package Model;

import java.io.Serializable;


public class Map implements Serializable 
{
    private int rowCount;               // stores the number of rows
    private int colCount;               // stores the number of columns
    private Location[][] locations;    // a reference to a 2-dimensional array
                                        // of Location objects

    /**
    * parameterized Map constructor
    * Purpose: Sets row and column values
    * and creates an array of Location objects
    * Parameters: row count and column count
    * Returns: none
     * @param _rows
     * @param _cols
    */
    public Map(int _rows, int _cols)
    {
        this.rowCount = _rows;
        this.colCount = _cols;
        
        // create the array of location objects
        this.locations = new Location[_rows][_cols];
    }
    
    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }
    
    /**
    * The getLocation method
    * Purpose: returns the location object at the given row and column
    * Parameters: a row and column
    * Returns: a Location object
     * @param row
     * @param col
     * @return 
    */
    public Location getLocation(int row, int col)
    {
        return this.locations[row][col];
    }

    /**
    * The setLocation method
    * Purpose: stores a location object at the row and column
    * Parameters: a row and column, and a reference to a location object
    * Returns: void
     * @param row
     * @param col
     * @param _location
    */
    public void setLocation(int row, int col, Location _location)
    {
        this.locations[row][col] = _location;
    } 



   
}
