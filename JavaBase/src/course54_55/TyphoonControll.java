package course54_55;

import java.util.Scanner;

public class TyphoonControll {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		Typhoon kaze1 = new Typhoon(1, "2022年4月 8日", "マラカス");
		Typhoon kaze2 = new Typhoon(2, "2022年4月10日", "メーギー");
		Typhoon kaze3 = new Typhoon(3, "2022年6月30日", "チャバ");
		Typhoon kaze4 = new Typhoon(4, "2022年7月 1日", "アイレー");
		Typhoon kaze5 = new Typhoon(5, "2022年7月28日", "ソングダー");
		Typhoon kaze6 = new Typhoon(6, "2022年7月31日", "トローセス");
		Typhoon kaze7 = new Typhoon(7, "2022年8月 9日", "ムーラン");
		Typhoon kaze8 = new Typhoon(8, "2022年8月12日", "メアリー");
		Typhoon kaze9 = new Typhoon(9, "2022年8月22日", "マーゴン");
		Typhoon kaze10 = new Typhoon(0, null, null);
		Typhoon kaze11 = new Typhoon(0, null, null);
		Typhoon kaze12 = new Typhoon(0, null, null);
		Typhoon kaze13 = new Typhoon(0, null, null);
		Typhoon kaze14 = new Typhoon(0, null, null);
		Typhoon kaze15 = new Typhoon(0, null, null);

		Typhoon[] typhoonList = new Typhoon[15];
		typhoonList[0] = kaze1;
		typhoonList[1] = kaze2;
		typhoonList[2] = kaze3;
		typhoonList[3] = kaze4;
		typhoonList[4] = kaze5;
		typhoonList[5] = kaze6;
		typhoonList[6] = kaze7;
		typhoonList[7] = kaze8;
		typhoonList[8] = kaze9;
		typhoonList[9] = kaze10;
		typhoonList[10] = kaze11;
		typhoonList[11] = kaze12;
		typhoonList[12] = kaze13;
		typhoonList[13] = kaze14;
		typhoonList[14] = kaze15;

		for (int n = 0; n < 9; n++) {

			System.out.println(
					"令和4年台風" + typhoonList[n].getTyphoonbango() + "号 " + typhoonList[n].getHasseibi()
							+ " " + typhoonList[n].getAsiaName());

		}

		System.out.println();

		hensyuerr: while (true) {//編集選択

			System.out.println("台風情報を編集しますか？");
			System.out.println("0:いいえ 99:はい 55:新規追加モード");
			int hensyu = stdIn.nextInt();
			System.out.println();

			if (hensyu == 0) {//編集しない

				System.out.println("終了します");
				break hensyuerr;

			} else if (hensyu == 99) {//編集する

				noerr: while (true) {//台風番号

					System.out.println("台風番号を入力してください");
					int no = stdIn.nextInt();
					System.out.println();

					if (no >= 1 && no <= 9) {//台風番号の判別

						no = no - 1;

						System.out.println("台風の名前を入力してください");
						String name = stdIn.next();
						System.out.println();

						typhoonList[no].setAsiaName(name);

						System.out.println(
								"令和4年台風" + typhoonList[no].getTyphoonbango() + "号 " + typhoonList[no].getHasseibi()
										+ " " + typhoonList[no].getAsiaName());
						System.out.println("に変更しました");

						System.out.println();

						nextensyuerr: while (true) {//続けて編集

							System.out.println("続けて台風情報を編集しますか？");
							System.out.println("0:いいえ 99:はい");
							int nextensyu = stdIn.nextInt();
							System.out.println();

							if (nextensyu == 99) {//続けて編集する

								System.out.println("続けて台風情報を行います");
								continue noerr;

							} else if (nextensyu == 0) {//続けて編集しない
								System.out.println("台風情報は以下で記録しました");

								for (int n = 0; n < typhoonList.length; n++) {

									System.out.println(
											"令和4年台風" + typhoonList[n].getTyphoonbango() + "号 "
													+ typhoonList[n].getHasseibi()
													+ " " + typhoonList[n].getAsiaName());

								}

								System.out.println();
								System.out.println("終了します");
								break;

							} else {//続けて編集エラー

								System.out.println("0または99で選択してください");
								System.out.println();
								continue nextensyuerr;

							}
						}

					} else {//台風番号エラー

						System.out.println("正しい台風番号を入力してください");
						System.out.println();
						continue noerr;
					}
				}
			}else if(hensyu==55) {
				
				System.out.println("台風番号を入力してください");
				int no = stdIn.nextInt();
				
				System.out.println("発生年を入力してください");
				int nen = stdIn.nextInt();
				
				System.out.println("発生月を入力してください");
				int tuki = stdIn.nextInt();
				
				System.out.println("発生日を入力してください");
				int hi = stdIn.nextInt();
				
				System.out.println("台風名を入力してください");
				int name = stdIn.nextInt();
				
				
			} else {//編集選択エラー

				System.out.println("0または99で選択してください");
				System.out.println();
				continue hensyuerr;
			}
		}
	}
}