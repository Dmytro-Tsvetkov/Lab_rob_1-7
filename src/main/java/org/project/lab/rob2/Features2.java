package org.project.lab.rob2;

import org.project.lab.rob1.CreatedCharacter;
import org.project.lab.rob1.Features;
import org.project.lab.rob5.History;

public class Features2 extends History {

    public Features features;

    public Features2(Features features) {
        this.features = features;
    }

    @Override
    public void history(){
        System.out.println("Our story begins with joining the adventurer's guild");
    }

    public double checkRank(double characterPower, double characterSpeed) {
        int rank = 1;
        if (characterPower < 50 && characterSpeed < 50){
            rank = 1;
        }
        else {
            rank = 2;
        }

        return rank;
    }

    public void presentAge(CreatedCharacter createdCharacter) {
        if (createdCharacter.getAge() == 18){
            System.out.println("------------------------" + "\nAdvertising!\nYou are 18 years old and don't have a job yet, but want to work as a photographer?\nWe invite you to work in our studio!!!\nDetails: https://dmytro-tsvetkov.github.io/Site/\n" + "------------------------");
        }
    }
}
