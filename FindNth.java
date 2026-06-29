import java.util.*;
public class FindNth {
    public static void main(String[] args)
    {
        int N = 3;
        int M = 27;
        int r = NthRoot(N,M);
        System.out.print(r);

    }
    static  int NthRoot(int N, int M) {
        int low = 1;
        int high = M;

        while(low <= high)
        {
            int mid = low + ( high - low ) / 2;

            long value = 1;

            for(int i = 1; i<=N;i++)
            {
                value *= mid;

                if(value > M)
                {
                    break;
                }

            }

            if( value == M )
            {
                return mid;
            }
            else if ( value < M)
            {
                low = mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }
        return -1 ;
        
    }
}
