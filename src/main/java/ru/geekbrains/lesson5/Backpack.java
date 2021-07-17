package ru.geekbrains.lesson5;

public class Backpack {
    public static int[] weights;
    public static int[] values;

    public static int recBackpackValue(int[] arrWeights, int[] arrValues, int maxCapacity){
        weights = arrWeights;
        values = arrValues;
        return recValue(weights.length - 1, maxCapacity);
    }

    private static int recValue(int w, int c) {
        if (w < 0) return 0;
        if (weights[w] > c) {
            return recValue(w - 1, c);
        } else {
            return Math.max(recValue(w - 1, c), recValue(w - 1, c - weights[w]) + values[w]);
        }
    }
}
