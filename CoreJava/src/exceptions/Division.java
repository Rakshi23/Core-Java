package exceptions;
import java.util.*;

public class Division {

	public static void main(String[] args) {
		int a, b, result;
		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");
		a = input.nextInt();
		b = input.nextInt();
		try{
			result = a/b;
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException e){
			System.out.println("Exception cought");
		}
		finally{
			input.close();
			System.out.println("in finally block");
		}
	}

}
