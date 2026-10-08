
import java.util.Scanner;


public class Unitity {
    
    /**
     * init Scanner with field private ensure safely.
     */
    private static final Scanner sc  = new Scanner(System.in);
    
  /**
   * 
   * @param size is size of graph.
   * @return A valid positive integer.
   */
    public static int checkInput1(String message,int size){
       int number;
       String input; 
        while (true) {
            try {   
                System.out.println(message);
                input = sc.nextLine().trim();
                number = Integer.parseInt(input);
                if (number > 0 && number < size) {
                    return number;
                } else {
                    System.err.println("Input must be greater  than 0 and less than "+size);
                }
            } catch (NumberFormatException e) {
                System.err.println("Input must be an Integer!");
            }
        }
    }
    
     /**
   * 
   * @param size is size of graph.
   * @return A valid positive integer.
   */
    public static int checkInput2(String message,int size){
       int number;
       String input; 
        while (true) {
            try {   
                 System.out.println(message);
                input = sc.nextLine().trim();
                number = Integer.parseInt(input);
                if (number > 0 && number < size) {
                    return number;
                } else {
                    System.err.println("Input must be greater  than 0 and less than "+size);
                }
            } catch (NumberFormatException e) {
                System.err.println("Input must be an Integer!");
            }
        }
    }
}
