package course06_07;
import java.util.Scanner;
public class practice04 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("値を入力");
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt();
		
		if(x>10) {
			System.out.println("10以上だよ");
			
		}else {
			System.out.println("小さい");
			
		}
}
}
