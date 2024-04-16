package course61.lesson02;

public class ArrayException2 {

	public static void main(String[] args) {

		// int型配列を定義
		int[] array = new int[5];

		try {

			System.out.println("array[10]に数値を代入します。");
			array[10] = 10;
			System.out.println("array[10]に10を代入しました。");
			System.out.println("処理終了");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("エラーが発生したよ！インデックスの指定がおかしいよ！");
		}

	}

}
