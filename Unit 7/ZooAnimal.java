public class ZooAnimal
{
    private String name, species, sex;
    public ZooAnimal(String x, String y, String z)
    {
        name = x;
        species = y;
        sex = z;
    }
    public void setName(String in)
    {
        name = in;
    }
    public void setSpecies(String in)
    {
        species = in;
    }
    public void setSex(String in)
    {
        sex = in;
    }
    public String getName()
    {
        return name;
    }
    public String getSpecies()
    {
        return species;
    }
    public String getSex()
    {
        return sex;
    }
    public String toString()
    {
        return name + " " + species + " " + sex + " ";
    }
}
