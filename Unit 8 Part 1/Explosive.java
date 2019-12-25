public class Explosive extends Kinetic
{
    private int AOE;
    public Explosive(String a, double b, int c, int d, int e, int f, int g, int h)
    {
        super(a, b, c, d, e, f, g);
        AOE = h;
    }
    public String toString()
    {
        String out = "\nArea Of Effect: " + AOE + "\n";
        return super.toString() + out;
    }
}
