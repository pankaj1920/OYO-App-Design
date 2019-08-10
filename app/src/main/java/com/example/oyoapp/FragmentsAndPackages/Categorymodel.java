package com.example.oyoapp.FragmentsAndPackages;

public class Categorymodel {
    String stateName;
    int stateImage;


    public Categorymodel(String stateName, int stateImage) {
        this.stateName = stateName;
        this.stateImage = stateImage;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getStateImage() {
        return stateImage;
    }

    public void setStateImage(int stateImage) {
        this.stateImage = stateImage;
    }
}
