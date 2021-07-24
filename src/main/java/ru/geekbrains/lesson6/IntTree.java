package ru.geekbrains.lesson6;


import java.util.NoSuchElementException;

public class IntTree{
    private Node root;

    public Integer get(Integer key) {
        checkKeyNotNull(key);
        return get(root, key);
    }

    private Integer get(Node node, Integer key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            return get(node.leftChild, key);
        } else {
            return get(node.rightChild, key);
        }
    }

    public void put(Integer key){
        checkKeyNotNull(key);
        root = put(root, key);
    }


    private Node put(Node node, Integer key){
        if (node == null){
            return new Node(key);
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.leftChild = put(node.leftChild, key);
        } else {
            node.rightChild = put(node.rightChild, key);
        }
        node.size = 1 + size(node.leftChild) + size(node.rightChild);
        return node;
    }

    public Integer minKey() {
        return min(root).key;
    }

    private Node min(Node node) {
        if (node.leftChild == null) {
            return node;
        }
        return min(node.leftChild);
    }

    public void deleteMin() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        root = deleteMin(root);
    }

    private void checkKeyNotNull(Integer key) {
        if (key == null) {
            throw new IllegalArgumentException("key не должен быть null");
        }
    }

    private Node deleteMin(Node node) {
        if (node.leftChild == null) {
            return node.rightChild;
        }
        node.leftChild = deleteMin(node.leftChild);
        node.size = 1 + size(node.leftChild) + size(node.rightChild);
        return node;
    }

    public void delete(Integer key) {
        checkKeyNotNull(key);
        root = delete(root, key);
    }

    private Node delete(Node node, Integer key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.leftChild = delete(node.leftChild, key);
        } else if (cmp > 0) {
            node.rightChild = delete(node.rightChild, key);
        } else {
            if (node.leftChild == null) {
                return node.rightChild;
            }
            if (node.rightChild == null) {
                return node.leftChild;
            }
            Node temp = node;
            node = min(node.rightChild);
            node.rightChild = deleteMin(temp.rightChild);
            node.leftChild = temp.leftChild;
        }
        node.size = 1 + size(node.leftChild) + size(node.rightChild);
        return node;
    }

    @Override
    public String toString() {
        return toString(root);
    }

    private String toString(Node node) {
        if (node == null) {
            return "";
        }
        return toString(node.leftChild) + " key: " +
                node.key +
                toString(node.rightChild);
    }

    public boolean contains(Integer key) {
        return get(key) != null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        return size(root);
    }

    public int size(Node node) {
        if (node == null) {
            return 0;
        }
        return node.size;
    }
}
