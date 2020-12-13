package com.company;

final public class Pup extends Dog {

    private AgeInMonth ageInMonth;
    private Number number;

    public Pup(String name, Color color, String breed, AgeInMonth ageInMonth, Number number, Shelter shelter) {
        super.setName(name);
        super.setColor(color);
        super.setBreed(breed);
        this.ageInMonth = ageInMonth;
        this.number = number;
        super.setShelter(shelter);
    }

    public AgeInMonth ageInMonth() {
        return ageInMonth;
    }

    void commandTo(String command) {
        System.out.println("Щенок делает команду " + command);
    }
    void commandTo(int howManyTimes, String command) {
        System.out.println("Щенок делает команду " + command+" "+howManyTimes+" раз");
    }

    public String getInfo() {
        return "Name:" + getName() + " Breed:" + getBreed() + " Color:" + getColor()
                +" Month:"+ageInMonth.getMonth()+" Days:"+ageInMonth.getDays()
                +" Shelter:"+getShelter().getName()+" Address:"+getShelter().getAddress();
    }
}