public abstract class Character
{
    private double weight;
    private double walkSpeed;
    private double runSpeed;
    private double airSpeed;
    private double fallSpeed;
    private double gravity;
    public Character(double a, double b, double c, double d, double e, double f)
    {
        weight = a;
        walkSpeed = b;
        runSpeed = c;
        airSpeed = d;
        fallSpeed = e;
        gravity = f;
    }
    public abstract void grab();
}
