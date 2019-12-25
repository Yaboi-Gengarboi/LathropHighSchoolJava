public class Task48
{
    public static void main(String[] args)
    {
        int[][] x = new int[6][6];
        double var;
        for (int i = 0; i < 6; i++)
        {
            for (int p = 0; p < 6; p++)
            {
                var = Math.random();
                if (var >= .5)
                    x[i][p] = 1;
                else
                    x[i][p] = 0;
            }
        }
        for (int i = 0; i < 6; i++)
        {
            for (int p = 0; p < 6; p++)
            {
                System.out.print(x[i][p] + " ");
            }
            System.out.println();
        }
    }
}