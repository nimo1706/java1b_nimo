package course40;

public class practice12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

		int n = 0;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			System.out.println(n = n + numbers[i]);
		}

	}

}
