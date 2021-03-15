package cambiarcorreo;
import java.util.Scanner;

public class cambiarcorreo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un correo: ");
		String correo = input.nextLine();
		int index= correo.indexOf("@");
		
		
		System.out.println(correo.substring(0,index)+"@hotmail.com");
		
		
	}

}
