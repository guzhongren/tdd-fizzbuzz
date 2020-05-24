package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzWhizzTest {

    @Test
    public void canRunTest() {
        assertEquals(42,42);
    }
    @ParameterizedTest(name="should_return_{1}_when_say_given_input_is_{0}")
    @CsvSource({
            "1, 1",
            "2,2"
    })
    public void FizzBuzzWhizzTestForNormal(int input, String expect) {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz(input);
        assertEquals(expect, fizzBuzzWhizz.say());
    }

    @Test
    public void should_return_Fizz_when_say_given_input_is_3x() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz(3);
        assertEquals("Fizz", fizzBuzzWhizz.say());
    }

    @Test
    public void should_return_Buzz_when_say_given_input_is_5x() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz(5);
        assertEquals("Buzz", fizzBuzzWhizz.say());
    }
}
