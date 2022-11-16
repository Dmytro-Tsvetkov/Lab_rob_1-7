package org.project.lab.rob6;

import org.project.lab.rob5.CreatedCharacter5;
import org.project.lab.rob5.Items5;

import java.util.Scanner;

public class CreatedCharacter6 implements Task {

    public CreatedCharacter5 createdCharacter5;

    public CreatedCharacter6(CreatedCharacter5 createdCharacter5) {
        this.createdCharacter5 = createdCharacter5;
    }

    public Items5 items;

    @Override
    public void task3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("When you defeated the ionster, you got a unique item. The bandits saw it and demanded that you give it to them or fight. \n" +
                "Will you fight or give it back?");

        System.out.print("☞ ");
        String tempChoice = scanner.nextLine();

        if (tempChoice.toLowerCase().equals("fight")) {

            System.out.println("How do you choice ?");
            System.out.print("☞ ");
            String tempChoice2 = scanner.nextLine();

            if (tempChoice2.toLowerCase().equals("fire balls") || tempChoice2.toLowerCase().equals("blade")) {
                System.out.println("Hooray you won !! \uD83E\uDD29 \uD83E\uDD73");
            }else {
                System.out.println("You've lost \uD83D\uDE25");
            }
        } else {
            System.out.println("You've lost \uD83D\uDE25");
        }

    }
}
