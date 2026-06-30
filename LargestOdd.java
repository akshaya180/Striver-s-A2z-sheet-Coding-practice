import java.util.*;
public class LargestOdd {

    public static void main(String[] args)
    {
         String s = "52";
         String result = largestOddNumber(s);
         System.out.print(result);
    }
    static String largestOddNumber(String num) {

         for(int i = num.length() - 1  ; i>=0 ; i--)
         {
            char ch = num.charAt(i);

            if( (ch - '0') % 2 != 0)
            {
                return num.substring( 0 , i + 1);
            }
         }
        
        return "" ;
        
    }
}