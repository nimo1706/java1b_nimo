package course54_55;

public class Typhoon {
	private int typhoonbango;
	private String hasseibi;
	private String asiaName;
	//デフォルトコンストラクタ
	//引数有りコンストラクタ
	//getter,setter

	public Typhoon(int No, String day, String name) {
		this.typhoonbango = No;
		this.hasseibi = day;
		this.asiaName = name;
	}

	public int getTyphoonbango() {
		return typhoonbango;
	}

	public void setTyphoonbango(int typhoonbango) {
		this.typhoonbango = typhoonbango;
	}

	public String getHasseibi() {
		return hasseibi;
	}

	public void setHasseibi(String hasseibi) {
		this.hasseibi = hasseibi;
	}

	public String getAsiaName() {
		return asiaName;
	}

	public void setAsiaName(String asiaName) {
		this.asiaName = asiaName;
	}

}