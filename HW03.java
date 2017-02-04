// Homework 03
// Abhinav Bassi
// CS 113 H02
// 31327046

import java.util.Scanner;

public class HW03 {

    public static void main(String[] args) {

        // 5.2
        
        int year;
        boolean answer = false;
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = userinput.nextInt();
        while (year != 0) {
            while (year < 1582) {
                System.out.println("INVALID YEAR");
                System.out.print("Enter a year: ");
                year = userinput.nextInt();
            }
            if (year%4 == 0 && year%100 != 0) {
                answer = true;
            }
            else {
                if (year%400 == 0) {
                    answer = true;
                }
            }
            if (answer == true) {
                System.out.println(year + " is a leap year.");
                System.out.println("Enter 0 to exit.");
            }
            else {
                System.out.println(year + " is not a leap year.");
                System.out.println("Enter 0 to exit.");
            }
            System.out.print("Enter a year: ");
            year = userinput.nextInt();
        }
        
        // 5.4
        
        String text;
        int length, cursor = 0;
        char letter;
        System.out.print("Enter text: ");
        text = userinput.nextLine();
        length = text.length();
        for (int count = 0; count < length; count++) {
            letter = text.charAt(cursor);
            System.out.println(letter);
            cursor++;
        }
        
        // Problem 1
        
        int sum = 0;
        for (int count = 0; count < 1000; count++) {
            if (count%3 == 0 || count%5 == 0) {
                sum += count;
            }
            if (count == 999) {
                System.out.println(sum);
            }
        }

    }
    
}
