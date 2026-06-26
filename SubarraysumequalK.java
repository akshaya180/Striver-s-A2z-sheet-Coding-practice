import java.util.*;
public class SubarraysumequalK {
    public static void main(String[] args)
    {
        int[] nums = {1,2,3};
        int k = 3;
        int result = subarraySum(nums,k);
        System.out.print(result);
    }
    static int subarraySum(int[] nums, int k) {

        if(nums.length == 0)
        {
            return 0;
        }
            int count = 0;
        for(int i =0;i<nums.length;i++)
        {
            int sum = 0;
            for(int j=i;j<nums.length;j++)
            {
                sum +=nums[j];

                if(sum==k)
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}