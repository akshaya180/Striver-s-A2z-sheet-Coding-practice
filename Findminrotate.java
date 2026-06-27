import java.util.*;
public class Findminrotate {
    public static void main(String[] args)
    {
        int[] nums = { 3,4,5,1,2};
        int r = findMin(nums);
        System.out.print(r);
    }
    static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1; 
        int ans = Integer.MAX_VALUE;

        while(low <= high)

    {
        int mid = (low + high) / 2;

        if(nums[low] <= nums[mid])
        {
            ans=Math.min(ans,nums[low]);
            low = mid + 1;
        }
        else
        {
            ans=Math.min(ans,nums[mid]);
            high = mid - 1;
        }
    }
        return ans;
    }
}