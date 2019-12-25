public class Feeder
{
    private String name;
    private int age;
    private double height;
    //Special
    private int IDA;
    public Feeder(String a, int b, double c)
    {
        name = a;
        age = b;
        height = c;
    }
    public String toString()
    {
        return "Name: " + name + " Age: " + age + " Height: " + height;
    }
    public void setName(String a)
    {
        name = a;
    }
    public void setAge(int b)
    {
        age = b;
    }
    public void setHeight(double c)
    {
        height = c;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public double getHeight()
    {
        return height;
    }
    public void feedBear(Bear x, Food y)
    {
        x.feed();
        y.take(30);
    }
    public void feedOwl(Owl x, Food y)
    {
        x.feed();
        y.take(15);
    }
    public void feedMoose(Moose x, Food y)
    {
        x.feed();
        y.take(25);
    }
    public void feedWolf(Wolf x, Food y)
    {
        x.feed();
        y.take(20);
    }
    public void feedEagle(Eagle x, Food y)
    {
        x.feed();
        y.take(15);
    }
    public void giveBearWater(Bear x, Water y)
    {
        x.drink();
        y.take(30);
    }
    public void giveOwlWater(Owl x, Water y)
    {
        x.feed();
        y.take(15);
    }
    public void giveMooseWater(Moose x, Water y)
    {
        x.feed();
        y.take(25);
    }
    public void giveWolfWater(Wolf x, Water y)
    {
        x.feed();
        y.take(20);
    }
    public void giveEagleWater(Eagle x, Water y)
    {
        x.feed();
        y.take(15);
    }
}