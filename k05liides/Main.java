import java.util.*;

public class Main {
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		boolean check = false;
		double answer = 0;
		Calculator calc = new Calculator();
		System.out.print("Sisestage number: ");
		String number1 = reader.nextLine();
		double num1 = Double.parseDouble(number1);
		System.out.println(" + | - | x | / ");
		String input = reader.nextLine();

		while (check != true){
			if (input.equals("+")){
			System.out.print("Sisestage number: ");
			String number2 = reader.nextLine();
			double num2 = Double.parseDouble(number2);
			answer = calc.Add(num1, num2);
			System.out.println("Vastus: " + answer);
			}
			
			if (input.equals("-")){
			System.out.print("Sisestage number: ");
			String number2 = reader.nextLine();
			double num2 = Double.parseDouble(number2);
			answer = calc.Subtract(num1, num2);
			System.out.println("Vastus: " + answer);
			}
			
			if (input.equals("x")){
			System.out.print("Sisestage number: ");
			String number2 = reader.nextLine();
			double num2 = Double.parseDouble(number2);
			answer = calc.Multiply(num1, num2);
			System.out.println("Vastus: " + answer);
			}
			
			if (input.equals("/")){
			System.out.print("Sisestage number: ");
			String number2 = reader.nextLine();
			double num2 = Double.parseDouble(number2);
			answer = calc.Divide(num1, num2);
			System.out.println("Vastus: " + answer);
			}
			
			System.out.println("Kas jätkata? [j/e]");
			String choice = reader.nextLine();
			if(choice.equals("j")){
				num1 = answer;
				System.out.println(" + | - | x | / ");
				input = reader.nextLine();
			}
			else{
				check = true;
			}
		}
	}
}
