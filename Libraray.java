package Pojo;

import java.util.HashMap;
import java.util.Map.Entry;

public class Library {

	public static void main(String[] args) {
		HashMap<String ,String> map=new HashMap<>();
		HashMap<String,Integer> map2=new HashMap<>();
		map.put("Visit1", "101");
		map.put("Visit2", "103");
		map.put("Visit3", "101");
		map.put("Visit4", "109");
		map.put("Visit5", "103");
		map.put("Visit6", "101");
		map.put("Visit7", "109");
		map.put("Visit8", "101");
		
		for(Entry<String, String> e:map.entrySet()) {
			Integer integer=map2.get(e.getValue());
			if(integer==null) {
				map2.put(e.getValue(), 1);
			}
			else {
				map2.put(e.getValue(), integer+1);
			}
	}
		System.out.println(map2);
	}
}
