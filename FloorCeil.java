import java.util.*;
public class FloorCeil {
    public static void main(String[] args)
    {
        int[] nums ={3, 4, 4, 7, 8, 10};
        int  x= 5;
        int[] result = getFloorAndCeil(nums,x);

        for(int i = 0;i<result.length;i++)
        {
              System.out.print(result[i] + " " );
        }
    }
    static  int[] getFloorAndCeil(int[] nums, int x) {

        int floor = -1;
        int ceil = -1;

        // Find Floor
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] <= x) {
                floor = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Find Ceil
        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] >= x) {
                ceil = nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[] {floor, ceil};
    }
}