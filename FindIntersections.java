package week3a.day2;

	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

	public class FindIntersections {
		public static void main(String[] args) {
			List<Integer> num1 = new ArrayList<>();
			Set<Integer> num2 = new HashSet<>();
			num1.add(3);
			num1.add(2);
			num1.add(9);
			num1.add(4);
			num1.add(6);
			num1.add(7);
			num2.add(1);
			num2.add(8);
			num2.add(6);
			num2.add(4);
			num2.add(9);
			num2.add(7);
			List<Integer> num3 = new ArrayList<>(num2);
			for(int i = 0;i<num1.size();i++) {
				for(int j =0;j<num3.size();j++) {
					if(num1.get(i)==num3.get(j)) {
						System.out.println(num1.get(i));
					}
				}
			}
		}
	}
	



