package org.project.lab.rob6;

import org.project.lab.rob5.Features5;
import org.project.lab.rob5.Items5;

import java.util.Scanner;

public class Features6 implements Task {

    public Features5 features5;

    public Features6(Features5 features5) {
        this.features5 = features5;
    }

    public Items5 items;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void task3() {
        System.out.println("While walking in the morning you were attacked by bandits ");
        System.out.println("What will you choose to fight or run away?");
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
