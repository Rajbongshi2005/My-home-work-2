import java.util.Scanner;
class Vehicle
{
	public void speedUp(float speed)
	{
		System.out.println(" this vehicle speed is  "+speed);
	}
}
class Car extends Vehicle
{
	public void speedUp(int speed)
	{
		System.out.println(" this car speed is  "+speed);
	}
}
class Bicycle extends Vehicle
{
	public void speedUp(int speed)
	{
		System.out.println(" this bicycle speed is  "+speed);
	}
}
class Main1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Car C1=new Car();
		int speed;
		System.out.print("Enter speed: ");
		speed=in.nextInt();

		C1.speedUp(speed);
		C1.speedUp((float)speed);
		Bicycle b1=new Bicycle();
		b1.speedUp(speed);
		C1.speedUp((float)speed);



	}
}