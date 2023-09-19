package course28;

public class Sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Chr numata = new Chr();
		numata.attack = 1;
		numata.def = 1;
		numata.spd = 1;
		numata.love = 1;
		numata.mp = 1;
		numata.hp = 500;

		Chr kajima = new Chr();
		kajima.attack = 100;
		kajima.def = 100;
		kajima.spd = 250;
		kajima.love = 10;
		kajima.hp = 10;
		kajima.mp = 30;

		kajima.naguru(kajima.attack, numata.def);

	}

}
