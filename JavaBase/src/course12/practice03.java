package course12;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("縦の数値");
		long tate = stdIn.nextLong();
		System.out.println("横の数値");
		long yoko = stdIn.nextLong();

		int i = 1;
		int n = 1;

		while (n <= tate) {

			while (i <= yoko) {
				System.out.print(i * n + ",");

				i++;
			}

			System.out.println();
			i = 1;
			n++;
		}
		stdIn.close();
	}

}
