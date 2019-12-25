public class TwoDShape
{
    private String type;
    private int sides;
    private double[] angles;
    public TwoDShape(String a, int b, double[] c)
    {
        type = a;
        sides = b;
        angles = c;
    }
    public String toString()
    {
        return "Type: " + type + "\nSides: " + sides + "\nAngles: " + arrToString(angles);
    }
    public String arrToString(double[] a)
    {
        String out = "";
        for (int i = 0; i < a.length; i++)
            out += a[i] + " ";
        return out;
    }
}
