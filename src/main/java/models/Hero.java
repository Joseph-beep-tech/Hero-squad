package models;

import java.util.ArrayList;

public class Hero {

    private String name;
    private int age;
    private int id;
    private String power;
    private String weakness;

    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, Integer age, String power, String weakness) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
    }
    public String getName() {return this.name;}
    public int getAge() {return this.age;}
    public String getPower() {return this.power;}
    public String getWeakness() {return this.weakness;}
    public static ArrayList<Hero> getAllInstances() {return instances;}
    public static void clearAllHeroes(){instances.clear();}
    public int getId(){return id;}
    public static Hero findById(int id) {return instances.get(id-1);}

    public static Hero setUpNewHero(){
        return new Hero("superman",30,"x-ray vision","kryptonite");
    }
    public static Hero setUpNewHero1(){
        return new Hero("Batman",41,"Bat mobile","Joker");
    }
    public static Hero setUpNewHero2(){
        return new Hero("Flash",24,"Speed","Motivation");
    }

}