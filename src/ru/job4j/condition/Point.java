package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        /* double rsl = Math.sqrt((x2-x1)^2 + (y2-y1)^2) для задачи было бы проще, но лучше поупражняться с Math.pow */
        double rsl = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("the distance between points (0, 0) to (2, 0) is " + result);
        result = Point.distance(1, 1, 2, 1);
        System.out.println("the distance between points (1, 1) to (2, 1) is " + result);
        result = Point.distance(5, 2, 14, 11);
        System.out.println("the distance between points (5, 2) to (14, 11) is " + result);
        result = Point.distance(5, 5, 12, 12);
        System.out.println("the distance between points (5, 5) to (12, 12) is " + result);
    }
}
