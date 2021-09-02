package practicePrograms;

public class StringPalindrome {

    public static boolean isPalindrome(String str)
    {
        int j=str.length()-1;
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(j-i))
            return false;
        }
        return  true;
    }

    public static void main(String args[])
    {
        System.out.println("shiva is Palindrome string:"+isPalindrome("shiva"));
        System.out.println("abcba is Palindrome string:"+isPalindrome("abccba"));

    }
}
