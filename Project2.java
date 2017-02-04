// Abhinav Bassi
// CS 113 H02
// 31327046

import java.util.Scanner;
import java.util.Random;

public class Project2 {

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter numer of loops: ");
        int loops = userinput.nextInt();
        double PI = calculatePI(loops);
        System.out.println("Calculated PI: " + PI); 
    }
    
    public static double calculatePI(int loops) {
        
        Random randnum = new Random();
        double PI, hits = 0.0;
        for (int i = 0; i <= loops; i++) {
            double x = randnum.nextDouble();
            double y = randnum.nextDouble();
            if (Math.pow((x-(0.5)),2) + Math.pow((y-(0.5)),2) <= (0.25)) {
                hits++;
            }
        }
        PI = (4.0 * (hits/(double)loops));
        
        return PI;
    }
    
}
