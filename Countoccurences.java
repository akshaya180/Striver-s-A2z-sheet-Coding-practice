import java.util.*;
public class Countoccurences {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,4,4,};
        int t = 4;
        int result = countOccurrences(arr,t);
        System.out.print(result);
    }
    static int countOccurrences(int[] arr, int target) {

       int count = 0; 

        for(int i = 0 ;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                count ++ ;

            }
           
        }
        // Your code goes here
        return count ;
    }
}
