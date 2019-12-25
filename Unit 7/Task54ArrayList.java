import java.util.ArrayList;
public class Task54ArrayList
{
    public static void main (String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        int x = 0;
        int y = 0;
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        numbers.add(51);
        numbers.add(12);
        numbers.add(-4);
        numbers.add(0);
        numbers.add(23);
        numbers.add(35);
        numbers.add(18);
        numbers.add(12);
        for (int i = 0; i < numbers.size(); i++)
        {
            if (Math.abs(numbers.get(i))%2 == 0)
                x++;
            else
                y++;
        }
        System.out.println(numbers);
        System.out.printf("Even: %d   Odd: %d", x, y);
    }
}
