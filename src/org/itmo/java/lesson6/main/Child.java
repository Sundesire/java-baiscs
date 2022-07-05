package org.itmo.java.lesson6.main;

public class Child extends Parent {

    @Override
    public void print() {
        System.out.println("Child method!");
    }

    public void someMethod() {
        String field1 = super.field;
        System.out.println(field1);
    }
}
