public class Rabbit extends ForestAnimal
{
    public Rabbit(String a, String b)
    {
        super("Rabbit", a, b);
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
