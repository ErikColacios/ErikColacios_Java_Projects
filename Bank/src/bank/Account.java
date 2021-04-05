package bank;

public class Account {
	
		//Atributos de la clase Account--------------------------------------------------------------------------------
	
		private double balance;
		private String owner;
		
		
		
		//Constructores -----------------------------------------------------------------------------------------------
		
		public Account (String owner, double balance) {
			this.balance = balance;
			this.owner = owner;
		}
		
		public void deposit (double amount) {
			balance += amount;
		}
		
		public void withdrawal (double amount) {
			balance -= amount;
		}
		
		
		
		//Getters y setters ---------------------------------------------------------------------------------------------
		
		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}
		
		
		//ToString -------------------------------------------------------------------------------------------------------
		
		@Override 
		public String toString() {
			return owner + " balance: " + balance;
		}
		
	
}
