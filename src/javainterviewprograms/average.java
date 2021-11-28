
package javainterviewprograms;

import java.util.Scanner;


public class average {
    
    private float avg(int a, int b)
    {
       
        float x,y,avg;
         x= (float)a;
         y= (float)b;
         
         avg=(x+y)/2;
         
         return avg;
    
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        average av= new average();
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        
        System.out.println("Average of the numbers = "+ av.avg(a,b) );
       
        
    }
}
