public class Whale extends OceanAnimal
{
    public Whale(String a, String b)
    {
        super("Whale", a, b);
    }
    public String toString()
    {
        return "Ocean Animal " + super.toString();
    }
    public void giveName(String d)
    {
        super.giveName(d);
    }
}
