import java.util.*;
public class Findsquare {
    public static void main(String[] args)
    {
        int n = 36;
        int r = floorSqrt(n);
        System.out.print(r);
    }
    static  int floorSqrt(int n) {
        int low = 1;
        int high = n;
        int ans = 0;

        while(low <= high )
        {
            int mid = low + ( high - low ) / 2;
            long square = (long) mid * mid;


            if(square <= n)
            {
                ans = mid;

                low = mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }

       return ans;
      
    }
}
