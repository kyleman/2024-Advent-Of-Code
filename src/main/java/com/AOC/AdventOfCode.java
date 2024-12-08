package com.AOC;

import java.lang.Math;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AdventOfCode {
	public static void main(String[] args) {
		List<Integer> left = new ArrayList<>();
		List<Integer> right = new ArrayList<>();
		
		try {
			File f = new File("lists.txt");
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {
				String line = s.nextLine();
				String[] numbers = line.split("\\s+");
				if (numbers.length != 2) {
					System.out.println("Bad line: " + line);
				} else {
					left.add(Integer.parseInt(numbers[0]));
					right.add(Integer.parseInt(numbers[1]));
				}
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("File not found: " + fnfe);
		}
		
		int sum = 0;
		
		Collections.sort(left);
		Collections.sort(right);
		
		for (int x = 0; x < left.size(); x++) {
			sum += Math.abs(left.get(x) - right.get(x));
		}
		
		System.out.println(sum);
	}
}
