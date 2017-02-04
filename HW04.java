// Homework 04
// Abhinav Bassi
// CS 113 H02
// 31327046

import java.util.Scanner;
import java.util.Random;

public class HW04 {
    
    public static void main(String[] args) {
           
        // 8.5
        
        double sum = 0, mean, variance = 0, stdDev;
        int bound, usernum, count = 0;
        int[] numlist = new int[50];
        Scanner userinput = new Scanner(System.in);
        System.out.print("Amount of numbers: ");
        bound = userinput.nextInt();
        Random randnum = new Random();
        for (int x = 0; x < bound; x++) {
            usernum = randnum.nextInt(100) + 1;
            numlist[x] = usernum;
            sum += usernum;
            count++;
        }
        mean = sum/count;
        System.out.println("Calculated mean: " + mean);
        for (int y = 0; y < bound; y++){
            variance += Math.pow((numlist[y] - mean),2);
        }
        stdDev = Math.sqrt(variance);
        System.out.println("Calculated standard deviation: " + stdDev);
    }    
}
