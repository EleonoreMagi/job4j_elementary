package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        for (int i = 0; i < 5; i++) {
            salary = hours[i] < 8 ? salary + hours[i] * 10 : salary + hours[i] * 10 + (hours[i] - 8) * 5;
        }
        for (int i = 5; i < 7; i++) {
            salary = hours[i] < 8 ? salary + hours[i] * 20 : salary + hours[i] * 20 + (hours[i] - 8) * 10;
        }
        return salary;
    }

    public static void main(String[] args) {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};
        int rsl = WeeklySalary.calculate(hours);
        System.out.println(rsl);
    }
}