import java.util.Scanner;
public class Task50
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][]x = new int[6][6];
        int cont = 1;
        int row;
        int column;
        System.out.println("  1 2 3 4 5 6");
        for (int i = 0; i < 6; i++)
        {
            System.out.print(i+1 + " ");
            for (int p = 0; p < 6; p++)
            {
                System.out.print(x[i][p] + " ");
            }
            System.out.println();
        }
        while (cont == 1)
        {
            
            System.out.print("SELECT ROW: ");
            row = sc.nextInt() - 1;
            System.out.print("SELECT COLUMN: ");
            column = sc.nextInt() - 1;
            System.out.print("ENTER INTEGER: ");
            x[row][column] = sc.nextInt();
            System.out.println("  1 2 3 4 5 6");
            for (int i = 0; i < 6; i++)
            {
                System.out.print(i+1 + " ");
                for (int p = 0; p < 6; p++)
                {
                    System.out.print(x[i][p] + " ");
                }
                System.out.println();
            }
            System.out.print("Continue? (Enter 1 for yes) ");
            cont = sc.nextInt();
        }
    }
}