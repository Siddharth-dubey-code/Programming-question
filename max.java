package JAVA.Functions;

public class max {
    public static int Max(int a, int b, int c) {
       if(a>=b && a>=c) return a;
       else if (b>=a && b>=c) return b;
       else return c; 
        
       } 
       public static void main(String[] args) {
        System.out.println(Max(4,2,9));
       }
    }
    

