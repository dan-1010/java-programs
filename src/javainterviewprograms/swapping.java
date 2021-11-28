
package javainterviewprograms;

import java.util.Scanner;


public class swapping {
    
    private void swap(int a, int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
    
 
    public static void main(String[] args) {
        int a, b;
        swapping s= new swapping();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number");
        a=sc.nextInt();
        
        System.out.println("Enter second number");
        b=sc.nextInt();
        
        s.swap(a, b);
        
       
        
        
        
        
    }
}
