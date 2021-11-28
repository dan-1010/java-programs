
package javainterviewprograms;

import java.util.Scanner;

public class evenOdd {
    
    
    private void isevenodd(int x)
    {
        if(x%2==0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int num;
        evenOdd number = new evenOdd();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num= sc.nextInt();
        number.isevenodd(num);
        
        
        
    }
    
}
