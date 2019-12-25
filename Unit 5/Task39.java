import java.util.Scanner;
public class Task39
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"","","",""};
        for (int i = 0; i < 4; i++)
        {
            System.out.print("Enter word: ");
            arr[i] = sc.next();
        }
        for (int i = 0; i < 4; i++)
        {
            System.out.print(arr[i]);
        }
    }
}
