package KeepMeInTheLoop;

import java.util.Arrays;
import java.util.Scanner;

public class KeepMeInTheLoop {

	/**
	 * Private constructor disables instantiation.
	 */
	private KeepMeInTheLoop() {
	}

	public static boolean containsWithGaps(java.lang.String source, java.lang.String target) {
		for (int i = 0, last = -1; i < target.length(); i++) {
			if (-1 == (last = source.indexOf(target.charAt(i), last + 1)))
				return false;
		}
		return true;

	}

	public static int findSecondLargest(java.lang.String nums) {

		int count = 0;
		int i = 0;
		for (i = 0; i < nums.length(); i++) {
			if (nums.charAt(i) == ' ') {
				count += 1;
			}
		}
		int[] arr = new int[count];
		Scanner s = new Scanner(nums);
		i = 0;
		int SecondLargest = s.nextInt();
		while (s.hasNextInt()) {
			arr[i] = s.nextInt();
			i++;
		}
		int max = SecondLargest;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				SecondLargest = max;
				max = arr[i];
			} else if (arr[i] > SecondLargest) {
				SecondLargest = arr[i];
			}
		}
		s.close();
		return SecondLargest;

	}

	public static int findStoppingTime(int n) {

		int counter = 0;
		int i;
		for (i = 1; i <= 500; i++) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = (n * 3) + 1;

			}
			counter = counter + 1;
			if (n == 1) {
				return counter;
			}
		}
		return -1;
	}

	public static String doubleConsonants(String s) {
		String doubleC = s.replaceAll("(?i)(([^aeiou])\\2+)|([^aeiou])", "$1$3$3");
		return doubleC;
	}

	public static int findNth(java.lang.String s, char ch, int n) {

		int place = s.indexOf(ch);
		while (--n > 0 && place != -1)
			place = s.indexOf(ch, place + 1);
		return place;
	}

	public static int howLong(double balance, double monthlyCost, double interestRate, double increase) {
		int i = 1;
		for (i = 1; i <= 500; i++) {
			if (i == 1) {
				balance = balance - monthlyCost;
			} else {
				balance = (balance * (interestRate / 12)) + balance;
				monthlyCost = monthlyCost + increase;
				balance = balance - monthlyCost;
			}

			if (monthlyCost > balance) {
				return i;
			}
		}
		return 0;
	}

	public static boolean isIBeforeE(java.lang.String s) {
		if (!s.contains("ie"))
			return true;
		if (!s.contains("c") && s.contains("ie")) {
			return true;
		} else if (s.contains("cei")) {
			return false;
		}
		return false;

	}

	public static boolean isPermutation(java.lang.String s, java.lang.String t) {
		if (s.length() != t.length()) {
			return false;
		}

		char[] x = s.toCharArray();
		char[] y = t.toCharArray();

		Arrays.sort(x);
		Arrays.sort(y);

		return Arrays.equals(x, y);

	}

}
