class Car
{
	private boolean engine;
	private int cylinder;
	private String name;
	private int wheels;

	public Car(int cylinder, String name)
	{
		this.engine = true;
		this.cylinder = cylinder;
		this.name = name;
		this.wheels = 4;
	}

	public int getCylinder()
	{
		return cylinder;
	}

	public String getName()
	{
		return name;
	}

	public String startEngine()
	{
		return "Car -> startEngine()";
	}

	public String accelerate()
	{
		return "Car -> accelerate()";
	}

	public String brake()
	{
		return "Car -> brake()";
	}


}


class Mitsubishi extends Car
{
	public Mitsubishi(int cylinder, String name)
	{
		super(cylinder, name);
	}

	@Override
	public String startEngine()
	{
		return "Mitsubishi -> startEngine()";
	}

	@Override
	public String accelerate()
	{
		return "Mitsubishi -> accelerate()";
	}

	@Override
	public String brake()
	{
		return "Mitsubishi -> brake()";
	}


}


public class MainCarPolymorphism
{

	public static void main(String[] args)
	{
		Car myCar = new Car(8, "Base car");
		System.out.println(myCar.startEngine());
		System.out.println(myCar.accelerate());
		System.out.println(myCar.brake());


		Mitsubishi myMitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
		System.out.println(myMitsubishi.startEngine());
		System.out.println(myMitsubishi.accelerate());
		System.out.println(myMitsubishi.brake());

		//from external class : Ford.java
		Ford myFord = new Ford(6, "Ford Explorer");
		System.out.println(myFord.startEngine());
		System.out.println(myFord.accelerate());
		System.out.println(myFord.brake());



	}
}