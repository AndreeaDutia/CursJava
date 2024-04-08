package curs10;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		/*
		 *  user = test
		 *  {  
		 *    clientId = 12345;
		 *     }
		 */
		
		Map<String, String> map = new HashMap<>();
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
	
		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("PO", "Product Owner");
		
		
	/*	Map<String, String> map2 = new HashMap<>();
		map2.put("S", "Level1 Support");
		System.out.println("Map2 inainte de put all " + map2);
		map2.putAll(map);
		System.out.println("Map2 dupa de put all " + map2); */

		
		System.out.println("---------------------------------");
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		System.out.println("---------------------------------");

		System.out.println(map);
		
		System.out.println(map.get("PO"));
		
		System.out.println("---------------------------------");

		map.put("D", "Director");
		System.out.println(map);
		
		map.replace("D", "Developer");
		System.out.println(map);
		
		map.put("d", "Director");
		System.out.println(map);
		
		System.out.println("---------------------------------");

		for(String key : map.keySet()) {
			System.out.print(key + " | ");	
		}
		
		System.out.println(map.values());
		
		System.out.println("\n---------------------------------");

		for(String value : map.values()) {
			
			System.out.println(value);
		}
		
		System.out.println("\n---------------------------------");

		boolean checkKey =  map.containsKey("T");
		System.out.println(checkKey);
		//if(map.containsKey("T")) {}
		
		boolean checkValue = map.containsValue("Product Owner");
		System.out.println(checkValue);
		
		System.out.println("\n---------------------------------");

		map.remove("M");
		
		System.out.println(map);
		
		map.clear();
		System.out.println("Printuri dupa clear map");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
	}

}