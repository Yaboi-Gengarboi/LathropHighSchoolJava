public class Squirrel extends ForestAnimal
{
    public Squirrel(String a, String b)
    {
        super("Squirrel", a, b);
    }
    public String toString()
    {
        return "Forest Animal " + super.toString();
    }
    public void giveName(String d)
    {
        super.giveName(d);
    }
}
