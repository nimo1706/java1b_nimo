package course_mob;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("総合演習２問目");
		System.out.println("０か１を入力してください");
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();

		if (a == 0) {
			System.out.println("00000");
		} else
			System.out.println("11111");

	}

}
