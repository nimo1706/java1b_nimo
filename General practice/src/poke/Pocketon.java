package poke;

public class Pocketon {

	String name;
	String type;
	int power;
	int difficult;
	int getted;

	Pocketon(String n, String t, int p, int d) {

		this.name = n;
		this.type = t;
		this.power = p;
		this.difficult = d;
		this.getted = 0;

	}

	void display() {
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.power);
		System.out.println(this.difficult);
		System.out.println(this.getted);
	}

}