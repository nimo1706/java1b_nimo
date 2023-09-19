package course34_35;

import java.util.Scanner;

public class practice01 {

	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("数値を入力してください");
		int num1 = stdIn.nextInt();

		if (num1 >= 50) {
			System.out.println("数値を入力してください");
			int num2 = stdIn.nextInt();

			cala(num1, num2);

		} else {

			cala(num1);

		}

	}

	static void cala(int x, int y) {
		System.out.println(x + y);

	}

	static void cala(int x) {
		System.out.println(x * 10);
	}

}
