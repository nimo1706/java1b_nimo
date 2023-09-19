package course29;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		Character me = new Character();
		System.out.println("名前は");
		me.name = stdIn.next();

		System.out.println("HPは");
		me.hp = stdIn.nextInt();

		System.out.println("攻撃力は");
		me.str =  stdIn.nextInt();

		System.out.println("防御力は");
		me.def =  stdIn.nextInt();

		System.out.println("命中率は");
		me.dex =  stdIn.nextInt();

		System.out.println("回避率は");
		me.agi =  stdIn.nextInt();

		me.viewStatus();

		Character tonari = new Character();
		tonari.name = "藤倉";
		tonari.hp = 50;
		tonari.str = 50;
		tonari.def = 50;
		tonari.dex = 50;
		tonari.agi = 50;

		tonari.viewStatus();

		me.battle(me, tonari);

	}

}
