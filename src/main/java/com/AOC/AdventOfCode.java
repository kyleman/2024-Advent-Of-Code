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
		/*
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
		
		
		Collections.sort(left);
		Collections.sort(right);
		*/
		
			List<Integer> leftList = new ArrayList<>();
		List<Integer> rightList = new ArrayList<>();
		
		leftList.add(3);
		rightList.add(4);
		leftList.add(4);
		rightList.add(3);
		leftList.add(2);
		rightList.add(5);
		leftList.add(1);
		rightList.add(3);
		leftList.add(3);
		rightList.add(9);
		leftList.add(3);
		rightList.add(3);
		
		Collections.sort(leftList);
		Collections.sort(rightList);
		
	}
}
