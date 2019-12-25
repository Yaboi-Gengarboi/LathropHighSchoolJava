import java.util.Scanner;
public class Task11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int A = sc.nextInt();
        int B = A;
        String X = "";
        if (A == 0)
        {
            System.out.println("0");
        }
        while (A > 0)
        {
            B = A%10;
            X = B + " " + X;
            A=A/10;
            if (A == 0)
            {
                System.out.println(X);
            }
        }
        if (A < 0)
        {
            A = A*-1;
            while (A > 0)
            {
                B = A%10;
                X = B + " " + X;
                A=A/10;
                if (A == 0)
                {
                    System.out.println(X);
                }
            }
        }
    }
}
