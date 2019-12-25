import java.util.ArrayList;
import java.util.Scanner;
public class Task61
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        do
        {
            System.out.println("Select option");
            System.out.println("1 --- Enter new String");
            System.out.println("2 --- Replace existing String");
            System.out.println("0 --- Quit");
            input = scanner.nextInt();
            if (input == 1)
            {
                System.out.print("Enter new string: ");
                words.add(scanner.next());
            }
            else if (input == 2)
            {
                System.out.print("Select index of String to replace: ");
                input = scanner.nextInt();
                System.out.print("Enter new String to replace " + words.get(input) + " : ");
                words.set(input, scanner.next());
                input = 1;
            }
            System.out.println(words);
        }
        while (input != 0);
    }
}
