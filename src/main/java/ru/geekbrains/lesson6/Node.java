package ru.geekbrains.lesson6;

public class Node {
    public Integer key;
    //public V value;
    public Node leftChild;
    public Node rightChild;
    public int size;
    public int height;

    public Node() {
    }

    public Node(Integer key) {
        this.key = key;
        //this.value = value;
        size = 1;
        height = 0;
    }

}
