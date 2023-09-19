package course29;

public class sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//クラス「Human」から、インスタンス「human1」を生成
				human human1 = new human();

				//human1にパラメータを設定
				human1.name = "システム太郎";
				human1.hobby = "基数変換";
				human1.address = "サーティファイ本社";

				//クラス「Human」から、インスタンス「human2」を生成
				human human2 = new human();

				//human2にパラメータを設定
				human2.name = "システム花子";
				human2.hobby = "パック10進数";
				human2.address = "国際理工学園182号館";

				//メソッド呼び出し
				human1.talk();
				human2.talk();
				
				human me = new human();
				me.name ="大関";
				me.hobby ="卓球";
				me.address ="千葉";
				me.talk();
				
				
				

	}

}
