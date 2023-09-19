package course44;

public class Animal extends Creatures {

	private String name;
	private String kari;
	private int jumyou;

	void display() {
		System.out.println(this.name);
		System.out.println(this.kari);
		System.out.println(this.jumyou);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKari() {
		return kari;
	}

	public void setKari(String kari) {
		this.kari = kari;
	}

	void death(String name) {
		System.out.println(name + "は" + jumyou + "年の寿命を全うし死んだ。そして天国から今も皆を見守っている。");
	}

	public int getJumyou() {
		return jumyou;
	}

	public void setJumyou(int jumyou) {
		this.jumyou = jumyou;

	}

}
