import java.util.*;
public class Unionoftowsortedarray {

    public static void main(String[] args)
    {
        int[] nums1={1,2,3,4,5};
        int[] nums2={1,2,7};

        int[] result = unionArray(nums1,nums2);

        for(int i=0;i <result.length;i++)
        {
            System.out.print(result[i] + "  ");
        }
    }
    static  int[] unionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        ArrayList<Integer> union = new ArrayList<>();

        int i =0;
        int j =0;

        while(i < n1 && j < n2)
        {
            if( i > 0 && nums1[i] == nums1[i-1])
            {
                i++;
                continue;
            }

            if( j > 0 && nums2[j] == nums2[j-1])
            {
                j++;
                continue;
            }

            if(nums1[i] < nums2[j])
            {
                union.add(nums1[i]);
                i++;
            }
            else if(nums2[j] < nums1[i])
            {
                union.add(nums2[j]);
                j++;
            }
            else
            {
                union.add(nums1[i]);
                i++;
                j++;

            }
        }
        
        while( i < n1)
        {
            if(i==0 || nums1[i]!=nums1[i-1])
            {
                union.add(nums1[i]);
            }
            i++;
        }

        while(j<n2)
        {
            if(j==0 || nums2[j]!=nums2[j-1])
            {
                union.add(nums2[j]);

            }
            j++;
        }

        int[] result = new int[union.size()];
        for(int k =0;k<union.size();k++)
        {
            result[k] = union.get(k);
        }
        return result;
    }
}