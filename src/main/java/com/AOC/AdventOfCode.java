package com.AOC;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdventOfCode {
	public static void main(String[] args) {
		List<String[]> reports = new ArrayList<>();
		int numberOfSafeReports = 0;
		String fileName = "levels.txt";
		try (Scanner reader = new Scanner(new File(fileName))) {
			while (reader.hasNextLine()) {
				String[] report = reader.nextLine().split("\\s+");
				reports.add(report);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("File not found: " + fnfe);
		}
		
		for (String[] report : reports) {
			if (isReportSafe(Arrays.asList(report))) {
				numberOfSafeReports++;
			}
		}
		
		System.out.println("Number of safe reports is: " + numberOfSafeReports);
	}
	
	public static boolean isReportSafe(List<String> report) {
		boolean safe = true;
		List<Integer> differences = new ArrayList<>();
		
		for (int i = 0; i < report.size() - 1; i++) {
			Integer first = Integer.parseInt(report.get(i));
			Integer second = Integer.parseInt(report.get(i+1));
			
			differences.add(first - second);
		}
		// check for ascending and valid increases
		boolean validAscending = differences.stream().allMatch(
			x -> x >= 1 && x <= 3
		);
		
		// check for descending and valid decreases
		boolean validDescending = differences.stream().allMatch(
			x -> x <= -1 && x >= -3
		);

		
		return validAscending || validDescending;
	}
	
}
