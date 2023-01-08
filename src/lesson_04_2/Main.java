package lesson_04_2;

public class Main {

	public static void main(String[] args) {
		
		Animal a = new Animal("Cat", 12, 6);
		
		System.out.println(a);
		
		a.setName("Dog");
		a.setSpeed(8);
		a.setAge(4);
		
		System.out.println();
		System.out.println(a);
	}
}
