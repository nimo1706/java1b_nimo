package course21;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		int[] thphoon = new int[13];
		thphoon[0] = 1;
		thphoon[1] = 1;
		thphoon[2] = 0;
		thphoon[3] = 0;
		thphoon[4] = 0;
		thphoon[5] = 1;
		thphoon[6] = 4;
		thphoon[7] = 5;
		thphoon[8] = 6;
		thphoon[9] = 4;
		thphoon[10] = 6;
		thphoon[11] = 1;
		thphoon[12] = 29;//年間

		int[] quake = new int[13];
		quake[0] = 153;
		quake[1] = 127;
		quake[2] = 130;
		quake[3] = 109;
		quake[4] = 118;
		quake[5] = 164;
		quake[6] = 130;
		quake[7] = 103;
		quake[8] = 103;
		quake[9] = 104;
		quake[10] = 123;
		quake[11] = 141;
		quake[12] = 1505;//年間

		int[] rain = new int[13];
		rain[0] = 20;
		rain[1] = 58;
		rain[2] = 107;
		rain[3] = 87;
		rain[4] = 114;
		rain[5] = 187;
		rain[6] = 200;
		rain[7] = 59;
		rain[8] = 169;
		rain[9] = 441;
		rain[10] = 158;
		rain[11] = 94;
		rain[12] = 1694;//年間

		System.out.println("見たい情報を選択してください");
		System.out.println("1:台風件数 2:地震件数 3:降水量 4:全て");
		int q = stdIn.nextInt();
		if (q == 1) {//1:台風件数
			System.out.println("年別か月別か年別(大きい順に表示)か選択してください");
			System.out.println("1:年別 2:月別 3:年別(大きい順に表示)");
			int q1 = stdIn.nextInt();
			if (q1 == 1) {
				System.out.println("1年間の台風件数の総合計は" + thphoon[12] + "件です。");

			} else if (q1 == 2) {
				System.out.println("見たい月を入力してください");
				int q2 = stdIn.nextInt();
				if (q2 == 9999) {
					System.out.println("編集したい月を入力してください");
					int q3 = stdIn.nextInt();
					System.out.println("編集する月の数値を入力してください");
					System.out.println("現在の" + q3 + "月の台風件数は" + thphoon[q3 - 1] + "件です。");
					int q4 = stdIn.nextInt();
					thphoon[q3 - 1] = q4;

				} else
					System.out.println(q2 + "月の台風件数は" + thphoon[q2 - 1] + "件です。");

			} else if (q1 == 3) {

				//配列の中身を入れ替える
				for (int n = 0; n < 12; n++) {
					for (int j = 12 - 1; j > n; j--) {
						if (thphoon[j - 1] < thphoon[j]) {
							int box = thphoon[j];
							thphoon[j] = thphoon[j - 1];
							thphoon[j - 1] = box;
						}
					}
				}

				for (int x = 0; x < 12; x++) {
					System.out.println(thphoon[x]);
				}

			}

		} else if (q == 2) {//2:地震件数
			System.out.println("年別か月別か年別(大きい順に表示)か選択してください");
			System.out.println("1:年別 2:月別 3:年別(大きい順に表示)");
			int q1 = stdIn.nextInt();
			if (q1 == 1) {
				System.out.println("1年間の地震件数の総合計は" + quake[12] + "件です。");

			} else if (q1 == 2) {
				System.out.println("見たい月を入力してください");
				int q2 = stdIn.nextInt();
				if (q2 == 9999) {
					System.out.println("編集したい月を入力してください");
					int q3 = stdIn.nextInt();
					System.out.println("編集する月の数値を入力してください");
					System.out.println("現在の" + q3 + "月の地震件数は" + quake[q3 - 1] + "件です。");
					int q4 = stdIn.nextInt();
					quake[q3 - 1] = q4;

				} else
					System.out.println(q2 + "月の地震件数は" + quake[q2 - 1] + "件です。");
			} else if (q1 == 3) {
				for (int n = 0; n < 12; n++) {
					for (int j = 12 - 1; j > n; j--) {
						if (quake[j - 1] < quake[j]) {
							int box = quake[j];
							quake[j] = quake[j - 1];
							quake[j - 1] = box;
						}
					}
				}

				for (int x = 0; x < 12; x++) {
					System.out.println(quake[x]);
				}

			}

		} else if (q == 3) {//3:降水量
			System.out.println("年別か月別か年別(大きい順に表示)か選択してください");
			System.out.println("1:年別 2:月別 3:年別(大きい順に表示)");
			int q1 = stdIn.nextInt();
			if (q1 == 1) {
				System.out.println("1年間の降水量の総合計は" + rain[12] + "mmです。");

			} else if (q1 == 2) {
				System.out.println("見たい月を入力してください");
				int q2 = stdIn.nextInt();
				if (q2 == 9999) {
					System.out.println("編集したい月を入力してください");
					int q3 = stdIn.nextInt();
					System.out.println("編集する月の数値を入力してください");
					System.out.println("現在の" + q3 + "月の降水量は" + rain[q3 - 1] + "㎜です");
					int q4 = stdIn.nextInt();
					rain[q3 - 1] = q4;

				} else
					System.out.println(q2 + "月の降水量は" + rain[q2 - 1] + "件です。");

			} else if (q1 == 3) {
				for (int n = 0; n < 12; n++) {
					for (int j = 12 - 1; j > n; j--) {
						if (quake[j - 1] < rain[j]) {
							int box = rain[j];
							rain[j] = rain[j - 1];
							rain[j - 1] = box;
						}
					}
				}

				for (int x = 0; x < 12; x++) {
					System.out.println(rain[x]);
				}

			}

		} else if (q == 4) {//全て
			int i = 0;
			for (int n = 0; n < 12; n++) {
				i++;
				System.out.println(i + "月の台風は" + thphoon[i] + "件です。");
			}
			System.out.println("1年間の台風の総合計は" + thphoon[12] + "件です。");
			System.out.println();

			i = 0;
			for (int n = 0; n < 12; n++) {
				i++;
				System.out.println(i + "月の地震件数は" + quake[1] + "件です。");
			}
			System.out.println("1年間の地震件数の総合計は" + quake[12] + "件です。");
			System.out.println();

			i = 0;
			for (int n = 0; n < 12; n++) {
				i++;
				System.out.println(i + "月の降水量は" + rain[i] + "mmです。");
			}
			System.out.println("1年間の降水量の総合計は" + rain[12] + "mmです。");

		}
	}

}
