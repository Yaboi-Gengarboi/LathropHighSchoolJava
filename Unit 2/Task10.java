import java.util.Scanner;
public class Task10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be the radius of a circle");
        double R = sc.nextInt();
        if (R<0 || R==0)
        {
            System.out.println("ERROR: NUMBER IS LESS THAN OR EQUAL TO 0");
        }
        else 
        {
            double diameter = R*2;
            System.out.println("Diameter = " + diameter);
            double circumference = 2*Math.PI*R;
            System.out.println("circumference = " + circumference);
            double area = Math.PI*(Math.pow(R, 2));
            System.out.println("Area = " + area);
        }
    }
}
