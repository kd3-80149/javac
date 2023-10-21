package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("/home/sunbeam/javapractice/day15/Assignment13_Q3/Anita.txt")) {
			try (BufferedReader br = new BufferedReader(fr)) {
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
