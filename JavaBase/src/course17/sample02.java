package course17;

public class sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int x = 8;
		int y = 8;

		//右に2ビットずらす
		x = x >> 2;
		System.out.println(x);

		//左に2ビットずらす
		y = y << 2;

		System.out.println(y);
	}

}
