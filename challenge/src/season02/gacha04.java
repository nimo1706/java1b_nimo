package season02;

import java.util.Random;
import java.util.Scanner;

public class gacha04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		long kaisu = 0;
		long i = 0;//全体の繰り返し
		long one = 0;
		long ten = 0;
		long hyaku = 0;
		long kakutei = 0;
		long tanpatu = 0;
		long juren = 0;
		long 単発ピックアップSSR = 0;
		long 単発通常SSR = 0;
		long 単発SR = 0;
		long 単発R = 0;
		long 十連SSR = 0;
		long 十連SR = 0;
		long 十連十回SSR = 0;
		long 十連十回SR = 0;
		long 養分SSR = 0;
		long 養分SR = 0;
		long 養分R = 0;

		int n = 0;

		System.out.println("ガチャは何回回しますか？");
		System.out.println("数値を入力してください。");
		kaisu = stdIn.nextLong();

		one = kaisu % 10;
		System.out.println("");
		System.out.println("one");
		System.out.println(one);

		ten = (kaisu / 10) * 10;
		System.out.println("");
		System.out.println("ten");
		System.out.println(ten);

		hyaku = (kaisu / 300);
		System.out.println("");
		System.out.println("確定回数");
		System.out.println(hyaku);
		System.out.println("");

		for (i = 0; i < kaisu; i++) {
			Random Rand0bj = new Random();
			n = Rand0bj.nextInt(100) + 1;
			System.out.println(n);

			kakutei++;

			if (kaisu < 300 && kakutei != 300) {//一般人
				System.out.println("一般人");
				if (tanpatu < one) {//単発ガチャ
					tanpatu++;
					if (n > 3) {//単発SSR

						if (n > 70) {//単発ピックアップSSR
							System.out.println("");
							System.out.println(n);
							System.out.println("ピックアップSSR");
							単発ピックアップSSR++;

						} else {//単発通常SSR
							System.out.println("");
							System.out.println(n);
							System.out.println("通常SSR");
							単発通常SSR++;
						}

					} else if (3 < n && n > 85) {//単発SR
						System.out.println("");
						System.out.println(n);
						System.out.println("SR");
						単発SR++;

					} else {//単発R
						System.out.println("");
						System.out.println(n);
						System.out.println("R");
						単発R++;
					}

				} else if (juren < ten && kaisu < 300) {//10連ガチャ
					juren++;
					if (n > 3 && juren != 10) {//十連SSR
						System.out.println("");
						System.out.println(n);
						System.out.println("SSR");
						十連SSR++;

					} else if (n < 3 && n > 18 && juren != 10) {//十連SR
						System.out.println("");
						System.out.println(n);
						System.out.println("SR");
						十連SR++;

					} else if (n > 97 && juren == 10) {//十連十回SSR
						System.out.println("");
						System.out.println(n);
						System.out.println("SSR");
						十連SSR++;
						十連十回SSR++;

					} else if (n < 97 && juren == 10) {//十連十回SR
						System.out.println("");
						System.out.println(n);
						System.out.println("SR");
						十連SR++;
						十連十回SR++;

					}
				}
			} else if (kaisu > 300 && kakutei != 300) {//優良養分顧客
				System.out.println("優良養分顧客");
				if (n == 1) {//養分SSR
					System.out.println("");
					System.out.println(n);
					System.out.println("SSR");
					養分SSR++;

				} else if (n <= 18) {//養分SR
					System.out.println("");
					System.out.println(n);
					System.out.println("SR");
					養分SR++;

				} else {//養分R
					System.out.println("");
					System.out.println(n);
					System.out.println("R");
					養分R++;

				}

			} else if (kakutei == 300) {//確定SSR
				System.out.println("");
				System.out.println(n);
				System.out.println("SSR");
				kakutei = 0;
			}

		}
		System.out.println("");
		System.out.println("結果");
		System.out.println(("ガチャを回した回数は ") + kaisu + (" 回です"));
		System.out.println("");
		System.out.println("単発ガチャ");
		System.out.println(("ピックアップSSRは ") + 単発ピックアップSSR + (" 回です"));
		System.out.println(("通常SSRは ") + 単発通常SSR + (" 回です"));
		System.out.println(("SRは ") + 単発SR + (" 回です"));
		System.out.println(("Rは ") + 単発R + (" 回です"));
		System.out.println("");
		System.out.println("10連ガチャ");
		System.out.println(("SSRは ") + 十連SSR + (" 回です"));
		System.out.println(("SRは ") + 十連SR + (" 回です"));
		System.out.println("");
		System.out.println("優良養分顧客");
		System.out.println(("SSRは ") + 養分SSR + (" 回です"));
		System.out.println(("SRは ") + 養分SR + (" 回です"));
		System.out.println(("Rは ") + 養分R + (" 回です"));

	}
}
