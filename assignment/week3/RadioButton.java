package assignment.week3;

public class RadioButton extends Button {

	public void selectRadioButton(){
		System.out.println("select radio button");
		}

		public static void main(String[] args) {
			
			RadioButton radioOptions = new RadioButton();
			radioOptions.selectRadioButton();
			// following are the methods from the Parent class Button, liked with this class object without error
			radioOptions.submit();
			radioOptions.createLead();
			// following is the method from great parent WebElement
			radioOptions.click();
			radioOptions.setText("linkText");
			
		}
}
