package course_mob;
import java.util.Scanner;
public class Practice04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int a = stdIn.nextInt();
		int b = a % 3;
		int c = a % 5;
		
		if (b==0) {
		
			System.out.println("Fizz");
		
		}else if(c==0) {
				System.out.println("Buzz");
		}else if(b == 0 && c == 0){
					System.out.println("Fizz&Buzz");
			}
			
		}
		
		

	}


