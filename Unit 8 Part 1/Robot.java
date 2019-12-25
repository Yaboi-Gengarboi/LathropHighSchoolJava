public class Robot extends VideoGameCharacter
{
    private double explosionRadius;
    public Robot(double a, double b, double c, double d)
    {
        super("Robot", a, b, c);
        explosionRadius = d;
    }
    public String toString()
    {
        return super.toString() + "\nExplosion Radius: " + explosionRadius;
    }
}