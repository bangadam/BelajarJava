package Praktikum_10;

public class GraphApp {

    public static void main(String[] args) {

        Graph theGraph = new Graph();

        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');

        theGraph.addEdge(4, 2);
        theGraph.addEdge(3, 4);
        theGraph.addEdge(1, 4);
        theGraph.addEdge(1, 0);
        theGraph.addEdge(0, 2);
        theGraph.display();
        theGraph.connectTable();
    }

}
