package Generics.CoffeGenerator;

public class Coffe{
	private static long counter = 0;
	private final long id = counter++;

	public static long getCounter(){
		//System.out.println("counter: " + counter);
		return counter;
	}

	@Override
	public String toString()
	{
		return getClass().getSimpleName() + " " + id;
	}
}
