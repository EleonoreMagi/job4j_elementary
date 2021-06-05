package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        int actionNum = 0;
        if (rsl == left + right) {
            actionNum = 1;
        }
        if (rsl == left - right) {
            actionNum = 2;
        }
        if (rsl == left * right) {
            actionNum = 3;
        }
        if (rsl == left / right) {
            actionNum = 4;
        }
        return switch (actionNum) {
            case 1 -> "added";
            case 2 -> "subtracted";
            case 3 -> "multiplied";
            case 4 -> "divided";
            default -> "none";
        };
    }

    public static void main(String[] args) {
        String result = ArithmeticActions.selectAction(5, 10, 15);
        System.out.println(result);
    }
}