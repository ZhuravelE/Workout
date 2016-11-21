package Generics.CoffeGenerator;

import Generics.Generator;

import java.util.*;
public class CoffeGenerator implements Generator<Coffe>, Iterable<Coffe>{
	private Class[] types = {Latte.class, Mocha.class, Capputtino.class, 
		Americano.class, Breve.class};
	private static Random rnd = new Random(47 /*Coffe.getCounter()*/);
	private int size = 0;
	
	public CoffeGenerator(){}
	public CoffeGenerator(int sz){
		this.size = sz;
	}
	
	@Override
	public Coffe next() {
		try{
			return (Coffe)types[rnd.nextInt(types.length)].newInstance();
		} catch (InstantiationException e){
			throw new RuntimeException(e);
		} catch (IllegalAccessException e){
			throw new RuntimeException(e);
		}
	}
	
	private class CoffeIterator implements Iterator<Coffe>{
		int count = size;
		@Override
		public boolean hasNext(){
			return count > 0;
		}

		@Override
		public Coffe next(){
			count--;
			return CoffeGenerator.this.next();
		}
	}
	
	@Override
	public Iterator<Coffe> iterator(){
		return new CoffeIterator();
	}
	
	public static void main (String args[]){
		CoffeGenerator cg = new CoffeGenerator();
		for(int i=0; i<5; i++){
			System.out.println(cg.next());
		}
		System.out.println();
		
		for(Coffe coffe: new CoffeGenerator(5)){
			System.out.println(coffe.toString());
		}
	}
}
