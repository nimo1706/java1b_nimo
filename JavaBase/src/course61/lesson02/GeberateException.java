package course61.lesson02;

public class GeberateException {

	public static void main(String[] args) {

		try {

			generateException();

		} catch (Exception e) {
			System.out.println("errorをキャッチしたよ！" + e.getMessage());
		}

	}

	public static void generateException() throws Exception {
		throw new RuntimeException("error発生");
	}

}
