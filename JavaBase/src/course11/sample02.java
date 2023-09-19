package course11;

public class sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i = 1;
		//while文の鉄板構文
		while (i < 10) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
			i++;
		}
		System.out.println("抜けたよ");
	}
}
