package assignment.week3;

public class LoginTestData extends TestData{

	public void enterUsername(){
		System.out.println("enterCredentials");
		}

	public void enterPassword() {
		System.out.println("enterPasswor)");
		}

		public static void main(String[] args) {
			
			LoginTestData loginOptions = new LoginTestData ();
			loginOptions.enterUsername();
			loginOptions.enterPassword();
			//calling methods from Parent TestData;
			loginOptions.enterCredentials();
			loginOptions.navigateToHomePage();
		}
}

