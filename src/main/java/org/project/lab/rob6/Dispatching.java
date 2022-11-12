package org.project.lab.rob6;

import org.project.databases.WorkerDB;

import java.util.Scanner;

public class Dispatching {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    Scanner scanner = new Scanner(System.in);
    WorkerDB workerDB = new WorkerDB();



    public void start() {
        System.out.println("⚔Greetings, warrior \uD83D\uDC4B \nSign in \uD83D\uDC48 \uD83D\uDEE1 \uD83D\uDC49Registration");
        System.out.print("☞");
        String choice = scanner.nextLine();

        System.out.println("Enter your name");
        System.out.print("☞");
        String tempName = scanner.nextLine();

        System.out.println("Enter your password");
        System.out.print("☞");
        int tempPassword = scanner.nextInt();

        workerDB.logOrReg(choice, tempName, tempPassword);
    }

    public void story() {
        System.out.println("In the guild you were summoned to a specific duel");
        System.out.println("Yes or No");
        System.out.print("☞");
        String choiceTask1 = scanner.nextLine();

    }

}
