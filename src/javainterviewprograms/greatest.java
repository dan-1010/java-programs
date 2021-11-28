
package javainterviewprograms;

import java.util.Scanner;


public class greatest {
    
    
    private int great(int a,int b,int c)
    {
        int grt;
        if(a>b)
        {
            grt=a;
        }
        else
            grt=b;
        
        if(b<c)
            grt=c;
            
        return grt;
    }
    
    public static void main(String[] args) {
        greatest num = new greatest();
        Scanner sc= new Scanner(System.in);
        
        int a,b,c,great;
        
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        System.out.println("Enter third number");
        c=sc.nextInt();
        great= num.great(a, b, c);
        System.out.println("The greatest number is "+ great);
        
    }
}
