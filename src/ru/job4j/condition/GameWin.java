package ru.job4j.condition;

public class GameWin {
    public static int checkGame(double percent, int prize, int pay) {
        int rsl = 0;
        if (percent * prize > pay) {
            rsl = (int) ((percent * prize) - pay);
        }
        return rsl;
    }

    public static void main(String[] args) {
        int result = GameWin.checkGame(0.2, 50, 9);
        System.out.println(result);
    }
}