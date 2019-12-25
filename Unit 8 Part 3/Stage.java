public abstract class Stage
{
    private String name;
    private double xBlastZone;
    private double yBlastZone;
    public Stage(String a, double x, double y)
    {
        name = a;
        xBlastZone = x;
        yBlastZone = y;
    }
    public abstract void drawStage();
}
