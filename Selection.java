import java.util.*;
public class Selection {

    public static void main(String[] args)
    {
          int[] nums={7,4,1,5,2};
          int[] result = selectionSort(nums);
          for(int i = 0;i<nums.length;i++)
          {
          System.out.print(nums[i]);
          }

    }
    static  int[] selectionSort(int[] nums) {

        int n = nums.length;

        for(int i = 0 ;i < n-1 ; i++)
        {
            int minIndex = i;
            for(int j = i+1; j < n ;j++)
            {
               if(nums[j] < nums[minIndex])
               {
                minIndex=j;
               }

            }
            int temp=nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex]=temp;
        }

        return nums;
    }
}
