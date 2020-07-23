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

    @Test
    void should_return_Buzz_when_playFizzBuzz_given_5() {
        //given
        int number = 5;
        //when
        String result = FizzBuzz.playFizzBuzz(number);
        //then
        assertEquals("Buzz", result);
    }

    @Test
    void should_return_Whizz_when_playFizzBuzz_given_7() {
//        given
        int number = 7;
//        when
        String result = FizzBuzz.playFizzBuzz(number);
//        then
        assertEquals("Whizz", result);
    }

    @Test
    void should_return_FizzBuzz_when_playFizzBuzz_given_multiples_of_3_and_5() {
//        given
        int number = 15;
//        when
        String result = FizzBuzz.playFizzBuzz(number);
//        then
        assertEquals("FizzBuzz", result);
    }
    @Test
    void should_return_FizzBuzz_when_playFizzBuzz_given_multiples_of_3_and_7() {
//        given
        int number = 21;
//        when
        String result = FizzBuzz.playFizzBuzz(number);
//        then
        assertEquals("FizzWhizz", result);
    }


}
