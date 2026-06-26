import java.util.*;
public class RecursiveInsertion {

    public static void main(String[] args)
    {
        int[] nums= {7,4,1,5,2};
        int[]  result = insertionSort(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(result[i] + " " );
        }
    }
    public static int[] insertionSort(int[] nums) {

        insert(nums,nums.length);
        return nums;
    }
    private static void insert(int[] nums,int n )
    {
        if(n<=1)
        {
            return;
        }

        insert(nums,n-1);

        int last = nums[n-1];
        int j = n-2;

        while(j>=0 && nums[j] > last)
        {
            nums[j+1]=nums[j];
            j--;
        }
            nums[j+1]=last;

    }

    }