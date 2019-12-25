import java.util.Scanner;
public class Task49
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[][]x = new String[3][3];
        for (int i = 0; i < 3; i++)
        {
            for (int p = 0; p < 3; p++)
            {
                System.out.print("Enter String: ");
                x[i][p] = sc.next();
            }
        }
        for (int i = 0; i < 3; i++)
        {
            for (int p = 0; p < 3; p++)
            {
                System.out.print(x[i][p] + " ");
            }
            System.out.println();
        }
    }
}