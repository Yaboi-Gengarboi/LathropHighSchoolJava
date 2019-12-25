import java.util.Scanner;
import java.util.ArrayList;
public class Task57ArrayList
{
    public static void main (String[] args)
    {
        ArrayList<Integer> randInt = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            randInt.add((int)(Math.floor(20*Math.random())));
        Scanner scanner = new Scanner(System.in);
        System.out.println(randInt);
        boolean cont = true;
        int el = 0;
        while (cont == true)
        {
            System.out.print("Enter the index of an element to replace: ");
            el = scanner.nextInt();
            System.out.println("You selected " + randInt.get(el));
            System.out.print("Enter a new element to replace " + randInt.get(el) + ": ");
            randInt.set(el,scanner.nextInt());
            System.out.println(randInt);
            System.out.print("Would you like to continue? Type YES to continue. ");
            cont = false;
            if (scanner.next().equals("YES"))
                cont = true;
        }
    }
}
