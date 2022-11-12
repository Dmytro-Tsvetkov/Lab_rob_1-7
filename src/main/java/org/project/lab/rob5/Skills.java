package org.project.lab.rob5;

public enum Skills {

    FIREBALLS("Fire Balls", 50), LIGHTNING("Lightning", 20), CRYSTAL("Crystal",20), BLADE("Blade", 50);

    private String nameSkills;
    private int damage;

    Skills(String nameSkills, int damage) {
        this.nameSkills = nameSkills;
        this.damage = damage;
    }

    public String getNameSkills() {
        return nameSkills;
    }

    public void setNameSkills(String nameSkills) {
        this.nameSkills = nameSkills;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
