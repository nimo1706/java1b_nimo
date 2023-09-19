package course30_31;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Drink dr = new Drink(100, "初期データ");
		dr.price = 150;
		dr.name = "午後の紅茶";

		dr.display();

		int n = dr.calcSum(dr.price, 17);

		System.out.println("合計は" + n);

		Drink drink = new Drink(100, "初期データ");
		drink.display();

		Books books = new Books("初期ネーム", 100, "初期太郎");
		books.display();

		books.name = "ITワールド";
		books.page = 500000;
		books.author = "サーティファイ";

	}

}
