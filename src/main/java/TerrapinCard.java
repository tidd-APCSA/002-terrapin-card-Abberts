public class TerrapinCard {

	private double balance;

		public TerrapinCard(double balance) {
			this.balance = balance; 
		}

		public void payEconomical() {
			balance - 2.50;
		}

		public void payGourmet(double balance) {
			return balance - 4.0;
		}

		public String toString() {
			return "This card has " + this.balance + " dollars.";
		}

}