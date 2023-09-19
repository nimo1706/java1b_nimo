package course08;

public class sample04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
						//switch文の鉄板構文
		String like = "魚";
		switch (like) {
		case "魚":
			System.out.println("魚が好きです。");
			break;		//以降の判定をスキップ
		case "肉":
			System.out.println("肉が好きです。");
			break;

		default:		//どれにも該当しない場合
			System.out.println("野菜派です。");

		}

	}

}
