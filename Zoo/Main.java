public class Main
{
    public static void main(String[] args)
    {
        Feeder Joe = new Feeder("Joe", 21, 5.4);
        Maintainer Bob = new Maintainer("Bob", 25, 5.5);
        Bear Alph = new Bear("Alph", "male", 6, 340);
        Owl Brav = new Owl("Brav", "female", 3, 62);
        Moose Char = new Moose("Char", "male", 5, 270);
        Wolf Delt = new Wolf("Delt", "female", 4, 120);
        Eagle Echo = new Eagle("Echo", "male", 2, 100);
        Food Bearfood = new Food("Bearfood", 10000, 11000, false);
        Food Owlfood = new Food("OwlBearfood", 10000, 9000, false);
        Food Moosefood = new Food("Moosefood", 10000, 10500, false);
        Food Wolffood = new Food("Wolffood", 10000, 11000, false);
        Food Eaglefood = new Food("Eaglefood", 10000, 9000, false);
        Cleaner MainC = new Cleaner("Yellow", 1000, false);
        Tool WakeUper = new Tool("WakeUper", 1, 'W');
        Tool SprayBottle = new Tool("SprayBottle", 2, 'S');
        Water MainW = new Water(10000, 16, false);
        System.out.println(Joe);
        System.out.println(Bob);
        System.out.println(Alph);
        System.out.println(Brav);
        System.out.println(Char);
        System.out.println(Delt);
        System.out.println(Echo);
        System.out.println(Bearfood);
        System.out.println(Owlfood);
        System.out.println(Moosefood);
        System.out.println(Wolffood);
        System.out.println(Eaglefood);
        System.out.println(MainC);
        System.out.println(WakeUper);
        System.out.println(SprayBottle);
        System.out.println(MainW);
        Alph.makeNoise();
        Brav.makeNoise();
        Char.makeNoise();
        Delt.makeNoise();
        Echo.makeNoise();
        Alph.setHungry(true);
        Brav.setHungry(true);
        Char.setHungry(true);
        Delt.setHungry(true);
        Echo.setHungry(true);
        Joe.feedBear(Alph, Bearfood);
        Joe.feedOwl(Brav, Owlfood);
        Joe.feedMoose(Char, Moosefood);
        Joe.feedWolf(Delt, Wolffood);
        Joe.feedEagle(Echo, Eaglefood);
    }
}