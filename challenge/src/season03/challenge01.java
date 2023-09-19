package season03;

import java.util.Scanner;

public class challenge01 {

	static Scanner stdIn = new Scanner(System.in);

	static int y = 0;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int n = 0;

		for (int i = 1; i <= 100; i++) {

			System.out.println("どの四則演算を行いますか");
			System.out.println("1:加算 2:減算 3:乗算 4:除算");
			int sisoku = stdIn.nextInt();

			System.out.println("数値を入力してください");
			int num = stdIn.nextInt();

			if (sisoku == 1) {//加算

				tasu(num);

			} else if (sisoku == 2) {//減算

				hiku(num);

			} else if (sisoku == 3) {//乗算

				kake(num);

			} else if (sisoku == 4) {//除算

				waru(num);

			} else {
			
			}

			if (num == 9999) {
				
				System.out.println(y);

				break;

			} else {

			}

			System.out.println(y);
		}
	}

	static void tasu(int x) {
		// TODO 自動生成されたメソッド・スタブ

		y = y + x;

	}

	static void hiku(int x) {
		// TODO 自動生成されたメソッド・スタブ

		y = y - x;

	}

	static void kake(int x) {
		// TODO 自動生成されたメソッド・スタブ

		y = y * x;

	}

	static void waru(int x) {
		// TODO 自動生成されたメソッド・スタブ

		y = y / x;

	}

}
