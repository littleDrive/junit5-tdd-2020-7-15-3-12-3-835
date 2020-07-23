package junit5.tdd;


public class FizzBuzz {

    public static String playFizzBuzz(int number) {

        String result = "";
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0 && number % 7 == 0) {
            return "FizzWhizz";
        }
        if (number % 5 == 0 && number % 7 == 0) {
            return "BuzzWhizz";
        }

        if (number % 3 == 0) {
            return   "Fizz";
        }
        if (number % 5 == 0) {
            return  "Buzz";
        }
        if (number % 7 == 0) {
            return  "Whizz";
        }

        return String.valueOf(number);


//        if (number % 3 == 0) {
//            result +=  "Fizz";
//        }
//        if (number % 5 == 0) {
//            result += "Buzz";
//        }
//        if (number % 7 == 0) {
//            result += "Whizz";
//        }
//
//        if (result.equals("")) {
//            result = String.valueOf(number);
//        }
//        return result;
    }
}
