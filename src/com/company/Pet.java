package com.company;

import java.util.Random;

public class Pet {

    private int age = generateDefaultAge();

    private Color color;
    private Shelter shelter;

/*    public Pet(Color color, Shelter shelter) {
        this.color = color;
        this.shelter = shelter;
    }
*/

    public int getAge() {
        return age;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public Shelter getShelter() {
        return shelter;
    }


    private int generateDefaultAge() {
        //  return new Random().nextInt(18)+1;
        return (int) (Math.random() * 10 + 5);
    }

    public String getInfo() {
        return "age:" + age + " color:" + color + " shelter:"
                + shelter.getName() + " " + shelter.getAddress();
    }
}
