package org.itmo.java.lesson3;

public class Tree {
    private Integer age;
    private Boolean isAlive;
    private String name;
    private String errMessage;

    public Tree(Integer age, String name) {
        this.age = age;
        this.isAlive = false;
    }

    public Tree(Integer age, Boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
        this.errMessage = "";
    }


    public Tree() {
        this.errMessage = "Пустой конструктор без параметров сработал";
    }
}

class TreeMain {
    public static void main(String[] args) {
        Tree firstTree = new Tree();
        Tree secondTree = new Tree(120,"Dub");
        Tree thirdTree = new Tree(70,true,"Beryoza");
    }
}
