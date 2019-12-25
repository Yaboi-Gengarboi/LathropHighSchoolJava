import java.util.ArrayList;
import java.util.Scanner;
public class Task50
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        while (!word.equals("STOP"))
        {
            System.out.print("Enter word to add to ArrayList. Enter STOP to quit.");
            word = scanner.next();
            if (!word.equals("STOP"))
                words.add(word);
            System.out.println(words);
        }
    }
}
