package Generics.Sets;
import java.util.*;

public class NumberSets{
	public enum Alphabetics {A, B, C, D, E, F, G, H, K, L, M, O}
	
	public static void main(String arg[]){
		Set<Alphabetics> setA = EnumSet.range(Alphabetics.A, Alphabetics.E);
		Set<Alphabetics> setB = EnumSet.range(Alphabetics.C, Alphabetics.H);
		System.out.println("setA: " + setA);
		System.out.println("setB: " + setB);
		Set<Alphabetics> union = Sets.union(setA, setB);
		System.out.println("union: " + union);
		Set<Alphabetics> difference = Sets.difference(setA, setB);
		System.out.println("difference: " + difference);
		Set<Alphabetics> intersection = Sets.intersection(setA, setB);
		System.out.println("intersection: " + intersection);
		System.out.println("complement: " + Sets.complement(setA, setB));
	}
}
