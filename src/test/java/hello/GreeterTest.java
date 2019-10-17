package hello;

import org.junit.Test;

/**
 * A class that runs test suites for our Greeter class.
 */
public class GreeterTest {

    /**
     * Assert that our message equals what it is supposed to.
     */
    @Test
    public void testGreeterMessageIsValid() {
        var greeter = new Greeter();
        var message = greeter.sayHello();
        org.junit.Assert.assertTrue(message.equals("Hello, World!"));
    }
}
