public class Shark extends OceanAnimal
{
    public Shark(String a, String b)
    {
        super("Shark", a, b);
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
