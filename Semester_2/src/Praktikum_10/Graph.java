package Praktikum_10;

public class Graph {

    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    public void addVertex(char label) {
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
//        adjMat[end][start] = 1;
    }

    public void connectTable() {
        System.out.println("Connectivity Table: ");
        for (int row = 0; row < nVerts; row++) {
            System.out.print(vertexList[row].label + " ");
            for (int col = 0; col < nVerts; col++) {
                if(adjMat[row][col] == 1) {
                    System.out.print(vertexList[col].label + " ");
                    //opsi 1
                    for(int i = 0; i < nVerts; i++) {
                        if(adjMat[col][i] == 1 && vertexList[i].wasVisited == false) {
                            System.out.print(vertexList[i].label + " ");
                            vertexList[i].wasVisited = true;
                        }
                    }
                    //opsi 2
//                    getAdjUnvisitedVertex(col);
                }
            }
            resetFlag();
            System.out.println("");
        }
    }

    public void getAdjUnvisitedVertex(int v) {
        for (int i = 0; i < nVerts; i++) {
            if(adjMat[v][i] == 1 && vertexList[i].wasVisited == false) {
                System.out.print(vertexList[i].label + " ");
                vertexList[i].wasVisited = true;
                return;
            }
        }
    }

    public void resetFlag() {
        for (int i = 0; i < nVerts; i++) {
            vertexList[i].wasVisited = false;
        }
    }

    public void display() {
        System.out.println("Adjecency:");
        for(int row = 0; row < nVerts; row++) {
            for(int col = 0; col < nVerts; col++) {
                if(adjMat[row][col] == 1) {
                    System.out.println(vertexList[row].label + " --> " + vertexList[col].label);
                }
            }
        }
        System.out.println("");
    }

}