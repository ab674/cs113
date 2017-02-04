// Abhinav Bassi
// CS 113 H02
// 31327046

import java.util.Scanner;

public class Project3 {

    public static void main(String[] args) {
        
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter upperbound of numbers: ");
        int loops = userinput.nextInt();
        int[] numbers = new int[loops];
        for (int i = 0; i < loops; i++) {
            numbers[i] = i+1; 
        }
        sieve(numbers);
        goldbach(numbers);
        
    }
 
    public static void sieve(int[] array) {
        
        array[0] = 0;
        int loops = array.length;
        for (int i = 0; i <= Math.sqrt(loops); i++) {
            if (array[i] != 0) {
                for (int x = i; x <= loops-(i+2);) {
                    array[x+=array[i]] = 0;                  
                }
            }
        }
        System.out.println();
        System.out.println("All prime numbers less than " + loops + ":");
        for (int num : array) {
            if (num != 0) {
                System.out.println(num);
            }
        }
        System.out.println();
    }
    
    public static void goldbach(int[] array) {
        
        int loops = array.length;
        int totalprimes = 0;        
        for (int y : array) {
            if (y != 0) {
                totalprimes++;
            }
        }
        int primecount = 0;
        int[] primes = new int[totalprimes];
        for (int z = 0; z < loops; z++) {
            if (array[z] != 0) {
                primes[primecount] = array[z];
                primecount++;
            }
        }
        System.out.println("All even numbers between 4 and " + loops + ": ");
        for (int j = 4; j <= loops; j+=2) {
            boolean flag = false;
            for (int i = 0; i <= (primes.length-1); i++) {
                for (int k = (primes.length-1); k >= 0; k--) {
                    if (j == (primes[i] + primes[k])) {
                        System.out.println(j + " = " + primes[i] + " + "
                                + primes[k]);
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
        }   
    }
}
