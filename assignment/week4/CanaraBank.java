package assignment.week4;

public abstract class CanaraBank implements PaymentInterface { 
	public void recordPaymentDetails() {
		System.out.println("The payment details are recorded");
	}
//implementing unimplemented method inside the abstract class
		public abstract void cashOnDelivery();
		public abstract void cash();
	
}