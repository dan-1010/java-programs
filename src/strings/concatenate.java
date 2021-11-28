
package strings;

import java.util.Scanner;


public class concatenate {
    
    
    private String concat(String a , String b){
        
        String c;
        c=a+b;
        return c;

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        concatenate s = new concatenate();
        String a,b,c;
        
        System.out.println("Enter Frist String = ");
        a=sc.nextLine();
        System.out.println("Enter Second String = ");
        b=sc.nextLine();
        
        c=s.concat(a, b);
        System.out.println("Concated string is = "+c);
    }
    
}
