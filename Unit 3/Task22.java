import java.util.Scanner;
public class Task22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive integer between 1 and 9");
        int a = sc.nextInt();
        int b;
        int c;
        if (a < 1 || a > 9)
        {
            System.out.println("ERROR: NUMBER ENTERED IS NOT IN BETWEEN 1 AND 9");
        }
        else
        {
            for (int i = 1; i <= a; i++)
            {
                for (int p = 1; p <= a; p++)
                {
                    b = (p%2);
                    if (i%2 == 1)
                    {
                        System.out.print(b);
                    }
                    else
                    {
                        if (b == 1)
                        {
                            b = 0;
                        }
                        else
                        {
                            b = 1;
                        }
                        System.out.print(b);
                    }
                }
                System.out.println();
            }
        }
    }
}
