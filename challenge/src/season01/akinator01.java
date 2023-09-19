package season01;

import java.util.Scanner;

public class akinator01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;

		Scanner stdIn = new Scanner(System.in);

		System.out.println("性別は？、職業は？、魚は好き？嫌いなら肉は好き？、夏と冬どっちが好き？");

		while (true) {
			System.out.println("性別は？");
			System.out.println("1:男　2:女");
			int sex = stdIn.nextInt();

			if (sex == 1) {

				a = 1; //男だった場合

			} else {

				a = 2;//女だった場合

			}

			System.out.println("職業は？");
			System.out.println("1:エンジニア　2:営業職");
			int job = stdIn.nextInt();

			if (job == 1) {

				b = 1; //エンジニアだった場合

			} else {

				b = 2;//営業職だった場合

			}

			System.out.println("魚は好き、嫌い？");
			System.out.println("1:好き　2:嫌い");
			int food = stdIn.nextInt();

			if (food == 1) {

				c = 1; //魚が好きだった場合

			} else {//魚が嫌いだった場合

				System.out.println("肉は好き、嫌い？");
				System.out.println("1:好き、2:無回答");
				int meet = stdIn.nextInt();

				if (meet == 1) {

					f = 1; //魚は嫌いだが肉は好き

				} else {

					f = 2;//無回答(魚は嫌い)

				}
			}

			System.out.println("夏と冬どっちが好き？");
			System.out.println("1:夏　2:冬");
			int season = stdIn.nextInt();

			if (season == 1) {

				d = 1; //夏だった場合

			} else {

				d = 2;//冬だった場合

			}

			System.out.println("猫派？犬派？");
			System.out.println("1:猫派　2:犬派");
			int pet = stdIn.nextInt();

			if (pet == 1) {

				e = 1; //猫派だった場合

			} else {

				e = 2;//犬派だった場合
			}

			
			if (a == 1 && b == 2 && f == 2 && d == 2 && e == 1) {//12321
				System.out.println("Aさん");
				break;
			} else if (a == 1 && b == 1 && c == 1 && d == 2 && e == 2) {//11122
				System.out.println("Bさん");
				break;
			} else if (a == 1 && b == 2 && f == 1 && d == 2 && e == 1) {//12221
				System.out.println("Cさん");
				break;
			} else if (a == 2 && b == 1 && c == 1 && d == 1 && e == 2) {//21112
				System.out.println("Dさん");
				break;
			} else if (a == 2 && b == 1 && c == 1 && d == 1 && e == 1) {//21111
				System.out.println("Eさん");
				break;
			} else if (a == 2 && b == 2 && f == 2 && d == 2 && e == 2) {//22322
				System.out.println("Fさん");
				break;
			} else {
				System.out.println("存在しません");

				System.out.println("もう一度やりますか");
				System.out.println("1:はい　2:いいえ");
				int A = stdIn.nextInt();

				if (A == 1) {

					e = 1; //はいだった場合

					System.out.println("もう一度入力をお願いします");

					a = 0;//変数の初期化
					b = 0;
					c = 0;
					d = 0;
					e = 0;
					f = 0;
					continue;

				} else {

					e = 2;//いいえだった場合
					System.out.println("終了します");

					break;

				}

			}

		}
		
	}

}