public class Bullet extends Kinetic
{
    private double shieldDamage;
    public Bullet(String a, double b, int c, int d, int e, int f, int g, double h)
    {
        super(a, b, c, d, e, f, g);
        shieldDamage = h;
    }
    public String toString()
    {
        String out = "\nShield Damage: " + shieldDamage + "\n";
        return super.toString() + out;
    }
}
