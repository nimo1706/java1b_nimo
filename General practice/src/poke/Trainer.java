package poke;

import java.util.Random;

public class Trainer {

	static Random Rand0bj = new Random();

	int ino3 = 0;
	String name;
	Pocketon[] myPockes;

	Trainer() {

		name = null;
		myPockes = new Pocketon[6];

	}

	void capture(Pocketon poke) {

		Pocketon Poke = new Pocketon(poke.name, poke.type, poke.power, poke.difficult);

		int raNum = Rand0bj.nextInt(10) + 1;

		if (poke.difficult < raNum) {

			myPockes[ino3] = Poke;
			ino3++;

			myPockes[ino3 - 1].getted = ino3;

			System.out.println("捕獲できた(^▽^)/");

		} else {
			System.out.println("逃げられたよ(^▽^)/");
		}

	}

	void display() {
		try {
			for (int n = 0; n < 6; n++)
				System.out.println(myPockes[n].name);
		} catch (Exception e) {
		}
	}

}