public interface Mathematician
{
    public abstract double[] quadratic(double a, double b, double c);
    public abstract double[] force(double k, double angle);
    public abstract double sampleStandardDeviation(double[] data);
    public abstract double[] boxStats(double[] data);
}
