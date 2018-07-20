/*
 * The CropData() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team members: Lance Abernathy, Brian Kenoyer, Andrew Petersen
 */

package Model;

import java.io.Serializable;

/**
 * @author andyp
 */

public class CropData implements Serializable{

    public int year;
    public int population;
    public int acresOwned;

    private int cropYield, wheatInStore;
    private int numberWhoDied, newPeople, harvest, harvestAfterOffering;
    private int offering, offeringBushels, peopleFed, acresPlanted, numStarved;
    private int eatenByRats, wheatForPeople;

    // year getters and setters
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // population getters and setters
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        this.population = population;
    }

    // acresOwned getters and setters
    public int getAcresOwned() {
        return acresOwned;
    }
    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    // cropYield getters and setters
    public int getCropYield() {
        return cropYield;
    }
    public void setCropYield(int cropYield) {
        this.cropYield = cropYield;
    }

    // wheatInStore getters and setters
    public int getWheatInStore() {
        return wheatInStore;
    }
    public void setWheatInStore(int wheatInStore) {
        this.wheatInStore = wheatInStore;
    }

    // numberWhoDied getters and setters
    public int getNumberWhoDied() {
        return population;
    }
    public void setNumberWhoDied(int numberWhoDied) {
        this.numberWhoDied = numberWhoDied;
    }

    // newPeople getters and setters
    public int getNewPeople() {
        return newPeople;
    }
    public void setNewPeople(int newPeople) {
        this.newPeople = newPeople;
    }

    // harvest getters and setters
    public int getHarvest() {
        return harvest;
    }
    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

    // harvestAfterOffering getters and setters
    public int getHarvestAfterOffering() {
        return harvestAfterOffering;
    }
    public void setHarvestAfterOffering(int harvestAfterOffering) {
        this.harvestAfterOffering = harvestAfterOffering;
    }

    // offering getters and setters
    public int getOffering() {
        return offering;
    }
    public void setOffering(int offering) {
        this.offering = offering;
    }

    // offeringBushels getters and setters
    public int getOfferingBushels() {
        return offeringBushels;
    }
    public void setOfferingBushels(int offeringBushels) {
        this.offeringBushels = offeringBushels;
    }

    // peopleFed  getters and setters
    public int getPeopleFed() {
        return peopleFed;
    }
    public void setPeopleFed(int peopleFed) {
        this.peopleFed = peopleFed;
    }

    // acresPlanted getters and setters
    public int getAcresPlanted() {
        return acresPlanted;
    }
    public void setAcresPlanted(int acresPlanted) {
        this.acresPlanted = acresPlanted;
    }

    // numStarved getters and setters
    public int getNumStarved() {
        return numStarved;
    }
    public void setNumStarved(int numStarved) {
        this.numStarved = numStarved;
    }

    // eatenByRats getters and setters
    public int getEatenByRats() {
        return eatenByRats;
    }
    public void setEatenByRats(int eatenByRats) {
        this.eatenByRats = eatenByRats;
    }

    // wheatForPeople getters and setters
    public int getWheatForPeople() {
        return wheatForPeople;
    }
    public void setWheatForPeople(int wheatForPeople) {
        this.wheatForPeople = wheatForPeople;
    }
}
