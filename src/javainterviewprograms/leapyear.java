
package javainterviewprograms;

import java.util.Scanner;

public class leapyear {
    
    
    private boolean isleap(int a)
    {
        if(a%4==0)
        {
            if(a%100==0)
            {
                if(a%400==0)
                {
                    return true;
                }
                else
                    return false;
            }
            else
                return true;
            
        }
        else
            return false;
        
        
       
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        leapyear l = new leapyear();
        
        int a;
        boolean y;
        System.out.println("Enter a year");
        a=sc.nextInt();
        
        
        y=l.isleap(a);
        if(y==true)
        {
            System.out.println("It is a leap year");
        }
        else
            System.out.println("It is not a leap year");
    }
    
    
}
