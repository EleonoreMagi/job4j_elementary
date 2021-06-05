package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        boolean rsl = false;
        if (left.charAt(0) == right.charAt(0) || (left.charAt(1) == right.charAt(1))) {
            rsl = true;
        }
        return rsl;
    }

    public static void main(String[] args) {
        boolean check = AttackRook.check("A8", "E8");
        System.out.println(check);
        check = AttackRook.check("H4", "H3");
        System.out.println(check);
        check = AttackRook.check("A1", "B2");
        System.out.println(check);
        check = AttackRook.check("F5", "C8");
        System.out.println(check);
    }
}