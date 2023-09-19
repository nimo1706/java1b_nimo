package course20;

public class practice07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String[] arr = new String[8];
		arr[0] = "y";
		arr[1] = "x";
		arr[2] = "x";
		arr[3] = "y";
		arr[4] = "x";
		arr[5] = "x";
		arr[6] = "x";
		arr[7] = "y";
		int x = 0;
		int y = 0;
		int i=0;
		for (String mojimoji : arr) {
			
			if ("x".equals(arr[i])) {
				x++;
				System.out.println("xは" + x);
			} else {

				y++;
				System.out.println("yは" + y);
			}
			i++;
		}
		System.out.println();
		System.out.println("xは" + x);
		System.out.println("yは" + y);
		
	}

}
