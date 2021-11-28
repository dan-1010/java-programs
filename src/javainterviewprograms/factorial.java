
package javainterviewprograms;

import java.util.Scanner;


public class factorial {
    
    
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int a,prod;
        prod=1;
        System.out.println("Enter a number ");
        a =sc.nextInt();
        
        
        for(int i=a;i>1;i--)
        {
            prod=prod*i;
            System.out.println(prod);
        }
        
    }
    
}
