import java.util.Scanner;
public class Task23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of the rectangle. ONLY POSITIVE INTEGERS");
        int height = sc.nextInt();
        if (height > 0)
        {
            System.out.println("Now Please enter the width of the rectangle. ONLY POSITIVE INTEGERS");
            int width = sc.nextInt();
            if (width > 0)
            {
                for (int i = 0; i < height; i++)
                {
                    for (int p = 0; p < width; p++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            else
            {
                System.out.println("ERROR: WIDTH IS LESS THAN 0");
            }
        }
        else
        {
            System.out.println("ERROR: HEIGHT IS LESS THAN 0");
        }
    }
}
