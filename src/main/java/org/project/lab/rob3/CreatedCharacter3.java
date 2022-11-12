package org.project.lab.rob3;

import org.project.lab.rob1.Features;
import org.project.lab.rob2.CreatedCharacter2;

public class CreatedCharacter3 {

    public CreatedCharacter2 createdCharacter2;

    public CreatedCharacter3(CreatedCharacter2 createdCharacter2) {
        this.createdCharacter2 = createdCharacter2;
    }

    private void history() {
        createdCharacter2.history();
    }

    public void getHistory() {
        history();
    }

    private int recursion(int age) {
        return createdCharacter2.recursion(age);
    }

    public int getRecursion(int age) {
        return recursion(age);
    }

    private void presentAge(){
        createdCharacter2.createdCharacter.presentAge();
    }

    public void getPresentAge() {
        presentAge();
    }

    private int reworkedAge() {
        return createdCharacter2.createdCharacter.reworkedAge();
    }

    public int getReworkedAge() {
        return reworkedAge();
    }

    private void task1(String task1, CreatedCharacter2 createdCharacter2) {
        createdCharacter2.createdCharacter.task1(task1, createdCharacter2);
    }

    public void getTask1(String task1, CreatedCharacter2 createdCharacter2) {
        task1(task1, createdCharacter2);
    }

    private void bonus(Features o, double yourNumber) {
        createdCharacter2.createdCharacter.bonus(o, yourNumber);
    }

    public void getBonus(Features o, double yourNumber) {
        bonus(o, yourNumber);
    }

}
