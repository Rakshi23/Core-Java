package collection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	int rollno;
	String name;
	int  age;
	
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student st)
	{
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else 
			return -1;
	}
}
public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(111,"arjun",28));
		al.add(new Student(123,"rakshi",35));
		al.add(new Student(134,"varun",22));
		Collections.sort(al);
		for(Student st:al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}
