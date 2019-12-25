import java.util.ArrayList;
public class Task56ArrayList
{
    public static void main (String[] args)
    {
        ArrayList<Boolean> booleans = new ArrayList<>();
        for (int i = 0; i < 100; i+=2)
        {
            booleans.add(true);
            booleans.add(false);
        }
        System.out.println(booleans);
    }
}