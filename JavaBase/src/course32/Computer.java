package course32;

public class Computer {

	String name;
	String cpu;
	int memory;
	String gurabo;
	int price;

	Computer(String n, String c, int m, String g, int p) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	void display() {
		System.out.println(name);
		System.out.println(cpu);
		System.out.println(memory);
		System.out.println(gurabo);
		System.out.println(price);
	}

	int nebiki(int nebikigaku) {

		return price - nebikigaku;
	}

	int chonebiki(int nebikigaku) {

		return price - (nebikigaku * 3);
	}

}
