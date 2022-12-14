package org.example.animals;

public class Cat extends Mammals {
    public static int count;
    private String name;
    private int lives;

    public Cat(String name, int lives) {
        this.name = name;
        this.lives = lives;
        count++;
        //System.out.println("Котик #" + count + " Родился!:" + this);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setLives(int lives){
        this.lives = lives;
    }
    @Override
    public String toString() {
        return "Имя: " + name + " - " + "количество жизней:" +lives;
   }

    @Override
    public void sleep() {
        System.out.println("Z-z-z...");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats meat");

    }

    @Override
    public String sound() {
        return "Pur-pur-pur";
    }
}
