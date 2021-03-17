import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int n=str.length()-1;
        int i=0;
        while(i<n)
        {
            if(str.charAt(i)!=str.charAt(n))
            {
                System.out.print("No not a palnidrome");
                return ;
            }
            else
            {
                i++;
                n--;
            }
        }
        System.out.print("Yes");
    }
}
