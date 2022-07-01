package week3a.day2;
import java.util.ArrayList;
	import java.util.LinkedHashSet;
	import java.util.List;
	import java.util.Set;

	public class RemoveDuplicates {
	public static void main(String[] args) {
		List <String> text = new ArrayList<>();
		text.add("We");
		text.add("learn");
		text.add("java");
		text.add("basics");
		text.add("as");
		text.add("part");
		text.add("of");
		text.add("java");
		text.add("session");
		text.add("in");
		text.add("java");
		text.add("week1");
		Set<String> text2 =new LinkedHashSet<>(text);
		System.out.println(text2);
	}
	}

