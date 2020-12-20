import java.lang.Math; 

class Movie
{
	private String name;

	public Movie(String name)	//constructor
	{
		this.name = name;
	}

	public String plot()	//method call "plot()"
	{
		return "No plot here";
	}

	public String getName()
	{
		return name;
	}


}


class Jaws extends Movie
{
	public Jaws()	//constructor
	{
		super("Jaws");
	}

	public String plot()
	{
		return "A shark eats lots of people";
	}
}


class IndependenceDay extends Movie
{
	public IndependenceDay()	//constructor
	{
		super("Independence Day");
	}

	@Override
	public String plot()
	{
		return "Alien attemp to take over planet earth";
	}
}

class MazeRunner extends Movie
{
	public MazeRunner()	//constructor
	{
		super("Maze Runner");
	}

	@Override
	public String plot()
	{
		return "Kids try and escape a maze";
	}
}

class StarWars extends Movie
{
	public StarWars()	//constructor
	{
		super("Star Wars");
	}

	@Override
	public String plot()
	{
		return "Imperial Forces try to take over the universe";
	}
}


class Forgetable extends Movie
{
	public Forgetable()	//constructor
	{
		super("Forgetable");
	}

	//No plot method
}



public class MainRandomMovies
{

	public static void main(String[] args)
	{
		for (int i = 1; i < 11; i++)
		{
			Movie movie = randomMovie();
			System.out.println("Movie # " + i + 
				" : " + movie.getName() + "\n" + 
				"Plot: " + movie.plot() + "\n");
		}
	}


	//method to generate random movies
	public static Movie randomMovie()
	{
		int randomNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random number generated was: " + randomNumber);

		switch(randomNumber)
		{
			case 1:
			return new Jaws();

			case 2:
			return new IndependenceDay();

			case 3:
			return new MazeRunner();

			case 4:
			return new StarWars();

			case 5:
			return new Forgetable();

		}

		return null;	//if not part of any case 1,2,3,4,5 just return "null"
		
	}
}