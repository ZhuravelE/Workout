package Generics;

public class GenericMethods{
	
	public <T> void type(T t){
		System.out.println(t.getClass().getName());
	}
	public static void main(String[] args){
		GenericMethods gm = new GenericMethods();
		gm.type("hj");
		gm.type(1);
		gm.type(2L);
		gm.type(3f);
		gm.type('♡');
		gm.type(gm);
	}
}
