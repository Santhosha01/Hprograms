package Day4.program3;

public class PaybackCard extends Card{

	private int pointsEarned;
	private double totalAmount;
	
	public PaybackCard(String holderName, String cardNumber, String expiryDate, int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
		System.out.println(holderName+"'s Payback Card Details : ");
		System.out.println("Card Number : "+cardNumber);
		System.out.println("points Earned : "+pointsEarned);
		System.out.println("Total Amount : "+totalAmount);
	}

	public int getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
}
