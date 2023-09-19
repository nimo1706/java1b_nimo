package course_mob;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("数値で回答してください");
		
		int a = stdIn.nextInt();

		if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
			System.out.println(a + ("月は31日日まであります"));
		} else if (a == 4 || a == 6 || a == 9 || a == 11) {
			System.out.println(a + ("月は30日まであります"));
		} else if (a == 2) {
			System.out.println(a + ("月は28日まであります"));
		}
	}
}