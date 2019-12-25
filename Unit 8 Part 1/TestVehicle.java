public class TestVehicle
{
    public static void main(String[] args)
    {
        Car car = new Car("Subaru", 15.2, 4, true);
        Truck truck = new Truck("Ford", 18.9, 1, true);
        SUV suv = new SUV("Jeep", 16.4, 3, false);
        Van van = new Van("Mercedes", 17.8, 5, false);
        Vehicle[] vehicles = {car, truck, suv, van};
        for (int i = 0; i < 4; i++)
            System.out.println(vehicles[i]);
    }
}
