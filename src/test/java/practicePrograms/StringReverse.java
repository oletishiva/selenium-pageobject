package practicePrograms;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class StringReverse {

    public static String reverseString(String str)
    {
        StringBuilder reverseString=new StringBuilder();
        String[] words=str.split(" ");
        for(int i=words.length-1;i>=0;i--)
        {
            reverseString.append(words[i]+" ");
        }
        return  reverseString.toString();
    }



    public static void main(String args[])
    {
        String test1="this is shiva oleti";
        System.out.println(reverseString(test1));
    }
}
