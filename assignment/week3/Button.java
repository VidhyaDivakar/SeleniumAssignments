package assignment.week3;

public class Button extends WebElement {

	public void submit(){
		System.out.println("Submit button is a clickable WebElement");
		}

	public void createLead() {
		System.out.println("createLead is a clicakble WebElement");
		}

		public static void main(String[] args) {
			
			Button buttonOptions = new Button ();
			buttonOptions.submit();
			buttonOptions.createLead();
			// following are the methods from the Parent class WebElement
			buttonOptions.click();
			buttonOptions.setText("text");
			
		}
}