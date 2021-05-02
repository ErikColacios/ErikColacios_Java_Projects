package birding;

public class Bird {
	
	String name;
	String latinName;
	int observations;
	
	
	public Bird(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
	}

	public Bird(String name, String latinName, int observations ) {
		this.name = name;
		this.latinName = latinName;
		this.observations = observations;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLatinName() {
		return latinName;
	}


	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}


	public int getObservations() {
		return observations;
	}


	public void setObservations(int observations) {
		this.observations = observations;
	}
	
	public void increaseObservations() {
		this.observations++;
	}
	
	@Override
	public String toString() {
		return "Bird [name=" + name + ", latinName=" + latinName + ", observations=" + observations + "]";
	}
	
	
	
	
	
}
