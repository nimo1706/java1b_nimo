package course61.lesson03;

public class NumberConversion {

	public static void main(String[] args) {

		// parseIntメソッドを使用した例題の処理を記載してください。

	}

	private static int parseInt(String input) throws NumberFormatException, IllegalArgumentException {

		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		int number = Integer.parseInt(input);

		if (number > 100) {
			throw new IllegalArgumentException("inputが100以下ではありません。");
		}

		return number;

	}

}
