class Animal
{
    void animalsound()
    {
        System.out.println("os animais fazem um som!");
    }
}

class Pig extends Animal
{
    void pigsound()
    {
        System.out.println("o porco faz woil woik!");
    }
}


public class Main
{
    public static void main(String[] args)
    {
        Pig sound = new Pig();
        sound.animalsound();
        sound.pigsound();
    }
}