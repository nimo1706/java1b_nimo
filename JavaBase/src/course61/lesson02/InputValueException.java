package course61.lesson02;

import java.util.Scanner;

public class InputValueException {

	public static void main(String[] args) {

		try {
			Scanner stdIn = new Scanner(System.in);

			System.out.print("整数を入力してください：");
			int ans = stdIn.nextInt();
			System.out.println("入力された整数は" + ans);
			
		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("整数が入力されませんでした");
			
		}

	}

}
