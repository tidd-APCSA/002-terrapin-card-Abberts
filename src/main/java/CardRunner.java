public class CardRunner {
	public static void main(String args[]){
		TerrapinCard card = new TerrapinCard (10);
		System.out.println("Billy: " + card);
		card.loadMoney(-15);
		System.out.println("Billy: " + card);
	}
}

