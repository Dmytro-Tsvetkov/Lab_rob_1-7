package org.project.lab.rob3;

import org.project.lab.rob1.Clothing;
import org.project.lab.rob1.CreatedCharacter;
import org.project.lab.rob2.Features2;



public class Features3 {

    public Features2 features2;

    public Features3(Features2 features2) {
        this.features2 = features2;
    }

    private double upgrade(CreatedCharacter b, Clothing o) {
        double newHeight = o.getHeight();

        if (b.getAge() < 6) {
            newHeight = Math.round(Math.random() * 11);
            System.out.println("The height will be changed to: " + newHeight +  " because of -age");;
        }

        return newHeight;
    }

    public double getUpgrade(CreatedCharacter b, Clothing o) {
        return upgrade(b, o);
    }

    private void history() {
        features2.history();
    }

    public void getHistory() {
        history();
    }

    private double checkRank(double characterPower, double characterSpeed) {
        return features2.checkRank(characterPower, characterSpeed);
    }

    public double getCheckRank(double characterPower, double characterSpeed) {
        return checkRank(characterPower, characterSpeed);
    }

    private void presentAge(CreatedCharacter createdCharacter) {
        features2.presentAge(createdCharacter);
    }

    public void getPresentAge(CreatedCharacter createdCharacter) {
        presentAge(createdCharacter);
    }

    private void featuresCheck() {
        features2.features.featuresCheck();
    }

    public void getFeaturesCheck() {
        featuresCheck();
    }

    private int checkRank() {
        return features2.features.checkRank();
    }

    public int getCheckRank() {
        return checkRank();
    }



}
