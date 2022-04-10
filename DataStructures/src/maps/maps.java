package maps;

import java.util.HashMap;
import java.util.Map;

public class maps {

	public static void main(String[] args) {
		// maps is for storing values based on their key
		// what you are going to put in the map
		// Map<K, V> = K is key, V is value
		Map<String, String> map = new HashMap<>();
		// key is Malaysia
		// value is KL
		map.put("Malaysia", "KL");
		map.put("Bolivia", "Cbba");
		map.put("US", "Chicago");
		System.out.println(map);
		
		// you get the value of the Key with .get
		System.out.println(map.get("Malaysia"));
		System.out.println("-----------------");
		
		// remove
		map.remove("US");
		System.out.println("remove US: " + map);
		System.out.println("-----------------");
		
		// keyset(); returns the keys in the map
		System.out.println("print key size: " + map.keySet().size());
		
		// prints only key
		for (String key : map.keySet()) {
			System.out.println("Keys: " + key);
			System.out.println("value: " + map.get(key));
			System.out.println("-----------------");
		}
		System.out.println("=========================");
		
		Map<String, String> person1 = new HashMap<>();
		person1.put("name", "Donaldino");
		person1.put("age", "19");
		person1.put("city", "NY");
		
		Map<String, String> person2 = new HashMap<>();
		person2.put("name", "amine");
		person2.put("age", "old enough");
		person2.put("city", "NY");
		
		System.out.println(person1);
		System.out.println(person2);

	}

}
