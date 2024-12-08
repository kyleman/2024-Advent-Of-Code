package com.AOC;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class AdventOfCode {
	public static void main(String[] args) {
		String fileName = "filename.txt";
		try (Scanner reader = new Scanner(new File(fileName))) {
			while (reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("File not found: " + fnfe);
		}
	}
}
