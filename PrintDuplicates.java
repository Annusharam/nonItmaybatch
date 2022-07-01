package week3a.day2;

	import java.util.ArrayList;
	import java.util.LinkedHashSet;
	import java.util.List;
	import java.util.Set;

	public class PrintDuplicates{
	public static void main(String[] args) {
		List <Integer> num = new ArrayList<>();
		num.add(14);
		num.add(12);
		num.add(13);
		num.add(11);
		num.add(15); 
		num.add(14);
		num.add(18);
		num.add(16);
		num.add(17);
		num.add(19);
		num.add(18);
		num.add(17);
		num.add(20);
		Set <Integer> num2 = new LinkedHashSet<>(num);
		//System.out.println(num2);
		for(int i=0 ; i<num2.size(); i++) {
			int count = 0;
			for(int j = i+1; j<num.size();j++) {
				if(num.get(i)==num.get(j)) {
					count= count +1;
				}
				if(count>0) {
					System.out.println(num.get(j));
					break;
				}
			}
			
		}
	}}


