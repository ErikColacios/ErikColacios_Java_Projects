package birding;

import java.util.Scanner;



public class Main {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		BirdDatabase db = new BirdDatabase();
		
		
		while (true) {
			
			String command = ask(scanner, "Option?");
			
			if(command.equals("Quit")) {
				
				break;
				
			}else if (command.equals("Add")) {
				
				add(scanner,db);
				
			}else if (command.equals("Observation")) {
				
				observation(scanner,db);
				
			}else if (command.equals("Show")) {
				
				show(scanner,db);
				
			}else if (command.equals("Statistics")) {
				
				statistics(db);
				
			}else {
				
				System.out.println("Uknown command!");
				
			}
			System.out.println("\n");
		}
		
	}
	
	
	
	// ===================================== METHODS =======================================================================================================
	
	
	
	public static String ask(Scanner input, String option) {
		
		System.out.println(option);
		System.out.println("Add - Adds a bird");
		System.out.println("Observation - Observes a bird");
		System.out.println("Show - Shows a bird's information");
		System.out.println("Statistics - Shows all birds information");
		System.out.println("Quit - Quits the program");
		System.out.println("\n");
			return input.nextLine();
			
	}
	
	
	public static void add(Scanner input, BirdDatabase db) {
		System.out.println("Name: ");
		String name= input.nextLine();
		if(db.exist(name)) {
			System.out.println("This bird already exists");
		}else {
			System.out.println("Latin name: ");
			String latinName = input.nextLine();
			db.birds.add(new Bird(name,latinName));
		}
		
	}
	
	public static void observation (Scanner input, BirdDatabase db) {
		
		System.out.println("Bird observed: ");
		String name = input.nextLine();
		if(!db.exist(name)) {
			System.out.println("That bird doesn't exist");
		}else {
			db.addObservation(name);
		}
		
	}
	
	public static void show (Scanner input, BirdDatabase db) {
		System.out.println("Which bird?: ");
		String name=input.nextLine();
		if(!db.exist(name)) {
			System.out.println("That bird doesn't exist");
		}else {
			db.findBird(name);
		}
	
	}
	
	
	public static void statistics (BirdDatabase db) {
		db.showAllBirds();
	}
	
	
	
	
	
	
	
}
