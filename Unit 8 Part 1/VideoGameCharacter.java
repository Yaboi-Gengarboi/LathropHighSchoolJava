public abstract class VideoGameCharacter
{
    private String name;
    private double runSpeed;
    private double fallSpeed;
    private double airSpeed;
    public VideoGameCharacter(String a, double b, double c, double d)
    {
        name = a;
        runSpeed = b;
        fallSpeed = c;
        airSpeed = d;
    }
    public void speedUp()
    {
        runSpeed *= 1.5;
        airSpeed *= 1.5;
    }
    public void slowDown()
    {
        runSpeed /= 1.5;
        airSpeed /= 1.5;
    }
    public String toString()
    {
        return "Name: " + name + "\nRun Speed: " + runSpeed + "\nFall Speed: " + fallSpeed + "\nAir Speed: " + airSpeed;
    }
}
