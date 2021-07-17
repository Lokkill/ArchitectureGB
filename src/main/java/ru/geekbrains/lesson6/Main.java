package ru.geekbrains.lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;

public class Main {
    static Random random = new Random();
    public static void main(String[] args) {
        List<IntTree> list = new ArrayList<>();
        for (int i = 0; i < 1; i++){
            IntTree tree = new IntTree();
            while (tree.size() < 6) {
                tree.put(randomValue(random, -100, 100));
            }
            System.out.println(tree.toString());
            System.out.println(tree.minKey());
        }

    }

    public static int randomValue(Random random, int min, int max){
        return random.nextInt((max - min) + 1) + min;
    }
}
