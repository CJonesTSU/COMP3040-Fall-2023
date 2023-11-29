package Graphs.DepthFirstSearch;

public class DFSDemo {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A'); // 0 (start for dfs)
        theGraph.addVertex('B'); // 1
        theGraph.addVertex('C'); // 2
        theGraph.addVertex('D'); // 3
        theGraph.addVertex('E'); // 4
        theGraph.addEdge(0, 1); // AB
        theGraph.addEdge(0,2); // AC
        theGraph.addEdge(0,4); // AE
        theGraph.addEdge(1, 2); // BC
        theGraph.addEdge(1, 3); // BD

        System.out.print("Visits: ");
        theGraph.dfs(); // depth-first search
        System.out.println();
    } // end main()
} // end class DFSApp
