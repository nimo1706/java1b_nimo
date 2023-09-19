package course20;

public class sample02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numarray = new int[5];
		numarray[0] = 10;
		numarray[1] = 20;
		numarray[2] = 30;
		numarray[3] = 40;
		numarray[4] = 50;

		for (int num : numarray) {
			System.out.println(num);
		}

		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		//左側に取り出した単品
		//右側に取り出し元の配列
		for (int num : arr) {
			sum = sum + num;
		}

	}

}
