package season02;

import java.util.Random;
import java.util.Scanner;

public class gacha03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		long g = 0, t = 0, f = 0, i = 0, z = 0, zz = 0, zzz = 0, FSSR = 0, PSSR = 0, SR = 0, R = 0, x = 0, y = 0,
				one = 0, ten = 0,
				ZPSSR = 0, sr = 0, ssr = 0, hyaku = 0, kakutei = 0, r = 0, k = 0, d = 0, aa = 0;
		int n = 0, nn = 0;
		//i		繰り返し数
		//kaisu	回数の質問
		//FSSR	通常SSRクラス
		//PSSR	ピックアップSSRクラス
		//SR	SRクラス
		//R		Rクラス
		//n		乱数の生成
		//nn	乱数
		//one	一の位
		//ten	十の位以上
		//x
		System.out.println("ガチャは何回回しますか？");
		System.out.println("数値を入力してください。");

		long kaisu = stdIn.nextLong();

		ten = (kaisu / 10) * 10;
		System.out.println("");
		System.out.println("ten");
		System.out.println(ten);

		one = kaisu % 10;
		System.out.println("");
		System.out.println("one");
		System.out.println(one);
		System.out.println("");

		hyaku = (kaisu / 100);
		kakutei = hyaku / 3;
		System.out.println("");
		System.out.println("確定回数");
		System.out.println(kakutei);
		System.out.println("");

		for (i = 0; i < kaisu; i++) {
			Random Rand0bj = new Random();
			n = Rand0bj.nextInt(100) + 1;

			if (f <= one) {//単発ガチャ
				f++;
				if (3 >= n) {

					if (30 >= n) {
						System.out.println("通常SSR");
						FSSR = FSSR + 1;
					} else {
						System.out.println("ピックアップSSR");
						PSSR = PSSR + 1;
					}

				} else if (3 < n && 18 >= n) {
					System.out.println("SR");
					SR = SR + 1;

				} else {
					System.out.println("R");
					R = R + 1;
				}

			} else if (t <= ten) {//10連ガチャ
				t++;
				if (97 > n) {
					System.out.println("SR");
					sr = sr + 1;
				} else if (97 < n && n >= 9) {
					System.out.println("SSR");
					ssr = ssr + 1;
					d = d + 1;
				} else if (97 < n && n == 10) {
					zz = zz + 1;

				}
			} else if (g <= kakutei) {//確定ピックアップ
				g++;
				System.out.println("確定ピックアップSSR");
				ZPSSR=ZPSSR+1;
			}

		}

		System.out.println("");
		System.out.println("結果");
		System.out.println(("ガチャを回した回数は ") + kaisu + (" 回です"));
		System.out.println("");
		System.out.println("単発ガチャ");
		System.out.println(("SRは ") + sr + (" 回です"));
		System.out.println(("SSRは ") + ssr + (" 回です"));
		System.out.println("");
		System.out.println("10連ガチャ");
		System.out.println(("確定ピックアップSSRは ") + ZPSSR + (" 回です"));
		System.out.println(("通常SSRは ") + FSSR + (" 回です"));
		System.out.println(("ピックアップSSRは ") + PSSR + (" 回です"));
		System.out.println(("SRは ") + SR + (" 回です"));
		System.out.println(("Rは ") + R + (" 回です"));

	}

}
