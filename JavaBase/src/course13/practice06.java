package course13;

import java.util.Scanner;

public class practice06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("数値を入力してね。");
		int a = stdIn.nextInt();
		for (int i = 0; i < a; i++) {
			System.out.println("現在" + i + "回目のループです。");
		}
	}

}
