public class TwoDShapeTest
{
    public static void main(String[] args)
    {
        double[] arr1 = {90.0, 90.0, 90.0, 90.0};
        Rectangle rec = new Rectangle(arr1);
        double[] arr2 = {150.0, 150.0, 30.0, 30.0};
        Trapezoid trap = new Trapezoid(arr2);
        double[] arr3 = {360.0};
        Circle cir = new Circle(arr3);
        double[] arr4 = {30.0, 60.0, 90.0};
        Triangle tri = new Triangle(arr4);
        System.out.println(rec.toString());
        System.out.println(trap.toString());
        System.out.println(cir.toString());
        System.out.println(tri.toString());
    }
}
