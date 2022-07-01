package week3a.day2;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class NumbersOccurence {
public static void main(String[] args) {
	int arr[]= {2,3,5,6,3,2,1,4,2,1,6,1};
	Map<Integer,Integer> tm = new TreeMap<>();
	for(int i =0;i<arr.length;i++) {
		if(tm.containsKey(arr[i])) {
			tm.put(arr[i], tm.get(arr[i])+1);
		}
		else {
			tm.put(arr[i], 1);
		}
	}
	Set<Entry<Integer,Integer>> entrySet = tm.entrySet();
	for (Entry<Integer,Integer> entry : entrySet) {
		System.out.println(entry.getKey()+" -> "+entry.getValue());
	}
}}


