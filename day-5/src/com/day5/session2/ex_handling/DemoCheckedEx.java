package com.day5.session2.ex_handling;

import java.io.*;

public class DemoCheckedEx {

	public static void main(String[] args) {
		// Checked Ex
		try (BufferedReader br = new BufferedReader(new FileReader(new File("data3.txt")))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} 

	}

}
