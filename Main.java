/**
 * Checks to see if a number is a Nivine number or not
 * @author Liana Bazzarella
 */
public class Main {

  public static boolean isNiven(int n){
    // varaible to keep original number
    int originalNumb = n;

    // initialize varaible so can use outside of while loop
    int middleDigits = 0;

    // accumulator variable
    int sum = middleDigits;

    // used to find last digit of number
    int lastDigit = ( n % 10 );

    // used to find first digit of number and middle numbers while adding them together
    while(n >= 10){
      n = n / 10;
      if ( n >= 10){
        middleDigits = n;
        middleDigits %= 10;
        sum = sum + middleDigits;
      }
    }

    // varaible for value of first digit
    int firstDigit = n;

    // variable that adds all the numbers together
    int finalSum = firstDigit + sum + lastDigit;

    // if statement to determine if nivine number or not
    if(originalNumb % finalSum == 0){
      System.out.println("True");
      return true;
    } else{ 
      System.out.println("False");
      return false; }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // number that is checked to be nivine umber or not
    isNiven(6804);
  }
}
