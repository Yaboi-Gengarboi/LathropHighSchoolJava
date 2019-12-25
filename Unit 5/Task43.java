public class Task43
{
    public static void main(String[] args)
    {
        String[] coin = {"v","v","v","v","v","v","v","v","v","v","v","v","v","v","v","v",};
        double flip;
        for (int i = 0; i < 16; i++)
        {
            flip = Math.random();
            if (flip >= 0.5)
            {
                coin[i] = "H";
            }
            else
            {
                coin[i] = "T";
            }
        }
        for (int i = 0; i < 16; i++)
        {
            System.out.print(coin[i] + " ");
        }
    }
}
