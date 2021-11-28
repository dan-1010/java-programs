
package javainterviewprograms;

import java.util.Scanner;


public class lcm {
    
    
    private int hcf(int a, int b)
    {
        int min,max,hcf;
        if(a<b)
        {
            min=a;
            max=b;
        }
        else 
            min=b;
            max=a;
        
        for(int i=min; i>=1;i--)
        {
            if((a%i==0)&&(b%i==0))
                    {
                        hcf=i;
                        return hcf;
                    }
        }
        return 0;
       
    }
    
    private int lcm2(int a, int b)
    {
        int hcf2,lcm,prod;
        hcf2= hcf(a, b);
        prod=a*b;
        System.out.println(prod);
        System.out.println(hcf2);
        lcm=prod/hcf2;
        return lcm;
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        lcm n= new lcm();
        int a,b;
        System.out.println("Enter first number =");
        a=sc.nextInt();
        System.out.println("Enter second number =");
        b=sc.nextInt();
        System.out.println("L.C.M of the two numbers is "+ n.lcm2(a, b));
        
    }
    
    
}
