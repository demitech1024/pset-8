public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}
		
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}
		
		return false;
	}
	
	public String[] endsMeet(String[] values, int n) {
		if (values == null || values.length < n || n <= 0) {
			return new String[0];
		}

		String[] returnMe = new String[n * 2];
		for (int i = 0; i < n; i++) {
			returnMe[i] = values[i];
		}

		int index = n;
		for (int i = values.length - n; i < values.length; i++) {
			returnMe[index] = values[i];
			index++;
		}
		
		return returnMe;
	}
	
	public int difference(int[] numbers) {
		if (numbers == null || numbers.length < 1) {
			return -1;
		}

		int max = 0;
		int min = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				min = numbers[i];
				max = numbers[i];
			}
			
			if (max < numbers[i]) {
				max = numbers[i];
			}

			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		
		return max - min;
	}
	
	
	public double biggest(double[] numbers) {
		if (numbers == null || numbers.length < 3 || numbers.length % 2 == 0) {
			return -1;
		}
		
		int midIndex = (int)(Math.ceil(numbers.length / 2));
		double max = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				return -1;
			}

			if ((i == 0 || i == numbers.length - 1 || i == midIndex) && numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		return max;
	}
	
	public String[] middle(String[] values) {
		if (values == null || values.length < 3 || values.length % 2 == 0) {
			return new String[0];
		}

		for (int i = 0; i < values.length; i++) {
			if (values[i] == null) {
				return new String[0];
			}
		}

		int midIndex = (int)(Math.ceil(values.length / 2));
		String[] returnMe = {values[midIndex - 1], values[midIndex], values[midIndex + 1]};
		
		return returnMe;
	}

	public boolean increasing(int[] numbers) {
		if (numbers == null || numbers.length < 3) {
			return false;
		}

		int counter = 0;
		int currentNum = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				counter = 1;
				currentNum = numbers[i];
			}
			
			if (numbers[i] == currentNum + 1) {
				counter += 1;
				currentNum = numbers[i];
			} else {
				counter = 1;
				currentNum = numbers[i];
			}

			if (counter == 3) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean everywhere(int[] numbers, int x) {
		if (numbers == null || numbers.length < 1) {
			return false;
		}
		
		boolean lastPos = false;
		int gap = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == x) {
				lastPos = true;
				gap = 0;
			} else {
				if (i == 1 && lastPos == false) {
					return false;
				} else if (lastPos == false) {
					gap++;
				}
				lastPos = false;
			}

			if (gap == 2) {
				return false;
			}
		}

		return true;
	}
	
	public boolean consecutive(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
