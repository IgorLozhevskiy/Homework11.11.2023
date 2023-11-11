package telran.interview;

import java.util.*;

public class InterviewTasks {
/**
 * 
 * @param ar array of integer numbers
 * @param sum integer number
 * @return true if the given array contains two numbers, the sum of which equals the given sum value
 */
	public static boolean isSum2(int [] ar, int sum) {
		HashSet<Integer> set = new HashSet<>();

		for (int num : ar) {
			if (set.contains(sum - num)) {
				return true;
			}
			set.add(num);
		}
		return false;
}
	/**
	 * 
	 * @param ar array of integer numbers
	 * @return maximal positive number having negative number with the same absolute value
	 */
	public static int getMaxPositiveWithNegativeValue (int ar[]) {
		HashSet<Integer> set = new HashSet<>();
		int maxPositive = -1;

		for (int num : ar) {
			if (num < 0 && set.contains(Math.abs(num))) {
				maxPositive = Math.max(maxPositive, Math.abs(num));
			}
			set.add(num);
		}

		return maxPositive;
	}
	
	/**
	 * 
	 * @param strings - array of strings
	 * @return Map where key - string, value - number of occurrences in the array
	 */
	public static HashMap<String, Long> getMapOccurrences(String[] strings) {
		//TODO should be done with complexity O[N]
		//Optionally, additional bonus if you apply the method "merge" of the interface Map
		//try to understand this method https://docs.oracle.com/javase/8/docs/api/java/util/Map.html#merge-K-V-java.util.function.BiFunction- 
		//it uses Functional interface BiFunction
		return null;
	}
	
}
