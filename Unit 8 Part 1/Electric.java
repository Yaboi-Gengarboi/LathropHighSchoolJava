public class Electric extends Energy
{
    private int lockOnRadius;
    public Electric(String a, double b, int c, int d, int e, int f, int g)
    {
        super(a, b, c, d, e, f);
        lockOnRadius = g;
    }
    public String toString()
    {
        String out = "\nLock-On Radius: " + lockOnRadius + "\n";
        return super.toString() + out;
    }
}