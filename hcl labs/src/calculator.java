import java.util.*;
import java.io.IOException;

public class calculator {
	public static void main(String [] args) throws IOException{
		int a;
		int b;
		char oper;
		double answer = 0.0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter first number." );
		a = input.nextInt();
	        
		System.out.println("What operation? Enter '+', '-', 'x', or '/'");
		oper = input.next().charAt(0);
		
		System.out.println("Enter second number." );
		b = input.nextInt();
		
		switch(oper) {
		case '+': answer = a + b;
		break;
		case '-': answer = a - b;
		break;
		case 'x': answer = a * b;
		break;
		case '/': answer = a / b;
		break;
		}
		System.out.println(a+" "+oper+" "+b+" = "+answer);
	}
}