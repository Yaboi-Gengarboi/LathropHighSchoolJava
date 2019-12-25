public abstract class Weapon
{
    private String name;
    private double damage;
    private int range;
    private int fireRate;
    public Weapon(String a, double b, int c, int d)
    {
        name = a;
        damage = b;
        range = c;
        fireRate = d;
    }
    public String toString()
    {
        String out = "";
        out += "Name: " + name;
        out += "\nDamage: " + damage;
        out += "\nRange: " + range;
        out += "\nFire Rate: " + fireRate;
        return out;
    }
}
