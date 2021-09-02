package practicePrograms;

public class NumberPalindrome {

    public static  boolean isNumberPalindrome(int num)
    {
      int originalNumber=num;
      int remainder,reverseNumber=0;

      if(num<=0)
          return false;
      while(num>0)
      {
          remainder=num%10;
          reverseNumber=(reverseNumber*10)+remainder;
          num=num/10;
      }
      if(originalNumber==reverseNumber)
          return  true;
      else
          return false;

    }
    public static void main(String args[])
    {
        System.out.println("Is number 123 is palindrome: " + isNumberPalindrome(123));
        System.out.println("Is number 121 is palindrome: " + isNumberPalindrome(121));
        System.out.println("Is number 321 is palindrome: " + isNumberPalindrome(321));
    }
}
