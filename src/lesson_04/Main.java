package lesson_04;

public class Main {

	public static void main(String[] args) {
		
		Robot robot = new Robot();
		CoffeRobot coffeeRobot = new CoffeRobot();
		RobotDancer robotDancer = new RobotDancer();
		RobotCoocker robotCoocker = new RobotCoocker();
		
		robot.work();
		coffeeRobot.work();
		robotDancer.work();
		robotCoocker.work();
		
		System.out.println();
		
		Robot[] array = {robot, coffeeRobot, robotDancer, robotCoocker};
		
		for (int i = 0; i < array.length; i++) {
			Robot r = array[i];
			r.work();
		}
	
	}
}
