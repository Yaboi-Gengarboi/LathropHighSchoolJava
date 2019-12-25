public class Task21
{
    public static void main(String[] args)
    {
        int r;
        System.out.println("    1   2   3   4   5   6   7   8   9   10  11  12");
        for (int i = 1; i < 13; i++)
        {
            if (i < 10)
            {
                System.out.printf("%d   ",i);
            }
            else
            {
                System.out.printf("%d  ",i);
            }
            for (int p = 1; p < 13; p++)
            {
                r = i * p;
                if (r < 10)
                {
                    System.out.printf("%d   ",r);
                }
                else if ((r > 10 || r == 10) && r < 100)
                {
                    System.out.printf("%d  ",r);
                }
                else
                {
                    System.out.printf("%d ",r);
                }
            }
            System.out.println();
        }
    }
}
