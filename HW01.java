// Homework 01
// Abhinav Bassi
// CS 113 H02
// 31327046

import java.util.Scanner;
import java.text.DecimalFormat;
        
public class HW01 {
    
    public static void main(String[] args) {
        
        // 2.5
        
        double fahrenheittemp, celsiustemp;
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter Fahrenheit Temperature: ");
        fahrenheittemp = userinput.nextDouble();
        celsiustemp = ((fahrenheittemp - 32)*(5.0/9.0));
        System.out.println("Temperature in Celsius : " + celsiustemp);        
        
        // 2.6
        
        float kilometers, miles;
        System.out.print("Distance in miles: ");
        miles = userinput.nextFloat();
        kilometers = (miles * 1.60935f);
        System.out.println("Distance in kilometers: " + kilometers);
        
        // 2.8
        
        int hr, min, sec, totalsecs;
        System.out.print("Hours: ");
        hr = userinput.nextInt();
        System.out.print("Minutes: ");
        min = userinput.nextInt();
        System.out.print("Seconds: ");
        sec = userinput.nextInt();
        totalsecs = (sec + (60*min) + (3600*hr));
        System.out.println("Total seconds: " + totalsecs);
        
        // 2.9
        
        int userseconds, hours, minutes, seconds;
        System.out.print("Seconds: ");
        userseconds = userinput.nextInt();
        hours = userseconds/3600;
        minutes = (userseconds%3600)/60;
        seconds = (userseconds%3600)%60;
        System.out.println(hours + " Hours " + minutes + " Minutes " + seconds + " Seconds ");               
        
    }
    
}
