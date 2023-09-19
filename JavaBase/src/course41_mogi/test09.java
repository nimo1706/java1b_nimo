package course41_mogi;

public class test09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numArr = new int[5];
		numArr[0] = 10;
		numArr[1] = 50;
		numArr[2] = 30;
		numArr[3] = 20;
		numArr[4] = 40;

		for (int n = 0; n < 5; n++) {
			for (int j = 5 - 1; j > n; j--) {
				if (numArr[j - 1] > numArr[j]) {
					int box = numArr[j];
					numArr[j] = numArr[j - 1];
					numArr[j - 1] = box;
				}
			}

		}

		System.out.println(numArr[4]);

	}

}
