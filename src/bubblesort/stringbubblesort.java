package bubblesort;

public class stringbubblesort {

	static void stringbubblesort(String[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					String temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] Places = { "Japan", "New Zealand ", "Australia", "Wyoming", "Samoa", 
				"Philippines", "Maldives" };

		System.out.println("Unsorted Places:");
		for (String plc : Places) {
			System.out.print(plc + " ");
		}

		stringbubblesort(Places);

		System.out.println("\nSorted Places:");
		for (String plc : Places) {
			System.out.print(plc + " ");
		}
	}
}