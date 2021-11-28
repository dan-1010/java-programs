
package javainterviewprograms;

import java.math.*;
import java.util.Scanner;


public class armstrongNumber {
    
    private int order(int a)
    {
        int n=0;
        while(a!=0)
        {
            a=a/10;
            ++n;
        }
        return n;
    }
    
    private boolean armStrong(int a)
    {
        int x,last,temp;
        int sum=0;
        temp= a;
        x=order(a);
        while (temp>0) {
            last=temp%10;
            sum=sum+ (int)Math.pow((double)last,(double)x);
            temp=temp/10;
        }
        
        if (a==sum){
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void main(String[] args) {
        armstrongNumber num = new armstrongNumber();
        int a;
        boolean b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit ");
        a= s.nextInt();
        for(int i =0;i<=a;i++){
        if(num.armStrong(i))
        {
            System.out.println(i+" ");
        }
            }
}
}
    
    
   /* private boolean armStrong(int n)
    {
        int 
    }*/
  


    
