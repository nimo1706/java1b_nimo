package course19;

import java.util.Arrays;

public class practice04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] logicArray = new int[5];
		logicArray[0] = 100;
		logicArray[1] = 50;
		logicArray[2] = 75;
		logicArray[3] = 80;
		logicArray[4] = 65;
		int s = 0;
		//int n = 0;
		for (int i = 0; i < 5; i++) {

			Arrays.sort(logicArray);
			System.out.println(Arrays.asList(logicArray[i]));

		}

	}

}