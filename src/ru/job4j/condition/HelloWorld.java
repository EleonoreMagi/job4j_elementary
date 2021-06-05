package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        String message;
        if (number % 3 == 0 && number % 5 != 0) {
            message = "Hello";
        } else if (number % 3 != 0 && number % 5 == 0) {
            message = "World";
        } else if (number % 3 == 0 && number % 5 == 0) {
            message = "Hello, World!!!";
        } else {
            message = "Operation not support";
        }
        return message;
    }

    public static void main(String[] args) {
        String result = HelloWorld.checkNumber(15);
        System.out.println(result);
        result = HelloWorld.checkNumber(9);
        System.out.println(result);
        result = HelloWorld.checkNumber(25);
        System.out.println(result);
        result = HelloWorld.checkNumber(14);
        System.out.println(result);
    }
}