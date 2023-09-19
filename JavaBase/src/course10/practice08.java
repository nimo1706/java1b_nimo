package course10;

import java.util.Scanner;

public class practice08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("aの数値を入力してください");
		int a = stdIn.nextInt();
		System.out.println("bの数値を入力してください");
		int b = stdIn.nextInt();
		System.out.println("cの数値を入力してください");
		int c = stdIn.nextInt();
		
		
		
			if (a>b && b>c) {
				System.out.println(a+("が1番大きい数値です"));
				System.out.println(b+("が2番大きい数値です"));
				System.out.println(c+("が3番大きい数値です"));
			}else if(a>c && c>b) {
				System.out.println(a+("が1番大きい数値です"));
				System.out.println(c+("が2番大きい数値です"));
				System.out.println(b+("が3番大きい数値です"));
			}else if(b>a && a>c) {
				System.out.println(b+("が1番大きい数値です"));
				System.out.println(a+("が2番大きい数値です"));
				System.out.println(c+("が3番大きい数値です"));
			}else if(b>c && c>a) {
				System.out.println(b+("が1番大きい数値です"));
				System.out.println(c+("が2番大きい数値です"));
				System.out.println(a+("が3番大きい数値です"));
			}else if(c>a && a>b) {
				System.out.println(c+("が1番大きい数値です"));
				System.out.println(a+("が2番大きい数値です"));
				System.out.println(b+("が3番大きい数値です"));
			}else if(c>b && b>a) {
				System.out.println(c+("が1番大きい数値です"));
				System.out.println(b+("が2番大きい数値です"));
				System.out.println(a+("が3番大きい数値です"));
			}
	
	}

}
