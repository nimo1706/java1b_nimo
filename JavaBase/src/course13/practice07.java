package course13;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("数値を入力してね。");
		int a = stdIn.nextInt();
		if (a > 100) {
			System.out.println("どれだけ回すの");
		}

		for (int i = 0; i < a; i++) {
			int y = i % 2;
			if (y == 0) {
				System.out.println("偶数です。");
			} else {
				System.out.println("奇数だよ");
			}
			System.out.println(i);
		}

	}

}