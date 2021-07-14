package ru.geekbrains.lesson5;

public class Recursion {

    public static float numberToDegree(float value, int degree) {
        float res = recursionValue(value, value, Math.abs(degree));
        return degree < 0 ? 1 / res : res;
    }

    private static float recursionValue(float value, float start, int degree) {
        if (degree <= 1 || Math.abs(start) <= 1) return value;
        return recursionValue(value * start, start, --degree);
    }

}
