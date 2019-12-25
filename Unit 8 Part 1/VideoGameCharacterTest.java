public class VideoGameCharacterTest
{
    public static void main(String[] args)
    {
        Agent agent = new Agent(2.402, 2.1, 1.11, 2);
        Ghost ghost = new Ghost(2.402, 2.1, 1.11, 2);
        Cowboy cowboy = new Cowboy(2.402, 2.1, 1.11, 2);
        Ninja ninja = new Ninja(2.402, 2.1, 1.11, 2);
        Knight knight = new Knight(2.402, 2.1, 1.11, 2);
        Wrestler wrestler = new Wrestler(2.402, 2.1, 1.11, 2);
        Doctor doctor = new Doctor(2.402, 2.1, 1.11, 2);
        Archer archer = new Archer(2.402, 2.1, 1.11, 2);
        Magician magician = new Magician(2.402, 2.1, 1.11, 2);
        Monster monster = new Monster(2.402, 2.1, 1.11, 2);
        Robot robot = new Robot(2.402, 2.1, 1.11, 2);
        Assasin assasin = new Assasin(2.402, 2.1, 1.11, 2);
        VideoGameCharacter[] characters = {agent, ghost, cowboy, ninja, knight, wrestler, doctor, archer, magician, monster, robot, assasin};
        for (int i = 0; i < characters.length; i++)
            System.out.println(characters[i].toString());
    }
}
