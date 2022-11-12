package org.project.lab.rob1;

public class Clothing {
    private String hat;
    private String outerwear;
    private String trousers;
    private double height;

    public Clothing(String hat, String outerwear, String trousers, double height) {
        this.hat = hat;
        this.outerwear = outerwear;
        this.trousers = trousers;
        this.height = height;
    }

    public void clothingCheck() {
        if (hat.toLowerCase().equals("cap") && outerwear.toLowerCase().equals("t-shirt") && trousers.toLowerCase().equals("jeans")){
            System.out.println("You have good taste in clothes");
        }
        else {
            System.out.println("It could have been better -_-");
        }
    }

    public int styleAssessment() {
        int stAssessment = 0;
        if (hat.toLowerCase().equals("cap") && outerwear.toLowerCase().equals("t-shirt") && trousers.toLowerCase().equals("jeans")){
            stAssessment = 100;
        }
        else {
            stAssessment = 1;
        }
        System.out.println("Overall assessment: " + stAssessment);

        return stAssessment;
    }

    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public String getOuterwear() {
        return outerwear;
    }

    public void setOuterwear(String outerwear) {
        this.outerwear = outerwear;
    }

    public String getTrousers() {
        return trousers;
    }

    public void setTrousers(String trousers) {
        this.trousers = trousers;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
