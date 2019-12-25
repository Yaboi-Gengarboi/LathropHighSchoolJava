import java.util.ArrayList;
public class Task52
{
    public static void main (String[] args)
    {
        ArrayList<Integer> randInt = new ArrayList<>();
        for (int i = 0; i < 12; i++)
            randInt.add((int)(Math.floor(10*Math.random())));
        System.out.println(randInt);
        int x = 0;
        int y = 0;
        for (int i = 0; i < 12; i++)
        {
            if (randInt.get(i)%2 == 0)
                x++;
            else
                y++;
        }
        System.out.printf("Even: %d   Odd: %d", x, y);
    }
}
