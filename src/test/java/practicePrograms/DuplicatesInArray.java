package practicePrograms;

import java.util.HashMap;

public class DuplicatesInArray {
    public static void main(String args[])
    {
        int[] arrayofelements={1,2,4,4,5,6,3,4,5,7,8,2,7};
        HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
        for(int x:arrayofelements)
        {
            if(!h.containsKey(x))
                h.put(x,1);
            else
                h.put(x,h.get(x)+1);
        }
        System.out.println(h);
        for(Integer x:h.keySet())
        {
            if(h.get(x)>1)
                System.out.println("duplicate element is:"+x);
        }
    }
}
