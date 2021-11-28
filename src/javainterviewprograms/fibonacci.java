
package javainterviewprograms;

import java.util.Scanner;


public class fibonacci {
    
    /*private void fibonacci(int a)
    {
        int first,second,sum;
        first=0;
        second=1;
        for(int i=2;i<a;i++ )
        {
            sum= first+second;
            System.out.print(sum);
            first=second;
            second=sum;
            
        }
    }*/
    public static void main(String[] args) {
        
        int num;
        int first,second,sum;
        first=0;
        second=1;
        
        fibonacci fib = new fibonacci();
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the limit ");
        num=sc.nextInt();
       for(int i=0;i<num;i++ )
        {
            if(i<2)
                System.out.print(i+" ");
            else{
            sum= first+second;
            System.out.print(sum + " ");
            first=second;
            second=sum;
            }
        }
        
        
        
        
         
    }
    
}
