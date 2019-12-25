public class Agent extends VideoGameCharacter
{
    private int gunFireRate;
    public Agent(double a, double b, double c, int d)
    {
        super("Agent", a, b, c);
        gunFireRate = d;
    }
    public String toString()
    {
        return super.toString() + "\nGun Fire Rate: " + gunFireRate;
    }
}
