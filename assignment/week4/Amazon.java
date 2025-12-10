package assignment.week4;

public class Amazon extends CanaraBank {
	public void cashOnDelivery() {
		System.out.println("Cash on Delivery is available");
	}
	
	public void upiPayments() {
		System.out.println("UPI Payment is available");
	}
	public void cardPayments() {
	System.out.println("Card Payment is available");
}
	public void internetBanking() {
		System.out.println("Internet Banking Payment is available");
	}
	//this is the unimplemented method in the CanaraBank Abstract class.
	public void cash() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		Amazon amazonObjects = new Amazon();
		amazonObjects.cashOnDelivery();
		amazonObjects.recordPaymentDetails();
		amazonObjects.cardPayments();

	}

	

}
