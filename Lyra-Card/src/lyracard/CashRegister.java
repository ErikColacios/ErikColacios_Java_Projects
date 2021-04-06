package lyracard;

public class CashRegister {
		
	
		//ATRIBUTOS
	
		private double cashInRegister; 
		
		private int economicalSold;
		
		private int gourmetSold;
		
		
		
		//CONSTRUCTORES 
		
		public CashRegister(double cashInRegister) {
			this.cashInRegister = 1000;
		}

		
		
		//METODOS
		
		public double payEconomical(double cashGiven) {
			
			double precio = 2.5;
			
						if(cashGiven >= precio) {
							
								this.cashInRegister += precio; 
								this.economicalSold +=1;
								
								return cashGiven - precio;
							
						}else {
							
								return cashGiven;
							
						}
		}
		
		
		public double payGourmet(double cashGiven) {
			
			double precio = 4;
						
						if(cashGiven >= precio) {
							
								this.cashInRegister += precio; 
								this.gourmetSold +=1;
								
								return cashGiven - precio;
							
						}else {
							
								return cashGiven;
							
						}
			
		}
		
		public boolean payEconomical(LyyraCard card) {
			
				double precio = 2.5;
				
				if(card.getBalance() >= precio) {
					
					this.economicalSold += 1;
					
					return true;
					
				}else {
					
					return false;
						
				}
			
			
		}
		
		public boolean payGourmet(LyyraCard card) {
				
			double precio = 4;
			
			if(card.getBalance() >= precio) {
				
				this.gourmetSold += 1;
				card.pay(precio);
				
				return true;
				
			}else {
				
				return false;
					
			}
		}
		
		
		public void loadMoneyToCard(LyyraCard card, double sum) {
			
			if(sum > 0) {
				this.cashInRegister += sum;
				card.loadMoney(sum);
				
			}
			
		}
		



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//GETTERS Y SETTERS
		
		public double getCashInRegister() {
			return cashInRegister;
		}
		
		public void setCashInRegister(double cashInRegister) {
			this.cashInRegister = cashInRegister;
		}



		public int getEconomicalSold() {
			return economicalSold;
		}



		public void setEconomicalSold(int economicalSold) {
			this.economicalSold = economicalSold;
		}



		public int getGourmetSold() {
			return gourmetSold;
		}



		public void setGourmetSold(int gourmetSold) {
			this.gourmetSold = gourmetSold;
		}
		
		
		
		
		@Override
		
		public String toString() {
			return "Money in register " + cashInRegister + " economical lunches sold: " + economicalSold +
					" gourmet lunches sold: " + gourmetSold; 
		}
		
		
		
		
		
		
		
		
	
}
