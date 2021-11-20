package nov_20;
import java.util.*;

public class EvaluatingSolution1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String input = s.nextLine();

		// Character unik yg ada dlm input
		ArrayList<Character> characters = new ArrayList<>();
		ArrayList<Integer> counts = new ArrayList<>();

		// hello world
		// characters = ['h', 'e', 'l'] ...
		// counts = [1, 1, 3] ...

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				continue;
			}

			// Cek apakah karakter ini sudah ada di list atau belum.
			if (characters.contains(input.charAt(i))) {
				int index = characters.indexOf(input.charAt(i));
				int previousCount = counts.get(index);
				counts.set(index, previousCount + 1);
			}
			else {
				characters.add(input.charAt(i));
				counts.add(1);
			}
		}

		// ArrayList -> size()
		// array biasa -> length
		for (int i = 0; i < characters.size(); i++) {
			for (int j = 0; j < counts.get(i); j++) {
				System.out.print(characters.get(i));
			}
		}

		s.close();

	}
}
