
import java.util.Arrays;

public class Numbers {

	public static void main(String[] args) {

		int[] baseline = new int[3]; // starting array
		int[] rank = new int[3];

		// Initialize array values

		baseline[0] = 10;
		baseline[1] = 5;
		baseline[2] = 12;

		rank = baseline; // ranked array- establishes ordering of the baseline array
		Arrays.sort(rank); // ranked version of starting array

		// rank index is used to cycle through baseline array to locate rank index+1
		for (int index = 0; index < baseline.length; index++) {
			if (baseline[index] < rank[index]) {
				System.out.println(baseline[index] + ": " + rank[index]);
				index++;
			}
		}

	}

}

