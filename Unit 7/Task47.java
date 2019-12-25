import java.util.ArrayList;
public class Task47
{
    public static void main (String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 8; i++)
        {
            numbers.add(i);
        }
        System.out.print(numbers);
        System.out.println();
        numbers.add(4,8);
        numbers.add(5,9);
        System.out.print(numbers);
    }
}
