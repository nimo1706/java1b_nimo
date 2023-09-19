package course34_35;

public class sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		calc();

		calc(50, 100);

		calc("K");

		calc(100);

	}

	static void calc() {
		System.out.println("計算したときは、引数を二つ渡して");

	}

	static void calc(int a, int b) {
		System.out.println("計算結果は" + (a + b));

	}

	static void calc(String a) {
		System.out.println("渡された文字は" + a + "です");
	}

	static void calc(int i) {
		System.out.println("受け取った値は" + i + "です");
	}

}
