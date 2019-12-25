import java.util.Scanner;
public class Task15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        while (cont == 1)
        {
            System.out.println("Please choose an equation to use.");
            System.out.println("1 = Quadratic Formula");
            System.out.println("2 = Law of Sines");
            System.out.println("3 = Law of Cosines");
            System.out.println("4 = Pythagorean Theorem");
            int eqID = sc.nextInt();
            double A, B, C, X, Y, a, b, c;
            if (eqID == 1)
            {
                System.out.println("Please enter a number for A");
                A = sc.nextDouble();
                System.out.println("Please enter a number for B");
                B = sc.nextDouble();
                System.out.println("Please enter a number for C");
                C = sc.nextDouble();
                X = -B + Math.sqrt((((Math.pow(B,2)) - 4*A*C))/(2*A));
                Y = -B - Math.sqrt((((Math.pow(B,2)) - 4*A*C))/(2*A));
                if (X == Y)
                {
                    System.out.println(X);
                }
                else
                {
                    System.out.println(X);
                    System.out.println(Y);
                }
            }
            else if (eqID == 2)
            {
                System.out.println("Please enter a number for side 'a'.");
                a = sc.nextDouble();
                System.out.println("Please enter a number for side 'c'.");
                c = sc.nextDouble();
                System.out.println("Please enter an angle in radians for angle 'C'.");
                C = sc.nextDouble();
                A = Math.asin((a*(Math.sin(C))/c));
                System.out.println(A);
            }
            else if (eqID == 3)
            {
                System.out.println("Please enter a number for side 'a'.");
                a = sc.nextDouble();
                System.out.println("Please enter a number for side 'b'.");
                b = sc.nextDouble();
                System.out.println("Please enter an angle in radians for angle 'C'.");
                C = sc.nextDouble();
                c = Math.sqrt( (Math.pow(a,2)) + (Math.pow(b,2)) - 2*a*b*(Math.cos(C)));
                System.out.println(c);
            }
            else if (eqID == 4)
            {
                System.out.println("Which side, a, b or c, would you like to solve for?");
                String side = sc.next();
                if (side.equals("a"))
                {
                    System.out.println("Please enter side b");
                    b = sc.nextDouble();
                    System.out.println("Please enter side c");
                    c = sc.nextDouble();
                    a = Math.sqrt((Math.pow(c, 2)) - (Math.pow(b, 2)));
                    System.out.println(a);
                }
                else if (side.equals("b"))
                {
                    System.out.println("Please enter side a");
                    a = sc.nextDouble();
                    System.out.println("Please enter side c");
                    c = sc.nextDouble();
                    b = Math.sqrt((Math.pow(c, 2)) - (Math.pow(a, 2)));
                    System.out.println(b);
                }
                else if (side.equals("c"))
                {
                    System.out.println("Please enter side a");
                    a = sc.nextDouble();
                    System.out.println("Please enter side b");
                    b = sc.nextDouble();
                    c = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
                    System.out.println(c);
                }
                else
                {
                    System.out.println("ERROR: NO SIDE SELECTED");
                }
            }
            else
            {
                System.out.println("ERROR: NO EQUATION SELECTED");
            }
            System.out.println("Would you like to do another calculation?");
            System.out.println("1 = Yes");
            System.out.println("0 = No");
            cont = sc.nextInt();
        }
    }
}
