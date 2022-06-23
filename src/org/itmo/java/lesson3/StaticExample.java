package org.itmo.java.lesson3;

public class StaticExample {
    public static final String STATIC_CONSTANT = "some constant";
    private static String staticString;
    private final String nonStaticString;
    protected String protectedString;
    Integer defaultInteger;

    static {
        System.out.println("==================");
        System.out.println("static block start");
        staticString = "static string";
        System.out.println(staticString);
        System.out.println("static block end");
        System.out.println("==================");
    }

    {
        System.out.println("==================");
        System.out.println("non static block start");
        nonStaticString = "non static string";
        System.out.println(nonStaticString);
        System.out.println("non static block end");
        System.out.println("==================");
    }

    public static void printStaticVar(){
        System.out.println(staticString + " in a static method");
    }

    public void printNonStaticMethod(){
        printStaticVar();
        staticString = "123";
    }

    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        staticExample.printNonStaticMethod();

        Integer integer = null;
        int i = integer.parseInt("123");
        System.out.println(integer);
        System.out.println(i);
    }
}
