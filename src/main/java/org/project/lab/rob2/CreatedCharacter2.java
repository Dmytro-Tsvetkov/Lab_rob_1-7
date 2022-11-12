package org.project.lab.rob2;

import org.project.lab.rob1.CreatedCharacter;
import org.project.lab.rob5.History;

public class CreatedCharacter2 extends History {

    public CreatedCharacter createdCharacter;

    public CreatedCharacter2(CreatedCharacter createdCharacter) {
        this.createdCharacter = createdCharacter;
    }

    @Override
    public void history(){
        System.out.println("A born hero in the kingdom of Freedonia sets out on a quest for adventure");
    }

    public int recursion(int age) {
        if (age == 4){
            return 4;
        }
        return recursion(age - 1);
    }

}
