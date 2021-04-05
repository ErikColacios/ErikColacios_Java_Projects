package apartmentcomparision;

public class Main {
	
		public static void main(String[] args) {
			
			Apartment manhattan = new Apartment(2, 16, 5500);
			Apartment brooklyn = new Apartment(2, 38, 4200);
			Apartment bronx = new Apartment(3, 78, 2500);
			
			System.out.println(manhattan);
			System.out.println(brooklyn);
			System.out.println(bronx);
			System.out.println("\n");
			
			//Metodo LARGER que compara si el Apartment manhattan es mas grande que el de bronx
			System.out.println("Metodo LARGER");
			System.out.println(manhattan.larger(bronx));
			System.out.println("\n");
			
			
			
			//Metodo PRICE DIFFERENCE que te copara la diferencia de lo que cuesta el Apartment de manhattan respecto a bronx
			System.out.println("Metodo PRICE DIFFERENCE");
			System.out.println(manhattan.priceDifference(bronx));
			System.out.println("\n");
			
			
			//Metodo MORE EXPENSIVE THAN que te compara si el Apartment bronx es mas caro que brooklyn
			System.out.println("Metodo MORE EXPENSIVE THAN");
			System.out.println(bronx.moreExpensiveThan(brooklyn));
			System.out.println("\n");
			
		}
		
}
