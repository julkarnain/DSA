package com.dsa.collection;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

/** 
 * Collection Interfaces implemented by Classes
 * Set : HashSet, LinkedHashSet, EnumSet
 * SortedSet : TreeSet
 * List : LinkedList, ArrayList, Vector, Stack
 * Queue : PriorityQueue, LinkedList
 * Map : HashTable, HashMap, LinkedHashMap, IdentityHashMap, WeakHashMap
 * SortedMap : TreeMap
 *  
 * **/
public class CustomCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("A");
		
		List<String> list = new ArrayList<String>();
		
		List<String> vector = new Vector<String>(list);
		
		List<String> stack = new Stack<String>();
		
		
		Collection<Object> collections = Collections.synchronizedCollection(new ArrayList<>());
		List<Object> lists = Collections.synchronizedList(new ArrayList<>());
		Set<Object> sets = Collections.synchronizedSet(new HashSet<>());
		Map<String, String> maps  = Collections.synchronizedMap(new HashMap<String, String>());
		SortedSet<Object> sortedSets = Collections.synchronizedSortedSet(new TreeSet<>());
		SortedMap<String, String> sortedMaps = Collections.synchronizedSortedMap(new TreeMap<String, String>());
		
		
		ArrayList<String> arrays = new ArrayList<String>();
		arrays.add("1");
		arrays.add("2");
		arrays.add("1");
		
		Collections.sort(arrays);
		
		Vector<String> vectors = new Vector<>();
		vector.add("A");
		vector.add("B");
		vector.add("C");
		
		System.out.println(vectors);
		
		Collections.copy(vectors, arrays);
		
		System.out.println(vectors);
		
		Collections.max(arrays);
		Collections.min(arrays);
		
		Enumeration<String> e = Collections.enumeration(arrays); 
		
		while(e.hasMoreElements()){
			
			System.out.printf("Enumeration :" + e.nextElement());
		}
		
		Collections.fill(arrays, "R");
		
		Collections.replaceAll(arrays, "1", "R");
		
		Collections.reverse(arrays);
		
		Collections.shuffle(arrays);
		
		Collections.swap(arrays, 0, 3);
		
		Comparator<String>  comparator  = Collections.reverseOrder();
		
		Collections.sort(arrays, comparator);
		
		Collections.binarySearch(arrays, "1");
		
		
		DateFormatSymbols dfs = new DateFormatSymbols();
		
		String[] months = dfs.getMonths();
		
		for(int i = 0; i<months.length; i++){
			list.add(months[i]);
		}
		
		Collections.sort(list);
		
		int index = Collections.binarySearch(list, "April");
		
		if(index>0){
			String month = list.get(index);
			
			System.out.printf(month);
		}
		
		
		 Collections.rotate(list, 10);
		 
		    List emptyList = Collections.EMPTY_LIST;
		    Set set = Collections.EMPTY_SET;
		    Map map = Collections.EMPTY_MAP;	
		    
		    List<String> s = Collections.emptyList();
		    Set<Long> l = Collections.emptySet();
		    Map<Date, String> d = Collections.emptyMap();
		    
		    Collection<String> immutable = Collections.unmodifiableList(list);
		
		
		
		
		

	}

}
