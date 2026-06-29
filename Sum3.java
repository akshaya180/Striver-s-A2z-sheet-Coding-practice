import java.util.*;
public class Sum3
{
public static void main(String[] args)
{
     int[] nums = { -1,0,1,2,-1,-4};

    List<List<Integer>> result = threeSum(nums);

   System.out.print(result);

} 
    static  List<List<Integer>> threeSum(int[] nums) {

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
        


        for( int i = 0 ;i < n -2 ; i++)
        {
             if(   i > 0 && nums[i] == nums[ i - 1] )  
             {
                continue;
             }

            int  left = i + 1;
            int  right = n -1 ;



            while ( left < right )
            {
                int sum = nums[i] + nums[left] + nums[right];

                if( sum == 0)
                {
                    List<Integer> triplet = new ArrayList<>();

                    triplet.add(nums[i]);
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
                else if ( sum < 0)
                {
                    left ++ ;
                }
                else 
                {
                    right-- ;
                }
            }
        }

        return ans;
    }
}
