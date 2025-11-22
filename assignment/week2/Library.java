package assignment.week2;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println(bookTitle + " " + "Book added successfuly"); 
		return bookTitle;}
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		Library bookStore = new Library();
		bookStore.addBook("DareGlass");
		bookStore.issueBook();
	}

}
