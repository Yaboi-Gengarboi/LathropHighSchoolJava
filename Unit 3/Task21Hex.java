//I was bored so I made this : )
public class Task21Hex
{
    public static void main(String[] args)
    {
        int r;
        String h;
        System.out.println("    1   2   3   4   5   6   7   8   9   A   B   C   D   E   F");
        for (int i = 1; i < 16; i++)
        {
            if (i < 16)
            {
                h = Integer.toHexString(i);
                System.out.printf("%s   ",h);
            }
            else
            {
                h = Integer.toHexString(i);
                System.out.printf("%s  ",h);
            }
            for (int p = 1; p < 16; p++)
            {
                r = i * p;
                if (r < 16)
                {
                    h = Integer.toHexString(r);
                    System.out.printf("%s   ",h);
                }
                else if ((r > 16 || r == 16) && r < 256)
                {
                    h = Integer.toHexString(r);
                    System.out.printf("%s  ",h);
                }
                else
                {
                    h = Integer.toHexString(r);
                    System.out.printf("%s ",h);
                }
            }
            System.out.println();
        }
    }
}
