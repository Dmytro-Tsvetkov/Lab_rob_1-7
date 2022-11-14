package org.project.databases;

import org.project.lab.rob1.*;
import org.project.lab.rob2.*;
import org.project.lab.rob3.*;
import org.project.lab.rob4.*;
import org.project.lab.rob5.*;
import org.project.lab.rob6.Clothing6;
import org.project.lab.rob6.CreatedCharacter6;
import org.project.lab.rob6.Features6;

import java.sql.*;
import java.util.Scanner;

public class WorkerDB {

    private String race;
    private int age;

    ConnectionDB connectionDB = new ConnectionDB();
    Scanner scanner = new Scanner(System.in);
    //Color
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    //SQL query
    private static final String GET_USER_QUERY = "SELECT * FROM created_character";
    private static final String INSERT_INTO = "INSERT INTO created_character(password, name, race, age) VALUES(?,?,?,?)";

    public void registration(String tempName, int tempPassword) {


        try {
            PreparedStatement preparedStatement = connectionDB.getConnectionDB().prepareStatement(INSERT_INTO);

            System.out.println("Choose a race: Cat, Elf, Human");
            System.out.println("Enter your race");
            System.out.print("☞ ");
            String tempRace = scanner.nextLine();

            System.out.println("Enter your age");
            System.out.print("☞ ");
            int tempAge = scanner.nextInt();
            System.out.println("\n");

            preparedStatement.setInt(1, tempPassword);
            preparedStatement.setString(2, tempName);
            preparedStatement.setString(3, tempRace);
            preparedStatement.setInt(4, tempAge);


            preparedStatement.execute();

            System.out.println("Ви успішно зареєструвалися )");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void logOrReg(String tempName, int tempPassword) {

            try {
                Statement statement = connectionDB.getConnectionDB().createStatement();
                ResultSet resultSet = statement.executeQuery(GET_USER_QUERY);
                PreparedStatement preparedStatement = connectionDB.getConnectionDB().prepareStatement(INSERT_INTO);


                    while (resultSet.next()) {
                        if ((tempName.equals(resultSet.getString("name"))) && (tempPassword == resultSet.getInt("password"))) {
                            System.out.println("\uD83C\uDF89 You have successfully logged in \uD83C\uDF89");

                            CreatedCharacter6 createdCharacter = new CreatedCharacter6(new CreatedCharacter5(new CreatedCharacter4(new CreatedCharacter3(new CreatedCharacter2(new CreatedCharacter(
                                    resultSet.getString("name"), resultSet.getString("race"), resultSet.getInt("age")))))));
                            Features6 features = new Features6(new Features5(new Features4(new Features3(new Features2(new Features(49, 49, 49))))));
                            Clothing6 clothing = new Clothing6(new Clothing5(new Clothing4((new Clothing3(new Clothing2(new Clothing("cap", "t-shirt", "jeans", 150)))))));
                            Items5 item = new Items5(new Items4(new Items3("yes")));

                            //history
                            System.out.println(ANSI_RESET + "--------------------------------" + ANSI_GREEN);
                            createdCharacter.createdCharacter5.createdCharacter4.createdCharacter3.getHistory();  //1
                            features.features5.features4.features3.getHistory();   //2
                            clothing.clothing5.clothing4.clothing3.getHistory();  //3
                            // presentAge
                            System.out.println(ANSI_RESET + "--------------------------------" + ANSI_GREEN);
                            createdCharacter.createdCharacter5.createdCharacter4.createdCharacter3.getPresentAge();
                            //reworkedAge
                            System.out.println(ANSI_RESET + "--------------------------------" + ANSI_GREEN);
                            createdCharacter.createdCharacter5.createdCharacter4.createdCharacter3.getReworkedAge();
                            // task1
                            System.out.println(ANSI_RESET + "--------------------------------" + ANSI_YELLOW);
                            System.out.println("In the guild you were summoned to a specific duel");
                            System.out.println("Yes or No");
                            System.out.print("☞ ");
                            String choiceTask1 = scanner.nextLine();
                            createdCharacter.createdCharacter5.createdCharacter4.createdCharacter3.getTask1(choiceTask1, createdCharacter.createdCharacter5.createdCharacter4.createdCharacter3.createdCharacter2);
                            //bonus
                            System.out.println("You have a unique opportunity to guess the number and get a bonus");
                            System.out.println("\uD83D\uDC47Enter a number up to 11\uD83D\uDC47");
                            System.out.print("☞ ");
                            double yourNumber = scanner.nextInt();
                            createdCharacter.createdCharacter5.createdCharacter4.createdCharacter3.getBonus(
                                    features.features5.features4.features3.features2.features, yourNumber
                            );
                            //upgrade
                            features.features5.features4.features3.getUpgrade(
                                    createdCharacter.createdCharacter5.createdCharacter4.createdCharacter3.createdCharacter2.createdCharacter, clothing.clothing5.clothing4.clothing3.clothing2.clothing
                            );
                            //checkRank (int)
                            features.features5.features4.features3.getCheckRank();
                            //checkRank (double)
                            features.features5.features4.features3.getCheckRank(49,49);
                            //presentAge (Advertising)
                            features.features5.features4.features3.getPresentAge(createdCharacter.createdCharacter5.createdCharacter4.createdCharacter3.createdCharacter2.createdCharacter);
                            //featuresCheck
                            features.features5.features4.features3.getFeaturesCheck();
                            //clothingCheck
                            clothing.clothing5.clothing4.clothing3.getClothingCheck();
                            //styleAssessment
                            System.out.println(ANSI_RESET + "--------------------------------" + ANSI_GREEN);
                            clothing.clothing5.clothing4.clothing3.getStyleAssessment();
                            //Access
                            System.out.println(ANSI_RESET + "--------------------------------" + ANSI_GREEN);
                            item.items4.items3.Access(features.features5.features4.features3.features2.features);
                            //setSkillsList
                            item.getSetSkillsList();
                            //task2
                            System.out.println(ANSI_RESET + "--------------------------------" + ANSI_YELLOW);
                            item.getTask2();
                            System.out.println(ANSI_RESET);
                            //task3
                            if ((resultSet.getString("race")).toLowerCase().equals("cat")) {
                                createdCharacter.task3();
                            } else if ((resultSet.getString("race")).toLowerCase().equals("elf")) {
                                clothing.task3();
                            } else if ((resultSet.getString("race")).toLowerCase().equals("human")) {
                                features.task3();
                            }

                        }
                    }

                statement.close();
                resultSet.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    public String getRace() {
        return race;
    }

    public String setRace(String race) {
        this.race = race;
        return race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}




