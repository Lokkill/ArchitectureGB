package ru.geekbrains.lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0, 1);
        graph.addEdge(0, 6);
        graph.addEdge(1, 2);
        graph.addEdge(1, 9);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(3, 9);
        graph.addEdge(4, 7);
        graph.addEdge(4, 9);
        graph.addEdge(5, 7);
        graph.addEdge(6, 7);
        graph.addEdge(6, 8);
        graph.addEdge(7, 9);

        BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 5);
        System.out.println(bfs.pathTo(3));

        graph.addEdge(5, 4);
        bfs = new BreadthFirstSearch(graph, 5);

        System.out.println(bfs.pathTo(3));
    }
}
