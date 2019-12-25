import java.util.Scanner;
public class Task55Array
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[8];
        for (int i = 0; i < 8; i++)
        {
            System.out.print("Enter String: ");
            words[i] = scanner.next();
        }
        System.out.println("These Strings are longer than 5 letters:");
        for (int i = 0; i < 8; i++)
        {
            if (words[i].length() > 5)
                System.out.print(words[i] + " ");
        }
    }
}
