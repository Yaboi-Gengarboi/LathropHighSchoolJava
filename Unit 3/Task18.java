import java.util.Scanner;
public class Task18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("This program will let you enter as many positive integers as you");
        System.out.println("would like and count how many are even and how many are odd. Just");
        System.out.println("enter a negative integer to stop the program.");
        while (a > -1)
        {
            System.out.println("Enter a positive integer, or enter a negative integer to stop.");
            a = sc.nextInt();
            if (a%2 == 0)
            {
                b = b+1; 
            }
            else if (a%2 == 1)
            {
                c = c+1;
            }
            System.out.printf("Even: %d \n Odd: %d \n", b, c);
        }
    }
}
