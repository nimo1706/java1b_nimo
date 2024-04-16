package course61.lesson02;

import java.util.Scanner;

public class ArrayElement {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		Scanner stdIn = new Scanner(System.in);

			System.out.println("配列の要素数は" + numbers.length + "です。");
			System.out.print("取得したいインデックスを入力してください。");
			int index = stdIn.nextInt();

			int element = getArrayElement(numbers, index);

			System.out.println("選択された要素: " + element);

		

	}

	// 例題で修正するメソッド
	private static int getArrayElement(int[] numbers, int index) {
		
		if (0>index||numbers.length<=index) {
			throw new ArrayStoreException();
			
		}

	
	}

}
