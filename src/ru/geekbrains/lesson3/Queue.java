package ru.geekbrains.lesson3;

public class Queue {
    private int maxSize;
    private int[] queue;
    private int front;
    private int rear;
    private int items;

    public Queue(int s){
        maxSize = s;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        items = 0;
    }
    public void insert(int i){
        checkCapacity();
        if(rear == maxSize-1)
            rear = -1;
        queue[++rear] = i;
        items++;
    }

    public int remove(){
        int temp = queue[front++];
        if(front == maxSize)
            front = 0;
        items--;
        return temp;
    }

    public int peek(){
        return queue[front];
    }
    public boolean isEmpty(){
        return (items==0);
    }

    public boolean isFull(){
        return (items==maxSize);
    }

    public int size(){
        return items;
    }

    // Task 4: Реализовать расширение массива в очереди при заполнении очереди.
    private void checkCapacity(){
        if (isFull()){
            int[] newArr = new int[(int) (maxSize * 1.5)];
            for (int i = front; i > 0; i--){
                newArr[i-1] = this.queue[i-1];
            }
            for (int i = 0;; i++){
                if (maxSize - 1 - i == rear){
                    rear = newArr.length - i - 2;
                    break;
                }
                newArr[newArr.length - 1 - i] = this.queue[maxSize - 1 - i];
            }
            this.maxSize = newArr.length;
            this.queue = newArr;
        }
    }

    public int[] getQueue() {
        return queue;
    }
}
