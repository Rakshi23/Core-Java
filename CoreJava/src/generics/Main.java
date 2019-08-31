package generics;

class Test<T> {
	//An object of type T is declared
	T obj;
	Test(T obj)
	{
		this.obj = obj; //constructor
	}
	public T getObject()
	{
		return this.obj;
	}
}
	public class Main
	{
		public static void main(String[] args) 
		{
			Test <Integer> iObj = new Test<Integer>(15);
			System.out.println(iObj.getObject());
			Test <String> sObj = new Test<String>("Generics");
			System.out.println(sObj.getObject());
		}
	}


