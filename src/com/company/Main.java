package com.company;

import javax.xml.namespace.QName;

import static com.company.Color.BLACK;

public class Main {

    public static void main(String[] args) {

 /*     Dog dog = new Dog();
        dog.setName("Жучка");
        dog.setBreed("Дворняга");
        dog.setColor(BLACK);
        dog.setShelter(new Shelter("Приют 1", "Токтогула 86"));

        dog.setCommands(new String[]{"Лежать", "Сидеть"});
        System.out.println(dog.getInfo());
*/
        Dog objectA = new Dog("Name", "Breed", Color.BROWN,
                new Shelter("Shelter name", "Shelter address"), new String[]{"Лежать", "Сидеть"});
        Pup objectB = new Pup("Pup ", Color.GRAY, "Taxa",
                new AgeInMonth(1, 10), Number.ONE,
                new Shelter("Shelter 1", "Shelter 1 address"));
        Pup objectC = new Pup("2 Pup ", Color.WHITE, "Beagle",
                new AgeInMonth(2, 7), Number.TWO,
                new Shelter("Shelter 1", "Shelter 1 address"));

        System.out.println(objectA.getInfo());
        System.out.println(objectB.getInfo());
        System.out.println(objectC.getInfo());

        objectA.commandTo("Лежать");
        objectA.commandTo("Сидеть", 5);
        objectB.commandTo(1,"дай лапу");
        objectC.commandTo("Принеси");
    }
}
