package course30_31;

public class Books {

	String name;
	int page;
	String author;

	/*Books(String n, int page, String a) {
		name = n;
		page = page;
		author = a;
	}*/
	
	Books(String n, int page, String a) {
		name ="明解Java";
		page = 400;
		author = "柴田望洋";
	}

	void display() {
		System.out.println(name);
		System.out.println(page);
		System.out.println(author);
	}
	
}
