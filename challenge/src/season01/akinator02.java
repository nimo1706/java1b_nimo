package season01;

import java.util.Scanner;

public class akinator02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		while (true) {
			String sex2 = null, job2 = null, food2 = null, season2 = null, pet2 = null;
			while (true) {
				System.out.println("性別は？");
				System.out.println("1:男　2:女");
				String sex = stdIn.next();
				if (sex.equals("1") || sex.equals("2")) {
					sex = sex2;
					break;
				} else {
					System.out.println("半角の数値で回答してください");
					continue;
				}
			}

			while (true) {
				System.out.println("職業は？");
				System.out.println("1:エンジニア　2:営業職");
				String job = stdIn.next();
				if (job.equals("1") || job.equals("2")) {
					job = job2;
					break;
				} else {
					System.out.println("半角の数値で回答してください");
					continue;
				}
			}

			while (true) {
				System.out.println("魚は好き、嫌い？");
				System.out.println("1:好き　2:嫌い 3:魚は嫌いだが肉は好き");
				String food = stdIn.next();
				if (food.equals("1") || food.equals("2") || food.equals("3")) {
					food = food2;
					break;
				} else {
					System.out.println("半角の数値で回答してください");
					continue;
				}
			}

			while (true) {
				System.out.println("夏と冬どっちが好き？");
				System.out.println("1:夏　2:冬");
				String season = stdIn.next();
				if (season.equals("1") || season.equals("2")) {
					season = season2;
					break;
				} else {
					System.out.println("半角の数値で回答してください");
					continue;
				}
			}

			while (true) {
				System.out.println("猫派？犬派？");
				System.out.println("1:猫派　2:犬派");
				String pet = stdIn.next();
				if (pet.equals("1") || pet.equals("2")) {
					pet = pet2;
					break;
				} else {
					System.out.println("半角の数値で回答してください");
					continue;
				}
			}

			String a = sex2 + job2 + food2 + season2 + pet2;

			switch (a) {
			case "12321":
				System.out.println("Aさん");
				break;
			case "11122":
				System.out.println("Bさん");
				break;
			case "12221":
				System.out.println("Cさん");
				break;
			case "21112":
				System.out.println("Dさん");
				break;
			case "21111":
				System.out.println("Eさん");
				break;
			case "22322":
				System.out.println("Fさん");
				break;

			default:

				System.out.println("存在しません");

				System.out.println("もう一度やりますか");
				System.out.println("1:はい　2:いいえ");
				String A = stdIn.next();

				while (true) {
					if (A.equals("1") || A.equals("2")) {
						if (A.equals("1")) {
							continue;
						}else if(A.equals("2")) {
							System.out.println("終了します");
						}else {
							System.out.println("半角の数値で回答してください");
							continue;
							/*} else {
							System.out.println("終了します");
							break;
					} else {
						System.out.println("半角の数値で回答してください");
						continue;*/
					}
				//}

			}
			}
		}

	}
	}
}