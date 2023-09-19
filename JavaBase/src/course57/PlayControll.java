package course57;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {

	static Player me = new Player();

	static int run1;
	static int run2;
	static int run3;
	static int run4;
	static int run5;
	static int run6;
	static int run7;
	static int run8;

	static String KOKU[];
	static int me1[];
	static int koku1[];

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner stdIn = new Scanner(System.in);

		modeeer: while (true) {

			System.out.println("モードを選択してください");
			System.out.println("0:通常モード 99:デバックモード");
			int mode = stdIn.nextInt();			
			
			if (mode == 0) {

				System.out.println("通常モードで実行します");
				System.out.println();

				run1 = rnd.nextInt(5) + 1;
				me.setKinryoku(run1);

				run2 = rnd.nextInt(5) + 1;
				me.setGakuryoku(run2);

				run3 = rnd.nextInt(5) + 1;
				me.setMitame(run3);

				run4 = rnd.nextInt(5) + 1;
				me.setOmosiro(run4);

				Target koku = new Target();

				run5 = rnd.nextInt(10) + 3;
				koku.setHituyouKin(run5);

				run6 = rnd.nextInt(10) + 3;
				koku.setHituyouGaku(run6);

				run7 = rnd.nextInt(10) + 3;
				koku.setHituyouMita(run7);

				run8 = rnd.nextInt(10) + 3;
				koku.setHituyouOmo(run8);

				break;

			} else if (mode == 99) {

				System.out.println("デバックモードで実行します");
				System.out.println();

				System.out.println("自分のパラメータを設定してください");
				System.out.println("自分の筋力値");
				run1 = stdIn.nextInt();

				System.out.println("自分の学力値");
				run2 = stdIn.nextInt();

				System.out.println("自分の見た目値");
				run3 = stdIn.nextInt();

				System.out.println("自分の面白さ値");
				run4 = stdIn.nextInt();

				System.out.println("相手のパラメータを設定してください");
				
				System.out.println("相手の筋力値");
				run5 = stdIn.nextInt();

				System.out.println("相手の学力値");
				run6 = stdIn.nextInt();

				System.out.println("相手の見た目値");
				run7 = stdIn.nextInt();

				System.out.println("相手の面白さ値");
				run8 = stdIn.nextInt();
				break;

			} else {

				continue;

			}

		}

		KOKU = new String[4];
		KOKU[0] = "筋力は" + run5 + "です";
		KOKU[1] = "学力は" + run6 + "です";
		KOKU[2] = "見た目は" + run7 + "です";
		KOKU[3] = "面白さは" + run8 + "です";

		me1 = new int[4];
		me1[0] = run1;
		me1[1] = run2;
		me1[2] = run3;
		me1[3] = run4;

		koku1 = new int[4];
		koku1[0] = run5;
		koku1[1] = run6;
		koku1[2] = run7;
		koku1[3] = run8;

		for (int n = 1; n < 8; n++) {

			System.out.println("現在の自分のスペックは");

			System.out.println("筋力が" + me.getKinryoku());
			System.out.println("学力が" + me.getGakuryoku());
			System.out.println("見た目が" + me.getMitame());
			System.out.println("面白さが" + me.getOmosiro());
			System.out.println("です");

			System.out.println();

			noeer: while (true) {

				System.out.println("何をトレーニングしますか？");
				System.out.println("1:筋トレ 2:勉強 3:整形 4:人と喋る");
				int no = stdIn.nextInt();

				if (no == 1) {

					me.setKinryoku(run1 + 1);

					break;

				} else if (no == 2) {

					me.setGakuryoku(run2 + 1);

					break;

				} else if (no == 3) {

					me.setMitame(run3 + 1);

					break;

				} else if (no == 4) {

					me.setOmosiro(run4 + 1);

					break;

				} else {

					continue noeer;

				}

			} //while noeer
			System.out.println();

			System.out.println(n + "回トレーニングしました");
			System.out.println();

			System.out.println("相手のスペックをランダムに表示します");
			int spec = rnd.nextInt(3);
			System.out.println(KOKU[spec]);
			System.out.println();

		}

		parametereer: while (true) {

			System.out.println("どのパラメータで告白しますか");
			System.out.println("1:筋トレ 2:勉強 3:整形 4:人と喋る");
			int parameter = stdIn.nextInt();

			int run9 = rnd.nextInt(10) + 3;

			if (parameter > 0 && parameter < 5) {

				if (me1[parameter] < koku1[parameter] && me1[run9] < koku1[run9]) {
					System.out.println("勝ち");

					break;

				} else {
					System.out.println("死亡");

					break;

				}

			} else {

				continue parametereer;

			}

		}

	}

}
