package course12;

public class practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 1;
		int n = 1;

		while (n <= 9) {

			while (i <= 9) {
				System.out.print(i * n + ",");

				i++;
			}
			
			System.out.println();
			i = 1;
			n++;
		}
	}

}
