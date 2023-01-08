package lesson_04_2;

public class Animal {

	private String name;
	private int speed;
	private int age;
	
	public Animal(String name, int speed, int age){
		super();
		this.name = name;
		this.speed = speed;
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void setAge(int age){
		this.age = age;
	}
		
	public int getAge(){
		return age;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", speed=" + speed + ", age=" + age + "]";
	}
}
	
	

