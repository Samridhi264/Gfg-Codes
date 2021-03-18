import java.util.Scanner;

class Main
{
    public static boolean Palindrome(String str)
    {
        StringBuilder rev=new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }
}
