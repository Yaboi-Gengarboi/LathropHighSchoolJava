import java.util.ArrayList;
public class Task53
{
    public static void main (String[] args)
    {
        int numLetters = 0;
        int randCharID = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String word = "";
        ArrayList<String> randString = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            numLetters = (int)(Math.floor(10*Math.random()));
            for (int p = 0; p < numLetters; p++)
            {
                randCharID= (int)(Math.floor(26*Math.random()));
                word += alphabet.charAt(randCharID);  
            }
            randString.add(word);
            word = "";
        }
        System.out.println(randString);
        int x = 0;
        for (int i = 0; i < 10; i ++)
        {
            word = randString.get(i);
            if (word.length() > 3)
                x++;
        }
        System.out.println("Number of words longer than 3 letters: " + x);
    }
}