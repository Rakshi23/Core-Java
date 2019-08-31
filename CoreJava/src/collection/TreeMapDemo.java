package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args)
{
	TreeMap<Integer,String> tmap= new TreeMap<Integer,String>();
	tmap.put(1,"data1");
	tmap.put(23,"data2");
	tmap.put(70,"data3");
	tmap.put(4,"data4");
	tmap.put(2,"data5");
	Set set=tmap.entrySet();
	Iterator iterator=set.iterator();
	while(iterator.hasNext()){
		Map.Entry mentry =(Map.Entry)iterator.next();
		System.out.println("key is :"+mentry.getKey()+"&  value is");
		System.out.println(mentry.getValue());
	}
}

}
