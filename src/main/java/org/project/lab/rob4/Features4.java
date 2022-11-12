package org.project.lab.rob4;

import org.project.lab.rob3.Clothing3;
import org.project.lab.rob3.CreatedCharacter3;
import org.project.lab.rob3.Features3;
import org.project.lab.rob3.Items3;

public class Features4 extends CreatedCharacter4{

    public Features3 features3;

    public Features4(Clothing3 clothing3) {
        super(clothing3);
    }

    public Features4(Features3 features3) {
        super(features3);
    }

    public Features4(Items3 items3) {
        super(items3);
    }

    public Features4(CreatedCharacter3 createdCharacter3, Features3 features3) {
        super(createdCharacter3);
        this.features3 = features3;
    }


}
