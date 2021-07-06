package ru.geekbrains;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static int[] arr, originArr;
    static long start, end;
    static int in, out, mark;

    public static void main(String[] args) {
        Random random = new Random();
        originArr = Arrays.stream(new int[100000]).map(x -> random.nextInt(100)).toArray();

        // +Bubble sort method
        discharge();
        start = System.currentTimeMillis();
        sortBubble();
        end = System.currentTimeMillis();
        System.out.printf("Bubble sort time: %s\n", end - start);

        // -Bubble sort method

        // +Sort select method
        discharge();
        start = System.currentTimeMillis();
        sortSelect();
        end = System.currentTimeMillis();
        System.out.printf("Sort select time: %s\n", end - start);
        // -Sort select method

        // +Sort insert method
        discharge();
        start = System.currentTimeMillis();
        sortInsert();
        end = System.currentTimeMillis();
        System.out.printf("Sort insert time: %s\n", end - start);
        // -Sort insert method
    }

    public static void sortBubble() {
        for (out = arr.length - 1; out >= 1; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    change(in, in + 1);
                }
            }
        }
    }

    public static void sortSelect() {
        for (out = 0; out < arr.length; out++) {
            mark = out;
            for (in = out + 1; in < arr.length; in++) {
                if (arr[in] < arr[mark]) {
                    mark = in;
                }
            }
            change(out, mark);
        }
    }

    public static void sortInsert() {
        for (out = 1; out < arr.length; out++) {
            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in] = temp;
        }
    }

    private static void change(int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void discharge() {
        in = 0;
        out = 0;
        mark = 0;
        arr = originArr.clone();
    }

}
