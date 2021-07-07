package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Test task 1
        String str = "Создать программу, которая переворачивает вводимые строки";
        System.out.println(reverseString(str));

        // Test task 2
        Deque deque = new Deque(10);
        deque.insertLeft(10);
        deque.insertRight(20);
        deque.insertLeft(30);
        deque.insertRight(40);
        deque.removeLeft();
        deque.removeRight();
        deque.insertLeft(50);
        deque.insertRight(60);
        System.out.println(Arrays.toString(deque.getDeque()));

        // Test task 3
        Stack stack = new Stack(10);
        for (int i = 0; i < 15; i++){
            stack.push(i);
        }
        System.out.println(stack.size());

        // Test task 4
        Queue q = new Queue(5);
        q.insert(10);
        q.insert(10);
        q.remove();
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        q.remove();
        q.remove();

        q.insert(50);
        q.insert(60);
        q.insert(70);
        q.insert(80);

        System.out.println(Arrays.toString(q.getQueue()));


    }

    // Task 1: Создать программу, которая переворачивает вводимые строки (читает справа налево).
    public static String reverseString(String str){
        char[] reverseArr = new char[str.length()];
        char[] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length; i++){
            reverseArr[i] = strArr[strArr.length - 1 - i];
        }
        return String.valueOf(reverseArr);
    }


}
