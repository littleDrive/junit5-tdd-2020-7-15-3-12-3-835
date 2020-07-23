package junit5.tdd;

public class FizzBuzz {

    public static String playFizzBuzz(int number) {
        if (number == 3) {
            return "Fizz";
        }
        if (number == 5) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
