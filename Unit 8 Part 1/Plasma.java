public class Plasma extends Energy
{
    private double heatDamage;
    public Plasma(String a, double b, int c, int d, int e, int f, double g)
    {
        super(a, b, c, d, e, f);
        heatDamage = g;
    }
    public String toString()
    {
        String out = "\nHeat DamagheatDamage" + heatDamage + "\n";
        return super.toString() + out;
    }
}