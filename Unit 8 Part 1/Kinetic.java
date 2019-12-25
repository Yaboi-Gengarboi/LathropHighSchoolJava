public class Kinetic extends Weapon
{
    private int clipSize;
    private int unloadTime;
    private int reloadTime;
    public Kinetic(String a, double b, int c, int d, int e, int f, int g)
    {
        super(a, b, c, d);
        clipSize = e;
        unloadTime = f;
        reloadTime = g;
    }
    public String toString()
    {
        String out = "";
        out += "\nClip Size: " + clipSize;
        out += "\nUnload Time: " + unloadTime;
        out += "\nReload Time: " + reloadTime;
        return super.toString() + out;
    }
}
