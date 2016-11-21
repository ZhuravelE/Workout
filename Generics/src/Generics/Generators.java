package Generics;

import Generics.CoffeGenerator.Coffe;
import Generics.CoffeGenerator.CoffeGenerator;
import Generics.Fibonacci.Fibonacci;

import java.util.*;
// Примечание.
// Еще примечание.
public class Generators
{
	public static <T> Collection<T> fill(
			Collection<T> collection, Generator<T> gen, int size){
		for(int i = 0; i < size; i++){
			collection.add(gen.next());
		}
		return collection;
	}
	
	public static void main(String args[]){
		Collection<Coffe> list = fill(new ArrayList<>(), new CoffeGenerator(), 5);
		for(Coffe c: list){
			System.out.println(c);
		}

		System.out.println();
		
		Collection<Integer> fib = fill(new ArrayList<>(), new Fibonacci(), 12);
		for(Integer i: fib){
			System.out.print(i + ", ");
		}
	}
}
