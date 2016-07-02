package solutions;

import java.util.HashSet;

public class TestHashSetSize {

	public static void main(String[] args) {
		HashSet<Integer> testSet=new HashSet<>(2);
		testSet.add(1);
		testSet.add(2);
		System.out.println(testSet.toString());
		System.out.println(testSet.size());
		testSet.add(3);
		System.out.println(testSet.toString());
		System.out.println(testSet.size());
	}
}
