public class Task44
{
    public static void main(String[] args)
    {
        int[] num = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < 16; i++)
        {
            num[i] = i;
        }
        for (int i = 0; i < 16; i++)
        {
            System.out.print(num[i] + " ");
        }
    }
}
