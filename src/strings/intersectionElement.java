/* intersection of elements in two array using hashset */
package strings;

import java.util.*;



public class intersectionElement {
    
    public static void main(String args[])
    {
        int arr1[]={2,5,7,8,0};
        int arr2[]={4,7,8,9,6};
        
        intersection(arr1,arr2);
        
        
        
    }

    private static void intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set= new HashSet();
        
        for(int i =0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        
        for(int i=0;i<arr2.length;i++)
        {
            if(set.contains(arr2[i]))
            {
                System.out.println(arr2[i]);
            }
        }
        
        
    }
        
    }
    
