package course21;

import java.util.Scanner;

public class practice04 {

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
		thphoon[12] = 29;

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
		quake[12] = 1505;

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
		rain[12] = 1694;

		System.out.println("見たい情報を選択してください");
		System.out.println("1:台風件数 2:地震件数 3:降水量");
		int q = stdIn.nextInt();
		if (q == 1) {//1:台風件数
			System.out.println("年別か月別か選択してください");
			System.out.println("1:年別 2:月別");
			int q1 = stdIn.nextInt();
			if (q1 == 1) {
				System.out.println("1年間の台風件数の総合計は"+thphoon[12]+"件です。");

			} else if (q1 == 2) {
				System.out.println("見たい月を入力してください");
				int q2 = stdIn.nextInt();
				System.out.println(q2+"月の台風は"+thphoon[q2-1]+"件です。");

			}

		} else if (q == 2) {//2:地震件数
			System.out.println("年別か月別か選択してください");
			System.out.println("1:年別 2:月別");
			int q1 = stdIn.nextInt();
			if (q1 == 1) {
				System.out.println("1年間の地震件数の総合計は"+quake[12]+"件です。");


			} else if (q1 == 2) {
				System.out.println("見たい月を入力してください");
				int q2 = stdIn.nextInt();
				System.out.println(q2+"月の地震件数は"+quake[q2-1]+"件です。");
			}

		} else if (q == 3) {//3:降水量
			System.out.println("年別か月別か選択してください");
			System.out.println("1:年別 2:月別");
			int q1 = stdIn.nextInt();
			if (q1 == 1) {
				System.out.println("1年間の降水量の総合計は"+rain[12]+"mmです。");
				
			} else if (q1 == 2) {
				System.out.println("見たい月を入力してください");
				int q2 = stdIn.nextInt();
				System.out.println(q2+"月の降水量は"+rain[q2-1]+"mmです。");

			}

		}

	}

}
