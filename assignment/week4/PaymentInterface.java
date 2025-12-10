package assignment.week4;

//AM    KEYWORD		INTERFACENAME
public interface PaymentInterface {
	//abstract methods/unimplemented method
	public void cashOnDelivery();
	// using default, static keyword to use implemented method inside interface
	default void upiPayments() {
	}
	static void emiPayments() {
	}
	public void cardPayments();
	public void internetBanking();
	
}

//Requirements: Create an Interface Payments with the following abstract methods: - cashOnDelivery() - upiPayments() - 
//cardPayments() - internetBanking() Create an Abstract Class CanaraBank that implements Payments interface
//and adds `recordPaymentDetails()` for payment specifics.
//Create a Concrete Class Amazon that inherits CanaraBank, implementing methods.