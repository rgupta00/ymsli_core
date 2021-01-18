package com.day6.session1.buffer_per;

import java.io.*;

public class FileCopyNoBuffer { // Pre-JDK 7
	public static void main(String[] args) {
		String inFileStr = "ali.jpeg";
		String outFileStr = "ali_v3.jpeg";
		FileInputStream in = null;
		FileOutputStream out = null;
		
		long startTime, elapsedTime; // for speed benchmarking

		// Print file length
		File fileIn = new File(inFileStr);
		System.out.println("File size is " + fileIn.length() + " bytes");

		try {
			in = new FileInputStream(inFileStr);
			out = new FileOutputStream(outFileStr);

			startTime = System.nanoTime();
			int byteRead;
			// Read a raw byte, returns an int of 0 to 255.
			while ((byteRead = in.read()) != -1) {
				// Write the least-significant byte of int, drop the upper 3 bytes
				out.write(byteRead);
			}
			elapsedTime = System.nanoTime() - startTime;
			System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally { // always close the I/O streams
			try {
				if (in != null)
					in.close();
				if (out != null)
					out.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}