package course41_mogi;

import java.util.Scanner;

public class test05 {

	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("数値を入力してください");
		int x = stdIn.nextInt();

		if (x >= 50) {
			System.out.println("50以上です。");
		} else {
			System.out.println("49以下です。");
		}

	}

}
