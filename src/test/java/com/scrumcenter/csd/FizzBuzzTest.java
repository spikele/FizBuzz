package  com.scrumcenter.csd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void testFizz() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
    }

    @Test
    public void testNumber() {
        assertEquals("7", FizzBuzz.fizzbuzz(7));
    }


    @Test
    public void testWoof3() { assertEquals("Woof", FizzBuzz.fizzbuzz(3, "Woof"));}

    @Test
    public void testWoof5() { assertEquals("Buzz", FizzBuzz.fizzbuzz(5, "Woof"));}

    @Test
    public void testWoof15() { assertEquals("WoofBuzz", FizzBuzz.fizzbuzz(15, "Woof"));}

    @Test
    public void testWoofNumber() { assertEquals("7", FizzBuzz.fizzbuzz(7, "Woof")); }
}