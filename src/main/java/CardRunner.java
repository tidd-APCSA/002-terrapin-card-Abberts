public class CardRunner {
	public static void main(String[] args) {
		TerrapinCard cardBilly= new TerrapinCard (20);
		TerrapinCard cardBrian = new TerrapinCard (30);

		cardBilly.payGourmet();
		System.out.println("Billy: " + cardBilly);		

		cardBrian.payEconomical();
		System.out.println("Brian: " + cardBrian);

		cardBilly.loadMoney(20);
		System.out.println("Billy: " + cardBilly);

		cardBrian.payGourmet();
		System.out.println("Brian: " + cardBrian);

		cardBilly.payEconomical();
		cardBilly.payEconomical();
		System.out.println("Billy: " + cardBilly);

		cardBrian.loadMoney(50);
		System.out.println("Brian: " + cardBrian);
	}
}