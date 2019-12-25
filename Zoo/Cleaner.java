public class Cleaner
{
    private String color;
    private double volume;
    private boolean isLow;
    public Cleaner(String a, double b, boolean c)
    {
        color = a;
        volume = b;
        isLow = c;
    }
    public String toString()
    {
        return "Color: " + color + " Volume: " + volume + " Is Low? " + isLow;
    }
    public void setVolume(double a)
    {
        volume = a;
    }
    public void setColor(String b)
    {
       color = b;
    }
    public void setIsLow(boolean c)
    {
        isLow = c;
    }
    public String getColor()
    {
        return color;
    }
    public double getVolume()
    {
        return volume;
    }
    public boolean getIsLow()
    {
        return isLow;
    }
    public void take(double x)
    {
        volume -= x;
        if (volume < 50)
            isLow = true;
    }
    public void refill(double x)
    {
        volume += x;
        if (volume < 50)
            isLow = true;
        else
            isLow = false;
    }
}
