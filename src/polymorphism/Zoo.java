package polymorphism;

public class Zoo
{
    public static void main(String[] args)
    {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Animal sasha = new Dog();
        
    }
}
