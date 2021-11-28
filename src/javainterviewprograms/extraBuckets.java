
package javainterviewprograms;


public class extraBuckets {
    

 public static int getBucketCount(double width,double height,double areaPerBucket, double extraBuckets)
    {
        
        if(((width<=0)||(height<=0))||((areaPerBucket<=0)||(extraBuckets<=0)))
        return -1;
        
        else return 1;
    }
    
 
    public static void main(String[] args) {
        
        int a;
        a=getBucketCount(-1, 2.5, 78, 0);
        System.out.println(a);
        
    }

}
