package course22_23;

import java.util.Scanner;

public class rikopazu01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

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

		String save = null;

		//////////パネル表示プログラム////
		System.out.println("現在のパネル↓");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		/////////////////////////////////

		System.out.println("入れ替え位置を入力してください。[0][0]左側の添え字");
		int 入れ替え位置1 = stdIn.nextInt();

		System.out.println("入れ替え位置を入力してください。[0][0]右側の添え字");
		int 入れ替え位置2 = stdIn.nextInt();

		System.out.println("入れ替え先を入力してください。[0][0]左側の添え字");
		int 入れ替え先1 = stdIn.nextInt();

		System.out.println("入れ替え先を入力してください。[0][0]右側の添え字");
		int 入れ替え先2 = stdIn.nextInt();

		save = arr[入れ替え位置1][入れ替え位置2];

		arr[入れ替え先1][入れ替え先2] = arr[入れ替え位置1][入れ替え位置2];

		arr[入れ替え位置1][入れ替え位置2] = save;

		if (arr[0][0].equals(arr[0][1])) {
			if (arr[0][0].equals(arr[0][2])) {
				arr[0][0] = "G";
				arr[0][1] = "G";
				arr[0][2] = "G";
			}

		} else if (arr[1][0].equals(arr[1][1])) {
			if (arr[1][0].equals(arr[1][2])) {
				arr[1][0] = "G";
				arr[1][1] = "G";
				arr[1][2] = "G";
			}
		} else if (arr[2][0].equals(arr[2][1])) {
			if (arr[2][0].equals(arr[2][2])) {
				arr[2][0] = "G";
				arr[2][1] = "G";
				arr[2][2] = "G";
			}
		}
		for (int i = 0; i < 3;) {

		}
	}
}
