public class Cowboy extends VideoGameCharacter
{
    private int clipSize;
    public Cowboy(double a, double b, double c, int d)
    {
        super("Cowboy", a, b, c);
        clipSize = d;
    }
    public String toString()
    {
        return super.toString() + "\nClip Size: " + clipSize;
    }
}
