package com.amura.exercise.utils;

import java.util.stream.Stream;

public class Util {
	static int EXIT_STATUS_PARAMETER_NOT_UNDERSTOOD = 2;

	public static String printMaxSubArraySum(String input) {
		try {
			int[] a = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
			return Util.maxSubArraySum(a);
		} catch (NumberFormatException e) {
			System.err.println("Please provide valid input. Ex: 2 4 -1 2 3 4");
			System.exit(EXIT_STATUS_PARAMETER_NOT_UNDERSTOOD);
		}
		return input;
	}

	public static String maxSubArraySum(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("Largest SubArray").append(System.lineSeparator());
		int size = arr.length;
		int maxSum = 0, currentMax = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < size; i++) {
			currentMax += arr[i];
			if (currentMax <= 0) {
				start = i + 1;
				currentMax = 0;
			} else if (maxSum < currentMax) {
				maxSum = currentMax;
				end = i;
			}
		}
		sb.append("Start Index: ").append(start).append(System.lineSeparator());
		sb.append("Length: ").append(end - start + 1).append(System.lineSeparator());
		sb.append("Sum: ").append(maxSum).append(System.lineSeparator());
		sb.append("Elements: ");
		int temp = start;
		while (temp <= end) {
			sb.append(arr[temp]).append(" ");
			temp++;
		}
		//sb.append(System.lineSeparator());

		return sb.toString().trim();
	}

}
