public class TerrapinCard {

//im done
	private double balance;
		
		public TerrapinCard(double balance) {
			this.balance = balance; 
		}

		public void loadMoney(double amount) {
			if (amount < 0) {
				balance = this.balance;
			} else if ((amount + this.balance) > 150.0) {
				balance =  150.0;
			} else {
				balance = this.balance + amount;
			}
		}

		public void payEconomical() {
			if (balance >= 2.5){
			  balance = this.balance - 2.4;
			}
		}

		public void payGourmet() {
			if (balance >= 4.0){
			  balance = this.balance - 4.0;
			} 
		}

		public double getBalance() {
			return this.balance;
		}

		public String toString() {
			return "The card has " + this.balance + " dollars";
		}

}