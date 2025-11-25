package assignment.week3;
//Program from Hierarchical Inheritance, one parent having more than one child, Button has three children 
// Elements, RadioButton, CheckBoxButton

public class Elements extends Button {

	public void clickElements(){
		System.out.println("click Elements");
		}

		public static void main(String[] args) {
			
			Elements elementOptions = new Elements ();
			elementOptions.clickElements();
			// following are the methods from the Parent class Button, liked with this class object without error
			// but this does not accepts methods from other siblings of the parent Button, like RadioButton, CheckBoxButton
			elementOptions.submit();
			elementOptions.createLead();
			// following is the method from great parent WebElement
			elementOptions.setText("linkText");
			
		}
}