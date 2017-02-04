// Homework 02
// Abhinav Bassi
// CS 113 H02
// 31327046

import java.util.Scanner;
import java.text.DecimalFormat;

public class HW02 {

    public static void main (String[] args) {
        
        // 3.5
        
        double radius, volume, surfacearea;
        Scanner userinput = new Scanner(System.in);
        System.out.print("Radius: ");
        radius = userinput.nextDouble();
        volume = ((4/3) * Math.PI * Math.pow(radius, 3));
        surfacearea = (4 * Math.PI * Math.pow(radius, 2));
        DecimalFormat fmt1 = new DecimalFormat("0.####");
        System.out.println("Volume: " + fmt1.format(volume));
        System.out.println("Surface Area: " + fmt1.format(surfacearea));
        
        // 3.6
        
        double a, b, c, s, area;
        System.out.print("First side: ");
        a = userinput.nextDouble();
        System.out.print("Second side: ");
        b = userinput.nextDouble();
        System.out.print("Third side: ");
        c = userinput.nextDouble();
        s = ((a + b + c) / 2);
        area = Math.sqrt((s) * (s-a) * (s-b) * (s-c));
        DecimalFormat fmt2 = new DecimalFormat("0.###");
        System.out.println("Area: " + fmt2.format(area));
        
        // 3.7
        
        for (int row = 1; row <= 12; row++) {
            for (int column = 1; column <= 12; column++)
                System.out.print(row * column + "\t");
        System.out.println();
        }
        
        // 3.9
        
        int count = 0;
        do {
            System.out.println(count + 1);
            count = count + 1;
        }
        while (count < 5);
            System.out.println("Done");  
         
    }

}

// 4.3

public class BoxTest {
    
    public static void main (String[] args) {

        Box box1 = new Box (2, 4, 6);
        Box box2 = new Box (3, 6, 9);
        Box box3 = new Box (4, 8, 12);
        
        System.out.println("Box 1: " + box1 );
        System.out.println("Box 2: " + box2 );
        System.out.println("Box 3: " + box3 );
        
        box1.setheight(3);
        box2.setwidth(7);
        box3.setdepth(13);
        
        System.out.println("Box 1: " + box1 );
        System.out.println("Box 2: " + box2 );
        System.out.println("Box 3: " + box3 );
        

    }

}

public class Box {
        
    private double h, w, d;
    private boolean full;
        
    public Box (double height, double width, double depth) {
        h = height;
        w = width;
        d = depth;
        full = false;
    }
        
    public void setheight(double value) {
        h = value;
    }
        
    public void setwidth(double value) {
        w = value;
    }
        
    public void setdepth(double value) {
        d = value;
    }
        
    public double getheight() {
        return h;
    }
        
    public double getwidth() {
        return w;
    }
        
    public double getdepth() {
        return d;
    }
        
    public String toString() {
        String result = ("Height: " + h + "\t Width: " + w 
                + "\t Depth: " + d);
        return result;
    }
        
}

// 4.6

public class Lights {
    
    public static void main (String[] args) {
        
        Bulb bulba = new Bulb();
        Bulb bulbb = new Bulb();
        Bulb bulbc = new Bulb();
        
        bulba.turnon();
        bulbb.turnon();
        bulbc.turnon();
        bulba.turnoff();
        
        System.out.println("Bulb A: " + bulba.getstatus());
        System.out.println("Bulb B: " + bulbb.getstatus());
        System.out.println("Bulb C: " + bulbc.getstatus());
        
    }
    
}

public class Bulb {
    
    private boolean status;
    private String answer;
    
    public Bulb () {
        status = false;
    }
    
    public boolean turnon() {
        status = true;
        return status;
    }
    
    public boolean turnoff() {
        status = false;
        return status;
    }
    
    public String getstatus() {
        if (status == true) {
            answer = "ON";
        }
        else {
            answer = "OFF";
        }
        return answer;
    }
    
}