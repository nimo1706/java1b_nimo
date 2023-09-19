package course38_39;

import java.util.Scanner;

public class UseClass {

	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*Pocketon poke1 = new Pocketon();
		poke1.name = "銭がめ";
		poke1.power = 100;
		poke1.difficult = 1;

		poke1.display();

		String[] arr2 = new String[3];
		arr2[0] = "あ";
		arr2[1] = "か";
		arr2[2] = "さ";

		Pocketon[] myPockes = new Pocketon[3];
		myPockes[0] = poke1;
		myPockes[1] = poke1;
		myPockes[2] = poke1;

		for(int i=0;i<myPockes.length;i++) {
			System.out.println(myPockes[i]);
		}

		Pocketon poke2 = new Pocketon();
		poke2.name = "不思議リーフ";
		poke2.power = 200;
		poke2.difficult = 1;

		myPockes[1] = poke2;

		System.out.println(myPockes[0].name);
		System.out.println(myPockes[1].difficult);

		Pocketon poke3 = new Pocketon();
		poke3.name = stdIn.next();
		poke3.power = stdIn.nextInt();
		poke3.difficult = stdIn.nextInt();

		myPockes[2] = poke3;

		System.out.println(myPockes[2].name);
		System.out.println(myPockes[2].power);
		System.out.println(myPockes[2].difficult);

		for (int i = 0; i < myPockes.length; i++) {
			System.out.println(myPockes[i].name);
			System.out.println(myPockes[i].power);
			System.out.println(myPockes[i].difficult);
		}

		myPockes[1].display();*/

		//////////クラス仮免学科問題//////////

		Student st1 = new Student();
		st1.name = "大関里惟";
		st1.no = 06;

		Student st2 = new Student();
		st2.name = "溝口真矢";
		st2.no = 25;

		Student[] myfriend = new Student[2];
		myfriend[0] = st1;
		myfriend[1] = st2;

		for (int i = 0; i < myfriend.length; i++) {
			System.out.println(myfriend[i].name);
			System.out.println(myfriend[i].no);
		}

	}

}
