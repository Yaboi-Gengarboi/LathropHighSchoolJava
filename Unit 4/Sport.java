//Task27
public class Sport
{
    private boolean isSprint;
    private boolean isSwim;
    private boolean isVolleyball;
    private boolean isTennis;
    public Sport(boolean a, boolean b, boolean c, boolean d)
    {
        isSprint = a;
        isSwim = b;
        isVolleyball = c;
        isTennis = d;
    }
    public String printA()
    {
        return "Sprint? " + isSprint;
    }
    public String printB()
    {
        return "Swimming? " + isSwim;
    }
    public String printC()
    {
        return "Volleyball? " + isVolleyball;
    }
    public String printD()
    {
        return "Tennis? " + isTennis;
    }
}
