package jun.algorithm.graph;

import java.util.HashMap;
import java.util.stream.Stream;

public class Fib {
	public static int fib(int n) {
		HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

		return memoisedFib(n, memo);
	}

	private static int memoisedFib(int n, HashMap<Integer, Integer> map) {
		if (n < 2)
			return 1;

		if (map.containsKey(n)) {
			return map.get(n);
		}

		map.put(n, memoisedFib(n - 1, map) + memoisedFib(n - 2, map));
		return map.get(n);
	}
	
	public static void main(String[] args) {
		String[] wordBank = new String[] {"ab", "cd", "ef"};
		String target = "abcdef";
		sub(wordBank, target);
		
		
	}

	private static void sub(String[] wordBank, String target) {
		for (String string : wordBank) {
			if (target.indexOf(string) == 0) {
				String suffix = target.substring(string.length());
			} 
			
		}
	}
}
