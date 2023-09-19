package course09;

import java.util.Scanner;

public class sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("数値を入力してください");
		Scanner stdIn = new Scanner(System.in);

		int num = stdIn.nextInt();
		switch (num) {
		case 1:
			System.out.println("1ですね？");
			break;		//以降の判定をスキップ
		case 2:
			System.out.println("2ですね？");
			break;
		case 10:
			System.out.println("10ですね？");
			break;
		default:		//どれにも該当しない場合
			System.out.println("該当せず");

		}
		
		
	}

}
