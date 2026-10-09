/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        //Init size of array.
        int size = 6;
// Init oject graph with size = 6.
        Graph graph = new Graph();
        graph.graph(6);

        //Step 2: add data edge of graph.
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        //Step 3: Display require user enter start point and check valid input.
        int input1 = Unitity.checkInput1("Enter the start point: ", size);

        //Step 4: Display require user enter start point and check valid input.
        int input2 = Unitity.checkInput1("Enter the end point: ", size);

        //Step 5: Call method checkIsEdge to check is edge or not.
        graph.checkIsEdge(input1, input2);
        
        //Step 6: Call method display to display result.
        graph.display();
    }
}
