package course36;

public class UseClass {
	public static void main(String[] args) {

		Student st = new Student();

		st.setName("わたべ");
		st.setCourse("高度情報処理科");
		st.setSchool("国際理工");

		st.display();

		Student st2 = new Student();
		st2.setName("ぬまた");
		st2.setCourse("情報システム科");
		st2.setSchool("船橋情報専門学校");
		
		
		System.out.println();

		
		Kaden ka1 = new Kaden();
		Kaden ka2 = new Kaden();

		ka1.name = "冷蔵庫";
		ka2.name = "洗濯機";
		ka1.price = 10000;

		ka1.display();
		ka2.display();

	}
}
