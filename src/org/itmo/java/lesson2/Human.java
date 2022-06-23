package org.itmo.java.lesson2;

public class Human {

    private String name;
    private int age;
    private Boolean isAlive;
    private Color hairColor;

    public static void main(String[] args) {

        Human human1 = new Human();
        System.out.println("Human 1: " + human1.getName() + " " + human1.getAge() + " years old." + " Is alive? - " + human1.getIsAlive() + ". Hair color: " + human1.getHairColor());
        human1.setName("Antony");
        human1.setAge(79);
        human1.setAlive(false);
        human1.setHairColor(Color.BLACK);
        System.out.println("Human 1: " + human1.getName() + " " + human1.getAge() + " years old." + " Is alive? - " + human1.getIsAlive() + ". Hair color: " + human1.getHairColor());

        Human human2 = new Human("Alex");
        System.out.println("Human 2: " + human2.getName() + " " + human2.getAge() + " years old." + " Is alive? - " + human2.getIsAlive() + ". Hair color: " + human2.getHairColor());
        human2.setAge(33);
        human2.setAlive(true);
        human2.setHairColor(Color.RED);
        System.out.println("Human 2: " + human2.getName() + " " + human2.getAge() + " years old." + " Is alive? - " + human2.getIsAlive() + ". Hair color: " + human2.getHairColor());

        Human human3 = new Human("James",21, true, Color.BLONDE);
        System.out.println("Human 3: " + human3.getName() + " " + human3.getAge() + " years old." + " Is alive? - " + human3.getIsAlive() + ". Hair color: " + human3.getHairColor());
    }

    public  Human() {
        name = "John";
        age = 31;
        isAlive = true;
        hairColor = Color.UNKNOWN;
    }

    public Human(String name) {
        this.name = name;
        this.age = 0;
        this.isAlive = false;
        this.hairColor = Color.UNKNOWN;
    }

    public Human(String name, int age, boolean isAlive, Color hairColor) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
        this.hairColor = hairColor;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getIsAlive() { return isAlive; }

    public void setAlive(Boolean isAlive) { this.isAlive = isAlive; }

    public Color getHairColor() { return hairColor; }

    public void setHairColor(Color hairColor) { this.hairColor = hairColor; }
}
