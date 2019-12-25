import java.util.Scanner;
public class Runner
{
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter class to test");
        String slct = sc.next();
        if (slct.equals("Assignment"))
        {
            System.out.println("Enter Name of Class (String)");
            String a = sc.next();
            System.out.println("Enter Name of Work (String)");
            String b = sc.next();
            System.out.println("Enter Date (String) (MMDDYYYY)");
            String c = sc.next();
            System.out.println("Enter Possible Score (double)");
            double d = sc.nextInt();
            System.out.println("Enter Earned Score (double)");
            double e = sc.nextInt();
            Assignment alpha = new Assignment(a, b, c, d, e);
            System.out.println(alpha.printA());
            System.out.println(alpha.printB());
            System.out.println(alpha.printC());
            System.out.println(alpha.printD());
            System.out.println(alpha.printE());
        }
        else if (slct.equals("Car"))
        {
            System.out.println("Enter Model (String)");
            String a = sc.next();
            System.out.println("Enter Color (String)");
            String b = sc.next();
            System.out.println("Enter Owner Name (String)");
            String c = sc.next();
            System.out.println("Enter License Plate (String)");
            String d = sc.next();
            System.out.println("Enter Car Age (int)");
            int e = sc.nextInt();
            System.out.println("Enter Number of Accidents (int)");
            int f = sc.nextInt();
            System.out.println("Enter Number of Citations (int)");
            int g = sc.nextInt();
            System.out.println("Enter Owner Age (int)");
            int h = sc.nextInt();
            Car alpha = new Car(a, b, c, d, e, f, g, h);
            System.out.println(alpha.printA());
            System.out.println(alpha.printB());
            System.out.println(alpha.printC());
            System.out.println(alpha.printD());
            System.out.println(alpha.printE());
        }
        else if (slct.equals("Shape"))
        {
            System.out.println("Enter Dimension (int) (2 or 3)");
            int a = sc.nextInt();
            System.out.println("Is the shape a Polygon? (Boolean)");
            boolean b = sc.nextBoolean();
            System.out.println("Enter Name (String)");
            String c = sc.next();
            Shape alpha = new Shape(a, b, c);
            System.out.println(alpha.printA());
            System.out.println(alpha.printB());
            System.out.println(alpha.printC());
        }
        else if (slct.equals("Sport"))
        {
            System.out.println("Is Sport Sprint? (Boolean)");
            boolean a = sc.nextBoolean();
            System.out.println("Is Sport Swimming? (Boolean)");
            boolean b = sc.nextBoolean();
            System.out.println("Is Sport Volleyball? (Boolean)");
            boolean c = sc.nextBoolean();
            System.out.println("Is Sport Tennis? (Boolean)");
            boolean d = sc.nextBoolean();
            Sport alpha = new Sport(a, b, c, d);
            System.out.println(alpha.printA());
            System.out.println(alpha.printB());
            System.out.println(alpha.printC());
            System.out.println(alpha.printD());
        }
        else if (slct.equals("School"))
        {
            System.out.println("Enter School Name (String)");
            String a = sc.next();
            System.out.println("Enter Location (String)");
            String b = sc.next();
            System.out.println("Enter Building years of age (int)");
            int c = sc.nextInt();
            System.out.println("Enter Amount of students (int)");
            int d = sc.nextInt();
            System.out.println("Enter Amount of staff (int)");
            int e = sc.nextInt();
            System.out.println("Enter Amount of subjects (int)");
            int f = sc.nextInt();
            System.out.println("Enter Building Area (double)");
            double g = sc.nextDouble();
            System.out.println("Enter Graduation Rate (double)");
            double h = sc.nextDouble();
            System.out.println("Is the school open? (Boolean)");
            boolean i = sc.nextBoolean();
            System.out.println("Is the school a private school? (Boolean)");
            boolean j = sc.nextBoolean();
            School alpha = new School(a, b, c, d, e, f, g, h, i, j);
            System.out.println(alpha.printA());
            System.out.println(alpha.printB());
            System.out.println(alpha.printC());
            System.out.println(alpha.printD());
            System.out.println(alpha.printE());
            System.out.println(alpha.printF());
            System.out.println(alpha.printG());
            System.out.println(alpha.printH());
            System.out.println(alpha.printI());
            System.out.println(alpha.printJ());
        }
        else if (slct.equals("Cat"))
        {
            Cat zena = new Cat("zena", 4, "female");
            zena.reverseName();
            System.out.println(zena.getName());
        }
    }
}