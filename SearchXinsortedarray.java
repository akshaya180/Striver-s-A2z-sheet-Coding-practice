import java.util.*;
public class SearchXinsortedarray {
    public static void main(String[] args)
    {
        int[] nums = {1,2,4,7,9};
        int t = 9;
        int result = search(nums,t);
        System.out.print(result);
    }
    static  int search(int[] nums, int target) {

        if(nums.length == 0)
        {
            return 0;
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}