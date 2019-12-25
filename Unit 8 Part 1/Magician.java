public class Magician extends VideoGameCharacter
{
    private double spellDPS;
    public Magician(double a, double b, double c, double d)
    {
        super("Magician", a, b, c);
        spellDPS = d;
    }
    public String toString()
    {
        return super.toString() + "\nSpell DPS: " + spellDPS;
    }
}