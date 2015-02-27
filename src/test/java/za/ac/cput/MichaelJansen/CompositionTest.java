package za.ac.cput.MichaelJansen;

/**
 * Created by student on 2015/02/27.
 */
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CompositionTest extends TestCase
{
    Dog d;
    @Before
    public void setUp() throws Exception
    {
        d = new Dog("Ryan","Ridgeback",true,false);
    }

    @Test
    public void testComposition() throws Exception
    {
        assertEquals("Ryan",d.getName());
        d.setBreed("Chihuahua");
        assertEquals("Chihuahua", d.getBreed());
    }



}
