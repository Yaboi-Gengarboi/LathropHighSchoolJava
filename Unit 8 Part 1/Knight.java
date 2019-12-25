public class Knight extends VideoGameCharacter
{
    private double swordLength;
    public Knight(double a, double b, double c, double d)
    {
        super("Knight", a, b, c);
        swordLength = d;
    }
    public String toString()
    {
        return super.toString() + "\nSword Length: " + swordLength;
    }
}