package org.project.lab.rob1;

import org.project.lab.rob2.CreatedCharacter2;

import java.util.Scanner;

public class CreatedCharacter {

    private String name;
    private String race;
    private int age;
    private int password;
    private int experience = 100;

    Scanner scanner = new Scanner(System.in);

    public CreatedCharacter(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }



    public void presentAge() {
        if (age >= 18 && age <= 60){
            System.out.println("All functions are available to you !");
        }
        else {
            System.out.println("Unfortunately, you can't access the full functionality of the system(");
        }
    }

    public int reworkedAge() {
        int rewAge = 1;
        if (race.toLowerCase().equals("cat")){
            System.out.println("Oh, you have the race of Cat. Your age is being verified.");
            if (age > 7){
                return rewAge = age - 7;
            }
            return age;
        }
        System.out.println("Because of your race, the age is recycled: " + rewAge);

        return rewAge = age;
    }

    public void task1(String task1, CreatedCharacter2 createdCharacter2) {
        if (task1.toLowerCase().equals("yes")) {
            System.out.println("Rules of the fight\nA clever man bet that you will not guess the number he guessed\n");
            System.out.println("You need to guess the number\nHINT: you know that this number is equivalent to the factorial of some number");
            int temp = createdCharacter2.recursion(age);
            int number = 1;
            for (int i = 1; i <=temp; i++) {
                number *= i;
            }

            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (answer == number) {
                System.out.println("Congratulations you won!!!\nYou have gained + 10 experience");
                experience += 10;
                System.out.println("Your experience now amounts to: " + experience);
            }
        } else if (task1.toLowerCase().equals("no")) {
            System.out.println("You shamefully left - 10 experiences");
            experience -= 10;
            System.out.println("Your experience now amounts to: " + experience);
        }
    }

    public void bonus(Features o, double yourNumber){

        double number = Math.round(Math.random() * 11);
        int newLife = 0;

        if (number == yourNumber){
            newLife = o.getCharacterLife() + 100;
            System.out.println("Number: " + number);
            System.out.println("You WIN\nyour new life: " + newLife);
        }
        else{
            System.out.println("Number: " + number);
            System.out.println("Unfortunately, you lost\nBetter luck next time.)");
        }
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
