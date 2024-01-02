import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.Test;

public class ApplicationTest extends TestCase
{
    public ApplicationTest( String testName )
    {
        super( testName );
    }


    public static Test suite()
    {
        return (Test) new TestSuite( ApplicationTest.class );
    }


    public void testApp()
    {
        assertTrue( true );
    }
}
