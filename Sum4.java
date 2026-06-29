import java.util.*;
public class Sum4
{
public static void main(String[] args)
{
     int[] nums = { 2,2,2,2,2};
     int t = 8;

    List<List<Integer>> result = fourSum(nums,t);

   System.out.print(result);

} 
    static List<List<Integer>> fourSum(int[] nums, int target) {
         List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;

        // bubble sort


        for(int i = 0 ; i< n - 1 ; i ++)
        {
            for(int j = 0; j < n-1-i;j++)
            {
                if(nums[j] > nums[j + 1])
                {
                    int temp = nums[j];
                    nums[j] = nums[ j + 1];
                    nums[j+1]= temp;
                }
            }
        }
        


        for( int i = 0 ;i < n -3 ; i++)
        {
             if(   i > 0 && nums[i] == nums[ i - 1] )  
             {
                continue;
             }

             for(int j = i + 1 ; j< n - 2 ;j++)
             {
                if ( j > i + 1 && nums[j] == nums[j - 1])
                {
                    continue;
                }
             

            int  left = j + 1;
            int  right = n -1 ;



            while ( left < right )
            {
                long sum = (long)nums[i] + nums[j] +  nums[left] + nums[right];

                if( sum == target)
                {
                    List<Integer> triplet = new ArrayList<>();

                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);

                    ans.add(triplet);



                    while ( left < right && nums[left] == nums[left + 1])
                    {
                        left ++ ;
                    }

                    while ( left < right && nums[right] == nums[right - 1])
                    {
                        right -- ;
                    }

                    left ++ ;
                    right -- ;
                }
                else if ( sum < target)
                {
                    left ++ ;
                }
                else 
                {
                    right-- ;
                }
            }
        }
        }
        return ans;
    }
}