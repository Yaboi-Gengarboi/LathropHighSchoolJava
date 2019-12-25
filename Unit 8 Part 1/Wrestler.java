public class Wrestler extends VideoGameCharacter
{
    private double superArmor;
    public Wrestler(double a, double b, double c, double d)
    {
        super("Wrestler", a, b, c);
        superArmor = d;
    }
    public String toString()
    {
        return super.toString() + "\nSuper Armor Strength: " + superArmor;
    }
}