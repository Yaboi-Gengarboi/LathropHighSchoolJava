public class Task47
{
    public static void main(String[] args)
    {
        String[][] x = new String[6][6];
        for (int i = 0; i < 6; i++)
        {
            for (int p = 0; p < 6; p++)
            {
                x[i][p] = "LHS";
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