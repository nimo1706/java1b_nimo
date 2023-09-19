package course44;

public class UaseClass {
	public static void main(String[] args) {

		Human human = new Human();

		human.setName("システム太郎");
		human.setHobby("プログラミング");
		human.setWeight(60000);

		human.disp();
		human.dispWeight();

		human.eat("ハンバーガー", 1200);

		human.dispWeight();

		Animal animal = new Animal();

		animal.setName("サイ");
		animal.setWeight(7000000);
		animal.setKari("角で相手を粉砕する");
		animal.setJumyou(30);
		animal.death(animal.getName());

		animal.display();
	}

}