import java.util.Scanner;
public class Replace
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Line");
        String line = sc.next();
        System.out.println("Enter Text to Replace");
        String look = sc.next();
        System.out.println("Enter Text to Replace With");
        String replace = sc.next();
        int x = line.length();
        int y = look.length();
        int z = replace.length();
        int space = 0;
        for (int i = 0; i < z; i++)
        {
            if (line.substring(i,i+y).equals(look))
            {
                space = space + (z-y);
            }
        }
    }
}
