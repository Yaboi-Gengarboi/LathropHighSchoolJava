import java.util.Scanner;
public class Task17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        int sum = 0;
        for (int i = 0;i < 7;i++)
        {
            System.out.println("Please enter an integer");
            a = sc.nextInt();
            sum = sum + a;
        }
        System.out.println("The sum of these numbers is " + sum);
        double mean = ((double)sum / 7);
        System.out.println("The average of these numbers is " + mean);
    }
}
