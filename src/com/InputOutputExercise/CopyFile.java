package com.InputOutputExercise;

import java.io.*;

public class CopyFile {
	public static void main(String[] arg) throws IOException {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream(
					"E:\\Java Exercises\\input.txt");
			out = new FileOutputStream("output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

		File fileName = new File("output.txt");
		if (fileName.exists()) {
			System.out.println("File exists");

		} else {
			System.out.println("File do not exists");

		}

		FileReader fileIn = new FileReader("Output.txt");
		BufferedReader br = new BufferedReader(fileIn);

		while (br.readLine() != null) {
			System.out.println(br.readLine());
		}

		fileIn.close();

	}

}
