package assignment.week3;

public class TextField extends WebElement {

	public void getText(){
		System.out.println("get the text");
		}

	public void sendText() {
		System.out.println("send the text");
		}

		public static void main(String[] args) {
			
			TextField TextOptions = new TextField ();
			TextOptions.getText();
			TextOptions.sendText();
			// following are the methods from the Parent class WebElement, liked with this class object without error
			TextOptions.click();
			TextOptions.setText("text");
			
		}
}