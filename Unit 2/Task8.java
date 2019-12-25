import java.util.Scanner;
public class Task8
{
    public static void main(String[] args)
    {
        //Dear god this is so messy
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer for A");
        int A = sc.nextInt();
        System.out.println("Enter another integer for B");
        int B = sc.nextInt();
        System.out.println("Enter one last integer for C");
        int C = sc.nextInt();
        int D = A + B + C;
        System.out.println("A + B + C = " + D);
        int E = A * B * C;
        System.out.println("A * B * C = " + E);
        double F = (( (double)A ) + ( (double)B ) + ( (double)C ))/3;
        System.out.println("Average: " + F);
        if (A == B && A == C)
        {
            System.out.println("A, B and C are all " + A);
        }
        else if (A == B && A < C)
        {
            System.out.printf("%d is the largest, but A and B are both %d \n", C, A);
        }
        else if (A == C && A < B)
        {
            System.out.printf("%d is the largest, but A and C are both %d \n", B, A);
        }
        else if (B == C && B < A)
        {
            System.out.printf("%d is the largest, but B and C are both %d \n", A, B);
        }
        else if (A > B && B > C)
        {
            System.out.printf("%d is the largest, %d is the smallest and %d is in between\n", A, C, B);
        }
        else if (B > A && A > C)
        {
            System.out.printf("%d is the largest, %d is the smallest and %d is in between\n", B, C, A);
        }
        else if (C > B && B > A)
        {
            System.out.printf("%d is the largest, %d is the smallest and %d is in between\n", C, A, B);
        }
        else if (A > C && C > B)
        {
            System.out.printf("%d is the largest, %d is the smallest and %d is in between.\n", A, B, C);
        }
        else if (B > C && C > A)
        {
            System.out.printf("%d is the largest, %d is the smallest and %d is in between.\n", B, A, C);
        }
        else if (C > A && A > B)
        {
            System.out.printf("%d is the largest, %d is the smallest and %d is in between.\n", C, B, A);
        }
    }
}
