public class Task56Array
{
    public static void main (String[] args)
    {
        boolean[] booleans = new boolean[100];
        for (int i = 0; i < 100; i+=2)
        {
            booleans[i] = true;
            booleans[i+1] = false;
        }
        for (int i = 0; i < 100; i++)
            System.out.print(booleans[i] + " ");
    }
}
