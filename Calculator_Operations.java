import java.util.*;
import java.lang.*;

class Calculator_Operations
{
  	public static void main(String[] args) 
	{

    		char operator;
    		Double number1, number2, result;

    		Scanner input = new Scanner(System.in);

    		System.out.println("Enter first number");
    		number1 = input.nextDouble();

    		System.out.println("Enter second number");
    		number2 = input.nextDouble();

		do
		{

		System.out.println("Choose an operator: \n + -> ADDITION \n - -> SUBTRACTION \n * -> MULTIPLICATION \n / -> DIVISION \n # -> EXIT \n");
    		operator = input.next().charAt(0);

    		switch (operator) 
		{
      			case '+':System.out.println("You Choosed ADDITION ");
				 result = number1 + number2;
        			 System.out.println(number1 + " + " + number2 + " = " + result+"\n");
        			 break;

      			case '-':System.out.println("You Choosed SUBTRACTION ");
				 result = number1 - number2;
        			 System.out.println(number1 + " - " + number2 + " = " + result+"\n");
        			 break;

      			case '*':System.out.println("You Choosed MULTIPLICATION ");
				 result = number1 * number2;
        			 System.out.println(number1 + " * " + number2 + " = " + result+"\n");
        			 break;

			case '/':System.out.println("You Choosed DIVISION ");
				 result = number1 / number2;
        			 System.out.println(number1 + " / " + number2 + " = " + result+"\n");
        			 break;

			case '#':System.out.println("You Choosed EXIT ");
				 System.exit(0);
				 break;

      			default:System.out.println("Invalid operator!... Please Enter Correct One...");
        			break;
    		}
		}while(true);
    		//input.close();
  }
}