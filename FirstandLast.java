import java.util.*;
public class FirstandLast {
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,8,8,9,10};
        int t = 8;
        int[] result= searchRange(nums,t);
        for(int i =0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
    static  int[] searchRange(int[] nums, int target) {

        int first = firstposition(nums,target);
        int last = lastposition(nums,target);

        return new int[] {first,last};
    }
    static  int firstposition(int[] nums,int target)
    {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(nums[mid] == target)
            {
                ans = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }

        }

        return ans;
    }
    static  int lastposition(int[] nums,int target)
    {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low <=high)
        {
            int mid = (low + high)/2;

            if(nums[mid]==target)
            {
                ans= mid;
                low = low + 1;
            }
            else if(nums[mid] < target)
            {
                low = low + 1;
            }
            else
            {
                high = high - 1;
            }
        }
        return ans;
    }




        
    }
