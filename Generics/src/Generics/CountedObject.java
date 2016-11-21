package Generics;

public class CountedObject{
	private static long count = 0;
	private final long id = count++;
	
	public long getId(){
		return id;
	}

	@Override
	public String toString(){
		return "CoutedObject" + id;
	}
}
