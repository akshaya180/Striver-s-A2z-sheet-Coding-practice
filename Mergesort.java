import java.util.*;
public class Mergesort {
    public static void main(String[] args)
    {
        int[] n1 = { 1,2,3,0,0,0};
        int[] n2 = { 2,5,6};
        int m = 3;
        int n = 3;

         merge(n1,m,n2,n);
         System.out.print(Arrays.toString(n1));

        
    }
    static  void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m -1 ;
        int j = n - 1;
        int k = n + m - 1;

        while ( i>=0 && j>=0)
        {
            if(nums1[i] > nums2[j])
            {
                nums1[k] = nums1[i];
                i--;
            }
            else 
            {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while( j>=0)
        {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}