// Abhinav Bassi
// CS 113 H02
// 31327046

public class Rational extends Number implements Comparable<Rational> {

    public Rational(int num, int denom) {

        this.num = num;
        this.denom = denom;
    }

    public Rational add(Rational o) {
        
        newnum = ((num*o.denom)+(o.num*denom));
        newdenom = (denom*o.denom);
        commondivisor = gcd(newnum, newdenom);
        
        return new Rational((newnum/commondivisor), (newdenom/commondivisor));
    }
    
    public int compareTo(Rational o) {
        
        int left = (num*o.denom);
        int right = (o.num*denom);
        if (right > left) {
            return -1;
        }
        if (right < left) {
            return 1;
        }
        
        return 0;
    }

    public Rational div(Rational o) {

        Rational flip = o.reciprocal();
        newnum = (num * flip.num);
        newdenom = (denom * flip.denom);
        commondivisor = gcd(newnum, newdenom);       

        return new Rational((newnum/commondivisor), (newdenom/commondivisor));
    }

    public double doubleValue() {
        
        return ((double)num/(double)denom);
    }
    
    public float floatValue() {
        
        return ((float)num/(float)denom);
    }
    
    private int gcd(int n, int m) {
      
        if(n>m) {
            int tempvalue = m;
            m = n;
            n = tempvalue;
        }
        while(n != 0) {
            r = m % n;
            m = n;
            n = r; 
        }
      
        return m;
    }
    
    public int intValue() {
        
        return ((int)num/(int)denom);
    }
    
    public long longValue() {
        
        return ((long)num/(long)denom);
    }
    
    public Rational mul(Rational o) {
        
        newnum = (num*o.num);
        newdenom = (denom*o.denom);
        commondivisor = gcd(newnum, newdenom);
      
        return new Rational((newnum/commondivisor), (newdenom/commondivisor));
    }

    private Rational reciprocal() {

        return new Rational(denom, num);
    }
    
    public Rational sub(Rational o) {
        
        newnum = ((num*o.denom)-(o.num*denom));
        newdenom = (denom*o.denom);
        commondivisor = gcd(newnum, newdenom);

        return new Rational((newnum/commondivisor), (newdenom/commondivisor));
    }

    public String toString() {

        return "(" + (denom < 0.0 ? -num : num) + "/" + (denom < 0.0 ? -denom : 
                denom) + ")";
    }

    private int num, newnum;
    private int denom, newdenom;
    private int m, n, r, commondivisor;
}