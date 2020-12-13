package com.company;

import java.util.Arrays;

public class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public Dog() {
    }


    public Dog(String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
    }


    public Dog(String name, String breed, Color color,
               Shelter shelter, String[] commands) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
        this.commands = commands;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setCommands(String commands[]) {
        this.commands = commands;
    }

    public String[] getCommands() {
        return commands;
    }

    public String getInfo() {
        return super.getInfo() + " name:" + name + " breed:" + breed
                + " commands:" + Arrays.toString(commands);
    }

    void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    void makeVoice(int number, String voice) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    void makeVoice(String voice) {
        System.out.println(voice);

    }

    void commandTo(String command) {
        System.out.println("Собака делает команду " + command);
    }

    void commandTo(int howManyTimes, String command) {
        System.out.println("Собака делает команду " + command);
    }

    final void commandTo(String command, int howManyTimes) {
        System.out.println("Собака делает команду " + command
                + " " + howManyTimes + " раз");
    }
}
