package org.project.lab.rob6;

import org.project.lab.rob5.Clothing5;
import org.project.lab.rob5.Items5;
import org.project.lab.rob5.Skills;

import java.util.Scanner;

public class Clothing6 implements Statistic{

    public Clothing5 clothing5;

    public Clothing6(Clothing5 clothing5) {
        this.clothing5 = clothing5;
    }

    Scanner scanner = new Scanner(System.in);
    public Items5 items;

    @Override
    public void task3() {
        System.out.println("In honor of your victory over the wolf that was a threat to the Elves' settlement. You have been heroically invited to celebrate your victory. " +
                "An elder elf approaches you and asks you to play a coin toss. \nWhat will you choose Heads or Tails?");
        System.out.print("☞ ");
        String tempChoice = scanner.nextLine();

        if (tempChoice.toLowerCase().equals("tails")) {
            System.out.println("Ви перемогли \uD83E\uDD73");
            System.out.println("The elf was very angry  \uD83D\uDE21 \nHe challenged you to a duel\n");
            System.out.println("How do you cut it down ?");
            System.out.print("☞ ");
            String tempChoice2 = scanner.nextLine();
            if (tempChoice2.toLowerCase().equals("fire balls") || tempChoice2.toLowerCase().equals("blade")) {
                System.out.println("OH, NO. Why did you kill him ? \uD83E\uDD2C");
            }else {
                System.out.println("Hooray you won !! \uD83E\uDD29 \uD83E\uDD73");
            }
        } else {
            System.out.println("You've lost \uD83D\uDE25");
        }
    }
}
