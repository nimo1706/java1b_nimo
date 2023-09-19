package course19;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stDIn = new Scanner(System.in);
		System.out.println("値を入力してください");
		int x = stDIn.nextInt();
		
		int[] numArray = new int[x];
		numArray[0] = 10;
		numArray[1] = 11;
		numArray[2] = 12;
		for (int i = 0; i < x; i++) {

			System.out.println("俺の数値は" + numArray[i] + "だ");
		}

	}

}
