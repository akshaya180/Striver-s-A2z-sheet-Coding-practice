
import java.util.*;
public class LongestConsecutive {
    public static void main(String[] args)
    {
        int[] nums = {100,4,200,1,3,2};

        int result = longestConsecutive(nums);

        System.out.print(result);
    }
    static  int longestConsecutive(int[] nums) {

        Arrays.sort(nums);

        int maxlen = 1;
        int count = 1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] == nums[i-1])
            {
                continue;
            }
            if(nums[i] == nums[i-1]+1)
            {
                count++;
            }
            else
            {
                count=1;

            }
            if(count > maxlen)
            {
                maxlen = count;
            }
        }
        return maxlen;
    }
}