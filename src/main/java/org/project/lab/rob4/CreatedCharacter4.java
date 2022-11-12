package org.project.lab.rob4;


import org.project.lab.rob3.Clothing3;
import org.project.lab.rob3.CreatedCharacter3;
import org.project.lab.rob3.Features3;
import org.project.lab.rob3.Items3;

public class CreatedCharacter4 {

    public CreatedCharacter3 createdCharacter3;
    public Features3 features3;
    public Items3 items3;
    public Clothing3 clothing3;

    public CreatedCharacter4(Clothing3 clothing3) {
        this.clothing3 = clothing3;
    }

    public CreatedCharacter4(Features3 features3) {
        this.features3 = features3;
    }

    public CreatedCharacter4(Items3 items3) {
        this.items3 = items3;
    }

    public CreatedCharacter4(CreatedCharacter3 createdCharacter3) {
        this.createdCharacter3 = createdCharacter3;
    }
}
