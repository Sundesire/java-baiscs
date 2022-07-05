package org.itmo.java.lesson5;

import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {
        String java = "Java";

//        java.toLowerCase();

        String java2 = new String("JaVa");

//        System.out.println(java == java2);
//        System.out.println(java.equals(java2));
//        System.out.println(java.equalsIgnoreCase(java2));
//
//        java = java.concat("Developer");
//        System.out.println(java);

//        java = java + 123;
//        System.out.println(java);
        java = 80 + 120 + java + 140 + 160;
//        System.out.println(java);

        int lenght = java.length();
        boolean empty = java.isEmpty();

//        System.out.println(java.substring(2));
//        System.out.println(java.substring(2, 6));

        String string = " Hello world!  ";
//        System.out.println(string);
//        System.out.println(string.trim());

//        System.out.println(string.replaceAll("l", "5"));

        String text = "Какой-то тестовый текст для урока";
        String[] strings = text.split(" ");
        for (String str : strings) {
//            System.out.println(str);
        }

        Integer number = 123123123;

//        String str = String.valueOf(number);
//        System.out.println(str);
//        char[] chars = str.toCharArray();
//        for (char aChar: chars) {
//            if(Character.isDigit(aChar)) {
//                System.out.println("true");
//            }
//        }

        StringBuilder builder = new StringBuilder(); //was text
        StringBuilder builder2 = new StringBuilder(text);
//        System.out.println(builder);
//
//        System.out.println(text == builder.toString());
//        System.out.println(builder == builder2);
//        System.out.println(text.equals(builder.toString()));
//        System.out.println(text.equals(builder));

        for (String str1 : text.split(" ")) {
            builder.append(str1)
                    .append(", ");
        }

//        System.out.println(builder);

        String reverse = builder.reverse().toString();
//        System.out.println(reverse);

        builder.insert(3, "SPB");
//        System.out.println(builder);

        StringBuffer buffer = new StringBuffer();


    }
}
