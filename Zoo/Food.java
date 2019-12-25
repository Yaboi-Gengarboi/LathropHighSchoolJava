public class Food
{
    private String type;
    private int count;
    private double weight;
    private boolean isLow;
    public Food(String a, int b, double c, boolean d)
    {
        type = a;
        count = b;
        weight = c;
        isLow = d;
    }
    public String toString()
    {
        return "Food: " + type + " Amount: " + count + " Weight: " + weight + " Is Low? " + isLow;
    }
    public void setType(String a)
    {
        type = a;
    }
    public void setCount(int b)
    {
        count = b;
    }
    public void setWeight(double c)
    {
        weight = c;
    }
    public void setIsLow(boolean d)
    {
        isLow = d;
    }
    public String getType()
    {
        return type;
    }
    public int getCount()
    {
        return count;
    }
    public double getWeight()
    {
        return weight;
    }
    public boolean getIsLow()
    {
        return isLow;
    }
    public void take(int x)
    {
        count -= x;
        if (count < 50)
            isLow = true;
    }
    public void refill(int x)
    {
        count += x;
        if (count < 50)
            isLow = true;
        else
            isLow = false;
    }
}
