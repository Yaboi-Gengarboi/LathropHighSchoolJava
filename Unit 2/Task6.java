import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int A = sc.nextInt();
        System.out.println("Enter another integer");
        int B = sc.nextInt();
        int C = A+B;
        int D = A-B;
        int E = A*B;
        double F = ( (double)A )/( (double)B );
        System.out.printf("A+B = %d \n", C);
        System.out.printf("A-B = %d \n", D);
        System.out.printf("A*B = %d \n", E);
        System.out.println("A/B = " + F);
    }
}
