import java.util.Scanner;
public class Task7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int A = sc.nextInt();
        System.out.println("Enter another integer");
        int B = sc.nextInt();
        if (A > B)
        {
            System.out.printf("%d is larger \n", A);
        }
        else if (A < B)
        {
            System.out.printf("%d is larger \n", B);
        }
        else
        {
            System.out.println("These numbers are equal");
        }
    }
}
