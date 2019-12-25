public class Snake extends DesertAnimal
{
    public Snake(String a, String b)
    {
        super("Snake", a, b);
    }
    public String toString()
    {
        return "Desert Animal " + super.toString();
    }
    public void giveName(String d)
    {
        super.giveName(d);
    }
}
