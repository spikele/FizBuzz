package  com.scrumcenter.csd;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class FizzBuzzTest {
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


    @Test
    public void testWoofMeow3() { assertEquals("Woof", FizzBuzz.fizzbuzz(3, "Woof", "Meow"));}

    @Test
    public void testWoofMeow5() { assertEquals("Meow", FizzBuzz.fizzbuzz(5, "Woof", "Meow"));}

    @Test
    public void testWoofMeow15() { assertEquals("WoofMeow", FizzBuzz.fizzbuzz(15, "Woof", "Meow"));}

    @Test
    public void testWoofMeowNumber() { assertEquals("7", FizzBuzz.fizzbuzz(7, "Woof", "Meow")); }


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testPrintUsedWordsWoofMeow() {
        FizzBuzz.fizzbuzz(7, "Woof", "Meow");
        assertThat(outContent.toString(), containsString("Using words Woof and Meow."));
    }

    @Test
    public void testPrintUsedWordsFizzBuzz() {
        FizzBuzz.fizzbuzz(7);
        assertThat(outContent.toString(), containsString("Using words Fizz and Buzz."));
    }
}