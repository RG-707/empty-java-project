package de.iteratec.misc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void helloGreeting() {
        Greeter greeter = new Greeter();
        assertEquals("Hello, World!", greeter.hello());
    }
}
