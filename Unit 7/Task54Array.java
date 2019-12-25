public class Task54Array
{
    public static void main (String[] args)
    {
        int[] numbers = {1, 5, 9, 51, 12, -4, 0, 23, 35, 18, 12};
        int x = 0;
        int y = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            if (Math.abs(numbers[i])%2 == 0)
                x++;
            else
                y++;
        }
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
        System.out.printf("Even: %d   Odd: %d", x, y);
    }
}
