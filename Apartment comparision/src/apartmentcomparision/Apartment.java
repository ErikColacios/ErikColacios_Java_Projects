package apartmentcomparision;

public class Apartment {
	
	//ATRIBUTOS
	
	private int rooms;
	private int squareMeters;
	private int pricePerSquareMeter;
	
	
	//CONSTRUCTORES
	
	public Apartment (int rooms, int squareMeters, int pricePerSquareMeter) {
		
		this.rooms = rooms;
		this.squareMeters = squareMeters;
		this.pricePerSquareMeter = pricePerSquareMeter;
		
	}

	
	
	
	
	
	//METODOS
	
	//Este metodo LARGER te dice si THIS apartment es mas grande que el OTHER apartment
	
	public boolean larger (Apartment otherApartment) {
		if(this.getSquareMeters() > otherApartment.getSquareMeters()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	//Este metodo PRICE DIFFERENCE te dice la diferencia de precio entre this Apartment y el other Apartment
	
	public int priceDifference (Apartment otherApartment) {
		
		int precioThisApartment = this.getPricePerSquareMeter() * this.getSquareMeters();
		int precioOtherApartment = otherApartment.getPricePerSquareMeter() * otherApartment.getSquareMeters();
		
		if((precioThisApartment - precioOtherApartment) < 0) {
			int diferencia = (precioThisApartment - precioOtherApartment) * -1;
			return diferencia;
		}else {
			int diferencia = (precioThisApartment - precioOtherApartment);
			return diferencia; 
		}
		
		
	}
	
	
	
	
	//Este metodo MORE EXPENSIVE THAN te dice si this Apartment es o no es mas caro que el other Apartment
	
	public boolean moreExpensiveThan (Apartment otherApartment) {
		int precioThisApartment = this.getPricePerSquareMeter() * this.getSquareMeters();
		int precioOtherApartment = otherApartment.getPricePerSquareMeter() * otherApartment.getSquareMeters();
		
		if(precioThisApartment > precioOtherApartment) {
			
			return true;
			
		}else {
			
			return false;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Getters y setters
	
	public int getRooms() {
		return rooms;
	}


	public void setRooms(int rooms) {
		this.rooms = rooms;
	}


	public int getSquareMeters() {
		return squareMeters;
	}


	public void setSquareMeters(int squareMeters) {
		this.squareMeters = squareMeters;
	}


	public int getPricePerSquareMeter() {
		return pricePerSquareMeter;
	}


	public void setPricePerSquareMeter(int pricePerSquareMeter) {
		this.pricePerSquareMeter = pricePerSquareMeter;
	}
	
	
	//toString
	@Override 
	public String toString() {
		
		return "Apartment rooms = " + rooms + ", squareMeters = " + squareMeters + ", pricePerSquareMeters = "
				+ pricePerSquareMeter;
	}
	
	
}
