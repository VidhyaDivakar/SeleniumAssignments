package assignment.week3;

public class WebElement {
	
	public void click() {
		System.out.println("click to open link/button");
		}

	public void setText (String text) {
		System.out.println("text");
		}
	
		public static void main(String[] args) {
			
			WebElement webElementOptions = new WebElement ();
			webElementOptions.click();
			webElementOptions.setText("linkText");
		}
		
		
	}



		