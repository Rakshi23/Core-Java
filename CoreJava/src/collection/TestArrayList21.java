package collection;
import java.util.*;

public class TestArrayList21 {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>(); //creating arraylist
		a1.add("Jim"); //adding objects in too arrayList
		a1.add("Michael");
		a1.add("James");
		a1.add("Andy");
		
		//traversing elements using Iterator
		Iterator itr = a1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
