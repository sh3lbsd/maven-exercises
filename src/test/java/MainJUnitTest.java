import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainJUnitTest {
    @Test
    public void testTwoIsTwo(){
        assertEquals(2,2);
    }

    @Test
    public void testAssertions() {
        int num = 2;
        assertEquals(2, num);
        assertEquals("bob", "bob");

    }

    @Test
    public void testReturnGreeting() {
        assertEquals("Well, hello!", Main.returnGreeting("hello"));
        assertEquals("Well, howdy!", Main.returnGreeting("howdy"));
    }

    @Test
    public void testAdd() {
        assertEquals(4, Main.add(2,2));
    }

}
