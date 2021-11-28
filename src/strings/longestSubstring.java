/* porgram to find logest substring in a given string using HashSet */
package strings;

import java.util.HashSet;

public class longestSubstring {
    
    public static void main(String args[])
    {
        String s,l;
        s="abcdabcde";
        l=longestSub(s);
        System.out.print(l);
        
        
    }

    private static String longestSub(String s) {
        String longtillnow="";
        String longoverall="";
        HashSet<Character> set = new HashSet();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(set.contains(ch))
            {
                longtillnow="";
                set.clear();
            }
            set.add(ch);
            longtillnow+=ch;
            
            if(longtillnow.length()>longoverall.length())
            {
                longoverall=longtillnow;
            }
            
        }
        return longoverall;
        
    }
    
}
