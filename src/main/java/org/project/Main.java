package org.project;

import org.project.databases.WorkerDB;
import org.project.lab.rob1.CreatedCharacter;
import org.project.lab.rob2.CreatedCharacter2;
import org.project.lab.rob3.Items3;
import org.project.lab.rob4.Items4;
import org.project.lab.rob5.Items5;
import org.project.lab.rob6.Dispatching;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dispatching dispatching = new Dispatching();


        Scanner scanner = new Scanner(System.in);
        WorkerDB workerDB = new WorkerDB();


        System.out.println("Вхід/Реєстрація");
        String choice = scanner.nextLine();


        System.out.println("вкажіть ім'я");
        String tempName = scanner.nextLine();

        System.out.println("вкажіть пароль");
        int tempPassword = scanner.nextInt();

        CreatedCharacter character = new CreatedCharacter(tempName, tempPassword);
        workerDB.logOrReg(choice, tempName, tempPassword);

        System.out.println("вік");
        int tempAge = scanner.nextInt();

        System.out.println("расу");
        String tempRace = scanner.nextLine();



        CreatedCharacter2 createdCharacter2 = new CreatedCharacter2(new CreatedCharacter(tempName, tempRace, tempAge));


        createdCharacter2.createdCharacter.presentAge();

        createdCharacter2.createdCharacter.task1("Yes", createdCharacter2);

        System.out.println(workerDB.getRace());

        Items5 items = new Items5(new Items4(new Items3("yes")));

        items.getSetSkillsList();
        items.getTask2();






    }
}