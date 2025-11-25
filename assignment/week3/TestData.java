package assignment.week3;

public class TestData {

	public void enterCredentials(){
		System.out.println("enterCredentials");
		}

	public void navigateToHomePage() {
		System.out.println("Go to HomePage");
		}

		public static void main(String[] args) {
			
			TestData testDataOptions = new TestData ();
			testDataOptions.enterCredentials();
			testDataOptions.navigateToHomePage();
			
			
		}
}




