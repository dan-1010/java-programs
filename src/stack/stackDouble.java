
package stack;

import java.security.spec.NamedParameterSpec;


public class stackDouble {
    int size;
    int top1,top2;
    int array[];
     public stackDouble(int size){
         this.size=size;
         array=new int[size];
         top1=-1;
         top2=size;
         }
     private void push1(int a)
     {
         if(top1<top2)
         {
         top1++;
         array[top1]=a;
         System.out.println("Inserted element is "+ a);
         }
         else{
             System.out.println("stack overflowed");
             System.exit(1);
         }            
     }
     
     private void push2(int b)
     {
         if(top1<top2-1)
         {
             top2--;
             array[top2]=b;
             System.out.println("Inserted Element is "+b);
         }
         else
         {
             System.out.println("Stack Overflowed");
             System.exit(1);
         }
     }
     
     private int pop1()
     {
         if(top1>=0)
         {
             int x= array[top1];
             System.out.println("The popped element is "+x);
             top1--;
             return x; 
         }
         else{
             System.out.println("Stack Underflow ");
             System.exit(1);
         }
         return 0;
     }
     
     private int pop2()
     {
         if(top2<size)
         {
             int x =array[top2];
             System.out.println("The popped element is "+x);
             top2--;
             return x;
         }
         else{
             System.out.println("Stack overflowed");
             System.exit(1);
         }
         return 0;
     }
    
    public static void main(String[] args) {
        stackDouble s= new stackDouble(10);
        s.push1(10);
        s.push1(17);
        s.push1(56);
        s.pop1();
        s.push2(56);
        s.push2(23);
        s.push2(78);
        s.pop2();
                
    }
}
