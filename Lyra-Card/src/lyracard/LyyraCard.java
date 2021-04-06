package lyracard;

public class LyyraCard {

		//ATRIBUTOS
	
		private double balance;
		
		
		
		
		//CONSTRUCTORES
		
		public LyyraCard(double balance) {
			this.balance = balance;
		}
		
		
		//METODOS
		public double balance() {
			return this.balance;
		}
		
		public void loadMoney(double amount) {
			this.balance += amount;
		}
		
		
		
		public boolean pay (double amount) {
			if(this.balance >= amount) {
				
				this.balance = this.balance - amount;
				return true;
				
			}else {
				
				return false;
				
			}
		}
		

		
		
		
		
		//GETTERS Y SETTERS
		
		public double getBalance() {
			return balance;
		}


		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		
		
		
		
		
}
