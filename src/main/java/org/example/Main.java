package org.example;

import org.example.animals.Cat;
import org.example.animals.Dog;
import org.example.animals.Animal;
import org.example.animals.Mammals;

public class Main {
    public static void main(String[] args) {

        Cat vasiliy = new Cat("Vasiliy", 9);
        Dog dog = new Dog();

        lifeofAnimal(vasiliy);
        System.out.println();
        lifeofAnimal(dog);
        dog.consume("mouse");
    }
        //Cat rijik = new Cat("Rijik",8);
        //rijik.setName("Rijik 2");
        //System.out.println("Сам котик: " + rijik);
        //int number = 9999;
        //number = number *1000;
        //System.out.println(number);
        //
        private static void lifeofAnimal(Mammals animal)
        {
            animal.drinkMilk();
            animal.eat();
            animal.sleep();
            System.out.println(animal.sound());
        }

    }