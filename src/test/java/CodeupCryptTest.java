import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testVersion() {
        assertEquals(0.0, CodeupCrypt.version, 0);
        CodeupCrypt.version =1.0;
        assertEquals(1.0, CodeupCrypt.version, 0);
    }

    @Test
    public void testHashPassword(){
        assertEquals("", CodeupCrypt.hashPassword(""));
        assertEquals("444", CodeupCrypt.hashPassword("444"));
        assertEquals("234", CodeupCrypt.hashPassword("234"));
        assertEquals("c4t", CodeupCrypt.hashPassword("cat"));
        assertEquals("c4t", CodeupCrypt.hashPassword("cAt"));

    }


}
