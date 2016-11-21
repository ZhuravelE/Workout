package Generics;//Автоматическое создание Generics.Generator для класса
//с конструктором по умолчанию (без аргументов).

public class BasicGenerator<T> implements Generator<T>{
	private Class<T> type;
	
	public BasicGenerator(Class<T> type){
		this.type = type;
	}
	
	@Override
	public T next(){
		try{
			//Предполагается, что type является public-классом.
			return type.newInstance();
		}catch (Exception e){
			throw new RuntimeException(e);
		}
	}
	
	//Получение генератора по умолчанию для заданного type.
	public static <T> Generator<T> creat(Class<T> type){
		return new BasicGenerator<>(type);
	}
}
