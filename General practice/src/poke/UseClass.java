package poke;

import java.util.Scanner;

public class UseClass {

	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {

		Trainer trainer = new Trainer();
		Pocketon Pocke = new Pocketon("名前", "タイプ", 0, 0);

		menyuerr: while (true) {

			System.out.println("1:捕獲 2:図鑑を見る 3:バトル 99:プログラム終了");
			int menyu = stdIn.nextInt();

			System.out.println("トレーナーの名前を入力してください");
			String satosi = stdIn.next();

			if (menyu == 1) {//捕獲

				System.out.println("名前を入力してください");
				Pocke.name = stdIn.next();

				hokaku: while (true) {

					System.out.println("タイプ(炎、水、地面、草)を入力してください");
					Pocke.type = stdIn.next();

					//System.out.println("炎");
					//Pocke.type = "炎";

					if (Pocke.type.equals("炎")) {
						break hokaku;

					} else if (Pocke.type.equals("水")) {
						break hokaku;

					} else if (Pocke.type.equals("地面")) {
						break hokaku;

					} else if (Pocke.type.equals("草")) {
						break hokaku;

					} else {

						continue hokaku;

					}
				}

				System.out.println("戦闘力を入力してください");
				Pocke.power = stdIn.nextInt();

				//System.out.println(1);
				//Pocke.power = 1;

				System.out.println("捕獲難易度を入力してください");
				//Pocke.difficult = stdIn.nextInt();

				System.out.println(0);
				Pocke.difficult = 0;

				trainer.capture(Pocke);
				trainer.display();

			} else if (menyu == 2) {//図鑑を見る

				trainer.display();

			} else if (menyu == 3) {//バトル
				try {
					Battle Battle = new Battle();

					System.out.println("1体目のポケモンの名前を入力してください");
					String pokemonn1 = stdIn.next();

					System.out.println("2体目のポケモンの名前を入力してください");
					String pokemonn2 = stdIn.next();

					int ino1 = 0;

					for (ino1 = 0; !(pokemonn1.equals(trainer.myPockes[ino1].name)); ino1++) {
					}

					int ino2 = 0;
					for (ino2 = 0; !(pokemonn2.equals(trainer.myPockes[ino2].name)); ino2++) {
					}

					Battle.doBattle(trainer.myPockes[ino1], trainer.myPockes[ino2]);

					break;
				} catch (Exception e) {

					//エラーの検出
					System.out.println("以下のエラーを検出しました");
					System.out.println(e);
				}
			} else if (menyu == 99) {//プログラム終了

			} else {//それ以外

				continue menyuerr;

			}
		}

	}
}