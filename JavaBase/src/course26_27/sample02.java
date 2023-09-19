/*package course26_27;

import java.util.Random;
import java.util.Scanner;

public class sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		Random stdIn = new Random();
		int gamecont = 0;
		int wincount = 0;
		int losecount = 0;
		int rand2 = 0;
		int rand = kaad();
		syo();

		

		System.out.println("１枚目カード数は[" + rand + "]");
		rand2 = kaad();
		System.out.println("２枚目カード数は[" + rand2 + "]");
		int yosou = 0;
		
		int kekka = hanntei(rand, rand2, yosou);

		System.out.println("高いか低いか予想をしてください");
		System.out.println("1:高い 2:低い");
		yosou = stdIn.nextInt();
		double r = Shouritu(gamecont, wincount);
		System.out.println(r + "%");
	}

	static void syo() {
		int syozi = 1000;
		System.out.println("現在の所持金は" + syozi + "です");
	}

	static int kaad() {
		Random rnd = new Random();
		int a = rnd.nextInt(13) + 1;
		int num = a;
		return num;
	}

	static String hanntei(int x, int y, int z) {
		String kekka = null;
		if (x == y) {
		} else if (x < y && z == 1) {
			kekka = "win";
		} else if (x > y && z == 1) {
			kekka = "win";
		} else if (x < y && z == 2) {
			kekka = "lose";
		} else if (x > y && z == 2) {
			kekka = "lose";
		}
		return kekka;
	}

	static double Shouritu(int u, int t) {
		//勝利数÷勝負数
		double f = u / t;
		return f;
	}

}*/
