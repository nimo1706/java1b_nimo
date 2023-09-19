package course40;

public class practice18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		boolean tf = isEven(55);

		System.out.println(tf);

	}

	static boolean isEven(int number) {
		// TODO 自動生成されたメソッド・スタブ

		int n = 0;
		n = number % 2;

		if (n == 0) {
			return true;
		} else {
			return false;
		}

	}

}
