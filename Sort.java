public class Sort {


    public static void main(String[] args)
    {
        int[] nums = {0,1,2,0,0,1};
        sortZeroOneTwo(nums);


        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i] + " ");
        }
    }


    static  void sortZeroOneTwo(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;


                low++;
                mid++;
            }

            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high]= temp;

                high--;
            }
        }



       
    }




    
}