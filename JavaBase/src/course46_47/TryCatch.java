package course46_47;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {

			System.out.println("数値を入力してね");
			Scanner stDIn = new Scanner(System.in);
			int x = stDIn.nextInt();

			int[] numArr = new int[3];
			numArr[1] = 10;
			numArr[2] = 20;
			numArr[3] = 30;
			numArr[4] = 40;

		} catch (Exception e) {
			System.out.println("以下のエラーを検出しました");
			System.out.println(e);
		}

	}

}
