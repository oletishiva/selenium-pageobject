package practicePrograms;

public class MaxConsecutiveTimes {

    public static int maxconsecutive(int[] a)
    {
        int counter=0;
        int maxConsecutiveTimes=0;
        int com=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                counter++;
            }
            else {
                if (maxConsecutiveTimes < counter + 1) {
                    maxConsecutiveTimes = counter + 1;
                }
                counter = 0;
            }
        }
        return maxConsecutiveTimes;
    }

    public static void main(String args[])
    {
        int[] a={1,1,0,1,1,0,1,1};
        System.out.println(maxconsecutive(a));
    }
}
