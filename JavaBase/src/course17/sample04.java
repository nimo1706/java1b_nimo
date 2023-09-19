package course17;

import java.util.Scanner;

public class sample04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stDIn = new Scanner(System.in);
		
		System.out.print("整数：");
		int x = stDIn.nextInt();

		System.out.printf("10進数では%dです。 \n", x);
		System.out.printf("8進数では%oです。 \n", x);
		System.out.printf("10進数では%xです。 \n", x);
	}

}
