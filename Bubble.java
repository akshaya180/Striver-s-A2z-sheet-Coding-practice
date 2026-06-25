import java.util.*;
public class Bubble {
    public static void main(String[] args)
    {
        int nums[] = {7,4,1,5,3};
        int result[] = bubbleSort(nums);
        for(int i = 0 ; i < nums.length ; i++)
        {
        System.out.print(result[i] + " ");
        }
    }
    static  int[] bubbleSort(int[] nums) {
        int n=nums.length;

        for(int i = 0 ; i < n -1 ; i++)
        {
            for(int j = 0 ; j< n-i-1; j++)
            {
                if(nums[j] > nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;

    }
}