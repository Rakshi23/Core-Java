package generics;

public class TestGenerics {
	static <T> void genericDisplay(T element)
	{
		System.out.println(element.getClass().getName() + "=" +element);
	}

	public static void main(String[] args) {
		genericDisplay(1);
		genericDisplay("Generics");
		genericDisplay(1.0);
	}

}
