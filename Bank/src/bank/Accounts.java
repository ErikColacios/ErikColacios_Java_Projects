package bank;

public class Accounts {

		public static void main(String[] args) {
			
			//Creamos los objetos de Account que en este caso serian los usuarios del banco, con su nombre y su dinero total
			
			Account erik = new Account("Erik", 2500.60);
			Account arnau = new Account("Arnau", 5200.20);
			Account marta = new Account("Marta", 6800);
			
			//Mostramos los objetos que hemos creado
			System.out.println(erik);
			System.out.println(arnau);
			System.out.println(marta);
			
			
			//Ejecutamos el metodo 1 transfer que hemos creado abajo para pasar 200.4 del objeto marta a erik.
			//Y comprobamos que se ha sumado el dinero a la cuenta de erik
			
			transfer(marta,erik,200.4);
			System.out.println("=============================TRANSFER========================================");
			System.out.println(erik);
			System.out.println(arnau);
			System.out.println(marta);
			
			
			
			/*Ahora ejecutaremos el metodo 2 que sirve para ingresar dinero. Escogeremos el usuario al que queremos ingresar
			y pondremos la cantidad */
			//Y otravez mostraremos para ver si se ha efectuado el ingreso
			personalCredit(erik,1000);
			System.out.println("=============================INGRESO========================================");
			System.out.println(erik);
			System.out.println(arnau);
			System.out.println(marta);
			
			
			//Aqui ejecturemos el metodo 3 para sacar dinero de erik. Para ello haremos lo mismo que arriba solo que le quitara dinero
			yourMethod(erik,500);
			System.out.println("=============================REINTEGRO========================================");
			System.out.println(erik);
			System.out.println(arnau);
			System.out.println(marta);
			
			
			
			
			
			
		}
		
		//Metodo 1 para transferir dinero de un objeto a otro
		public static void transfer (Account origen, Account destinatario, double cantidad) {
			if(origen.getBalance() > cantidad) {
				origen.withdrawal(cantidad);
				destinatario.deposit(cantidad);
			}else {
				return;
			}
		}
		
		//Metodo 2 para ingresar dinero en un objeto
		public static void personalCredit (Account usuario, double balance) {
			usuario.deposit(balance);
		}
		
		//Metodo 3 para sacar dinero de un objeto
		public static void yourMethod (Account usuario, double balance) {
			usuario.withdrawal(balance);
		}
}
