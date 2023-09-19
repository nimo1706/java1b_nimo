package course48;

//乱数、キーボード入力使用準備
import java.util.Random;
import java.util.Scanner;

public class Seki02 {

	//乱数を生成
	static Random Rand0bj = new Random();
	static Scanner stdIn = new Scanner(System.in);

	//nに0を代入
	static int n = 0;

	static int omae = 0;

	static int xmoto = 0;
	static int ymoto = 0;
	static int xsaki = 0;
	static int ysaki = 0;

	static int test = 0;

	public static void main(String[] args) {

		//エラー検出スタート
		try {

			/////////////////////////////開始/////////////////////////////

			//席の配列を設定する
			int[][] seki = new int[6][6];

			modeerr: while (true) {

				//モードの選択
				System.out.println("どのモードを使いますか");
				System.out.println("1:完全ランダム 2:手動");
				int sentaku = stdIn.nextInt();
				System.out.println();

				///////////////////////ランダムモード///////////////////////

				//完全ランダムモードだった場合この中に入る
				if (sentaku == 1) {

					//36人までを設定する
					int[] num = new int[36];

					//判定の記録用の変数
					int count = 0;

					//numの数分(36回)繰り返す
					for (int i = 0; i < num.length; i++) {

						//0以上36未満の乱数を生成  0が生成されるから1を足す  最大値が36未満だから1を足す
						int raNum = (int) ((Math.random() * 36) + 1);
						test++;

						//席が重複していないか判定
						for (int j = 0; j < num.length; j++) {

							if (num[j] == raNum) {
								count++;
							}

						}

						if (count > 0) {

							i--;

							count = 0;
							continue;

						} else {

							num[i] = raNum;

						}

					}
					//席６×６を設定

					int o = 0;

					for (int t = 0; t < 6; t++) {
						for (int d = 0; d < 6; d++) {
							//2桁以上の場合

							if (num[o] < 10) {

								seki[t][d] = num[o];

								o++;

								System.out.print("| seki[" + t + "][" + d + "]= " + seki[t][d] + " |");

								//1桁の場合右詰めに設定される
							} else {

								seki[t][d] = num[o];

								o++;

								System.out.print("| seki[" + t + "][" + d + "]=" + seki[t][d] + " |");

							}

						}

						System.out.println();
					}
					
					System.out.println();
					System.out.println(test + "回実行しました");

					System.out.println();

					break modeerr;

					///////////////////////手動モード///////////////////////

				} else if (sentaku == 2) {

					System.out.println("左上から右に手動で選択します");
					System.out.println();

					int[] num = new int[36];

					//判定用の変数
					int count = 0;

					int n = 0;

					//numの数分(36回)繰り返す
					for (int x = 0; x < 6; x++) {
						for (int y = 0; y < 6; y++) {

							omaeerr: while (true) {

								//入れたい人の指定
								System.out.println("seki[" + x + "][" + y + "] に誰を入れますか");
								omae = stdIn.nextInt();

								if (omae >= 0 && omae < 37) {

									break omaeerr;

								} else {

									System.out.println("入力された値が存在しません");
									System.out.println("もう一度入力してください");
									System.out.println();

									continue omaeerr;
								}

							}

							//席が重複していないか判定
							for (int j = 0; j < num.length; j++) {

								if (num[j] == omae) {
									count++;
								}

							}

							if (count > 0) {

								System.out.println("既に入力された番号または無効な番号です");
								System.out.println("入力しなおしてください");
								System.out.println();

								y--;

								count = 0;

								continue;

								//0の場合
							} else {

								num[n] = omae;
								n++;

							}

						}

					}

					//席６×６を設定

					int o = 0;

					for (int t = 0; t < 6; t++) {
						for (int d = 0; d < 6; d++) {

							//2桁以上の場合
							if (num[o] < 10) {

								seki[t][d] = num[o];

								o++;

								System.out.print("| seki[" + t + "][" + d + "]= " + seki[t][d] + " |");

								//1桁の場合右詰めに設定される
							} else {

								seki[t][d] = num[o];

								o++;

								System.out.print("| seki[" + t + "][" + d + "]=" + seki[t][d] + " |");

							}

						}

						System.out.println();

					}

					System.out.println();

					break modeerr;

					//////////////////////モード選択エラー///////////////////////

				} else {

					System.out.println("選択肢に無い番号です");
					System.out.println("1または2を選択してください");
					System.out.println();

					continue modeerr;

				}

			}

			///////////////////////確認プログラム///////////////////////

			////////////////////////////確定////////////////////////////

			kakuteierr: while (true) {
				System.out.println("これで確定してよろしいですか？");
				System.out.println("1:確定 2:変更");
				int kakunin = stdIn.nextInt();
				System.out.println();

				if (kakunin == 1) {

					System.out.println("座席を以下の通りで確定します");
					System.out.println();

					for (int t = 0; t < 6; t++) {
						for (int d = 0; d < 6; d++) {

							//2桁以上の場合
							if (seki[t][d] < 10) {

								System.out.print("| seki[" + t + "][" + d + "]= " + seki[t][d] + " |");

								//1桁の場合右詰めに設定される
							} else {

								System.out.print("| seki[" + t + "][" + d + "]=" + seki[t][d] + " |");

							}

						}

						System.out.println();

					}

					break kakuteierr;

					//終了（End）

					/////////////////////////////変更/////////////////////////////

				} else if (kakunin == 2) {

					System.out.println("席の入れ替えを行います");
					System.out.println();

					xyerr: while (true) {

						for (int t = 0; t < 6; t++) {
							for (int d = 0; d < 6; d++) {

								//2桁以上の場合
								if (seki[t][d] < 10) {

									System.out.print("| seki[" + t + "][" + d + "]= " + seki[t][d] + " |");

									//1桁の場合右詰めに設定される
								} else {

									System.out.print("| seki[" + t + "][" + d + "]=" + seki[t][d] + " |");

								}

							}

							System.out.println();
						}

						xmotoerr: while (true) {//Xの元
							System.out.println();
							System.out.println("上記の表を元に入れ替え元のX座標を入力してください");
							System.out.println("seki[X][Y]=? -> seki[XX][YY]=??");
							xmoto = stdIn.nextInt();
							System.out.println();

							if (xmoto >= 0 && xmoto < 6) {

								break xmotoerr;

							} else {

								System.out.println("入力された値が範囲外です");
								System.out.println("もう一度入力してください");
								System.out.println();

								continue xmotoerr;

							}

						}

						ymotoerr: while (true) {//Yの元
							System.out.println();
							System.out.println("上記の表を元に入れ替え元のY座標を入力してください");
							System.out.println("seki[" + xmoto + "][Y]=? -> seki[XX][YY]=??");
							ymoto = stdIn.nextInt();
							System.out.println();
							if (ymoto >= 0 && ymoto < 6) {

								break ymotoerr;

							} else {

								System.out.println("入力された値が範囲外です");
								System.out.println("もう一度入力してください");
								System.out.println();

								continue ymotoerr;

							}

						}

						xsakierr: while (true) {//Xの先
							System.out.println();
							System.out.println("上記の表を元に入れ替え先のXX座標を入力してください");
							System.out.println(
									"seki[" + xmoto + "][" + ymoto + "]=" + seki[xmoto][ymoto] + " -> seki[XX][YY]=??");
							xsaki = stdIn.nextInt();
							System.out.println();

							if (xsaki >= 0 && xsaki < 6) {

								break xsakierr;

							} else {

								System.out.println("入力された値が範囲外です");
								System.out.println("もう一度入力してください");
								System.out.println();

								continue xsakierr;

							}

						}

						ysakierr: while (true) {//Yの先
							System.out.println();
							System.out.println("上記の表を元に入れ替え先のY座標を入力してください");
							System.out.println(
									"seki[" + xmoto + "][" + ymoto + "]=" + seki[xmoto][ymoto] + " -> seki[" + xsaki
											+ "][YY]=??");
							ysaki = stdIn.nextInt();

							if (ysaki >= 0 && ysaki < 6) {

								break ysakierr;

							} else {

								System.out.println("入力された値が範囲外です");
								System.out.println("もう一度入力してください");
								System.out.println();

								continue ysakierr;

							}

						}

						System.out.println(
								"seki[" + xmoto + "][" + ymoto + "]=" + seki[xmoto][ymoto] + " -> seki[" + xsaki
										+ "][" + ysaki + "]= " + seki[xsaki][ysaki]);
						System.out.println();

						irekae: while (true) {
							System.out.println("これでよろしいですか？");
							System.out.println("1:確定 2:変更");
							int irekae = stdIn.nextInt();
							System.out.println();

							if (irekae == 1) {

								System.out.println("入れ替えが完了しました");
								System.out.println();

								break irekae;

							} else if (irekae == 2) {

								System.out.println("正しい入れ替え元、入れ替え先を入力してください");
								System.out.println();

								continue xyerr;

							} else {

								System.out.println("選択肢に無い番号です");
								System.out.println("1または2を選択してください");
								System.out.println();

								continue irekae;

							}

						}

						if (xmoto == xsaki) {

							if (ymoto == ysaki) {

								System.out.println("同じ場所が選択されています");
								System.out.println("選択しなおしてください");
								System.out.println();
								continue xyerr;

							} else {

								break xyerr;

							}

						} else {

							break xyerr;

						}

					}

				} else {

					System.out.println("選択肢に無い番号です");
					System.out.println("1または2を選択してください");
					System.out.println();

					continue kakuteierr;

				}

			}

			/////////////////////////////終了/////////////////////////////

		} catch (Exception e) {

			System.out.println("以下のエラーを検出しました");
			System.out.println(e);

		}

	}

}