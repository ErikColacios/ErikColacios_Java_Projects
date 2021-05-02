package birding;

import java.util.ArrayList;


public class BirdDatabase {
	
	ArrayList<Bird>birds;
	
	
	public BirdDatabase() {
		this.birds = new ArrayList<Bird>();
	}
	
	public ArrayList<Bird> getBirds(){
		return birds;
	}
	
	public void setBirds(ArrayList<Bird> birds) {
		this.birds = birds;
	}
	
	
	public boolean exist(String name) {
		for(Bird x:this.birds) {
			if(x.name.equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public void addObservation (String name) {
		for (Bird x:this.birds) {
			if(x.name.equals(name)) {
				x.increaseObservations();
			}
		}
	}
	
	public void findBird(String name) {
		for (Bird x:this.birds) {
			if(x.name.equals(name)) {
				System.out.println(x.toString());
			}
		}
	}
	
	public void showAllBirds() {
		for (Bird x:this.birds) {
			System.out.println(x.toString());
		}
	}
	
	
}
