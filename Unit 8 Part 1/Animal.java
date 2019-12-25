public abstract class Animal
{
    private String species;
    private String sex;
    private String color;
    
    private String name;
    public Animal(String a, String b, String c)
    {
        species = a;
        sex = b;
        color = c;
    }
    public String toString()
    {
        return "Species: " + species + "\nSex: " + sex + "\nColor: " + color;
    }
    public void giveName(String d)
    {
        name = d;
    }
}
