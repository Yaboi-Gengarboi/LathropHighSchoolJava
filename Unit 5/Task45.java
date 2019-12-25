public class Task45
{
    public static void main(String[] args)
    {
        int[] num = new int[50];
        num[0] = 1;
        num[1] = 1;
        for (int i = 2; i < 50; i++)
        {
            num[i] = num[i-2] + num[i-1];
        }
        for (int i = 0; i < 50; i++)
        {
            System.out.print(num[i] + " ");
        }
    }
}
