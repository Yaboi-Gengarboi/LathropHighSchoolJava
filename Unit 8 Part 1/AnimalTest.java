public class AnimalTest
{
    public static void main(String[] args)
    {
        Shark shark = new Shark("Female", "Grey");
        Whale whale = new Whale("Female", "Black");
        Squirrel squirrel = new Squirrel("Male", "Brown");
        Rabbit rabbit = new Rabbit("Male", "White");
        Scorpion scorpion = new Scorpion("Male", "Black");
        Snake snake = new Snake("Female", "Orange");
        Animal[] animals = {shark, whale, squirrel, rabbit, scorpion, snake};
        for (int i = 0; i < 6; i++)
            System.out.println(animals[i].toString());
    }
}
