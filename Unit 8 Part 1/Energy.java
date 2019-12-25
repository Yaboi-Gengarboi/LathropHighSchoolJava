public class Energy extends Weapon
{
    private int clipSize;
    private int unloadTime;
    public Energy(String a, double b, int c, int d, int e, int f)
    {
        super(a, b, c, d);
        clipSize = e;
        unloadTime = f;
    }
    public String toString()
    {
        String out = "";
        out += "\nClip Size: " + clipSize;
        out += "\nUnload Time: " + unloadTime;
        return super.toString() + out;
    }
}
