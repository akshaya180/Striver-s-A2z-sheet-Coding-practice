import java.util.*;
public class RecursiveBubble
{
    public static void main(String[] args)
    {
        int nums[] = {4,1,5,6,2};

        bubble(nums,nums.length);

        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i] + " " );
        }
    }

    static void bubble(int[] nums,int n )

    {
         if(n==1)
         {
            return;
         }

         for(int i =0;i<n-1;i++)
         {
            if(nums[i] > nums[i+1])
            {
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
         }


         bubble(nums,n-1);
    }
}