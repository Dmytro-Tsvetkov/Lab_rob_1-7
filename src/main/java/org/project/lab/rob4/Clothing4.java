package org.project.lab.rob4;

import org.project.lab.rob3.Clothing3;
import org.project.lab.rob3.CreatedCharacter3;
import org.project.lab.rob3.Features3;

public class Clothing4 extends Features4{

    public Clothing3 clothing3;

    public Clothing4(Clothing3 clothing3) {
        super(clothing3);
    }

    public Clothing4(CreatedCharacter3 createdCharacter3, Features3 features3, Clothing3 clothing3) {
        super(createdCharacter3, features3);
        this.clothing3 = clothing3;
    }
}
