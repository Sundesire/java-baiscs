package org.itmo.java.lesson6.main;

public class Main {
    private static Object object;

    public static void main(String[] args) {
//        Human human = new Human();

//        Field[] declaredFields =  human.getClass().getDeclaredFields();

//        for (Field declaredField: declaredFields) {
//            System.out.println(declaredField);
//        }

//        Object object = new Object();

//        Child child = new Parent(); //Создание невозможно
        Parent parent = new Parent();
        Parent parent2 = new Child();
        Parent parent3 = new AnotherChild();

//        ((Child)parent).print(); //Ошибка компиляции

        Moveable human1 = new Human();
        Moveable man = new Man();

        getHumanInfo(human1);
        getHumanInfo(man);


    }

    public static void getHumanInfo(Moveable human) {
        human.printInfo();
    }
}
