package nov_20;
import java.util.*;

public class EvaluatingSolution3 {

	public static int Banding2String(char[] kal1, char[] kal2) {
		
		// hai
		// haii
		// looping 3
		int length = -1;
		if (kal1.length < kal2.length) {
			length = kal1.length;
		}
		else {
			length = kal2.length;
		}

		for (int i = 0; i < length; i++) {
			if (kal1[i] == kal2[i]) {
				continue;
			}
			else if (kal1[i] < kal2[i]) {
				return -1;
			}
			else {
				return 1;
			}
		}

		if (kal1.length < kal2.length) {
			return -1;
		}
		else if (kal1.length > kal2.length) {
			return 1;
		}

		return 0;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String input1 = s.nextLine();
		String input2 = s.nextLine();

		s.close();

		int result = Banding2String(
			input1.toCharArray(), 
			input2.toCharArray()
		);

		System.out.println(result);
		switch (result) {
			case 0:
				System.out.println("String 1 sama dengan String 2");
				break;
			case 1:
				System.out.println("String 1 lebih besar dari String 2");
				break;
			case -1:
				System.out.println("String 2 lebih besar dari String 1");
				break;
			default:
				System.out.println("Error!");
				break;
		}
	}
}
