package course11;

public class Ex01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 0,a=0;

		while (i <= 100) {
			System.out.println("現在のカウントは" + i + "です");
			i++;
			a=i%10;
			if(a==0) {
				System.out.println("10の倍数です");
			}
		
	}
	}

}
