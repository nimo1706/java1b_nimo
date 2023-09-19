package course40;

public class practice13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

		for (int n = 0; n < 5; n++) {
			for (int j = 5 - 1; j > n; j--) {
				if (numbers[j - 1] < numbers[j]) {
					int box = numbers[j];
					numbers[j] = numbers[j - 1];
					numbers[j - 1] = box;
				}
			}

		}

		System.out.println(numbers[0]);

	}

}
