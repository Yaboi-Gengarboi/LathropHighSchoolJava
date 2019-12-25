public class Archer extends VideoGameCharacter
{
    private double arrowSpeed;
    public Archer(double a, double b, double c, double d)
    {
        super("Archer", a, b, c);
        arrowSpeed = d;
    }
    public String toString()
    {
        return super.toString() + "\nArrow Speed: " + arrowSpeed;
    }
}