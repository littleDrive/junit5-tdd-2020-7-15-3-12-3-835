package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {
    @Test
    void should_return_1_when_playFizzBuzz_given_1() {
        //given
        int number = 1;
        //when
        String result = FizzBuzz.playFizzBuzz(number);
        //then
        assertEquals("1", result);
    }

    @Test
    void should_return_Fizz_when_playFizzBuzz_given_3() {
        //given
        int number = 3;
        //when
        String result = FizzBuzz.playFizzBuzz(number);
        //then
        assertEquals("Fizz", result);
    }
}
