import java.util.Scanner;

class javacalc {
  public static void main(String[] args) {

    char operator;
    int number1, number2, result;

    // create an object of Scanner class
    Scanner sc = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = sc.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = sc.nextInt();

    System.out.println("Enter second number");
    number2 = sc.nextInt();

    switch (operator) {

      // performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*'
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    
  }
}