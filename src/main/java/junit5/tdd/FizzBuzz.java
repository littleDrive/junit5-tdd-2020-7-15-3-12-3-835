package junit5.tdd;

public class FizzBuzz {

    public static String playFizzBuzz(int number) {
        if (number == 3) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
