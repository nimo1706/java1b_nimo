package course20;

public class sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] moji = new String[5];
		moji[0] = "て";
		moji[1] = "す";
		moji[2] = "と";
		moji[3] = "だ";
		moji[4] = "よ";

		int x = moji.length;
		System.out.println(x);
		for (int i = 0; i < moji.length; i++) {

			System.out.println(i + "番目の要素は「" + moji[i] + "」");
		}

	}

}
