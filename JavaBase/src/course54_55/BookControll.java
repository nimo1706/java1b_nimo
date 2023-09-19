package course54_55;

public class BookControll {
	public static void main(String[] args) {

		int[] err = new int[5];

		err[0] = 10;
		err[1] = 11;
		err[2] = 12;
		err[3] = 13;
		err[4] = 14;

		for (int n = 0; n < err.length; n++) {

			System.out.println(err[n]);

		}

		Book book1 = new Book("明解Java", 1500);
		Book book2 = new Book("ITパスポート 問題集", 2500);
		Book book3 = new Book("30時間でマスター Visual Basic", 1200);
		Book book4 = new Book("確かな力が身につく C#", 2800);

		System.out.println(book1.getPrice());
		System.out.println(book2.getPrice());
		System.out.println(book3.getPrice());
		System.out.println(book4.getPrice());

		Book[] hondana = new Book[4];

		hondana[0] = book1;
		hondana[1] = book2;
		hondana[2] = book3;
		hondana[3] = book4;
		
		for (int n = 0; n < hondana.length; n++) {

			System.out.println(hondana[n]);

		}

	}
}