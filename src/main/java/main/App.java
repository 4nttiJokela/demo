package main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal myAnimal = new Animal("Pikseli", "hedgehog", 13);

        System.out.println(myAnimal.name);
        System.out.println(myAnimal.species);
        System.out.println(myAnimal.age);
    }
}
