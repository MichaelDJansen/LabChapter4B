package za.ac.cput.MichaelJansen;

/**
 * Created by student on 2015/02/27.
 */
public class Dog implements Trained
{
    private Animal dog;

    public Dog(){dog = new Animal();}
    public Dog(String name,String breed,Boolean healthy, Boolean washed){dog = new Animal(name,breed,healthy, washed);}

    public String getName()
    {
        return dog.getName();
    }

    public void setName(String name)
    {
        dog.setName(name);
    }

    public String speak(){return "Woof";}
    public String roll(){return "Dog Rolled";}
    public String fetch(){return "Dog brought ball back";}
    public String skateboard(){return "Dog did a Kickflip";}

    public void setBreed(String breed)
    {
        dog.setBreed(breed);
    }

    public String getBreed()
    {
        return dog.getBreed();
    }
}
