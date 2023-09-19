package course19;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stDIn = new Scanner(System.in);
		//なれよう問題１
		String[] mygroup = new String[10];
		mygroup[0] = "長縄";
		mygroup[1] = "杉本";
		mygroup[2] = "渡部先生";

		for (int i = 0; i < 3; i++) {

			System.out.println("俺の友達は" + mygroup[i] + "だ");
		}
		//慣れよう問題２

		int[] mygroupnum = new int[10];
		mygroupnum[0] = 19;
		mygroupnum[1] = 13;
		mygroupnum[2] = 99;
		for (int i = 0; i < 3; i++) {

			System.out.println("俺の友達は" + mygroupnum[i] + "だ");
		}

		//慣れよう問題3
		int[] mynum = new int[10];
		mynum[0] = 10;
		mynum[1] = 50;
		mynum[2] = mynum[0] + mynum[1];
		for (int i = 0; i < 3; i++) {

			System.out.println("俺の数値は" + mygroupnum[i] + "だ");
		}
		//慣れよう問題3
		System.out.println("値を入力してください");
		int x = stDIn.nextInt();
		int[] mynumscan = new int[10];
		mynumscan[0] = 10;
		mynumscan[1] = x;
		mynumscan[2] = mynumscan[0] + mygroupnum[1];
		for (int i = 0; i < 3; i++) {

			System.out.println("俺の数値は" + mynumscan[i] + "だ");
		}
	}

}
