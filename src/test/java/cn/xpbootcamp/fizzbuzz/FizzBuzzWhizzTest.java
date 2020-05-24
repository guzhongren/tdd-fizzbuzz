package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzWhizzTest {

    @Test
    public void canRunTest() {
        assertEquals(42,42);
    }

    @Test
    public void should_return_1_when_say_given_input_is_1() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz(1);
        assertEquals("1", fizzBuzzWhizz.say());
    }
    @Test
    public void should_return_2_when_say_given_input_is_2() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz(2);
        assertEquals("2", fizzBuzzWhizz.say());
    }
}
