public class Doctor extends VideoGameCharacter
{
    private double healSpeed;
    public Doctor(double a, double b, double c, double d)
    {
        super("Doctor", a, b, c);
        healSpeed = d;
    }
    public String toString()
    {
        return super.toString() + "\nHeal Speed: " + healSpeed;
    }
}