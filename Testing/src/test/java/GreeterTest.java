import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GreeterTest {

        @Test
        public void testGreeter(){
                Greeter testedGreeter = new Greeter();
                assertEquals("Hello, world", testedGreeter.greeter("world"));
        }
}
