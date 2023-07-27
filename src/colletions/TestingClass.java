package colletions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class TestingClass {

	public static void main(String[] args) {
		Class c1 = new Class("Reviewing the ArrayLists", 14);
		Class c2 = new Class("Object Lists", 19);
		Class c3 = new Class("Relationship of lists and objects",25);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(c1);
		classes.add(c2);
		classes.add(c3);
		
		System.out.println(classes.toString());
		
		Collections.sort(classes);
		System.out.println(classes.toString());
		classes.sort(Comparator.comparing(Class::getDuration));
		System.out.println(classes.toString());

	}

}
