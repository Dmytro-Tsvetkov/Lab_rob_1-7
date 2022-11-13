package org.project.lab.rob5;

import org.project.lab.rob4.Items4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Items5 {

    public Items4 items4;

    public Items5(Items4 items4) {
        this.items4 = items4;
    }

    public List<Skills> skillsList = new ArrayList<>();

    private void setSkillsList() {
        Skills skill1 = Skills.FIREBALLS;
        Skills skill2 = Skills.LIGHTNING;
        Skills skill3 = Skills.CRYSTAL;
        Skills skill4 = Skills.BLADE;

        skillsList.add(skill1);
        skillsList.add(skill2);
        skillsList.add(skill3);
        skillsList.add(skill4);
    }



    private String task2() {
        Scanner scanner = new Scanner(System.in);

        String resultTask2;

        System.out.println("You went to fight a monster and you have these skins");
        for (Skills i : skillsList){
            System.out.println("Name skill:" + i.getNameSkills() + " damage: " + i.getDamage());
        }
        System.out.println("A monster wolf jumped out in front of you what do you attack it with?");
        System.out.print("☞ ");
        String tempChoice = scanner.nextLine();

        if (tempChoice.toLowerCase().equals("fire balls") || tempChoice.toLowerCase().equals("blade")) {
            System.out.println("Yay \uD83E\uDD73 !!!! You defeated the monster.");
            return resultTask2 = "task2 done";
        } else {
            System.out.println("You have not defeated the wolf monster! \uD83D\uDE23 Unfortunately you escaped \uD83D\uDE22");
            return resultTask2 = "task2 not done";
        }
    }

    public void getSetSkillsList() {
        setSkillsList();
    }

    public String getTask2() {
        return task2();
    }
}
