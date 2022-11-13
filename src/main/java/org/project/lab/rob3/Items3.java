package org.project.lab.rob3;

import org.project.lab.rob1.Features;

public class Items3 {

    private String choice2;

    public Items3(String choice2) {
        this.choice2 = choice2;
    }

    public void Access(Features r){
        Subject subject = new Subject();
        subject.subjectAccessCheck(r);
    }

    class Subject {
        void subjectAccessCheck(Features r) {
            if (choice2.toLowerCase().equals("yes")){
                if (r.checkRank() == 2){
                    System.out.println("You have a level 2 sword !");
                }else{
                    System.out.println("You have a level 1 sword !");
                }

            }
        }
    }

    public String getChoice2() {
        return choice2;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }
}
