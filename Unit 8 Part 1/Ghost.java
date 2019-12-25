public class Ghost extends VideoGameCharacter
{
    private double fazeSpeed;
    public Ghost(double a, double b, double c, double d)
    {
        super("Ghost", a, b, c);
        fazeSpeed = d;
    }
    public String toString()
    {
        return super.toString() + "\nFaze Speed: " + fazeSpeed;
    }
}