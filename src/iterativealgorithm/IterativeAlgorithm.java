/*
 * Developed at Kristianstad University
 * URL: http://www.hkr.se
 * Programme: Bachelor Programme in Software Development
 */
package iterativealgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This iterative algorithm will show the first m terms of the following number sequence:
 * t(n)= t(n-1) + 6*t(n-2)+ 5*n 
 * 
 * It is created as a part of the university course Discrete Mathematics for Computing
 * 
 * @author Halil Radogoshi <halil.radogoshi0002@stud.hkr.se>
 * <www.halilradogoshi.com>
 * 
 */
public class IterativeAlgorithm {

    static BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
    
    //Declare variables
    private static int v = 1; //t(n-2)
    private static int t = 1; //t(n-1)
    private static int n = 3; //t(n) where n>=3
    private static int m; //user input for length of iteration

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        System.out.print("Enter the number of iterations: ");
        m = Integer.parseInt(br.readLine());
        
        System.out.println("t(1)=1");
        System.out.println("t(2)=1");
        
        while (n <= m) {
            int u;
            u = t + 6 * v + 5 * n;
            v = t;
            t = u;
            System.out.println("t(" + n + ")=" + t);
            n++;
        }
    }

}
