public class Task40
{
    public static void main(String[] args)
    {
        double[] val = {0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < 9; i++)
        {
            val[i] = Math.random()*10;
        }
        for (int i = 0; i < 9; i++)
        {
            System.out.println(val[i]);
        }
    }
}
