import java.util.*;
public class Countsubarrayxor {

    public static void main(String[] args)
    {
        int[] nums = {4,2,2,6,4};
        int k = 6;
        int result = subarraysWithXorK(nums,k);
        System.out.print(result);
    }
    static  int subarraysWithXorK(int[] nums, int k) {

        int count = 0;
        for(int i =0;i<nums.length;i++)
        {
            int xor = 0;

            for(int j=i;j<nums.length;j++)
            {
                xor = xor ^ nums[j];

                if(xor == k)
                {
                    count++;
                }
            }
        }
        return count;
      
    }
}