package calculadora;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("CALCULADORA");
		
		while(true) {
			
			System.out.println("Quieres sumar '+', restar '-', multiplicar '*', dividir '/' o modulo '%' ?");
			String opcion = input.nextLine(); 
			if(opcion.equals("salir")) {
				break;
			}
			System.out.println("introduce dos numeros:");
			
			System.out.println("Primer numero:");
			int n1 = Integer.parseInt(input.nextLine());
			System.out.println("Segundo numero:");
			int n2 = Integer.parseInt(input.nextLine());
			
			if(opcion.equals("+")) {
				int result = n1 + n2;
				System.out.println("El resultado de la suma es: "+ result);
			}else if(opcion.equals("-")) {
				int result = n1 - n2;
				System.out.println("El resultado de la resta es: "+ result);
			}else if(opcion.equals("*")) {
				int result = n1 * n2;
				System.out.println("El resultado de la multiplicacion es: "+ result);
			}else if(opcion.equals("/")) {
				int result = n1 / n2;
				System.out.println("El resultado de la division es: "+ result);
			}else if(opcion.equals("%")) {
				int result = n1 % n2;
				System.out.println("El resultado del modulo es: "+ result);
			}
		}

	}

}
