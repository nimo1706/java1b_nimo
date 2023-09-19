package course20;

public class practice06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] moji = new String[5];
		moji[0] = "x";
		moji[1] = "y";
		moji[2] = "x";
		moji[3] = "y";
		moji[4] = "x";
		int x = 0;
		int y = 0;
		int i=0;
		for (String mojimoji : moji) {
			
			if ("x".equals(moji[i])) {
				x++;
				System.out.println("xは" + x);
			} else {

				y++;
				System.out.println("yは" + y);
			}
			i++;
		}

	}

}
