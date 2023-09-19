package course57;

import java.util.Random;
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Random rnd = new Random();
		Scanner stdIn = new Scanner(System.in);

		int ransu = rnd.nextInt(100) + 1;

		int count = 0;

		while (true) {

			System.out.println("乱数を予想してください");
			int no = stdIn.nextInt();

			count++;

			if (ransu == no) {

				System.out.println(count + "回目でクリアしました");

				break;

			} else {

				if (ransu > no) {
					System.out.println("答えはもっと大きな数字です");
					System.out.println();

					continue;

				} else if (ransu < no) {
					System.out.println("答えはもっと小さな数字です");
					System.out.println();

					continue;

				}

			}

		} //while

	}

}