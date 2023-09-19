/*package course26_27;

import java.util.Scanner;

public class sample01 {

	public static void main(String[] args) {
		int rand2 = 0;
		int rand = 0;
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int gamecont = 0;

		System.out.println(kekka);
		///////////////////////////////////////////////////
		//import java.util.Scanner;
		//Scanner stdIn = new Scanner(System.in);
		///////////////////////////////////////////////////
		int yosou = 0;
		System.out.println("高いか低いか予想をしてください");
		System.out.println("1:高い 2:低い");
		yosou = stdIn.nextInt();

		String kekka = hanntei(rand, rand2, yosou);
	}

	static String hanntei(int x, int y, int z) {
		// TODO 自動生成されたメソッド・スタブ
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

}*/
