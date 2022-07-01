package week3a.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingElements {
public static void main(String[] args) {
	Set<Integer> num = new LinkedHashSet<>();
	num.add(1);
	num.add(2);
	num.add(4);
	num.add(3);
	num.add(5);
	num.add(8);
	num.add(7);
	Set<Integer> num1 = new TreeSet<>(num);
	List<Integer> num2 = new ArrayList<>(num1);
	int n= num2.size()+1;
	int t= (n*(n+1))/2;
	for(int i =0;i<num.size();i++) {
		t = t - num2.get(i);
	}
	System.out.println(t);
}
}


