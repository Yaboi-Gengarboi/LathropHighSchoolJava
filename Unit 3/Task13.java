import java.util.Scanner;
public class Task13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive integer between 2 and 20");
        int a = sc.nextInt();
        int b, c, d, e, f;
        if (a > 20)
        {
            System.out.println("ERROR: NUMBER ENTERED IS GREATER THAN 20");
        }
        else if (a < 2)
        {
            System.out.println("ERROR: NUMBER ENTERED IS LESS THAN 2");
        }
        else
        {
            System.out.println("Prime Factors: ");
            if (a % 2 == 0)
            {
                System.out.print("2 ");
            }
            if (a % 3 == 0)
            {
                System.out.print("3 ");
            }
            if (a % 5 == 0)
            {
               System.out.print("5 ");
            }
            if (a % 7 == 0)
            {
               System.out.print("7 ");
            }
            if (a % 11 == 0)
            {
                System.out.println("11");
            }
            if (a % 13 == 0)
            {
                System.out.println("13");
            }
            if (a % 17 == 0)
            {
                System.out.println("17");
            }
            if (a % 19 == 0)
            {
                System.out.println("19");
            }
        }
    }
}