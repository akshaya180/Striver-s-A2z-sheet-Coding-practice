import java.util.*;
public class Insertion {
    public static void main(String[] args)
    {
        int nums[] = { 7 , 4, 3 , 5 , 1};
        int result[] = insertionSort(nums);

        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
    static int[] insertionSort(int[] nums) {

        int n = nums.length;

        for(int i=1;i<n;i++)
        {
            int key = nums[i];
            int j = i-1;
        

        while(j>=0 && nums[j] > key)
        {
            nums[j+1] = nums[j];
            j--;
        }
        nums[j+1] = key;
        

        }
        return nums;



    }
}