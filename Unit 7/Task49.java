import java.util.ArrayList;
public class Task49
{
    public static void main (String[] args)
    {
        ArrayList<Integer> randInt = new ArrayList<>();
        for (int i = 0; i < 9; i++)
            randInt.add((int)(Math.floor(5*Math.random()))+5);
        System.out.println(randInt);
    }
}
