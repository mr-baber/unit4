public class MathAlgorithms{
    public static void main(String[] args) {

        // Use printDigits method to print the digits of Integer.MAX_VALUE
        printDigits(Integer.MAX_VALUE);
        // Use a loop and the isPrime method to print the first 100 primes.
    
        // Use a loop and the isPerfect method to print out the only perfect
        // numbers that can be expresssed with an int variable.
    
      }
    
      /*
       * Write the implementation for the following method that will
       * take any positive int value, num, and return its properly labelled
       * individual digits.
       * HINT: You may want to use String.valueOf() to get the number of digits,
       * unless you feel comfortable with logarithms!
       */
    
      public static void printDigits(int num) {
        // Your code goes here
        int place = 1;
        while (num > 0){
          System.out.println(place + "s place:" + num % 10);
          num /= 10;
          place *= 10;
        }
      }
    
      /*
       * Write the implementation for the following method that will
       * take an int parameter and return an int that represents the
       * sum of num's factors, excluding 1 and num itself:
       * so, num = 8 would return 6 while 7 would return 0.
       * Thus, a return value of 0 would indicate that num is prime,
       * and a value greater than 0 would indicate a composite number.
       * The second parameter is a boolean that indicates whether to
       * print the factors.
       */
    
      public static int isPrime(int num, boolean printFactors) {
        return 0;
      }
    
      /*
       * Write the implementation for the following (VERY simple) method
       * that returns a boolean indicating whether the int parameter is
       * perfect (the sum of all num's factors, excluding itself, equal num).
       * Your implementation must make use of the isPrime method.
       */
    
      public static boolean isPerfect(int num) {
        return false;
      }
}