public class TerrapinCard {

	private double balance;

		public TerrapinCard(double balance) {
			this.balance = balance; 
		}

		public void payEconomical() {
			balance = this.balance - 2.5;
		}

		public void payGourmet() {
			  balance = this.balance - 4.0;
		}

		public String toString() {
			return "This card has " + this.balance + " dollars.";
		}

}