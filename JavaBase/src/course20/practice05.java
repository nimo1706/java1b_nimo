package course20;

public class practice05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;

		int i = 0;
		int n=0;
		for (int numnum : num) {
			if (i == 0 || i == 4) {
n=n+num[i];
			}else if(i == 3 || i == 4)
			System.out.println(n);
		}

	}

}
