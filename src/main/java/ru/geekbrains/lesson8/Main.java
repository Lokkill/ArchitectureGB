package ru.geekbrains.lesson8;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ChainingHashMap<Integer, String> chm = new ChainingHashMap<>(16);

        chm.put(1, "1");
        chm.put(12, "12");
        chm.put(23, "23");
        chm.put(34, "34");
        chm.put(45, "45");
        chm.put(56, "56");

        System.out.println(chm.toString());
        chm.delete(12);
        System.out.println(chm.toString());
        chm.delete(45);
        System.out.println(chm.toString());

    }
}
