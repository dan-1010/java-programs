/* occurence of letter in a string */
package strings;
 import java.util.*;

public class occurenceString {
    
    
   
    public static void main(String args[]){
        
        String str,str1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        str=sc.nextLine();
        int initial_length=str.length();
        System.out.println("Enter a character");
        str1=sc.next();
        str=str.replace(str1, "");
        int final_length=str.length();
        System.out.println("Occurence of the character "+str1+" ="+(initial_length-final_length));
        
        
        
    }
    
    
}
