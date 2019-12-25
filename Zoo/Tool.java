public class Tool
{
    private String name;
    private int ID;
    private char abbrev;
    public Tool(String a, int b, char c)
    {
        name = a;
        ID = b;
        abbrev = c;
    }
    public String toString()
    {
        return "Tool: " + name + " ID: " + ID + " Abbreviation: " + abbrev;
    }
    public void setName(String a)
    {
        name = a;
    }
    public void setID(int b)
    {
        ID = b;
    }
    public void setAbbrev(char c)
    {
        abbrev = c;
    }
    public String getName()
    {
        return name;
    }
    public int getID()
    {
        return ID;
    }
    public char getAbbrev()
    {
        return abbrev;
    }
}
