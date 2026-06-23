class Majority {

    public static void main(String[] args)
{
    int nums[] = {3,3,3};

    int result = majorityElement(nums);

    System.out.println(result);
}
    static  int majorityElement(int[] nums) {
        int count = 0;
        int majority = 0;

        for(int num : nums)
        {
            if(count == 0)
            {
                majority = num;
            }

          if(majority == num )
            {
                count ++;
            }
            else
            {
                count --;
            }
        }


        return majority;

        
        
    }
}