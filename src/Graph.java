/**
 * Graph class is create graph, add edge, check edge.
 *
 * @version 11/06/2026
 * @author TuanPHAHE194741
 */
public class Graph {
    
    /**
     * Save result of checking an edge.
     */
    private boolean checkEdge;
        
    /**
     * Save element of edges.
     */
    private boolean [][] graph;
    
    /**
     * Method to init a graph that no edge linked.
     * @param size is the number of elements need generate.
     */
    public void graph(int size){
    graph = new boolean[size][size];
}
    
    /**
     * The method to addEdge graph.
     * @param i vertex start.
     * @param j vertex end.
     */
    public void addEdge(int i, int j){
        graph[i][j] = true;
        graph[j][i] = true;
    }
    
    /**
     * The method to check 
     * @param i vertex start.
     * @param j vertex end.
     */
    public void checkIsAdge(int i, int j){
        graph[i][j] = true;
    }
    
    /**
     * Method to display result.
     */
    public void display(){
        if (checkEdge) {
            System.err.println("Is not edge.");
        }else{
            System.out.println("This is edge.");
        }
    }
}
