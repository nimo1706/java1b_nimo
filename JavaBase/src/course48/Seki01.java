package course48;

//乱数、キーボード入力使用準備
import java.util.Random;
import java.util.Scanner;

public class Seki01 {

	//乱数を生成
	static Random Rand0bj = new Random();
	static Scanner stdIn = new Scanner(System.in);

	//nに0を代入
	static int n = 0;

	public static void main(String[] args) {
		//エラー検出スタート
		try {

			//席の配列を設定する
			int[][] seki = new int[6][6];

			seki[0][0] = 0;
			seki[0][1] = 0;
			seki[0][2] = 0;
			seki[0][3] = 0;
			seki[0][4] = 0;
			seki[0][5] = 0;
			seki[1][0] = 0;
			seki[1][1] = 0;
			seki[1][2] = 0;
			seki[1][3] = 0;
			seki[1][4] = 0;
			seki[1][5] = 0;
			seki[2][0] = 0;
			seki[2][1] = 0;
			seki[2][2] = 0;
			seki[2][3] = 0;
			seki[2][4] = 0;
			seki[2][5] = 0;
			seki[3][0] = 0;
			seki[3][1] = 0;
			seki[3][2] = 0;
			seki[3][3] = 0;
			seki[3][4] = 0;
			seki[3][5] = 0;
			seki[4][0] = 0;
			seki[4][1] = 0;
			seki[4][2] = 0;
			seki[4][3] = 0;
			seki[4][4] = 0;
			seki[4][5] = 0;
			seki[5][0] = 0;
			seki[5][1] = 0;
			seki[5][2] = 0;
			seki[5][3] = 0;
			seki[5][4] = 0;
			seki[5][5] = 0;

			System.out.println("どのモードを使いますか");
			System.out.println("1:完全ランダム 2:手動");
			int sentaku = stdIn.nextInt();

			//1だった場合この中に入る
			if (sentaku == 1) {

				//36人までを設定する
				int[] num = new int[36];
				//回数
				int count = 0;

				//lengthの人数分(36回)回す
				for (int i = 0; i < num.length; i++) {

					//乱数の生成
					int raNum = (int) ((Math.random() * 36) + 1);

					//席が重複しないように
					for (int j = 0; j < num.length; j++) {

						if (num[j] == raNum) {
							count++;
						}
					}

					if (count > 0) {

						i--;
						count = 0;
						continue;
						//0の場合
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

				/**//**//*ここから違うモード*//**//**/

			} else if (sentaku == 2) {
				System.out.println("左上から右に手動で選択します");
				System.out.println();
				int s = 0;
				int i = 0;

				for (int x = 0; x < 6; x++) {

					sitei: for (int y = 0; y < 6; y++) {

						System.out.println("seki[" + x + "][" + y + "] に誰を入れますか");
						int hito = stdIn.nextInt();

						/* 1～36までの数値を収める配列を準備 */
						int[] num = new int[36];

						num[i] = hito;

						for (int t = 0; t > num.length; t++) {
							if (num[t] == hito) {

								System.out.println("既に入力されたナンバーです");
								System.out.println("入力しなおしてください");
								y--;

								continue sitei;

							} else {
								i++;
								System.out.println("seki[" + x + "][" + y + "]= " + seki[x][y]);
							}
						}

						/*	if (hito < 10) {
						
								seki[x][y] = hito;
						
								System.out.print("| seki[" + x + "][" + y + "]= " + seki[x][y] + " |");
						
							} else {
						
								seki[x][y] = hito;
						
								System.out.print("| seki[" + x + "][" + y + "]=" + seki[x][y] + " |");
							}*/
					}

					System.out.println();
				}

			} else {

			}
		} catch (Exception e) {
			System.out.println("以下のエラーを検出しました");
			System.out.println(e);
		}

	}

}
