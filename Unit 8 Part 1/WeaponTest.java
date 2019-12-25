public class WeaponTest
{
    public static void main(String[] args)
    {
        Bullet Shredder = new Bullet("Shredder", 30.0, 500, 8, 64, 8000, 4000, 15.0);
        Explosive Stinger = new Explosive("Stinger", 180.0, 250, 4, 4, 1000, 3000, 10);
        Electric Zeus = new Electric("Zeus", 25.0, 400, 0, 1, 250, 15);
        Plasma Laser = new Plasma("Lazer", 10.0, 1000, 0, 1, 100, 20); 
    }
}
