package org.project.lab.rob3;

import org.project.lab.rob2.Clothing2;

public class Clothing3 {

    public Clothing2 clothing2;

    public Clothing3(Clothing2 clothing2) {
        this.clothing2 = clothing2;
    }

    private void history() {
        clothing2.history();
    }

    public void getHistory() {
        history();
    }

    private void clothingCheck() {
        clothing2.clothing.clothingCheck();
    }

    public void getClothingCheck() {
        clothingCheck();
    }

    private int styleAssessment() {
        return clothing2.clothing.styleAssessment();
    }

    public int getStyleAssessment() {
        return styleAssessment();
    }

}
