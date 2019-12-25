public class Ninja extends VideoGameCharacter
{
    private double wallClimbSpeed;
    public Ninja(double a, double b, double c, double d)
    {
        super("Ninja", a, b, c);
        wallClimbSpeed = d;
    }
    public String toString()
    {
        return super.toString() + "\nWallClimb Speed: " + wallClimbSpeed;
    }
}