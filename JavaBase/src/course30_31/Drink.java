package course30_31;

public class Drink {

	int price;
	int suryo;
	String name;

	void display() {
		System.out.println(price);
		System.out.println(name);
		System.out.println();
	}

	int calcSum(int x, int y) {
		int sum = x * y;

		return sum;
	}

	Drink(int p, String n) {
		price = p;
		name = n;
	}



}
