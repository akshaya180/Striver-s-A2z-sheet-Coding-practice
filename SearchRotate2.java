import java.util.*;
public class SearchRotate2 {
    public static void main(String[] args)
    {
        int[] nums = {2,5,6,0,0,1,2};
        int t = 6;
        boolean r = search(nums,t);
        System.out.print(r);
    }
    static boolean search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while(low <= high)
        {
            int mid = ( low + high ) /2 ;

            if(nums[mid]==target)
            {
                return true;
            }


            if(nums[mid] == nums[low] && nums[mid]==nums[high])
            {
                low ++;
                high --;
                continue;
            }

            if(nums[low] <= nums[mid])
            {
            if(target >= nums[low] && target < nums[mid])
            {
                high = mid -1;
            }
            else
            {
                low = mid + 1;
            }
            }

                 else {

                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
    
        return false;
    }
}