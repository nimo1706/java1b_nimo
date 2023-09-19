package course22_23;

import java.util.Arrays;

public class practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[][] arr = new String[3][3];
		arr[0][0] = "o";
		arr[0][1] = "x";
		arr[0][2] = "o";

		arr[1][0] = "x";
		arr[1][1] = "o";
		arr[1][2] = "x";

		arr[2][0] = "o";
		arr[2][1] = "o";
		arr[2][2] = "o";
		System.out.println(Arrays.deepToString(arr));
	}
}
