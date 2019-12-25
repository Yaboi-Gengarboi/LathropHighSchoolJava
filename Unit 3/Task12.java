import java.util.Scanner;
public class Task12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have Bread?");
        System.out.println("1 = Yes  0 = No");
        int a = sc.nextInt();
        System.out.println("Do you have Peanut Butter?");
        System.out.println("1 = Yes  0 = No");
        int b = sc.nextInt();
        System.out.println("Do you have Jelly?");
        System.out.println("1 = Yes  0 = No");
        int c = sc.nextInt();
        System.out.println("Do you have a Knife?");
        System.out.println("1 = Yes  0 = No");
        int d = sc.nextInt();
        System.out.println("Do you have Milk?");
        System.out.println("1 = Yes  0 = No");
        int e = sc.nextInt();
        if ((a + b + c + d + e) == 5)
        {
            System.out.println("Yay! You can have a nice snack!");
        }
        else
        {
            if (e == 0 && (a + b + c + d) == 4)
            {
                System.out.println("Ok, you can make a sandwich, but you have nothing to drink."); 
            }
            if (a == 0)
            {
                System.out.println("You have no Bread."); 
            }
            if (b == 0)
            {
                System.out.println("You have no Peanut Butter."); 
            }
            if (c == 0)
            {
                System.out.println("You have no Jelly."); 
            }
            if (d == 0)
            {
                System.out.println("You have no Knife.");
            }
            if (e == 0 && (a + b + c + d) != 4)
            {
                System.out.println("You have no Milk");
            }
        }
    }
}