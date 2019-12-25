import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Task60
{
    public static void sortList(ArrayList<Integer> list)
    {
        int c = list.size();
        int[] tempArray = new int[c];
        for (int i = 0; i < c; i++)
            tempArray[i] = list.get(i);
        Arrays.sort(tempArray);
        for (int i = 0; i < c; i++)
            list.set(i, tempArray[i]);
    }
    public static void main (String[] args)
    {
        int input = 1;
        int a, b;
        ArrayList<Integer> ints = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ArrayList created. Empty.");
        do
        {
            System.out.println("Select an option");
            System.out.println("1 --- Add integer");
            System.out.println("2 --- Remove integer");
            System.out.println("3 --- Replace integer");
            System.out.println("0 --- Quit");
            input = scanner.nextInt();
            if (input == 1)
            {
                System.out.print("Enter an integer: ");
                ints.add(scanner.nextInt());
            }
            else if (input == 2)
            {
                if (ints.size() > 0)
                {
                    System.out.print("Enter index of element to remove: ");
                    ints.remove(scanner.nextInt());
                }
                else
                {
                    System.out.println("This array has no elements");
                }
            }
            else if (input == 3)
            {
                System.out.print("Enter index of element to replace: ");
                a = scanner.nextInt();
                System.out.print("Enter new integer to replace " + ints.get(a) + " : ");
                b = scanner.nextInt();
                ints.set(a, b);
            }
            sortList(ints);
            System.out.println(ints);
        }
        while (input != 0);
    }
}