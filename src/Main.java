import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		checkHashElem();
	}

	public static void checkHashElem(){
		Set<String> names = new HashSet<>(Arrays.asList("Rocco", "Giovanni", "Marco"));
		names.add("paolo");

		for (String name : names) {
			System.out.println(name);
		}
	}
}