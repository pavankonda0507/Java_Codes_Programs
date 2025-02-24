package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class MapData {
	public static void main(String[] args) {
//		System.out.println("Hash Map.......");
//		Map<Integer,String> map = new HashMap<>();
//		map.put(32,"Pavan");
//		map.put(12, "Raj");
//		map.put(14, "Ram");
//		map.put(9, null);
//		map.put(32, "Sai");
//		map.put(12, "Dev");
//		map.put(23, "John");
////		System.out.println(map);
////		System.out.println(map.get(12));
////		System.out.println(map.entrySet());
////		System.out.println(map.keySet());
////		System.out.println(map.values());
////		System.out.println(map.containsKey(32));
////		System.out.println(map.containsValue("Raj"));
////		System.out.println(map.isEmpty());
////		System.out.println(map.size());
////		System.out.println(map.remove(12));
////		System.out.println(map);
//		System.out.println(map);
//		for(Entry<Integer,String> temp: map.entrySet()) {
//			System.out.println(temp.getKey()+" "+temp.getValue());
//		}
//		System.out.println("Linked Hash Set.....");
//		Map<Integer,String> lm = new LinkedHashMap<>();
//		lm.put(32,"Pavan");
//		lm.put(12, "Raj");
//		lm.put(14, "Ram");
//		lm.put(9, null);
//		lm.put(32, "Sai");
//		lm.put(12, "Dev");
//		lm.put(23, "John");
//		System.out.println(lm);
//		for(Entry<Integer,String> temp: lm.entrySet()) {
//			System.out.println(temp.getKey()+" "+temp.getValue());
//		}
		System.out.println("Tree Map........");
		Map<Integer,String> tm = new TreeMap<>();
		tm.put(32,"Pavan");
		tm.put(12, "Raj");
		tm.put(14, "Ram");
		tm.put(9, null);
		tm.put(32, "Sai");
		tm.put(12, "Dev");
		tm.put(23, "John");
		tm.put(87, "Ram");
		System.out.println(tm);
		for(Entry<Integer,String> temp: tm.entrySet()) {
			System.out.println(temp.getKey()+" "+temp.getValue());
		}
		
		System.out.println("Printing even Key and values in Map");
		for(Entry<Integer,String> temp:tm.entrySet()) {
			if(temp.getKey()%2==0) {
				System.out.println(temp.getKey()+" "+temp.getValue());
			}
		}
		
		System.out.println("To print the values present in the Map");
		for(Entry<Integer,String> temp:tm.entrySet()) {
			if(temp.getValue()=="Ram") {
				System.out.println(temp.getKey()+" "+temp.getValue());
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
