package course61.lesson02;

import java.util.Scanner;

public class CalcThrowSample2 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.print("1~100の範囲で整数を入力してください：");
		int ans = stdIn.nextInt();
		System.out.println("入力された整数は" + ans);

		try {

			int result = calculateDivision(100, ans);
			System.out.println("100から" + ans + "を割った数は、" + result);

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticExceptionが発生しました: " + e.getMessage());

		} finally {
			System.out.println("★★★★処理を終了します。★★★★");
		}
	}

	// 引数は1~100までの範囲とする。
	public static int calculateDivision(int num1, int num2) throws ArithmeticException {

		if (num2 == 0) {
			throw new ArithmeticException("0で割ることはできません");
		}

		return num1 / num2;
	}

}
