public class TerrapinCard {

	private double balance;

		public TerrapinCard(double balance) {
			this.balance = balance; 
		}

		public void payEconomical() {
			if (balance >= 2.4){
			  balance = this.balance - 2.4;
			}

		}

		public void payGourmet() {
			if (balance >= 4.0){
			  balance = this.balance - 4.0;
			} 
		}

		public String toString() {
			return "This card has " + this.balance + " dollars";
		}

}