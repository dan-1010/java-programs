/*this is program to check the occurence of all the letters in a given string */
package strings;


public class panagramExample {
    
   
    public static void main(String args[]){
        System.out.println("Hello");
        String s = "The quick brown fox jumps over the lazy dog";
        
        System.out.println(isPanagram(s));
        
    }

    private static boolean isPanagram(String a) {
        String b =a.toLowerCase();
        
        if(b.length()<26){
            return false;
        }
        else{
        for(char c ='a';c <='z';c++){
            if(b.indexOf(c)<0){
                return false;
            }
        }
        }
        return true;
        
        
      
    }
    
}
