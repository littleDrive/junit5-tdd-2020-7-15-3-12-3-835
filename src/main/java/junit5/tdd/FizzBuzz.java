package junit5.tdd;


public class FizzBuzz {

    public static String playFizzBuzz(int number) {

        String result = "";
//        if (number % 3 == 0 && number % 5 == 0) {
//            return "FizzBuzz";
//        }
        if (number % 3 == 0) {
            result +=  "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (result.equals("")) {
            result = String.valueOf(number);
        }
        return result;
    }
}
