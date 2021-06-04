package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        boolean rsl;
        rsl = isEven(5);
        System.out.println(rsl);
        rsl = isPositive(5);
        System.out.println(rsl);
        rsl = notEven(5);
        System.out.println(rsl);
        rsl =  notPositive(5);
        System.out.println(rsl);
        rsl = notEvenAndPositive(5);
        System.out.println(rsl);
        rsl = evenOrNotPositive(5);
        System.out.println(rsl);
    }

}