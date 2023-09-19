package course10;

import java.util.Scanner;

public class practice06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("xの数値を入力してください");
		int x = stdIn.nextInt();
		System.out.println("yの数値を入力してください");
		int y = stdIn.nextInt();

		if (x > y) {
			System.out.println(("xがでかい！なぜならxは")+x+("でyは")+y+("だから"));
		} else if (y > x) {
			System.out.println(("yがでかい！なぜならyは")+y+("でxは")+x+("だから"));

		} else if (x == y) {
			System.out.println("おなじー");

		}

	}

}
