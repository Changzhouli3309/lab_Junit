package main;

public class MathTools {
	
	public static int average(int... numbers) {
		int re = 0;
		for (int n : numbers) {
			re += n;
		}
		return re / numbers.length;
	}

	public static int greatest(int... numbers) {
		int re = numbers[0];
		for (int n : numbers) {
			if (re < n) {
				re = n;
			}
		}
		return re;
	}
	
	public static int lowest(int...numbers) {
		int re = numbers[0];
		for (int n : numbers) {
			if (re > n) {
				re = n;
			}
		}
		return re; 
	}
}
