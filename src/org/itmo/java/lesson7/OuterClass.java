package org.itmo.java.lesson7;

public class OuterClass {
    private int a = 2;
    private int b = 3;

    static String name = "Mike";

    void sum(final int x, final int y) {
        this.a = x;
        this.b = y;

    }

    class InnerClass {
        void display() {
            sum(4,6);
            System.out.println("sum = " + (a + b));
        }
    }

    public static void main(String[] args) {
//        OuterClass.NestedStaticClass nestedStaticClass = new OuterClass.NestedStaticClass();
//        nestedStaticClass.methodNestedClassicClass();
        OuterClass outerClass = new OuterClass();
        outerClass.innerMethod();
    }

    public void innerMethod() {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.display();
    }

    static class NestedStaticClass {
        void methodNestedClassicClass() {
            System.out.println("Static nested class");
            System.out.println(name);
        }
    }
}
