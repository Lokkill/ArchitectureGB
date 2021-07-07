package ru.geekbrains.lesson3;

// Task 2: Создать класс для реализации дека.
public class Deque {
    private int maxSize;
    private int[] deque;
    private int items;
    private int leftPoint;
    private int rightPoint;

    public Deque(int size) {
        this.maxSize = size;
        this.deque = new int[size];
        this.items = 0;
        this.leftPoint = -1;
        this.rightPoint = size;
    }

    public void insertLeft(int i){
        if(leftPoint == maxSize - 1)
            leftPoint = -1;
        deque[++leftPoint] = i;
    }

    public int removeLeft(){
        int temp = deque[leftPoint];
        if (leftPoint > 0){
            leftPoint--;
        }
        return temp;
    }

    public void insertRight(int i){
        if(rightPoint == 0)
            rightPoint = maxSize;
        deque[--rightPoint] = i;
    }

    public int removeRight(){
        int temp = deque[rightPoint];
        if(rightPoint < maxSize)
            rightPoint++;
        return temp;
    }

    public int[] getDeque() {
        return deque;
    }
}
