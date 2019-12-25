import java.util.Scanner;
public class Task57Array
{
    public static void main (String[] args)
    {
        int[] randInt = new int[10];
        for (int i = 0; i < 10; i++)
            randInt[i] = (int)(Math.floor(20*Math.random()));
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
            System.out.print(randInt[i] + " ");
        System.out.println();
        boolean cont = true;
        int el = 0;
        while (cont == true)
        {
            System.out.print("Enter the index of an element to replace: ");
            el = scanner.nextInt();
            System.out.println("You selected " + randInt[el]);
            System.out.print("Enter a new element to replace " + randInt[el] + ": ");
            randInt[el] = scanner.nextInt();
            for (int i = 0; i < 10; i++)
                System.out.print(randInt[i] + " ");
            System.out.println();
            System.out.print("Would you like to continue? Type YES to continue. ");
            cont = false;
            if (scanner.next().equals("YES"))
                cont = true;
        }
    }
}
