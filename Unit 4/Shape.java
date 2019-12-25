//Task26
public class Shape
{
    private int dimension;
    private boolean isPolygon;
    private String name;
    public Shape(int a, boolean b, String c)
    {
        dimension = a;
        isPolygon = b;
        name = c;
    }
    public String printA()
    {
        return "Dimension: " + dimension;
    }
    public String printB()
    {
        return "Polygon? " + isPolygon;
    }
    public String printC()
    {
        return "Name: " + name;
    }
}
