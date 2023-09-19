package course10;

import java.util.Scanner;

public class practice09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("予約したい曜日を入力してください（例　月曜）");
		String a = stdIn.next();
		
		switch (a) {
				case "月曜":
		case "水曜":
		case "木曜":
		case "土曜":
			System.out.println("予約できます");
			break;
		case "日曜":
		case "火曜":
		case "金曜":
			System.out.println("予約できません");
			break;
		default:
		System.out.println("該当する曜日がありません");
		}

	}

}
