package org.project.lab.rob1;

public class Features {

    private int characterPower;
    private int characterSpeed;
    private int characterLife;

    public Features(int characterPower, int characterSpeed, int characterLife) {
        this.characterPower = characterPower;
        this.characterSpeed = characterSpeed;
        this.characterLife = characterLife;
    }

    public void featuresCheck() {
        if (characterSpeed > 100 || characterPower > 100 || characterLife > 100){
            System.out.println("Character test");
            System.out.println("You can't make such a strong character !");
            this.characterPower = 50;// доробити
            characterSpeed = 50;
            characterLife = 50;
        }
    }

    public int checkRank() {
        int rank = 1;
        if (characterPower < 50 && characterSpeed < 50){
            rank = 1;
        }
        else {
            rank = 2;
        }
        return rank;
    }

    public int getCharacterPower() {
        return characterPower;
    }

    public void setCharacterPower(int characterPower) {
        this.characterPower = characterPower;
    }

    public int getCharacterSpeed() {
        return characterSpeed;
    }

    public void setCharacterSpeed(int characterSpeed) {
        this.characterSpeed = characterSpeed;
    }

    public int getCharacterLife() {
        return characterLife;
    }

    public void setCharacterLife(int characterLife) {
        this.characterLife = characterLife;
    }
}
