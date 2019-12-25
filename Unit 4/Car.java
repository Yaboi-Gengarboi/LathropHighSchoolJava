//Task25
public class Car
{
    private String model;
    private String color;
    private String owner;
    private String plateID;
    private int carAge;
    private int accidentCount;
    private int citationCount;
    private int ownerAge;
    public Car(String a, String b, String c, String d, int e, int f, int g, int h)
    {
        model = a;
        color = b;
        carAge = e;
        plateID = d;
        owner = c;
        ownerAge = h;
        accidentCount = f;
        citationCount = g;
    }
    public String printA()
    {
        return "Model: " + model;
    }
    public String printB()
    {
        return "Color: " + color;
    }
    public String printC()
    {
        return "Owner Name: " + owner;
    }
    public String printD()
    {
        return "License Plate: " + plateID;
    }
    public String printE()
    {
        return "Car Age: " + carAge;
    }
    public String printF()
    {
        return "Number of Accidents: " + accidentCount;
    }
    public String printG()
    {
        return "Number of Citations: " + citationCount;
    }
    public String printH()
    {
        return "Owner Age: " + ownerAge;
    }
}
