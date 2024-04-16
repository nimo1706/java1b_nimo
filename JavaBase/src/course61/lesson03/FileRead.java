package course61.lesson03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("src/course61/lesson03/example.txt");
		Scanner scanner = new Scanner(file);

		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}

		System.out.println("エラー: ファイルが見つかりません。");

	}

}
