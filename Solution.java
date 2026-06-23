import java.util.*;


public class Solution {

 

public static void main(String[] args)
{
    int numRows = 5;

    List<List<Integer>> result = generate(numRows);

    System.out.println(result);
}
     
    static  List<List<Integer>> generate(int numRows) {



        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < numRows; i++)
        {
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <= i; j++)
            {
                if(j == 0 || j == i)
                {
                    row.add(1);
                }
                else
                {
                    int value =
                        ans.get(i - 1).get(j - 1)
                        +
                        ans.get(i - 1).get(j);

                    row.add(value);
                }
            }

            ans.add(row);
        }

        return ans;
    }
}

        
