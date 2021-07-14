package ru.geekbrains.lesson3;

import java.util.Arrays;

public class Stack{
    private int maxSize;
    private int[] stack;
    private int top;

    public Stack(int size){
        this.maxSize = size;
        this.stack = new int[this.maxSize];
        this.top = -1;
    }

    public void push(int i){
        checkCapacity();
        this.stack[++this.top] = i;
    }

    public int pop(){
        return this.stack[this.top--];
    }

    public int peek(){
        return this.stack[this.top];
    }

    public boolean isEmpty(){
        return (this.top == -1);
    }

    public boolean isFull(){
        return (this.top == this.maxSize-1);
    }

    // Task 3: Реализовать расширение массива в стеке при заполнении стека.
    private void checkCapacity(){
        if (isFull()){
            this.maxSize = (int) (maxSize * 1.5);
            this.stack = Arrays.copyOf(this.stack, this.maxSize);
        }
    }

    public int size() {
        return maxSize;
    }
}
