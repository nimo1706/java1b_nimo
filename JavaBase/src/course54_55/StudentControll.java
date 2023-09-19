package course54_55;

public class StudentControll {
	public static void main(String[] args) {

		Student tonari = new Student(10, "坂本　光平");
		Student me = new Student(6, "大関　里惟");

		//System.out.println(tonari.getSyussekibango() + tonari.getName());
		//System.out.println(me.getSyussekibango() + me.getName());

		Student[] mymen = new Student[2];

		mymen[0] = tonari;
		mymen[1] = me;
		
		System.out.println(mymen[0].getSyussekibango()+mymen[0].getName());
		System.out.println(mymen[1].getSyussekibango()+mymen[1].getName());
		
		mymen[0].setSyussekibango(3);	
		mymen[0].setName("猪　琉希");	
		
		System.out.println(mymen[0].getSyussekibango()+mymen[0].getName());
	}
}