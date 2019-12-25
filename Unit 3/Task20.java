import java.util.Scanner;
public class Task20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        System.out.println("Please enter a positive number for a maximum.");
        int max = sc.nextInt() + 1;
        int range = max - min;
        int r;
        for (int p = 0; p < 8; p++)
        {
            for (int i = 0; i < 4; i++)
            {
                r = (int)(Math.random()*range);
                System.out.print(r);
            }
            System.out.println();
        }
    }
}
