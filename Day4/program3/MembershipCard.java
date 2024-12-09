package Day4.program3;

public class MembershipCard extends Card{

	private int rating;
	
	public MembershipCard(String holderName, String cardNumber, String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
		System.out.println(holderName+"'s MemberShip Card Details : ");
		System.out.println("Card Number : "+cardNumber);
		System.out.println("Card Rating : "+rating);
	}

	
	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}

}
