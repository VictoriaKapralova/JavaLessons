package org.example;

import org.example.animals.Cat;

public class Main {
    public static void main(String[] args) {

        Cat vasiliy = new Cat("Vasiliy", 9);
        Cat rijik = new Cat("Rijik",8);
        rijik.setName("Rijik 2");
        System.out.println("Сам котик: " + rijik);

        int number = 9999;
        number = number *1000;
        System.out.println(number);




    }
}