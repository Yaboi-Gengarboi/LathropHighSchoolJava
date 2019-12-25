public class Monster extends VideoGameCharacter
{
    private int fearStunTime;
    public Monster(double a, double b, double c, int d)
    {
        super("Monster", a, b, c);
        fearStunTime = d;
    }
    public String toString()
    {
        return super.toString() + "\nFear Stun Time: " + fearStunTime;
    }
}