package assignment.week4;

public class CanaraImplementation extends CanaraBank {

	// only the unimplemented methods is copied from the Payment Interface
	public void cardPayments() {
		System.out.println("Card Payment accepted.");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("InternetBanking accepted.");
		
	}

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on delivery accepted.");
	}
	
	// This is the unimplemented method from the Abstract CanaraBank class.
	public void cash() {
		// TODO Auto-generated method stub
	}
		public static void main(String[] args) {
			CanaraImplementation CanaraImpObjects = new CanaraImplementation();
			CanaraImpObjects.cashOnDelivery();
			CanaraImpObjects.recordPaymentDetails();
			CanaraImpObjects.cardPayments();
		}

	
			
		}
		
	


