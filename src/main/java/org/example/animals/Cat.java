package org.example.animals;

public class Cat {
    public static int count;
    private String name;
    private int lives;

    public Cat(String name, int lives) {
        this.name = name;
        this.lives = lives;
        count++;
        System.out.println("Котик #" + count + " Родился!:" + this);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " - " + "количество жизней:" +lives;
    }
}
