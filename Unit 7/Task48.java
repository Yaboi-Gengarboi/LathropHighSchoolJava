import java.util.ArrayList;
public class Task48
{
    public static void main (String[] args)
    {
        ArrayList<Double> rand = new ArrayList<>();
        for (int i = 0; i < 6; i++)
            rand.add(Math.random());
        System.out.println(rand);
        rand.remove(2);
        rand.remove(2);
        System.out.println(rand);
    }
}
