package Fruit;

import java.util.LinkedHashMap;
import static java.util.Map.*;

public class Tester5 {
	public static void main(String args[]) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(10, "ten");
		map.put(1, "one");
		map.put(2, "two");
		map.put(4, "four");
		map.put(7, "seven");
		System.out.println("LHM :");
		System.out.println(map);

		System.out.println("Keys");
		for (int k : map.keySet())
			System.out.println(k + "");
		System.out.println("\n values");
		for (String s : map.values())
			System.out.println(s + "");

		System.out.println("Entries :");
		for (Entry<Integer, String> entry : map.entrySet())
			System.out.println("key" + entry.getValue());

		
	}

}
