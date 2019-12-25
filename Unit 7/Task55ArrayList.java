import java.util.Scanner;
import java.util.ArrayList;
public class Task55ArrayList
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 8; i++)
        {
            System.out.print("Enter String: ");
            words.add(scanner.next());
        }
        System.out.println("These Strings are longer than 5 letters:");
        for (int i = 0; i < 8; i++)
        {
            if ((words.get(i)).length() > 5)
                System.out.print(words.get(i) + " ");
        }
    }
}
