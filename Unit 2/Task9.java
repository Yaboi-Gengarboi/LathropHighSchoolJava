import java.util.Scanner;
public class Task9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int A = sc.nextInt();
        if (A%2 == 0)
        {
            System.out.println("This number is even.");
        }
        else if (A%2 == 1)
        {
            System.out.println("This number is odd.");
        }
    }
}
