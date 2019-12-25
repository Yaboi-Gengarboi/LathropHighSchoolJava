public class Assasin extends VideoGameCharacter
{
    private double needlespeed;
    public Assasin(double a, double b, double c, double d)
    {
        super("Assasin", a, b, c);
        needlespeed = d;
    }
    public String toString()
    {
        return super.toString() + "\nNeedlespeed: " + needlespeed;
    }
}