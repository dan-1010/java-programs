
package stack;


public class stackImplementation {
    
    int array[]= new int[5];
    int top=-1;
    
    private boolean push(int x)
    {
        top++;
        array[top]=x;
        System.out.println("Element pushed into stack= "+x);
        return true;
    }
    
    private boolean pop()
    {
            if(top<0)
        {
            System.out.println("Stack is empty");
            return true;
        }
        int x =array[top--];
        System.out.println("Elemnt popped from the stack="+x);
        return true;
    }
    
    private boolean peek()
    {
          if(top<0)
        {
            System.out.println("Stack is empty");
            return true;
        }
        int x;
        System.out.println("Top most element in the stack ="+array[top]);
        return true;
    }
    
    
    public static void main(String args[])
    {
        stackImplementation stack = new stackImplementation();
        stack.push(50);
        stack.push(600);
        stack.push(107);
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.pop();
        stack.peek();
    }
    
}


