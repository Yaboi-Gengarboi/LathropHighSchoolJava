import java.util.Scanner;
public class Deriv
{
    public static void main(String[] args)
    {
        char c;
        char b;
        char d;
        Scanner Sc = new Scanner(System.in);
        //3x^2+6x+9
        System.out.print("Enter Equation here: ");
        String eq = Sc.next();
        System.out.println();
        for (int i = 1; i < eq.length()-2; i++)
        {
            c = eq.charAt(i);
            b = eq.charAt(i-1);
            d = eq.charAt(i+1);
            System.out.println(c);
            if (c == 'x')
            {
                
            }
        }
    }
}
