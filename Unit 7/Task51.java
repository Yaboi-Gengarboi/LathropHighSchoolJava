import java.util.ArrayList;
import java.util.Scanner;
public class Task51
{
    public static void main (String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int cont = 1;
        numbers.add(8);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(4);
        while (cont == 1)
        {
            System.out.println(numbers);
            System.out.print("Select the index of an element to remove: ");
            cont = scanner.nextInt();
            if (numbers.size() == 0)
            {
                System.out.println("YOU REMOVED ALL OF THE ELEMENTS! WHAT'S WRONG WITH YOU?");
                cont = 0;
            }
            else if (cont > numbers.size() || cont < 0)
            {
                System.out.println("Out-of-bounds error.");
                cont = 1;
            }
            else
            {
                numbers.remove(cont);
                System.out.println(numbers);
                System.out.print("Enter 1 to continue.");
                cont = scanner.nextInt();
            }
        }
    }
}
