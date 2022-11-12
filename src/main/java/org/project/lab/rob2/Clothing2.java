package org.project.lab.rob2;

import org.project.lab.rob1.Clothing;
import org.project.lab.rob5.History;

public class Clothing2 extends History {

    public Clothing clothing;

    public Clothing2(Clothing clothing) {
        this.clothing = clothing;
    }

    @Override
    public void history(){ // 3
        System.out.println("Where our hero takes the first quest \"Find medicinal herbs\"");
    }

}
