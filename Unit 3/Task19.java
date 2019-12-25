import java.util.Scanner;
public class Task19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        for (int i = 1; i < 10; i++)
        {
            for (int p = 0; p < 5; p++)
            {
                a = i * (int)(Math.pow(10, p));
                System.out.printf("%d   ",a);
            }
            System.out.println();
        }
    }
}
