package nov_20;
import java.util.*;

public class EvaluatingSolution2 {

	public static int CountWord(String word) {
		int total = 0;
		for (int i = 0; i < word.length(); i++) {
			int ascii = (int) word.charAt(i);
			total += ascii;
		}
		return total;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();
		input = input.toUpperCase();

		String[] words = input.split(" ");
		int[] values = new int[words.length];

		for (int i = 0; i < words.length; i++) {
			int value = CountWord(words[i]);
			values[i] = value;
		}

		// Sorting
		// Bubble sort
		// 5, 2, 1, 3
		// 2, 5, 1, 3
		// 2, 1, 5, 3
		// 2, 1, 3, 5

		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			// Sorting
			for (int i = 0; i < values.length - 1; i++) {
				if (values[i] > values[i + 1]) {
					int tmp = values[i];
					values[i] = values[i + 1];
					values[i + 1] = tmp;

					String tmpw = words[i];
					words[i] = words[i + 1];
					words[i + 1] = tmpw;

					isSorted = false;
				}
			}
		}

		System.out.println(String.join(" ", words));

		s.close();
	}
}
