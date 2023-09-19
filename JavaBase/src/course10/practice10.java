package course10;

import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("予約したい曜日を入力してください（例　月曜）");
		String a = stdIn.next();
		System.out.println("希望の時間を入力してください");
		System.out.println("午前　午後　夜間");
		String b = stdIn.next();

		switch (a) {
		case "日曜":
			if (b.equals("午前")) {
				System.out.println("予約できません");
			} else if (b.equals("午後")) {
				System.out.println("予約できません");
			} else if (b.equals("夜間")) {
				System.out.println("予約できません");
			}
			break;
		case "月曜":
			if (b.equals("午前")) {
				System.out.println("予約できます");
			} else if (b.equals("午後")) {
				System.out.println("予約できます");
			} else if (b.equals("夜間")) {
				System.out.println("予約できます");
			}
			break;
		case "火曜":
			if (b.equals("午前")) {
				System.out.println("予約できません");
			} else if (b.equals("午後")) {
				System.out.println("予約できます");
			} else if (b.equals("夜間")) {
				System.out.println("予約できます");
			}

			break;
		case "水曜":
			if (b.equals("午前")) {
				System.out.println("予約できます");
			} else if (b.equals("午後")) {
				System.out.println("予約できます");
			} else if (b.equals("夜間")) {
				System.out.println("予約できません");
			}
			break;
		case "木曜":
			if (b.equals("午前")) {
				System.out.println("予約できます");
			} else if (b.equals("午後")) {
				System.out.println("予約できます");
			} else if (b.equals("夜間")) {
				System.out.println("予約できます");
			}
			break;
		case "金曜":
			if (b.equals("午前")) {
				System.out.println("予約できません");
			} else if (b.equals("午後")) {
				System.out.println("予約できます");
			} else if (b.equals("夜間")) {
				System.out.println("予約できます");
			}
			break;
		case "土曜":
			if (b.equals("午前")) {
				System.out.println("予約できます");
			} else if (b.equals("午後")) {
				System.out.println("予約できません");
			} else if (b.equals("夜間")) {
				System.out.println("予約できません");
			}
			break;

		default:
			System.out.println("該当する曜日がありません");
		}

	}

}
