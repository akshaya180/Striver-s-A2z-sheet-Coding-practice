import java.util.*;
public class UpperBound {
    public static void main(String[] args)
    {
        int[] nums={1,2,2,3};
        int x = 2;
        int result = upperBound(nums,2);
        System.out.print(result);
    }
    static int upperBound(int[] nums, int x) {

    
       int low=0;
       int high = nums.length-1;
       int ans=nums.length;


       while(low <= high)
       {
        int mid = (low + high) / 2;
        if(nums[mid] >  x)
        {
            ans = mid;
            high = mid -1;
        }
        else
        {
            low = mid + 1;
        }
       }

       return ans;
     }
}


