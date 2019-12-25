public class Task41
{
    public static void main(String[] args)
    {
        int[] val = {0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < 9; i++)
        {
            val[i] = (int)(Math.floor(Math.random()*5+5));
        }
        for (int i = 0; i < 9; i++)
        {
            System.out.println(val[i]);
        }
    }
}
