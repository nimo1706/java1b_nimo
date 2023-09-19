package season02;

import java.util.Random;
import java.util.Scanner;

public class gacha05 {

	static Random Rand0bj = new Random();
	static Scanner stdIn = new Scanner(System.in);

	static int i;
	static int 単発ピックアップSSR;
	static int 単発通常SSR;
	static int 単発SR;
	static int 単発R;
	static int 十連SSR;
	static int 十連SR;
	static int 十連R;
	static int 養分SSR;
	static int 養分SR;
	static int 養分R;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("何回回しますか");
		int kaisuu = stdIn.nextInt();

		int ten = kaisuu / 10;

		for (int kaunnto = 1; kaunnto <= kaisuu; kaunnto++) {
			i++;

			int ran = Rand0bj.nextInt(100) + 1;
			System.out.println(ran);

			if (kaisuu <= 301) {//単発

				if (ran <= 1) {//SSR

					ssr();

				} else if (ran > 1 && ran < 19) {//単発SR
					単発SR++;

				} else {//単発R
					単発R++;
				}

			} else if (ten != 0 && kaisuu <= 301) {//10連
				if (ran >= 3) {//10連SSR
					十連SSR++;

				} else if (ran <= 97) {//10連SR
					十連SR++;

				} else {//10連R
					十連R++;

				}
			} else if (kaisuu >= 301) {
				if (ran <= 1) {//養分SSR
					養分SSR++;

				} else if (ran > 1 && ran < 19) {//養分SR
					養分SR++;

				} else {//養分R
					養分R++;

				}

			} else {

			}
		}
		System.out.println("");
		System.out.println("結果");
		System.out.println(("ガチャを回した回数は ") + i + (" 回です"));
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

	static void ssr() {
		// TODO 自動生成されたメソッド・スタブ

		int ran = Rand0bj.nextInt(100) + 1;

		if (ran >= 301) {

			if (ran <= 70) {//ピックアップSSR
				System.out.println("単発ピックアップSSR");
				単発ピックアップSSR++;

			} else {//通常SSR
				System.out.println("単発通常SSR");
				単発通常SSR++;
			}

		} else {

		}

	}

}
