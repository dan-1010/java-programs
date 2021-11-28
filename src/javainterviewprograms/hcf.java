
package javainterviewprograms;
import java.util.Scanner;


public class hcf {
    
    
    private int  hcf2(int a, int b)
    {
        int min,max,hcf;
        if(a<b)
        {
            min=a;
            max=b;
        }
        else
        {
            min=b;
            max=a;
        }
        for(int i= min;i>=1;i--)
        {
            if((min%i==0)&&(max%i==0)){
                hcf=i;
                return hcf;
                
            }
            
        }
        return 0;
        
        
    }
    
    public static void main(String[] args) {
        hcf h= new hcf();
        Scanner sc = new Scanner(System.in);
        
        int a,b,hcf;
        
        System.out.println(" Enter first number ");
        a=sc.nextInt();
        System.out.println("Enter the Second number ");
        b=sc.nextInt();
        
       hcf= h.hcf2(a, b);
        System.out.println(" H.C.F of the numbers is "+hcf);
        
        
    }
    
}
