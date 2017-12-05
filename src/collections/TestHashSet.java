package collections;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		Integer i1= 45;
		Integer i2= 46;
		
		set.add(i1);
		set.add(i1);
		System.out.println("*******");
		System.out.println(set.size());
		
		set.add(i2);
		System.out.println("*******");
		System.out.println(set.size());
		
		set.remove(i1);
		System.out.println("*******");
		System.out.println(set.size());
		
		i2=49;
		set.remove(i2);		// n'a plus auccun effet après i2=49
		System.out.println("*******");
		System.out.println(set.size());
		
	}

}
