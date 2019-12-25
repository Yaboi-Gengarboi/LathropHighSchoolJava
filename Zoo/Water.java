public class Water
{
    private double volume;
    private int temp;
    private boolean isLow;
    public Water(double a, int b, boolean c)
    {
        volume = a;
        temp = b;
        isLow = c;
    }
    public String toString()
    {
        return "Volume: " + volume + " Temperaturet: " + temp + " Is Low? " + isLow;
    }
    public void setVolume(double a)
    {
        volume = a;
    }
    public void setTemp(int b)
    {
        temp = b;
    }
    public void setIsLow(boolean c)
    {
        isLow = c;
    }
    public double getVolume()
    {
        return volume;
    }
    public int getTemp()
    {
        return temp;
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
    public void resetTemp()
    {
        temp = 16;
    }
}
