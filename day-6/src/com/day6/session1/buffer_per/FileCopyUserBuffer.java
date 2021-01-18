package com.day6.session1.buffer_per;

import java.io.*;

public class FileCopyUserBuffer { // Pre-JDK 7
	public static void main(String[] args) {
		String inFileStr = "ali.jpeg";
		String outFileStr = "ali_v3.jpeg";
		FileInputStream in = null;
		FileOutputStream out = null;
		long startTime, elapsedTime; // for speed benchmarking

		// Check file length
		File fileIn = new File(inFileStr);
		System.out.println("File size is " + fileIn.length() + " bytes");

		try {
			in = new FileInputStream(inFileStr);
			out = new FileOutputStream(outFileStr);
			startTime = System.nanoTime();
			byte[] byteBuf = new byte[4096]; // 4K byte-buffer
			int numBytesRead;
			while ((numBytesRead = in.read(byteBuf)) != -1) {
				out.write(byteBuf, 0, numBytesRead);
			}
			elapsedTime = System.nanoTime() - startTime;
			System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally { // always close the streams
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