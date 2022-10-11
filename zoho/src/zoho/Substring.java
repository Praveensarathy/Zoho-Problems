package zoho;

class Substring {

// Function to print all sub strings
	static void subString(String str, int n) {
		String s = "praveen";
		// Pick starting point
		for (int len = 1; len <= n; len++) {
			// Pick ending point
			for (int i = 0; i <= n - len; i++) {
				// Print characters from current
				// starting point to current ending
				// point.
				int j = i + len - 1;
				for (int k = i; k <= j; k++) {
					System.out.print(str.charAt(k));
				}

				System.out.println();
			}
		}
	}

// Driver program to test above function
	public static void main(String[] args) {
		String s ="abcd";
		subString(s, s.length());

	}
}
// This code is contributed by PrinciRaj1992
