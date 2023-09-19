package course22_23;

import java.util.Scanner;

public class rikopazu02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		///////////回答////////////

		Scanner stdIn = new Scanner(System.in);
		String[][] arr = new String[3][3];

		arr[0][0] = "☆";
		arr[0][1] = "□";
		arr[0][2] = "☆";
		arr[1][0] = "□";
		arr[1][1] = "☆";
		arr[1][2] = "△";
		arr[2][0] = "△";
		arr[2][1] = "□";
		arr[2][2] = "△";

		System.out.println("りこドラ！");

		//手数カウント用変数
		int tekazu = 0;

		//とりあえず死ぬほどループさせる。
		for (int r = 0; r < 999; r++) {

			//////////パネル表示プログラム////
			System.out.println("現在のパネル↓");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			/////////////////////////////////

			System.out.println("入れ替え元を入力してね[0][0]の←側");
			int x1 = stdIn.nextInt();

			System.out.println("入れ替え元を入力してね[0][0]の→側");
			int x2 = stdIn.nextInt();

			System.out.println("入れ替え先を入力してね[0][0]の←側");
			int z1 = stdIn.nextInt();

			System.out.println("入れ替え先を入力してね[0][0]の→側");
			int z2 = stdIn.nextInt();

			///入れ替え実行///
			String save = "";
			save = arr[z1][z2];
			arr[z1][z2] = arr[x1][x2];
			arr[x1][x2] = save;
			tekazu = tekazu + 1;

			/*************************************
			 * 縦横3つ揃ってるかチェック。
			 * 各行、各列で1つずつ見ていく。
			 *************************************/

			//一番上の行が横に揃ってるか？
			if (arr[0][0] == arr[0][1] && arr[0][0] == arr[0][2]) {
				//揃ってるならGで置き換え
				arr[0][0] = "G";
				arr[0][1] = "G";
				arr[0][2] = "G";
			}

			//真ん中の行が横に揃ってるか？
			if (arr[1][0] == arr[1][1] && arr[1][0] == arr[1][2]) {
				//揃ってるならGで置き換え
				arr[1][0] = "G";
				arr[1][1] = "G";
				arr[1][2] = "G";
			}

			//一番下の行が横に揃ってるか？
			if (arr[2][0] == arr[2][1] && arr[2][0] == arr[2][2]) {
				//揃ってるならGで置き換え
				arr[2][0] = "G";
				arr[2][1] = "G";
				arr[2][2] = "G";
			}

			//一番左の列が縦に揃ってるか？
			if (arr[0][0] == arr[1][0] && arr[0][0] == arr[2][0]) {
				//揃ってるならGで置き換え
				arr[0][0] = "G";
				arr[1][0] = "G";
				arr[2][0] = "G";
			}

			//真ん中の列が縦に揃ってるか？
			if (arr[0][1] == arr[1][1] && arr[0][1] == arr[2][1]) {
				//揃ってるならGで置き換え
				arr[0][1] = "G";
				arr[1][1] = "G";
				arr[2][1] = "G";
			}

			//右の列が縦に揃ってるか？
			if (arr[0][2] == arr[1][2] && arr[0][2] == arr[2][2]) {
				//揃ってるならGで置き換え
				arr[0][2] = "G";
				arr[1][2] = "G";
				arr[2][2] = "G";
			}
			/*************************************
			 * 全てのマスが「G」かチェックする。
			 *************************************/
			int gCount = 0;
			for (int x = 0; x < 3; x++) {
				for (int y = 0; y < 3; y++) {
					if (arr[x][y].equals("G")) {
						gCount = gCount + 1;
					}
				}
			}

			if (gCount == 9) {
				//全てGならループを抜けるように、iに１０００を足す。
				r = r + 1000;
			}
		}
		//ループの外でメッセージを表示して終了
		System.out.println("クリア！！！！");
		System.out.println("手数は" + tekazu + "でした。");

	}

}
