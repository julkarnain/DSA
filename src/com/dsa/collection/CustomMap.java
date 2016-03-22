package com.dsa.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CustomMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, int[]> map = new TreeMap<String, int[]>();
		
		int[] array = new int[3];
		
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		
		map.put("array", array);

		Iterator<String> iter = map.keySet().iterator();
		
		
		
		for(Entry<String, int[]> en :  map.entrySet()){
			
			String key = en.getKey();
			
			int[] value = en.getValue();
			
			
		}
		
		while(iter.hasNext()){
			
			String key  = iter.next();
			array = map.get(key);
			
			for(int i = 0; i<array.length; i++){
				
				System.out.print(array[i]);
			}
			
		}
	}

}
