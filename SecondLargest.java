package week3a.day2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {
	public static void main(String[] args) {
		List <Integer> num = new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(9);
		num.add(4);
		num.add(5);
		num.add(11);
		Set<Integer> num1 = new TreeSet<>(num);
		//System.out.println(num1);
		List<Integer> num2 = new ArrayList<>(num1);
		int i = num.size()-2;
		System.out.println(num2.get(i));	
	}

}


