public class Vehicle
{
    private String brand;
    private double mileage;
    private int age;
    private boolean fourWheeler;
    public Vehicle(String a, double b, int c, boolean d)
    {
        brand = a;
        mileage = b;
        age = c;
        fourWheeler = d;
    }
    public String toString()
    {
        return "Brand: " + brand + "\nMileage: " + mileage + "\nAge: " + age + "\nFour Wheeler? " + fourWheeler;
    }
}
