package com.amura.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.amura.exercise.reader.Reader;
import com.amura.exercise.utils.Util;

/**
 * Write a Java program to find the contiguous subarray within a one­dimensional
 * array of numbers (containing at least one positive number) which has the
 * largest sum. For example, for the sequence of values −2, 1, −3, 4, −1, 2, 1,
 * −5, 4; the contiguous subarray with the largest sum is 4, −1, 2, 1, with sum
 * 6. The program should run as follows <bold is user entry>: Enter the array :2
 * 1 ­3 4 ­1 2 1 ­5 4 Largest SubArray Start Index: 3 Length: 4 Sum: 6 Elements:
 * 4 ­1 2 1
 * 
 * @author akash
 *
 */
public class App {


	// -2 1 -3 4 -1 2 1 -5 4
	public static void main(String... s) throws IOException {

		Reader r = () -> {
			return new BufferedReader(new InputStreamReader(System.in));
		};

		System.out.print("Enter the Array here : ");
		String st = r.getReader().readLine();
		System.out.print(Util.printMaxSubArraySum(st));
		
	}

}
