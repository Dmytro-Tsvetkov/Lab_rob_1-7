package org.project.lab.rob5;

import org.project.databases.WorkerDB;

import java.util.Scanner;

public class Dispatching {

    Scanner scanner = new Scanner(System.in);
    WorkerDB workerDB = new WorkerDB();

    private void start() {
        System.out.println("⚔Greetings, warrior \uD83D\uDC4B \nSign in \uD83D\uDC48 \uD83D\uDEE1 \uD83D\uDC49Registration");
        System.out.print("☞ ");
        String choice = scanner.nextLine();

        System.out.println("Enter your name");
        System.out.print("☞ ");
        String tempName = scanner.nextLine();

        System.out.println("Enter your password");
        System.out.print("☞ ");
        int tempPassword = scanner.nextInt();
        if (choice.toLowerCase().equals("sign in")) {
            workerDB.singIn(tempName, tempPassword);
        } else if (choice.toLowerCase().equals("registration")) {
            workerDB.registration(tempName, tempPassword);
            workerDB.singIn(tempName, tempPassword);
        }

    }

    public void getStart() {
        start();
    }

}
