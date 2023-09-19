package course19;

public class sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String a="大関";
		String b="杉本";
		String c="長縄";
		String d="藤倉";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		String e="臼井";
		String f="鹿嶋";
		String g="土屋";
		String h="大澤";
		
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		String[] nameList=new String[10];
		nameList[0]="やすだ";
		nameList[1]="ねもと";
		nameList[2]="ながなわ";
		
		for (int i =0;i<3;i++) {
			System.out.println("俺の友達は"+nameList[i]+"だ");
		}
		
		System.out.println("俺の友達は"+nameList[0]+"だ");
		
	}

}
