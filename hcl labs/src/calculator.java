import java.util.*;
import java.io.IOException;

public class calculator {
	public static void main(String [] args) throws IOException{
		float a;
		float b;
		char oper;
		float answer = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter first number." );
		a = input.nextFloat();
	        
		do
		{
			System.out.println("What operation? Enter '+', '-', 'x', or '/'.");
			oper = input.next().charAt(0);
		}
		while(oper != '+' && oper != '-' && oper != 'x' && oper != '/');
		
		
		System.out.println("Enter second number." );
		b = input.nextFloat();
		
		input.close();
		
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