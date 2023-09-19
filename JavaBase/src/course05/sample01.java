package course05;

import java.util.Scanner;
//import・・・Scannerパーツの取りつけ

public class sample01 {
	public static void main(String[] args) {
		

		Scanner stdIn = new Scanner(System.in);
		//Scanner stdIn・・・Scanner使用準備

		System.out.println("xとyを加算します");

		System.out.println("xの値を入力してください");

		double x = stdIn.nextDouble();
		//stdIn.nextInt・・・System使用（キーボード入力が発生する）
		//変数「ｘ」に入力した内容が格納される

		System.out.println("yの値を入力してください");

		int y = stdIn.nextInt();
		
		System.out.println("zの値を入力してください");
		int z = stdIn.nextInt();

		System.out.println("x + y =" + (x + y));
		
	}
}
