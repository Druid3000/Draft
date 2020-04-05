import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testJoinArray() {
        String expected = "T:E:S:T";
        String[] source = {"T", "E", "S", "T"};
        assertEquals("Test is failed", expected, StringUtils.joinArray(source, ':'));
        assertNull(StringUtils.joinArray(null, ':'));
    }

    @Test
    public void testToArray() {
        String[] expected = {"T", "E", "S", "T"};
        String source="T:E:S:T";
        assertArrayEquals("Wrong array", expected, StringUtils.toArray(source, ':'));
        assertNull(StringUtils.toArray(null, ':'));
    }

    @Test
    public void testIsEmpty(){
        assertFalse("Non empty string claimed to be empty", StringUtils.isEmpty("TEST"));
        assertTrue("Empty string not recognized", StringUtils.isEmpty(""));
        assertTrue("Whitespaces not recognized", StringUtils.isEmpty(" "));
    }

    @Test
    public void testToDouble() {
        assertEquals (3.1415, StringUtils.toDouble("3.1415"), 0.0001);
        assertEquals("Not NaN of null", Double.NaN, StringUtils.toDouble(null), 0.00001);

    }

    @Test
    public void testFromDouble() {
        double source = 3.1415;
        String expected = "3.1415";

        String actual = StringUtils.fromDouble(source);
        assertEquals("Unexpected string value", expected, actual);
    }
}
