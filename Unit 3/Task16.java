import java.util.Scanner;
public class Task16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will tell you whether any positive integer you enter");
        System.out.println("is odd or even. You can enter as many as you like. Just enter a");
        System.out.println("negative integer to stop the program.");
        System.out.println("Please enter a POSITIVE integer, or enter a NEGATIVE integer to stop the program.");
        int a = sc.nextInt();
        while (a > -1)
        {
            if (a%2 == 0)
            {
                System.out.printf("%d is even. \n", a);
            }
            else if (a%2 == 1)
            {
                System.out.printf("%d is odd. \n", a);
            }
            System.out.println("Please enter a POSITIVE integer, or enter a NEGATIVE integer to stop the program.");
            a = sc.nextInt();
        }
    }
}
