import java.util.*;
public class LongestwithsumK{

    public static void main(String[] args)
    {
        int[] nums = {10,7,2,10,5};
        int k = 20;

        int result = longestSubarray(nums , k);
        System.out.print(result);

        }
    static  int longestSubarray(int[] nums, int k) {
        int maxLen = 0;
        for(int i =0;i<nums.length;i++)
        {
            int sum = 0;


            for(int j=i;j<nums.length;j++)
            {
                sum += nums[j];

                if(sum == k )
                {
                    maxLen = Math.max(maxLen , j -i + 1);
                }
            }
        }

        return maxLen;
       
    }
}