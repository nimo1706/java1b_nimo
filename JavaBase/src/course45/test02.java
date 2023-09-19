package course45;

public class test02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] numExArr = new int[5];
		numExArr[0] = 10;
		numExArr[1] = 50;
		numExArr[2] = 30;
		numExArr[3] = 20;
		numExArr[4] = 40;

		int bux = numExArr[0];

		numExArr[0] = numExArr[4];

		numExArr[4] = bux;

		System.out.println(numExArr[0]);
		System.out.println(numExArr[4]);

	}

}
