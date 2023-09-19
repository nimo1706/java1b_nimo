package course04;

public class practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/*③String型の変数に「pr1」という名前を付け、
		 「変数の練習問題」という値を入れ、表示する*/
		String pr1 ="変数の練習問題";
		System.out.println(pr1);	
		
		/*④int型の変数に「pr2」という名前を付け、
		  「100」という値を入れ、表示する。*/
		int pr2 = 100;
		System.out.println(pr2);
		
		/*⑤int型の変数に「pr3」という名前を付け、
		 「100＊100」の計算結果を値として入れ表示する。*/
		int pr3 = 100*100;
		System.out.println(pr3);
		
		/*⑥String型の変数に「pr4」という名前を付け、
		  「Java」という文字と「勉強中」文字をくっつけて表示する。*/
		String pr4 = "Java";
		System.out.println(pr4+"勉強中");
		
		/*⑦変数「pr61」に「100」、変数「pr62」に「200」を入れ、
		  変数「pr63」に「pr61」と「pr62」を足した結果を入れ、表示する。*/
		
		int pr61 = 100;
		int pr62 = 200;
		int pr63 = pr61 + pr62;
		System.out.println(pr63);
		
		/*以下の出力のなるようなプログラムを作成しなさい。
		 「変数の勉強中です。100+100は｢200｣です」
		  なお必ずString型変数を2つ、int型変数を1つ使う事。*/
		int c = 200;
		String a = "変数の勉強中です。100+100は「"+(c)+"」";
		String b = "です。";
		System.out.println(a+b);
		
	}

}