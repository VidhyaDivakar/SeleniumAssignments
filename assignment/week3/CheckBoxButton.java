package assignment.week3;

public class CheckBoxButton extends Button {

	public void clickCheckButton(){
		System.out.println("select check box");
		}

		public static void main(String[] args) {
			
			CheckBoxButton checkBoxOptions = new CheckBoxButton ();
			checkBoxOptions.clickCheckButton();
			// following are the methods from the Parent class Button, liked with this class object without error
			checkBoxOptions.submit();
			checkBoxOptions.createLead();
			
		}
}