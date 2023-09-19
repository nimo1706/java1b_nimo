package test;

import java.util.Random;
import java.util.Scanner;

public class test {

	static Random Rand0bj = new Random();
	static Scanner stdIn = new Scanner(System.in);

	//long a=11111111111111L;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double f = 0;
		double h = 0;
		double g = 0;
		
		double j = 0;
		double k = 0;
		double l = 0;

		System.out.println("豆の数を入力してください");
		long t = stdIn.nextLong();
		System.out.println();

		System.out.println("何回繰り返すか入力してください");
		long d = stdIn.nextLong();
		System.out.println();

		long naka = 0;
		long soto = 0;

		for (int s = 0; s < d; s++) {

			double w = 0;
			double e = 0;
			double q = 0;

			for (int i = 0; i < t; i++) {

				Random x = new Random();
				double xx = x.nextDouble();

				Random y = new Random();
				double yy = y.nextDouble();

				double r = xx * 2 + yy * 2;

				if (r < 1) {
					naka = naka + 1;
					
					System.out.print("内側 "+r);
					
					w = w + 1;
				} else {
					soto = soto + 1;

					System.out.print("外側 "+r);
					
					e = e + 1;

				}
				q = 4 * e / t;

			} //for豆の数

			System.out.println();
			
			f = f + e;
			g = g + w;
			h = h + q;

		} //for繰り返し

		j = f / d;
		k = g / d;
		l = h / d;

		System.out.println();
		System.out.println("内側の平均値 " + j);
		System.out.println("外側の平均値 " + k);
		System.out.println("π値の平均値 " + l);

	}

}
