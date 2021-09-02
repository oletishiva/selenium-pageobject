package practicePrograms;

import java.util.HashSet;

public class TwoSum {

    public static boolean twosum(int[] arrayofelements,int sum)
    {
        HashSet<Integer> hset=new HashSet<Integer>();
        for(int i=0;i<arrayofelements.length-1;i++)
        {
            if(hset.contains(sum-arrayofelements[i])) {
                System.out.println(" The Pair Sum is:" + (sum - arrayofelements[i]) + "," + arrayofelements[i]);
                return true;
            }
            else
                hset.add(arrayofelements[i]);
        }
        return  false;
    }

   public static void main(String args[])
   {
       int[] arrayofElements={1,2,4,3,5,7,8,3,6};
       System.out.println(twosum(arrayofElements,11));
   }

}
